/*
@Author Diego Fernandes Lins
RA: 2920481921010
Um programa que faz três operações como calcular o fatorial, numero quadro e o volume de de uma lata .
*/

fun main() {
    var cod = 0
    var number: Int
    while (cod != 4) {
        println("1 - fatorial\n2 - quadrado de um numero\n3 - volume de uma lata\n4 - Sair")
        print("Digite o codigo da operação: ")
        cod = readLine().toString().toInt()
        if (cod == 1) {
            print("Digite o numero que deseja ver o fatorial: ")
            number = readLine().toString().toInt()
            println("O fatorial de $number é ${fatorial(number)}")
        }
        if (cod == 2) {
            print("Digite o numero que deseja ver o quadrado: ")
            number = readLine().toString().toInt()
            println("O quadrado de $number é ${quadradoNumero(number)}")
        }
        if (cod == 3) {
            print("Digite  o raio: ")
            var raio: Double = readLine().toString().toDouble()
            print("Digite a altura: ")
            var altura: Double = readLine().toString().toDouble()
            println("O volume é %.4f".format(calcLata(raio, altura)))
        }
    }
}
fun fato(n: Int): Int{
    if(n>= 1)
        return n * fato(n - 1)
    else
        return 1
    }

fun quadradoNumero(n: Int): Int{
    return n*n
}
fun calcLata(raio: Double, altura: Double, pi: Double = 3.14159): Double{
    var vol: Double = 3.14159 * Math.pow(raio, 2.0) * altura
    return vol
}