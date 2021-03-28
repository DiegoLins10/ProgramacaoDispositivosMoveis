/*
@Author Diego Fernandes Lins
RA: 2920481921010
Um programa usando função anonima para ver o tamanho de uma string
*/
fun main(){
    val tamanhoString: (String) -> Int = { input ->
        input.length
    }
    val tamanho: Int = tamanhoString("Android")
    println("O tamanho é " + tamanho)
}