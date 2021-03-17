fun main() {

    for (dia in DiaSemana.values()){
        println("${dia.nome} é um dia ${if (dia.util) "útil"
        else "do final de semana"}.")
    }

}

enum class DiaSemana(val id: Int, val nome: String, val util: Boolean){
    DOMINGO(1,"Domingo", false),
    SEGUNDA(2,"Segunda", true),
    TERCA(3, "Terça", true),
    QUARTA(4,"Quarta", true),
    QUINTA(5, "Quinta", true),
    SEXTA(6, "Sexta", true),
    SABADO(7, "Sábado", false)

}