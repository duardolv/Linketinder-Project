class Sistema {
    List<Candidato> candidatos = []
    List<Empresa> empresas = []

    void listarCandidatos(){
        candidatos.each { candidato ->
            println candidato}
    }

    void listarEmpresa(){
        empresas.each {empresa ->
            println empresa}
    }

    void adiconarCandidato(Candidato candidato){
        candidatos << candidato
    }

    void adiconarEmpresa(Empresa empresa){
        empresas << empresa
    }

    void match(){
        candidatos.each {candidato  ->
            empresas.each {empresa ->
                if(candidato.competencias.intersect(empresa.competenciasDesejadas)){
                    println "O candidato ${candidato.nome} deu match com a empresa ${empresa.nome}"
                }
            }
        }
    }
}
