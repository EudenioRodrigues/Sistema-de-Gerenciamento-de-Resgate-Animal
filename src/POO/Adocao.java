package POO;

import java.time.LocalDate;

public class Adocao {
    private Animal animal;
    private Adotante adotante;
    private LocalDate dataAdocao;

    public Adocao(Animal animal, Adotante adotante, LocalDate dataAdocao) {
        this.animal = animal;
        this.adotante = adotante;
        this.dataAdocao = dataAdocao;
        this.animal.setAdotado(true);
    }
    
    public void registrarAdocao() {
        System.out.println("==================Adoção==================");
        System.out.println("Adoção registrada:");
        System.out.println("Animal: " + animal.getNome());
        System.out.println("Adotante: " + adotante.getNome());
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
