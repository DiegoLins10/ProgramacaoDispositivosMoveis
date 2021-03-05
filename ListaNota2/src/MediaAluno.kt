/*
@Author Diego Fernandes Lins
RA: 2920481921010
Um programa que le 3 notas de alunos e faz a soma da média
*/

fun main(){
    print("Digite sua nota: ")
    var nota1 = readLine().toString().toDouble()
    print("Digite sua nota: ")
    var nota2 = readLine().toString().toDouble()
    print("Digite sua nota: ")
    var nota3 = readLine().toString().toDouble()
    print("Digite sua nota: ")
    var nota4= readLine().toString().toDouble()

    val media = (nota1+nota2+nota3+nota4)/4
    if(media in 7..10)
        println("aprovado sua medía é %.2f".format(media))
    else
    println("Aluno reprovado sua média é %.2f".format(media))
    }



