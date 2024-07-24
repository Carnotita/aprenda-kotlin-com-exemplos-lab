enum class Nivel { BASICO, INTERMEDIARIO, AVANCADO }
enum class Tipo { VIDEO, MATERIAL_DIDATICO, QUESTIONARIO }

class Usuario(val id: Int, var nome: String)

data class ConteudoEducacional(var nome: String, val duracao: Int, val tipo: Tipo)

data class Formacao(val nome: String, var conteudos: List<ConteudoEducacional>, var nivel: Nivel) {
    val inscritos = mutableListOf<Usuario>()
    
    fun matricular(usuario: Usuario) {
        inscritos.add(usuario)
    }
}

fun main() {
    //TODO("Analise as classes modeladas para este domínio de aplicação e pense em formas de evoluí-las.")
    //TODO("Simule alguns cenários de teste. Para isso, crie alguns objetos usando as classes em questão.")
    
    val conteudo1 = ConteudoEducacional("Primeiros passos com Kotlin", 1029, Tipo.VIDEO)
    val conteudo2 = ConteudoEducacional("DIOsafio Kotlin", 3600, Tipo.QUESTIONARIO)
    
    val formacaoKotlin = Formacao(
    
        nome = "Curso secreto chines de Kotlin",
        conteudos = listOf(conteudo1, conteudo2),
        nivel = Nivel.BASICO
    )
    
    val usuario1 = Usuario (1, "Lucas")
    val usuario2 = Usuario (2, "Matheus")
    
    formacaoKotlin.matricular(usuario1)
    formacaoKotlin.matricular(usuario2)
   
}