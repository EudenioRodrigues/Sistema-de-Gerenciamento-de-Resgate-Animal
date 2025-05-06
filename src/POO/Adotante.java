package POO;

public class Adotante {
    private String nome;
    private String endereco;
    private String telefone;
    private String email;

    public Adotante(String nome, String endereco, String telefone, String email) {
        setNome(nome);
        setEndereco(endereco);
        setTelefone(telefone);
        setEmail(email);
    }

    private boolean isStringValida(String s) {
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
    
    public String getTelefone() {
        return telefone;
    }
    
    public void setTelefone(String telefone) {
        if (telefone != null && telefone.matches("\\d{11}")) {
            this.telefone = telefone;
        } else {
            System.out.println("Telefone inválido! Deve conter 11 dígitos numéricos.");
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
}
