fun main(){
    print("Digite a temperatura em Celsiu: ")
    var c: Double = readLine().toString().toDouble()

    var f: Double = (9 * c + 160) /5
    println("$c Graus Celsius são $f graus em Fahrenheit")
}