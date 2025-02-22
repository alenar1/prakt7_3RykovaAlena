fun main () {
    try {
        print("Введите  целое четырехзначное число: ")
        val num = readln().toInt()
        if (num < 1000 || num > 9999) {
            println("Введите корректное число")
            return
        }
        else {
            val thousand = num / 1000
            val hundred = (num % 1000) / 100
            val ten = (num % 100) / 10
            val unit = num % 10
            val sum = thousand + hundred + ten + unit
            println("Сумма цифр вашего числа: $sum")
        }
    } catch (e:Exception) { println("Ошибка")}
}