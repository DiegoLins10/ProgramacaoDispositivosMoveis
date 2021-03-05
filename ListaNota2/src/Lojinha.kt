/*
@Author Diego Fernandes Lins
RA: 2920481921010
Um programa que recebe o id do produto, quantidade e calcule o valor para o cliente
*/

fun main(){

    var idProd = 0
    var quantidade: Int
    while(idProd != 99){
        println("Especificação \tCódigo \tPreço")
        println("Cachorro quente \t100 \t\t1,20\n" +
                "Bauru simples   \t101 \t\t1,30\n" +
                "Bauru com ovo   \t102 \t\t1,50\n" +
                "Hambúrger   \t\t103 \t\t1,20\n" +
                "Cheeseburguer   \t104 \t\t1,30\n" +
                "Refrigerante \t\t105 \t\t1,00\n" +
                "Sair \t\t\t\t99" )
        print("Digite o codigo do produto: ")
        idProd = readLine().toString().toInt()
        if(idProd == 100) {
            print("Digite a quantidade: ")
            quantidade = readLine().toString().toInt()
            println(" Total: R$ %.2f".format(CachorroQuente(quant = quantidade)))
        }
        else if(idProd == 101) {
            print("Digite a quantidade: ")
            quantidade = readLine().toString().toInt()
            println(" Total: R$ %.2f".format(BauruSimples(quant = quantidade)))
        }
        else if(idProd == 102) {
            print("Digite a quantidade: ")
            quantidade = readLine().toString().toInt()
            println(" Total: R$ %.2f".format(BauruComOvo(quant = quantidade)))
        }
        else if(idProd == 103) {
            print("Digite a quantidade: ")
            quantidade = readLine().toString().toInt()
            println(" Total: R$ %.2f".format(Hamburguer(quant = quantidade)))
        }
        else if(idProd == 104) {
            print("Digite a quantidade: ")
            quantidade = readLine().toString().toInt()
            println(" Total: R$ %.2f".format(chesseburger(quant = quantidade)))
        }
        else if(idProd == 105) {
            print("Digite a quantidade: ")
            quantidade = readLine().toString().toInt()
            println(" Total: R$ %.2f".format(Refri(quant = quantidade)))
        }
    }
}

fun CachorroQuente(preco :Double = 1.20, quant: Int): Double{
    return preco * quant
}
fun BauruSimples(preco :Double = 1.30, quant: Int): Double {
    return preco * quant
}
fun BauruComOvo(preco :Double = 1.50, quant: Int): Double {
    return preco * quant
}
fun Hamburguer(preco :Double = 1.20, quant: Int): Double {
    return preco * quant
}
fun chesseburger(preco :Double = 1.30, quant: Int): Double {
    return preco * quant
}
fun Refri(preco :Double = 1.00, quant: Int): Double {
    return preco * quant
}

