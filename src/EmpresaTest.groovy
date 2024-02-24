import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class EmpresaTest {

    @Test
    void testToString() {
        Empresa empresa = new Empresa();
        empresa.nome = "softwares prime";
        empresa.email = "softwares.prime@gmail.com";
        empresa.cnpj = "12.345.678/0001-99";
        empresa.estado = "ES";
        empresa.cep = "29800-000";
        empresa.pais = "Brasil";
        empresa.descricao = "Empresa especializada em softwares por encomenda";
        empresa.competenciasDesejadas = ["Java", "Groovy"];

        String esperado = "Empresa: softwares prime, softwares.prime@gmail.com, cnpj:12.345.678/0001-99, Endereço:ES-29800-000,Brasil, Descrição: Empresa especializada em softwares por encomenda, competencias desejadas:[Java, Groovy]";
        assertEquals(esperado, empresa.toString());
    }
}

