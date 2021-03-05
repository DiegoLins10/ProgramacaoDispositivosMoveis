fun main(){
    print("Digite a cotacao do dolar: ")
    var cotacao: Double = readLine().toString().toDouble()
    print("Digite sua quantidade de dolar")
    var quant: Double = readLine().toString().toDouble()

    var conversao = cotacao*quant
    print("Voce tem R$ %.2f".format(conversao))
}