fun main(){
    println("Digite como voce deseja converter")
    print("1- dia\n2- mes\n3- ano\n")
    var num = readLine().toString().toInt()
    println("Digite sua idade")
    if(num == 1){
        var dia = readLine().toString().toInt()
        println("idade em dias: $dia")
    }
    else if (num == 2){
        var mes = readLine().toString().toInt()
        var totalDias = mes*30
        println("idade em dias $totalDias")
    }
    else{
        var ano = readLine().toString().toInt()
        var totalDias = (ano*12) * 30
        println("idade em dias $totalDias")
    }
}