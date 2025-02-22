import kotlin.math.*
fun main () {
    try {
        //Задание 1
        print("Введите сторону треугольника a:")
        val a = readln().toDouble()
        print("Введите сторону треугольника b:")
        val b = readln().toDouble()
        print("Введите сторону треугольника c:")
        val c = readln().toDouble()
        if (a <= 0 || b < 0 || c <= 0 || a + b <= c || a + c <= b || b + c <= a) {
            println("Стороны введены некорректно")
            return
        }
        val p = (a+b+c) / 2
        val s = sqrt(p*(p-a)*(p-b)*(p-c)) / 2
        val h = round(2 * s / a)
        println("Высота, проведенная к стороне a: $h")
    } catch (e:Exception) {println("Ошибка")}}