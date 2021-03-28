/*
@Author Diego Fernandes Lins
RA: 2920481921010
Um programa para somar o valor das compras total de uma loja de computadores
*/
fun main() {
    val PecasPC = listOf(
        Produto("ram", 210.00),
    Produto("Placa de video", 1000.0),
    Produto("placa mãe", 880.00),
    Produto("Processador", 1500.50) ,
    Produto("Fonte", 500.50),
        Produto("AIR cooler", 500.50),
    )
    val somaTotal = {total: Double, atual: Double -> total + atual}
    val precoTotal = PecasPC.map{it.preco}.reduce(somaTotal)
    println("O total do seu computador é R$ $precoTotal")
     }

data class Produto (val nomeP: String, val preco: Double)