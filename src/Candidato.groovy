class Candidato extends Pessoa {

        String  cpf
        int idade
        List<String> competencias = []

        String toString() {
                return "Candidato: ${nome}, ${email}, cpf:${cpf}, idade:${idade}, Endereço:${estado}-${cep}, Descrição: ${descricao}, competencias: ${competencias}"
        }
}

