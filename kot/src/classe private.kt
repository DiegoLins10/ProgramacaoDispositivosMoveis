fun main() {


}

//variaveis ou constantes
private val dentroDoArquivo = 1
//protected val protegidoNaoSuportoAqui = 1
internal val dentroDoProjeto = 1
public val publico = 1
//funcoes
private fun dentroDoArquivo() = 1
//protected protegidoNaoSuportadoaqui() = 1
internal fun dentroDoProjeto() = 1
public fun publico() = 1
open class Exemplo{
    //atributos da classes
    private val dentroDoObjeto = 1
    protected val vaiPorHeranca = 1
    internal val dentroDoProjeto = 1
    public val publico = 1
    //métodos da classe
    private fun dentroDoObjeto() =1
    protected fun vaiPorHeranca() = 1
    internal fun dentroDoProjeto() = 1
    public fun publico() = 1

}

class ExemploFilha: Exemplo(){

    fun verificaAcesso(){
        //println(Exemplo.dentroDoObjeto)
        println(vaiPorHeranca)
        println(dentroDoProjeto)
        println(publico)

    }

}

fun verificaACesso(){
    //println(Exemplo().dentroDoObjeto)
    //println(Exemplo().vaiPorHeranca)
    println(Exemplo().dentroDoProjeto)
    println(Exemplo().publico)
}

