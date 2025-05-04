package POO;

import java.util.ArrayList;
import java.util.List;

public class HistoricoMedico {
    private List<String> doencasPreexistentes;
    private List<String> alergias;
    private List<String> medicamentosEmUso;
    private List<String> cirurgiasAnteriores;
    private List<String> examesRealizados;
    private List<String> vacinas;

    // Construtor sem parâmetros que inicializa as listas vazias
    public HistoricoMedico() {
        this.doencasPreexistentes = new ArrayList<>();
        this.alergias = new ArrayList<>();
        this.medicamentosEmUso = new ArrayList<>();
        this.cirurgiasAnteriores = new ArrayList<>();
        this.examesRealizados = new ArrayList<>();
        this.vacinas = new ArrayList<>();
    }

    public void adicionarDoencaPreexistente(String doenca) {
        if (doenca != null && !doenca.isEmpty()) {
            this.doencasPreexistentes.add(doenca);
        } else {
            System.out.println("Doença inválida!");
        }
    }

    public void adicionarAlergia(String alergia) {
        if (alergia != null && !alergia.isEmpty()) {
            this.alergias.add(alergia);
        } else {
            System.out.println("Alergia inválida!");
        }
    }

    public void adicionarMedicamento(String medicamento) {
        if (medicamento != null && !medicamento.isEmpty()) {
            this.medicamentosEmUso.add(medicamento);
        } else {
            System.out.println("Medicamento inválido!");
        }
    }

    public void adicionarCirurgia(String cirurgia) {
        if (cirurgia != null && !cirurgia.isEmpty()) {
            this.cirurgiasAnteriores.add(cirurgia);
        } else {
            System.out.println("Cirurgia inválida!");
        }
    }

    public void adicionarExame(String exame) {
        if (exame != null && !exame.isEmpty()) {
            this.examesRealizados.add(exame);
        } else {
            System.out.println("Exame inválido!");
        }
    }

    public void adicionarVacina(String vacina) {
        if (vacina != null && !vacina.isEmpty()) {
            this.vacinas.add(vacina);
        } else {
            System.out.println("Vacina inválida!");
        }
    }

    // Métodos para adicionar múltiplos itens
    public void adicionarDoencasPreexistentes(List<String> doencas) {
        if (doencas != null && !doencas.isEmpty()) {
            this.doencasPreexistentes.addAll(doencas);
        } else {
            System.out.println("Lista de doenças inválida!");
        }
    }

    public void adicionarAlergias(List<String> alergias) {
        if (alergias != null && !alergias.isEmpty()) {
            this.alergias.addAll(alergias);
        } else {
            System.out.println("Lista de alergias inválida!");
        }
    }

    public void adicionarMedicamentosEmUso(List<String> medicamentos) {
        if (medicamentos != null && !medicamentos.isEmpty()) {
            this.medicamentosEmUso.addAll(medicamentos);
        } else {
            System.out.println("Lista de medicamentos inválida!");
        }
    }

    public void adicionarCirurgiasAnteriores(List<String> cirurgias) {
        if (cirurgias != null && !cirurgias.isEmpty()) {
            this.cirurgiasAnteriores.addAll(cirurgias);
        } else {
            System.out.println("Lista de cirurgias inválida!");
        }
    }

    public void adicionarExamesRealizados(List<String> exames) {
        if (exames != null && !exames.isEmpty()) {
            this.examesRealizados.addAll(exames);
        } else {
            System.out.println("Lista de exames inválida!");
        }
    }

    public void adicionarVacinas(List<String> vacinas) {
        if (vacinas != null && !vacinas.isEmpty()) {
            this.vacinas.addAll(vacinas);
        } else {
            System.out.println("Lista de vacinas inválida!");
        }
    }

    // Getters e setters permanecem os mesmos
    public List<String> getDoencasPreexistentes() {
        return doencasPreexistentes;
    }

    public void setDoencasPreexistentes(List<String> doencasPreexistentes) {
        this.doencasPreexistentes = doencasPreexistentes;
    }

    public List<String> getAlergias() {
        return alergias;
    }

    public void setAlergias(List<String> alergias) {
        this.alergias = alergias;
    }

    public List<String> getMedicamentosEmUso() {
        return medicamentosEmUso;
    }

    public void setMedicamentosEmUso(List<String> medicamentosEmUso) {
        this.medicamentosEmUso = medicamentosEmUso;
    }

    public List<String> getCirurgiasAnteriores() {
        return cirurgiasAnteriores;
    }

    public void setCirurgiasAnteriores(List<String> cirurgiasAnteriores) {
        this.cirurgiasAnteriores = cirurgiasAnteriores;
    }

    public List<String> getExamesRealizados() {
        return examesRealizados;
    }

    public void setExamesRealizados(List<String> examesRealizados) {
        this.examesRealizados = examesRealizados;
    }

    public List<String> getVacinas() {
        return vacinas;
    }

    public void setVacinas(List<String> vacinas) {
        this.vacinas = vacinas;
    }
    
    public void exibirDetalhes() {
        System.out.println("====================Histórico Médico===================");
        System.out.println("Doenças Preexistentes: " + doencasPreexistentes);
        System.out.println("Alergias: " + alergias);
        System.out.println("Medicamentos em Uso: " + medicamentosEmUso);
        System.out.println("Cirurgias Anteriores: " + cirurgiasAnteriores);
        System.out.println("Exames Realizados: " + examesRealizados);
        System.out.println("Vacinas: " + vacinas);
        System.out.println("=======================================================");
    }

}
