/*
@Author Diego Fernandes Lins
RA: 2920481921010
Classe funcionario para registrar os dados e os metodos
*/
open class Funcionario(var nome: String, var salario: Double, var desconto: Double) {

    open fun salarioLiquido(): Double{
        this.salario = salario - desconto
        return salario
    }
    open fun aumentarSalarioPorcentagem(porcentagem: Double): Double{
        this.salario = (salario * (porcentagem/100)) + salario
        return salario
    }
}