fun main() {
    val cliente = Cliente("Marcos")
    //cliente.nome = "João"
    println("O Cliente é ${cliente.nome}")
}

class Cliente(val nomeInicial:String){
    val nome:String = nomeInicial
}