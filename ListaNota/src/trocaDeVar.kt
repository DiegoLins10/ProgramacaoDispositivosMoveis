fun main(){

    print("Digite o valor a: ")
    var a = readLine().toString().toInt()
    print("Digite o valor b: ")
    var b = readLine().toString().toInt()

    var c = a
    a = b
    b = c
    println("Valor a: $a")
    println("Valor b: $b")

}