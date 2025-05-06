package POO;

import java.util.ArrayList;
import java.util.List;

public class HistoricoMedico {
    private Animal animal;
    private List<String> doencasPreexistentes;
    private List<String> alergias;
    private List<String> medicamentosEmUso;
    private List<String> cirurgiasAnteriores;
    private List<String> examesRealizados;
    private List<String> vacinas;

    // Construtor sem parâmetros que inicializa as listas vazias
    public HistoricoMedico(Animal animal) {
        setAnimal(animal);
        this.doencasPreexistentes = new ArrayList<>();
        this.alergias = new ArrayList<>();
        this.medicamentosEmUso = new ArrayList<>();
        this.cirurgiasAnteriores = new ArrayList<>();
        this.examesRealizados = new ArrayList<>();
        this.vacinas = new ArrayList<>();
    }

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        if (animal != null) {
            this.animal = animal;
        } else {
            System.out.println("Animal inválido!");
        }
    }

    public List<String> getDoencasPreexistentes() {
        return doencasPreexistentes;
    }

    public List<String> getAlergias() {
        return alergias;
    }

    public List<String> getMedicamentosEmUso() {
        return medicamentosEmUso;
    }

    public List<String> getCirurgiasAnteriores() {
        return cirurgiasAnteriores;
    }

    public List<String> getExamesRealizados() {
        return examesRealizados;
    }

    public List<String> getVacinas() {
        return vacinas;
    }

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

    public void removerDoencaPreexistente(String doenca) {
        if (doenca != null && doencasPreexistentes.contains(doenca)) {
            this.doencasPreexistentes.remove(doenca);
        } else {
            System.out.println("Doença não encontrada ou inválida!");
        }
    }

    public void removerAlergia(String alergia) {
        if (alergia != null && alergias.contains(alergia)) {
            this.alergias.remove(alergia);
        } else {
            System.out.println("Alergia não encontrada ou inválida!");
        }
    }

    public void removerMedicamento(String medicamento) {
        if (medicamento != null && medicamentosEmUso.contains(medicamento)) {
            this.medicamentosEmUso.remove(medicamento);
        } else {
            System.out.println("Medicamento não encontrado ou inválido!");
        }
    }
    
    public void removerCirurgia(String cirurgia) {
        if (cirurgia != null && cirurgiasAnteriores.contains(cirurgia)) {
            this.cirurgiasAnteriores.remove(cirurgia);
        } else {
            System.out.println("Cirurgia não encontrada ou inválida!");
        }
    }
    
    public void removerExame(String exame) {
        if (exame != null && examesRealizados.contains(exame)) {
            this.examesRealizados.remove(exame);
        } else {
            System.out.println("Exame não encontrado ou inválido!");
        }
    }
    
    public void removerVacina(String vacina) {
        if (vacina != null && vacinas.contains(vacina)) {
            this.vacinas.remove(vacina);
        } else {
            System.out.println("Vacina não encontrada ou inválida!");
        }
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
