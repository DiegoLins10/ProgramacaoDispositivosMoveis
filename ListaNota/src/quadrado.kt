import java.lang.*

fun main(){
    print("Digite um numero para elevar ao quadrado: ")
    var a = readLine().toString().toDouble()
    var quadrado: Double = Math.pow(a,2.0)
    println(quadrado)
}