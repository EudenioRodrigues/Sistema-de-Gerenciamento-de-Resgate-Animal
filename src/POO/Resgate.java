package POO;

import java.time.LocalDate;

public class Resgate {
    private Animal animal;
    private Voluntario voluntario;
    private LocalDate dataResgate;
    
    public Resgate(Animal animal, Voluntario voluntario, LocalDate dataResgate) {
        this.animal = animal;
        this.voluntario = voluntario;
        this.dataResgate = dataResgate;
    }

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        if(animal != null){
            this.animal = animal;
        }
          else{
             System.out.println("Animal inválido!");
        }
    }

    public Voluntario getVoluntario() {
        return voluntario;
    }

    public void setVoluntario(Voluntario voluntario) {
        if(voluntario != null){
            this.voluntario = voluntario;
        }
        else{
            System.out.println("Voluntário inválido!");
        }
    }

    public LocalDate getDataResgate() {
        return dataResgate;
    }
    
    public void setDataResgate(LocalDate dataResgate) {
        if (dataResgate != null) {
            if (dataResgate.isAfter(LocalDate.now())) {
                System.out.println("Data de resgate não pode ser futura!");
                return;
            }
            this.dataResgate = dataResgate;
        } else {
            System.out.println("Data de resgate inválida!");
        }
    }

    public void registrar() {
        voluntario.getAnimaisResgatados().add(animal);
        animal.setVoluntario(voluntario);
        System.out.println("==================Resgate==================");
        System.out.println("Resgate registrado de " + animal.getNome() + " por " + voluntario.getNome());
        System.out.println("=============================================");
    }
    
    public void exibirDetalhes() {
        System.out.println("==================Detalhes do resgate==================");
        System.out.println("Animal: " + animal.getNome());
        System.out.println("Voluntário: " + voluntario.getNome());
        System.out.println("Data do resgate: " + dataResgate);
        System.out.println("=======================================================");
    }
}
