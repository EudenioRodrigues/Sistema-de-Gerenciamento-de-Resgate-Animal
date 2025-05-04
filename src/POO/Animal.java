package POO;

import java.time.LocalDate;
import java.util.List;

public class Animal implements Cuidavel {
    private String nome;
    private String especie;
    private String raca;
    private int idade;
    private double peso;
    private String sexo;
    private String observacoes;
    private boolean castrado;
    private HistoricoMedico historicoMedico;
    private Voluntario voluntario;
    private boolean adotado = false;

    public Animal(String nome, String especie, String raca, int idade, String sexo, double peso,
                  String observacoes, boolean castrado, 
                  HistoricoMedico historicoMedico, Voluntario voluntario, boolean adotado) {
                    
        this.adotado = adotado;
        this.voluntario = voluntario;
        this.nome = nome;
        this.especie = especie;
        this.raca = raca;
        this.idade = idade;
        this.peso = peso;
        this.sexo = sexo;
        this.observacoes = observacoes;
        this.castrado = castrado;
        this.historicoMedico = historicoMedico;

        if (voluntario != null) {
            Resgate resgate = new Resgate(this, voluntario, LocalDate.now());
            resgate.registrar();
            resgate.exibirDetalhes();
        } else {
            System.out.println("Voluntário não informado. Resgate não registrado.");
        }

    }

