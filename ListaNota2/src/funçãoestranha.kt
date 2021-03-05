fun main(){
    var nota1 = readLine().toString().toDouble()
    var nota2 = readLine().toString().toDouble()
    var nota3 = readLine().toString().toDouble()
    var nota4= readLine().toString().toDouble()

    val media = (nota1+nota2+nota3+nota4)/4
    when(media){
        10.0,9.0,8.0,7.0 -> println("aprovado sua medía é %.2f".format(media))
        6.0,5.0,4.0,3.0,2.0,1.0,0.0 -> println("Aluno reprovado sua média é %.2f".format(media))
    }



}