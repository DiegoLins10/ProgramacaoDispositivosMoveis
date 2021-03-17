fun main() {
    val c3 = Cliente3("Pedro")
    //c3.nome = "teste"
    println("O Cliente é ${c3.nome}")
}

class Cliente1(var nome: String)
class Cliente2(val nome: String)
class Cliente3(nomeInicial:String){
    val nome:String = nomeInicial
}