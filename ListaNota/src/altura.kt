fun main(){
    print("Digite  o raio: ")
    var raio: Double = readLine().toString().toDouble()
    print("Digite a altura")
    var altura: Double = readLine().toString().toDouble()

    var vol: Double = 3.14159 * Math.pow(raio, 2.0) * altura
    println("Volume: %.4f".format(vol))
}