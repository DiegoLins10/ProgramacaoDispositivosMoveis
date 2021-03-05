/*
@Author Diego Fernandes Lins
RA: 2920481921010
Um programa que recebe um numero e calcula o fatorial do numero usando recursividade.
*/

fun main(){
    var number = readLine().toString().toInt()
    println("O fatorial de $number é ${fatorial(number)}")

}
fun fatorial(n: Int): Int{
    if(n>= 1)
        return n * fatorial(n - 1)
    else
        return 1
}