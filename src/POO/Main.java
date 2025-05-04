package POO;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {


    Voluntario voluntario2 = new Voluntario("Ruan", "12345678911", "88997841263", 
            "Barreiras dos paraibanos", "oruan666@gmail.com", LocalDate.of(2003, 05, 12),
            new ArrayList<>());

    Animal animal = new Animal("Rex", "Cachorro", "Pitbull", 5, "Macho", 30.0,
        "Gosta de crianças", true, null, voluntario2, false);

    ClinicaVeterinaria clinica1 = new ClinicaVeterinaria("Clínica Central", "Rua Principal, 123", "12345678901", "contato@clinicacentral.com", new ArrayList<>());
    clinica1.adicionarAnimal(animal);

    Adotante adotante = new Adotante("Maria", "98765432100", "11987654321",
        "Avenida das Flores, 456");
    
    HistoricoMedico historicoMedicoRex = new HistoricoMedico();

    // Adicionando múltiplos itens de uma vez
    historicoMedicoRex.adicionarDoencasPreexistentes(List.of("Diabetes", "Hipertensão"));
    historicoMedicoRex.adicionarAlergias(List.of("Pólen", "Amendoim"));
    historicoMedicoRex.adicionarMedicamentosEmUso(List.of("Insulina", "Antialérgico"));
    historicoMedicoRex.adicionarCirurgiasAnteriores(List.of("Cirurgia de joelho"));
    historicoMedicoRex.adicionarExamesRealizados(List.of("Raio-X", "Hemograma"));
    historicoMedicoRex.adicionarVacinas(List.of("Antirrábica", "Polivalente", "V10", "V8"));

    animal.setHistoricoMedico(historicoMedicoRex);
    animal.avaliarSaude();
    animal.avaliarCondicao();
    animal.exibirDetalhes();

    animal.avaliarCondicao();
    // Tentando encaminhar o animal para adoção enquanto ele está em tratamento
    animal.encaminharParaAdocao(adotante);

    // Removendo o animal do tratamento
    clinica1.removerAnimal(animal);

    // Tentando encaminhar o animal para adoção novamente
    animal.encaminharParaAdocao(adotante);

    // Criando uma adoção
    Adocao adocao = new Adocao(animal, adotante, LocalDate.now());
    adocao.registrarAdocao();
    adocao.exibirDetalhes();
    
    // Enviando notificações
    Notificacao.enviar("Obrigado por resgatar o animal!", voluntario2);
    Notificacao.enviarResgate("Resgate realizado com sucesso!", voluntario2, animal);
    }
}
