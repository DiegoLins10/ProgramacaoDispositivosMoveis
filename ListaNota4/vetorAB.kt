/*
@Author Diego Fernandes Lins
RA: 2920481921010
Um programa que apresenta os valores de dis vetores com um B com os valores do A multiplicado.
*/

fun main(){
    var A = Array<Int>(10, {i->i})
    var B = Array<Int>(10, {i->i})

    var num = 1;

    print("Grupo A: ")
    for(i in 0..A.size-1){
        A[i] = num
        num++
        B[i] = A[i] * 2
        print("${A[i]} ")
    }
    println()
    print("Grupo B: ")
    for(i in 0..B.size-1){
        print("${B[i]} ")
    }
}