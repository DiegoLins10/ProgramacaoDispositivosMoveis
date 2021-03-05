/*
@Author Diego Fernandes Lins
RA: 2920481921010
Um programa com uma função que recebe três numeros inteiros e mostra os em ordem crescente
*/

fun main(){
    print("Digite o primeiro numero: ")
    var a = readLine().toString().toInt()
    print("Digite o segundo numero: ")
    var b = readLine().toString().toInt()
    print("Digite o terceiro numero: ")
    var c = readLine().toString().toInt()
    for(n in ordernar(a,b,c)){
        println(n)
    }

}
fun ordernar(vararg  numero:Int): IntArray{
    return numero.sortedArray()
}