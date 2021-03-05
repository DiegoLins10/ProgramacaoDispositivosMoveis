class Medicamento(val formula: String, val posologia: String) {
    init {
        require(formula.trim().length > 0) {
            "Informe uma fórmula"
        }

        require(posologia.trim().length > 0) {
            "Informe uma posologia"
        }
    }
}

fun main(){
val medicamento1 = Medicamento("C8H9NO2", "...")
println(medicamento1.formula)
}