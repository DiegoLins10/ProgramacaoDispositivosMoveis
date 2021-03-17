package Carro

open class Carros(val velocidadeMaxima: Int = 200, var velocidadeAtual: Int = 0){
    protected fun alterarVelocidade(velocidade: Int){
        val novaVelocidade = velocidadeAtual + velocidade
        velocidadeAtual = when (novaVelocidade){
            in 0..velocidadeMaxima -> novaVelocidade
            in velocidadeMaxima + 1..Int.MAX_VALUE -> velocidadeMaxima
            else -> 0
        }
    }

    open fun acelerar(){
        alterarVelocidade(5)
    }

    open fun frear(){
        alterarVelocidade(-5)
    }

    override fun toString(): String {
        return "A velocidade atual é $velocidadeAtual km/h"
    }
}