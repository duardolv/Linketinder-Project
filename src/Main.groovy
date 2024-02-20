// Código por: Eduardo Guimarães

def sistema = new Sistema()

Scanner input = new Scanner(System.in)

List<Candidato> candidatos = [
        new Candidato(nome: "Josué", email: "josue@gmail.com", cpf: "123.456.789-00", idade: 27, estado:"São Paulo", cep:"14800-000", descricao:"descricao", competencias: ["React", "NodeJs"]),
        new Candidato(nome: "Maria", email: "maria@gmail.com", cpf: "234.567.890-11", idade: 30, estado:"Espírito Santo", cep:"29800-000", descricao:"Desenvolvedora Java com experiência em Spring Boot", competencias: ["Java", "Spring Boot"]),
        new Candidato(nome: "João", email: "joao@gmail.com", cpf: "345.678.901-22", idade: 35, estado:"Rio de Janeiro", cep:"20000-000", descricao:"Desenvolvedor Python especializado em Django", competencias: ["Python", "Django"]),
        new Candidato(nome: "Ana", email: "ana@gmail.com", cpf: "456.789.012-33", idade: 18, estado:"São Paulo", cep:"01000-000", descricao:"Desenvolvedora júnior JavaScript com conhecimento em Vue.js", competencias: ["JavaScript", "Vue.js"]),
        new Candidato(nome: "Pedro", email: "pedro@gmail.com", cpf: "567.890.123-44", idade: 28, estado:"Minas Gerais", cep:"30000-000", descricao:"Desenvolvedor C# com experiência em .NET", competencias: ["C#", ".NET"])
]

        List<Empresa> empresas = [
        new Empresa(nome: "TechNova", email: "technova@email.com", cnpj: "23.456.789/0001-01", estado:"São Paulo", cep:"12800-000",pais:"Brasil", descricao:"descricao", competenciasDesejadas: ["Java"]),
        new Empresa(nome: "InovaSoft", email: "inovasoft@email.com", cnpj: "34.567.890/0001-12", estado:"Espírito Santo", cep:"29800-000", pais:"Brasil", descricao:"Empresa inovadora com foco em soluções tecnológicas personalizadas", competenciasDesejadas: ["JavaScript"]),
        new Empresa(nome: "MegaByte", email: "megabyte@email.com", cnpj: "45.678.901/0001-23", estado:"Rio de Janeiro", cep:"20000-000", pais:"Brasil", descricao:"Empresa líder em transformação digital e automação de processos", competenciasDesejadas: ["C#"]),
        new Empresa(nome: "UltraTech", email: "ultratech@email.com", cnpj: "56.789.012/0001-34", estado:"São Paulo", cep:"01000-000", pais:"Brasil", descricao:"Empresa de tecnologia focada em soluções de inteligência artificial", competenciasDesejadas: ["Python"]),
        new Empresa(nome: "SuperCode", email: "supercode@email.com", cnpj: "67.890.123/0001-45", estado:"Minas Gerais", cep:"30000-000", pais:"Brasil", descricao:"Empresa de desenvolvimento de software com ênfase em segurança cibernética", competenciasDesejadas: ["Ruby"])
]

candidatos.each { sistema.adiconarCandidato(it) }
empresas.each { sistema.adiconarEmpresa(it) }

while(true){
    println("""
        1 - Listar empresas e candidatos
        2 - Listar match entre empresas e candidatos
        3 - Adicionar candidato
        4 - Adicionar empresa
        5 - Sair
    """)

    def opcao = input.nextLine().toInteger()
    if(5 == opcao){
        break
    }

    switch (opcao) {
        case 1:
            sistema.listarCandidatos()
            println()
            sistema.listarEmpresa()
            break

        case 2:
            sistema.match()
            break
        case 3:
            println("nome do candidato")
            String nomeCandidato= input.nextLine()

            println("email")
            String emailCandidato = input.nextLine()

            println("cpf")
            String cpfCandidato = input.nextLine()

            println("idade")
            int idadeCandidato = input.nextLine().toInteger()

            println("Estado onde mora:")
            String estadoCandidato  = input.nextLine()

            println("cep:")
            String cepCandidatp =input.nextLine()

            println("descrição:")
            String descricaoCandidato = input.nextLine()

            println("competencias:")
            String competenciasCandidato = input.nextLine()

            def candidadoAdicionado = new Candidato(nome: nomeCandidato, email: emailCandidato, cpf: cpfCandidato, idade: idadeCandidato, estado: estadoCandidato, cep: cepCandidatp, descricao: descricaoCandidato, competencias: [competenciasCandidato])
            sistema.adiconarCandidato(candidadoAdicionado)
            println("candidato adicionado com sucesso")
            break
        case 4:
            println("Nome da empresa:")
            String nomeEmpresa= input.nextLine()

            println("email:")
            String emailEmpresa = input.nextLine()

            println("cnpj:")
            String cnpjEmpresa = input.nextLine()

            println("Estado onde fica:")
            String estadoEmpresa = input.nextLine()

            println("cep:")
            String cepEmpresa = input.nextLine()

            println("País")
            String paisEmpresa = input.nextLine()

            println("descrição:")
            String descricaoEmpresa = input.nextLine()

            println("competencias desejadas:")
            String competenciasEmpresa = input.nextLine()
            def empresaAdicionada = new Empresa(nome: nomeEmpresa, email: emailEmpresa, cnpj: cnpjEmpresa, estado:estadoEmpresa, cep:cepEmpresa, pais:paisEmpresa, descricao:descricaoEmpresa, competenciasDesejadas: [competenciasEmpresa])
            sistema.adiconarEmpresa(empresaAdicionada)
            println("Empresa adicionada com sucesso")
            break
    }
}


