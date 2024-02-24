import org.junit.jupiter.api.Test
import static org.junit.jupiter.api.Assertions.assertEquals

class SistemaTest {

    @Test
    void testarAdicionarCandidato() {
        Sistema sistema = new Sistema()
        Candidato candidato = new Candidato(nome: 'João', competencias: ['Java', 'Groovy'])

        sistema.adiconarCandidato(candidato)

        assertEquals(1, sistema.candidatos.size())
    }

    @Test
    void testarListarCandidatos() {
        Sistema sistema = new Sistema()
        Candidato candidato = new Candidato(nome: 'João', competencias: ['Java', 'Groovy'])

        sistema.adiconarCandidato(candidato)

        assertEquals('João', sistema.candidatos[0].nome)
    }

    @Test
    void testarAdicionarEmpresa() {
        Sistema sistema = new Sistema()
        Empresa empresa = new Empresa(nome: 'Empresa X', competenciasDesejadas: ['Java', 'Groovy'])

        sistema.adiconarEmpresa(empresa)

        assertEquals(1, sistema.empresas.size())
    }

    @Test
    void testarListarEmpresas() {
        Sistema sistema = new Sistema()
        Empresa empresa = new Empresa(nome: 'Empresa X', competenciasDesejadas: ['Java', 'Groovy'])

        sistema.adiconarEmpresa(empresa)

        assertEquals('Empresa X', sistema.empresas[0].nome)
    }


}



