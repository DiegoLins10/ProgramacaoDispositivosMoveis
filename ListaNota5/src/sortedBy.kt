/*
@Author Diego Fernandes Lins
RA: 2920481921010
Um programa usando o SortedBy para ordenar os numeros de um dado
*/

fun main(){
    val dado = arrayListOf(4,2,3,1,5,6)

    val arrumarDado = dado.sortedBy { it }
    println("O valor sorteado é $arrumarDado")
}