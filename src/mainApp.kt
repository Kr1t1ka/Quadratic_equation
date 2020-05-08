import kotlin.math.pow
import kotlin.math.sqrt
fun main(){
    var a: Double
    var b: Double
    var c: Double
    val d: Double
    while (true) {
        try {
            println("Введите коэффициенты а, b, c через пробел: ")
            val (a1: Double, b1: Double, c1: Double) = readLine()!!.split(' ').map(String::toDouble)
            a = a1
            b = b1
            c = c1
            break
        } catch (e: Exception) {
            println("ОШИБКА: недопустимые значения")
        }
    }
    if (a == 0.0 && b == 0.0) {
        if (c == 0.0) {
            println("x - может быть любым числом")
        } else {
            println("Уравнение не имеет действительных корней")
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
                println("x1 = ${(-b) / (2 * a)}")
            }
            else -> {
                println("Уравнение не имеет действительных корней")
            }
        }
    }
}