/*
@Author Diego Fernandes Lins
RA: 2920481921010
Um programa que solicita 5 valores ao usuario e os adiciona no vetor A
e apos isso calcula o fatorial do numero e adiciona no vetor B.
*/

fun main(){
    var A = Array<Int>(5, {i->i}) // criando array int
    var B = Array<Int>(5, {i->i})

    for(i in 0..A.size-1){
        print("Digite o valor ${i+1}: ") //adicionando os valores
        var v1 = readLine().toString().toInt()
        A[i] = v1 // adicionando o numero ao vetor A
        B[i] = fatorial(v1)// chamando a função e adicionando o numero ao vetor B
    }
    print("vetor A: ")
    for(i in 0..A.size-1){ // imprimindo o vetor A
        print("${A[i]} ")
    }
    println()// quebra de linha
    print("vetor B: ")
    for(i in 0..B.size-1){ // imprimindo o vetor B
        print("${B[i]} ")
    }

}
fun fatorial(n: Int): Int{ // função para calcular o fatorial usando recursividade
    if(n>= 1)
        return n * fatorial(n - 1)
    else
        return 1
}