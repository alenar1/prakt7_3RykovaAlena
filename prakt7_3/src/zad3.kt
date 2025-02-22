fun main () {
    try {
        print("Введите вещественное число x: ")
        val x = readln().toDouble()
        print("Введите вещественное число y: ")
        val y = readln().toDouble()
        print("Введите вещественное число z: ")
        val z = readln().toDouble()
        val u = if (y < 0) {
            minOf(z, maxOf(x, y))
        } else {
            maxOf(z, minOf(x, y))
        }
        println("Значение U = $u")
    } catch (e:Exception) { println("Ошибка")}
}