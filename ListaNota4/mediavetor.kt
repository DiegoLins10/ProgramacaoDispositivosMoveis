/*
@Author Diego Fernandes Lins
RA: 2920481921010
Um programa que solicita as notas de 5 alunos e as adiciona em vetores para retornar as medias dos alunos.
*/
fun main(){
    var nota1 = Array<Int>(5, {i->i})//criação do vetor
    var nota2 = Array<Int>(5, {i->i})

    for(i in 0 .. nota1.size-1){
        print("Digite a nota do aluno ${i+1} na primeira prova: ") //adicionando as notas
        var n1 = readLine().toString().toInt()
        nota1[i] = n1
        print("Digite a nota do aluno ${i+1} na segunda prova: ")
        var n2 = readLine().toString().toInt()
        nota2[i] = n2
    }
    for(i in 0..nota1.size-1){
        var media = (nota1[i] + nota2[i])/ 2  // calculando as medias
        println("Nota média aluno ${i+1}: $media") // imprimindo os resultados
    }


}