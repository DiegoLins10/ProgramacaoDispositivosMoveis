/*
@Author Diego Fernandes Lins
RA: 2920481921010
Um programa para mostrar o maior e o menor numero
*/
fun main(){
    var i = 0
    var maior = 0
    var menor = 99999999
    for(i in 1..5){
        print("Digite um numero: ")
        var number = readLine().toString().toInt()
        if(number > maior)
            maior = number
        if(number < menor)
            menor = number
    }
    println("O maior é $maior")
    println("O menor é $menor")
}