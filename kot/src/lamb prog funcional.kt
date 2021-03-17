fun main() {
    val subtracao = { a: Int, b: Int -> a - b }
    val soma = { a: Int, b: Int -> a + b }
    val multiplicacao = { a: Int, b: Int -> a * b } // cria a função lambda
    val divisao = { a: Int, b: Int -> a / b }
    val resultado = calcular(10, 5, subtracao)

    println(resultado)
    println(calcular(10, 5, soma))
    println(calcular(10, 5, multiplicacao))
    println(calcular(10, 5, divisao))

    println(calcular2(10, 5, 7.0, "Fatec"))

}

fun calcular2(a: Int, b: Int, c: Double, d: String): Int {
    return a + b
}

fun calcular(a: Int, b: Int, operacao: (Int, Int) -> Int): Int { // função para chamar as lambda//
    return operacao(a, b)
}