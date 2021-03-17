fun main() {
    var dataDeHoje = DataHoje(dia= 10, mes =3, ano = 2021)
    println("A data de hoje é ${dataDeHoje.formatar()}")

}

class DataHoje(var dia: Int, var mes: Int, var ano:Int){
    fun formatar(): String{
        return "$dia/$mes/$ano"
    }
}