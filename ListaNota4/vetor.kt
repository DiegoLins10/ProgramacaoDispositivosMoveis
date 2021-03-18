/*
@Author Diego Fernandes Lins
RA: 2920481921010
Um programa que apresenta os valores em um vetor
*/

fun main(){
    var numeros = Array<Int>(10,{i->i}) //preencher um vetor
    var num = 1

    for(i in 0..numeros.size-1){
        numeros[i] = num
        num++
    }
    for(i in 0..numeros.size-1)
        print("${numeros[i]} "  )
}