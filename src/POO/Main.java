package POO;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

    // Criando um voluntário
    Voluntario voluntario1 = new Voluntario("Ruan", "12345678911", "88997841263", 
            "Barreiras dos paraibanos", "oruan666@gmail.com", LocalDate.of(2003, 05, 12),
            new ArrayList<>());

    // Criando um animal        
    Animal animal = new Animal("Rex", "Cachorro", "Pitbull", 5, "Macho", 30.0,
        "Gosta de crianças", true,voluntario1);
    
    // Criando uma clínica veterinária    
    ClinicaVeterinaria clinica1 = new ClinicaVeterinaria("Clínica Central", "Rua Principal, 123", "12345678901", "contato@clinicacentral.com", new ArrayList<>());
    clinica1.adicionarAnimal(animal);
    
    // Criando um adotante
    Adotante adotante = new Adotante("Maria", "Rua Teste 01", "88981918522",
        "maria@gmail.com");
    
    // Criando um histórico médico de Rex    
    HistoricoMedico historicoMedicoRex = new HistoricoMedico(animal);

    // Adicionando múltiplos itens de uma vez
    historicoMedicoRex.adicionarDoencasPreexistentes(List.of("Cinomose", "Parvovirose"));
    historicoMedicoRex.adicionarAlergias(List.of("Dermatite Atópica"));
    historicoMedicoRex.adicionarMedicamentosEmUso(List.of("Benzilpenicilina procaína"));
    historicoMedicoRex.adicionarCirurgiasAnteriores(List.of("Cirurgia de joelho"));
    historicoMedicoRex.adicionarExamesRealizados(List.of("Raio-X"));
    historicoMedicoRex.adicionarVacinas(List.of("Antirrábica", "Polivalente"));
    
    // Adicionando o histórico médico ao animal
    animal.setHistoricoMedico(historicoMedicoRex);
    // Avalaindo a saúde e condição do animal

    animal.avaliarSaude();
    animal.avaliarCondicao();
    animal.exibirDetalhes();

    // Tentando encaminhar o animal para adoção enquanto ele está em tratamento
    animal.encaminharParaAdocao(adotante);

    // Removendo o animal do tratamento
    clinica1.removerAnimal(animal);

    // Tentando encaminhar o animal para adoção novamente
    animal.encaminharParaAdocao(adotante);

    // Enviando notificações
    Notificacao.enviar("Obrigado por resgatar o animal!", voluntario1);
    Notificacao.enviarResgate("Resgate realizado com sucesso!", voluntario1, animal);

    // Testando ativação e desativação de voluntário
    voluntario1.desativar();
    voluntario1.avaliarCondicao();
    voluntario1.ativar();
    voluntario1.avaliarCondicao();
    
    // Testando adição e remoção de animais na clínica
    Animal animal2 = new Animal("Luna", "Gato", "Siamês", 3, "Fêmea", 4.5,
            "Muito dócil", true, voluntario1);
    animal2.exibirDetalhes();
    
    voluntario1.exibirDetalhes();

    animal.encaminharParaAdocao(adotante);
    }
}
