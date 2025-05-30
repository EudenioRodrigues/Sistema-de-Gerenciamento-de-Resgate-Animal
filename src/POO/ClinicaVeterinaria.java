package POO;

import java.util.List;

public class ClinicaVeterinaria {
    private String nomeClinica;
    private String enderecoClinica;
    private String telefoneClinica;
    private String emailClinica;
    private List<Animal> animaisEmTratamento;


    public ClinicaVeterinaria(String nomeClinica, String enderecoClinica, String telefoneClinica, String emailClinica, List<Animal> animaisEmTratamento) {
        setNomeClinica(nomeClinica);
        setEnderecoClinica(enderecoClinica);
        setTelefoneClinica(telefoneClinica);
        setEmailClinica(emailClinica);
        setAnimaisEmTratamento(animaisEmTratamento);
    }

    public boolean isStringValida(String s) {
        return s != null && !s.trim().isEmpty();
    }
    
    public String getNomeClinica() {
        return nomeClinica;
    }
    
    public void setNomeClinica(String nomeClinica) {
        if (isStringValida(nomeClinica)) {
            this.nomeClinica = nomeClinica;
        } else {
            System.out.println("Nome da clínica inválido!");
        }
    }
    
    public String getEnderecoClinica() {
        return enderecoClinica;
    }
    
    public void setEnderecoClinica(String enderecoClinica) {
        if (isStringValida(enderecoClinica)) {
            this.enderecoClinica = enderecoClinica;
        } else {
            System.out.println("Endereço da clínica inválido!");
        }
    }
    
    public String getTelefoneClinica() {
        return telefoneClinica;
    }
    
    public void setTelefoneClinica(String telefoneClinica) {
        if (telefoneClinica != null && telefoneClinica.matches("\\d{11}")) {
            this.telefoneClinica = telefoneClinica;
        } else {
            System.out.println("Telefone da clínica inválido! Deve conter 11 dígitos numéricos.");
        }
    }
    
    public String getEmailClinica() {
        return emailClinica;
    }
    
    public void setEmailClinica(String emailClinica) {
        if (emailClinica != null && emailClinica.matches("^[\\w._%+-]+@[\\w.-]+\\.[a-zA-Z]{2,}$")) {
            this.emailClinica = emailClinica;
        } else {
            System.out.println("E-mail da clínica inválido!");
        }
    }

    public List<Animal> getAnimaisEmTratamento() {
        return animaisEmTratamento;
    }
    
    public void setAnimaisEmTratamento(List<Animal> animaisEmTratamento) {
        if(animaisEmTratamento != null){
            this.animaisEmTratamento = animaisEmTratamento;
        }
        else{
            System.out.println("Lista de animais em tratamento invalida");
        }
    }

    public void adicionarAnimal(Animal animal) {
        if (!animaisEmTratamento.contains(animal) && animal.getClinicaVeterinaria() == null) {
            animaisEmTratamento.add(animal);
            animal.setClinicaVeterinaria(this); 
        }
    }

    public void removerAnimal(Animal animal) {
        if (animaisEmTratamento.contains(animal)) {
            animaisEmTratamento.remove(animal); 
            animal.setClinicaVeterinaria(null); 
        }
    }

    public void exibirDetalhes() {
        System.out.println("Nome da Clínica: " + nomeClinica);
        System.out.println("Endereço: " + enderecoClinica);
        System.out.println("Telefone: " + telefoneClinica);
        System.out.println("E-mail: " + emailClinica);
        System.out.println("Animais em Tratamento: ");
        for (Animal animal : animaisEmTratamento) {
            System.out.println("- " + animal.getNome());
        }
        System.out.println("=========================================================");
    }
}
