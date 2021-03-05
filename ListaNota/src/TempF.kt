fun main(){
    print("Digite a temperatura em Fahrenheit: ")
    var f: Double = readLine().toString().toDouble()

    var c: Double = ((f - 32.0)*(5.0/9.0))
    println("%.2f Graus Fahrenheit são %.2f graus em Celsius".format(f, c))
}