/*
@Author Diego Fernandes Lins
RA: 2920481921010
Um programa que apresenta os valores de celsius contados em 10 em 10 convertidos em Fahrenheit
*/

fun main(){
var c = 0
    for(i in 0 ..10){
        var f: Double = (9.0 * c + 160.0) /5.0
        println(" Celsius: %dº  Fahrenheit: %.0fº".format(c, f))
        c+=10
    }
}