/*
@Author Diego Fernandes Lins
RA: 2920481921010
Um programa que le os dados do usuario e faz o desconto do salario e a soma do aumento salarial
*/
fun main(){

    print("Nome: ")
    var nome: String = readLine().toString()
    print("Salario bruto: ")
    var salario = readLine().toString().toDouble()
    print("Desconto: ")
    var desconto = readLine().toString().toDouble()
    var f = Funcionario(nome, salario, desconto)
    f.salarioLiquido()
    println("dados do funcionario: ${f.nome},R$ %.2f".format(f.salario))
    print("Deseja aumentar o salario em qual porcentagem? ")
    var porcentagem = readLine().toString().toDouble()
    f.aumentarSalarioPorcentagem(porcentagem)
    println("dados do funcionario: ${f.nome},R$ %.2f".format(f.salario))

}