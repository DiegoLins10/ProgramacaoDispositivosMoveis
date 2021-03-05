fun main() {
    //tres caracteristicas do Looping/Repetição
    //condicao/limite
    //incremento
    //valor inicio
    var opcao: Int = 0
    while(opcao != -1) {
        println("Digite a opcao")
        opcao = readLine().toString().toInt()
        println(opcao is Int)
        println("Opção escolhida $opcao")
    }
    println("Fim do Processamento")


}