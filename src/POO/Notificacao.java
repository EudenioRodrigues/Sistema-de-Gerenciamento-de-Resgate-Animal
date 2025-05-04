package POO;

public class Notificacao {
    public static void enviar(String mensagem, Voluntario voluntario) {
        System.out.println("Notificação para " + voluntario.getNome() + ": " + mensagem);
    }

    public static void enviarResgate(String mensagem, Voluntario voluntario, Animal animal) {
        System.out.println("Notificação para " + voluntario.getNome() + ": " + mensagem);
        System.out.println("Você resgatou o animal " + animal.getNome());
    }
}
