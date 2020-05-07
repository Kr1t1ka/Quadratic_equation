import kotlin.math.pow
import kotlin.math.sqrt
fun main(){
    var a: Double
    var b: Double
    var c: Double
    var d: Double
    var menu = true
    while (menu) {
        while (true) {
            try {
                println("Введите кофицент а, b, c через пробел: ")
                val (a1: Double, b1: Double, c1: Double) = readLine()!!.split(' ').map(String::toDouble)
                a = a1
                b = b1
                c = c1
                break
            } catch (e: Exception) {
                println("ОШИБКА")
            }
        }
        if (a == 0.0 && b == 0.0) {
            if (c == 0.0) {
                println("x - может быть любым числом")
            } else {
                println("x - может быть любым числом")
            }
        } else if (a == 0.0) {
            println("x1 = ${-c / b}")
        } else {
            d = b.pow(2.0) - 4 * a * c
            when {
                d > 0 -> {
                    println("x1 = ${(-b + sqrt(d)) / (2 * a)}")
                    println("x2 = ${(-b - sqrt(d)) / (2 * a)}")
                }
                d == 0.0 -> {
                    println("x1 = ${(-b) / 2 * a}")
                }
                else -> {
                    println("Уровнение не имеет действительных корней")
                }
            }
        }
        println("Продолжить? Введите (Н) для остановки программы.")
        val tmp = readLine()
        if (tmp == "Н" || tmp == "н"){
            menu = false
        }
    }
}