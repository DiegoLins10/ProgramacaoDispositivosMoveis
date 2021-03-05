fun main(){
    print("Digite o valor da prestação original: ")
    var valor: Double = readLine().toString().toDouble()
    print("Digite o valor da taxa: ")
    var taxa: Double = readLine().toString().toDouble()
    print("Digite o tempo de atraso: ")
    var tempo: Int = readLine().toString().toInt()

    var prestacao: Double = valor + (valor * (taxa/100) * tempo)
    println("Prestação atrasada : R$ %.2f".format(prestacao))
}