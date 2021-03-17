class Computador(val marca: String, val so: String)

data class Celular(val marca: String, val so: String)


fun main() {
    val c1 = Computador("Dell", "Windows")
    val c2 = Computador("Dell", "Windows")
    println("Computador")
    println(c1 ==c2)//equals //endereco de memoria
    println(c1===c2)

    println("Celular")
    val ce1 = Celular("Samsung", "Android")
    val ce2 = Celular("Samsung", "Android")
    println(ce1 == ce2)
    println(ce1===ce2)

    println(c1.toString())
    println(ce1.toString())

    //destructuring em Data Class
    val (marca, so) = ce1

    println("$marca - $so")

    //erroval (marca2, so2) = c2

}