package POO;

import java.time.LocalDate;

public class Adocao {
    private Animal animal;
    private Adotante adotante;
    private LocalDate dataAdocao;

    public Adocao(Animal animal, Adotante adotante, LocalDate dataAdocao) {
        setAnimal(animal);
        setAdotante(adotante);
        setDataAdocao(dataAdocao);
        this.animal.setAdotado(true);
    }
    
    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        if (animal != null) {
            this.animal = animal;
        }
    }

    public Adotante getAdotante() {
        return adotante;
    }

    public void setAdotante(Adotante adotante) {
        if (adotante != null) {
            this.adotante = adotante;
        }
    }

    public LocalDate getDataAdocao() {
        return dataAdocao;
    }

    public void setDataAdocao(LocalDate dataAdocao) {
        if(dataAdocao != null) {
            if (dataAdocao.isAfter(LocalDate.now())) {
                System.out.println("Data de adoção não pode ser futura!");
                return;
            }
            this.dataAdocao = dataAdocao;
        } else {
            System.out.println("Data de adoção inválida!");
        }
    }

    public void registrarAdocao() {
        System.out.println("==================Adoção==================");
        System.out.println("Adoção registrada:");
        System.out.println("Animal: " + animal.getNome());
        System.out.println("Data da adoção: " + dataAdocao);
        System.out.println("=============================================");
    }

    public void exibirDetalhes() {
        System.out.println("==================Detalhes da Adoção==================");
        System.out.println("Detalhes da adoção:");
        System.out.println("Animal: " + animal.getNome());
        System.out.println("Adotante: " + adotante.getNome());
        System.out.println("Data da adoção: " + dataAdocao);
        System.out.println("=======================================================");
    }
}
