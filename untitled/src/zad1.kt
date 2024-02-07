import kotlin.math.pow

fun main(){
    try {
        val num = readln()!!.toDouble()
        when(num){
            in -3.5..3.5 -> println(4*num.pow(2)+2*num-19)
            else -> println(-(2*num)/(-4*num+8))
        }
    }
    catch (e: Exception){
        println("Выввели неверное значение")
    }

}