    public boolean isStringValida(String s) {
        return s != null && !s.trim().isEmpty();
    }
    
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        if (isStringValida(nome)) {
            this.nome = nome;
        } else {
            System.out.println("Nome inválido!");
        }
    }
    
    public String getEspecie() {
        return especie;
    }
    
    public void setEspecie(String especie) {
        if (isStringValida(especie)) {
            this.especie = especie;
        } else {
            System.out.println("Espécie inválida!");
        }
    }
    
    public String getRaca() {
        return raca;
    }
    
    public void setRaca(String raca) {
        if (isStringValida(raca)) {
            this.raca = raca;
        } else {
            System.out.println("Raça inválida!");
        }
    }
    
    public int getIdade() {
        return idade;
    }
    
    public void setIdade(int idade) {
        if (idade >= 0) {
            this.idade = idade;
        } else {
            System.out.println("Idade inválida!");
        }
    }
    
    public double getPeso() {
        return peso;
    }
    
    public void setPeso(double peso) {
        if (peso > 0) {
            this.peso = peso;
        } else {
            System.out.println("Peso inválido!");
        }
    }
    
    public String getSexo() {
        return sexo;
    }
    
    public void setSexo(String sexo) {
        if (isStringValida(sexo)) {
            this.sexo = sexo;
        } else {
            System.out.println("Sexo inválido!");
        }
    }
    
    public String getObservacoes() {
        return observacoes;
    }
    
    public void setObservacoes(String observacoes) {
        if (isStringValida(observacoes)) {
            this.observacoes = observacoes;
        } else {
            System.out.println("Observações inválidas!");
        }
    }

    public boolean isCastrado() {
        return castrado;
    }

    public void setCastrado(boolean castrado) {
        this.castrado = castrado;
    }
    
    public HistoricoMedico getHistoricoMedico() {
        return historicoMedico;
    }

    public void setHistoricoMedico(HistoricoMedico historicoMedico) {
        this.historicoMedico = historicoMedico;
    }

    public Voluntario getVoluntario() {
        return voluntario;
    }

    public void setVoluntario(Voluntario voluntario) {
        this.voluntario = voluntario;
    }
    
    private ClinicaVeterinaria clinicaVeterinaria;

    public void setClinicaVeterinaria(ClinicaVeterinaria clinica) {
        this.clinicaVeterinaria = clinica;
    }

    @Override
    public void avaliarCondicao() {
        if (adotado) {
            System.out.println("====================Avaliação de Condição==================");
            System.out.println("O animal " + nome + " já foi adotado e não está disponível para adoção.");
            System.out.println("=========================================================");
            return;
        }
    
        // Simulação de verificação na clínica veterinária
        if (clinicaVeterinaria.getAnimaisEmTratamento().contains(this)) {
            System.out.println("====================Avaliação de Condição==================");
            System.out.println("O animal " + nome + " está em tratamento na clínica " + clinicaVeterinaria.getNomeClinica() + ". Não está disponível para adoção.");
            System.out.println("=========================================================");
        } else {
            System.out.println("====================Avaliação de Condição==================");
            System.out.println("O animal " + nome + " não está em tratamento e está disponível para adoção.");
            System.out.println("=========================================================");
        }
    }

    public void avaliarSaude() {
        System.out.println("===================Avaliação de Saúde==================");
        if (historicoMedico == null) {
            System.out.println("O animal " + nome + " não possui histórico médico registrado.");
            System.out.println("=======================================================");
            return;
        }
    
        boolean possuiProblemas = false;
    
        // Verifica doenças preexistentes
        if (historicoMedico.getDoencasPreexistentes() != null && !historicoMedico.getDoencasPreexistentes().isEmpty()) {
            System.out.println("- Doenças preexistentes: " + historicoMedico.getDoencasPreexistentes());
            possuiProblemas = true;
        }
    
        // Verifica alergias
        if (historicoMedico.getAlergias() != null && !historicoMedico.getAlergias().isEmpty()) {
            System.out.println("- Alergias: " + historicoMedico.getAlergias());
            possuiProblemas = true;
        }
    
        // Verifica medicamentos em uso
        if (historicoMedico.getMedicamentosEmUso() != null && !historicoMedico.getMedicamentosEmUso().isEmpty()) {
            System.out.println("- Medicamentos em uso: " + historicoMedico.getMedicamentosEmUso());
            possuiProblemas = true;
        }
    
        // Verifica cirurgias anteriores
        if (historicoMedico.getCirurgiasAnteriores() != null && !historicoMedico.getCirurgiasAnteriores().isEmpty()) {
            System.out.println("- Cirurgias anteriores: " + historicoMedico.getCirurgiasAnteriores());
            possuiProblemas = true;
        }
    
        // Determina se o animal está saudável
        if (!possuiProblemas) {
            System.out.println("- O animal " + nome + " está saudável.");
        } else {
            System.out.println("- O animal " + nome + " possui condições que requerem atenção.");
        }
        System.out.println("=======================================================");
    }
    
    public void encaminharParaAdocao(Adotante adotante) {
        
        System.out.println("==================Encaminhamento para Adoção==================");
    
        // Verifica se o animal já foi adotado
        if (adotado) {
            System.out.println("O animal " + nome + " já foi adotado e não pode ser encaminhado novamente.");
            System.out.println("=============================================================");
            return;
        }
    
        // Verifica se o animal está em tratamento
        if (clinicaVeterinaria != null && clinicaVeterinaria.getAnimaisEmTratamento().contains(this)) {
            System.out.println("O animal " + nome + " está em tratamento e não pode ser encaminhado para adoção.");
            System.out.println("=============================================================");
            return;
        }
        
        // Registra a adoção
        Adocao adocao = new Adocao(this, adotante, LocalDate.now());
        adocao.registrarAdocao();
    
        // Marca o animal como adotado
        adotado = true;
    
        System.out.println("O animal " + nome + " foi encaminhado para adoção com sucesso!");
        System.out.println("=============================================================");
    }

    public void exibirDetalhes() {
        System.out.println("==================Animal==================");
        System.out.println("Nome: " + nome);
        System.out.println("Espécie: " + especie);
        System.out.println("Raça: " + raca);
        System.out.println("Idade: " + idade);
        System.out.println("Peso: " + peso);
        System.out.println("Sexo: " + sexo);
        System.out.println("Observações: " + observacoes);
        System.out.println("Castrado: " + (castrado ? "Sim" : "Não"));
        System.out.println("Voluntário: " + (voluntario != null ? voluntario.getNome() : "Não informado"));
        historicoMedico.exibirDetalhes();
    }
}