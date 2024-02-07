//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    try
    {
        val age = readln()!!.toInt()
        when (age)
        {
            in 0..2-> println("вы Младенец")
            in 3..13-> println("вы Ребёнок")
            in 14..21-> println("вы Подросток")
            in 22..60-> println("вы Взрослый")
            in 61..100->println("вы Старец")
            else -> println("вы Нежить")
        }
    }
    catch (e: Exception){
        println("Выввели неверное значение")
    }
}