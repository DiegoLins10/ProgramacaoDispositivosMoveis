/*
@Author Diego Fernandes Lins
RA: 2920481921010
Um programa que mostra os winrates positivos de um determinado jogo
*/

fun main() {
    val winRate = arrayListOf(TaxaDeVitoria("Diego", 75.0), TaxaDeVitoria("Maria", 50.0), TaxaDeVitoria("Claudio", 80.1), TaxaDeVitoria("Pedro", 20.5), TaxaDeVitoria("Debs", 70.0))
    val winRatePositivos = winRate.filter { it.winRate >= 50.0 }
    println("WINRATES POSITIVOS DO GAME")
    println(winRatePositivos)
    }
data class TaxaDeVitoria(val nome: String, val winRate: Double)