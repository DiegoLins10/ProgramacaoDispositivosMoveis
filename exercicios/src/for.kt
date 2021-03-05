fun main() {
    for(i in 1..100) {
        if (i % 2 == 1) {
            continue
        }
        println(i)
    }
    println("Fim do Processamento")
}