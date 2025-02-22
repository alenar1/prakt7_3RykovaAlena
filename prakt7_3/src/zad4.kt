import kotlin.math.*
fun main () {
    try {
        print("Введите коэффициент a: ")
        val a = readln().toDouble()
        print("Введите коэффициент b: ")
        val b = readln().toDouble()
        print("Введите коэффициент c: ")
        val c = readln().toDouble()
        val disc = b*b - 4*a*c
        if (disc > 0) {
            val y1 = (-b + sqrt(disc)) / (2*a)
            val y2 = (-b - sqrt(disc)) / (2*a)
            if (y1 >= 0) {
                println("Корни уравнения: ${sqrt(y1)}, ${-sqrt(y1)}")
            }
            if (y2 >= 0) {
                println("Корни уравнения: ${sqrt(y2)}, ${-sqrt(y2)}")
            }
            if (y1 < 0 && y2 < 0) {
                println("Действительных корней нет")
            } else if (disc == 0.0) {
                val y = -b / (2*a)
                if (y>=0) {
                    println("Корни уравнения: ${sqrt(y)}, ${-sqrt(y)}")
                } else {
                    println("Нет действительных корней")
                }
            }
        }
    } catch (e:Exception) { println("Ошибка")}
}