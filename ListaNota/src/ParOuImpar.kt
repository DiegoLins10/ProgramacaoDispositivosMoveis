/*
@Author Diego Fernandes Lins
RA: 2920481921010
Um programa para mostrar se o numero é imapr ou par
*/

fun main(){
    var number = readLine().toString().toInt()
    if(number%2 == 0){
        println("$number é par")
    }
    else{
        println("$number é impar")
    }
}