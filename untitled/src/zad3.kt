fun main(){
    try {
        val temperature = readln().toInt()
        when (temperature){
            in 60..9999-> println("Пожарная ситуация")
            else-> println("всё ок")
        }
    }
    catch (e: Exception){
        println("Выввели неверное значение")
    }
}