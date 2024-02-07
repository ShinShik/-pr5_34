fun main(){
    try {
        val num = readln().toInt()
        if (num.toString().length == 3) {
            val nums = num / 100 + num % 100 / 10 + num % 10
            when {
                (nums % 5.0 == 0.0) -> println("Сумма чисел кратна 5")
                else -> println("сумма чисел не кратна 5")
            }
        }
        else{
            println("Вы ввели не трехзначное число")
        }
    }
    catch (e: Exception){
        println("Выввели неверное значение")
    }
}