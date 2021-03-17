package Carro

class Ferrari: Carros(velocidadeMaxima = 350){
    override fun acelerar(){
        super.alterarVelocidade(25)
    }
    override fun frear(){
        super.alterarVelocidade(-25)
    }
}