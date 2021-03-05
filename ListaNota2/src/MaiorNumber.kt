/*
@Author Diego Fernandes Lins
RA: 2920481921010
Um programa que le 3 numeros e mostra qual o maior numero
*/
fun main(){
    var i = 0
    var maior = 0
    for(i in 1..3){
        print("Digite um numero: ")
        var number = readLine().toString().toInt()
        if(number > maior)
            maior = number
    }
    println("O maior é $maior")
}