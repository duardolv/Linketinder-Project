class Empresa extends Pessoa {
    String cnpj
    String pais
    List<String> competenciasDesejadas = []

    String toString() {
        return "Empresa: ${nome}, ${email}, cnpj:${cnpj}, Endereço:${estado}-${cep},${pais}, Descrição: ${descricao}, competencias desejadas:${competenciasDesejadas}"
    }
}
