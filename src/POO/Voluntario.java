package POO;

import java.time.LocalDate;
import java.util.List;

public class Voluntario implements Cuidavel {
    private String nome;
    private String cpf;
    private String telefone;
    private String endereco;
    private String email;
    private LocalDate dataNascimento;
    private List<Animal> animaisResgatados;
    private boolean ativo;

    public Voluntario(String nome, String cpf, String telefone, String endereco, String email,
                      LocalDate dataNascimento, List<Animal> animaisResgatados) {
        setNome(nome);
        setCpf(cpf);
        setTelefone(telefone);
        setEndereco(endereco);
        setEmail(email);
        setDataNascimento(dataNascimento);
        setAnimaisResgatados(animaisResgatados);

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

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        if (cpf != null && cpf.matches("\\d{11}")) { // Verifica se o CPF tem 11 dígitos numéricos
            this.cpf = cpf;
        } else {
            System.out.println("CPF inválido! Deve conter 11 dígitos numéricos.");
        }
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        if (telefone != null && telefone.matches("\\d{11}")) { // Verifica se tem 11 dígitos numéricos
            this.telefone = telefone;
        } else {
            System.out.println("Telefone inválido! Deve conter 11 dígitos numéricos.");
        }
    
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        if (isStringValida(endereco)) {
            this.endereco = endereco;
        } else {
            System.out.println("Endereço inválido!");
        }
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (email != null && email.matches("^[\\w._%+-]+@[\\w.-]+\\.[a-zA-Z]{2,}$")) {
            this.email = email;
        } else {
            System.out.println("E-mail inválido!");
        }
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        if (dataNascimento != null) {
            if (dataNascimento.isAfter(LocalDate.now())) {
                System.out.println("Data de nascimento não pode ser futura!");
                return;
            }
            this.dataNascimento = dataNascimento;
        } else{
            System.out.println("Data de nascimento inválida");
        }
        
    }

    public List<Animal> getAnimaisResgatados() {
        return animaisResgatados;
    }

    public void setAnimaisResgatados(List<Animal> animaisResgatados) {
        if (animaisResgatados != null) {
            this.animaisResgatados = animaisResgatados;
        } else {
            System.out.println("Lista de animais resgatados inválida!");
        }
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    public void ativar() {
        this.ativo = true;
        System.out.println("O voluntário " + nome + " foi ativado.");
    }
    
    public void desativar() {
        this.ativo = false;
        System.out.println("O voluntário " + nome + " foi desativado.");
    }

    @Override
    public void avaliarCondicao() {  
        if (ativo) {
            System.out.println("O voluntário " + nome + " está ativo e apto a cuidar dos animais.");
        } else {
            System.out.println("O voluntário " + nome + " não está ativo.");
            
        }
    }

    public void exibirDetalhes() {
        System.out.println("==================Detalhes do voluntário==================");
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println("Telefone: " + telefone);
        System.out.println("Endereço: " + endereco);
        System.out.println("E-mail: " + email);
        System.out.println("Data de Nascimento: " + dataNascimento);
        for(Animal animal : animaisResgatados) {
            System.out.println("Animal resgatado: " + animal.getNome());
        }
        System.out.println("=========================================================");
    }
}