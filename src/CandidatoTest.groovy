import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class CandidatoTest {

    @Test
    void testarToString() {
        Candidato candidato = new Candidato();
        candidato.nome = "João";
        candidato.email = "joao@gmail.com";
        candidato.cpf = "123.456.789-00";
        candidato.idade = 30;
        candidato.estado = "ES";
        candidato.cep = "29800-000";
        candidato.descricao = "Descrição do João";
        candidato.competencias = ["Java", "Groovy"];

        String esperado = "Candidato: João, joao@email.com, cpf:123.456.789-00, idade:30, Endereço:ES-29800-000, Descrição: Descrição do João, competencias: [Java, Groovy]";
        assertEquals(esperado, candidato.toString());
    }
}

