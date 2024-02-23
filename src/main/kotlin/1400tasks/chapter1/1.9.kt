package `1400tasks`.chapter1

/**
 * 1.9.	 Составить программу вывода на экран числа, вводимого
 * с клавиатуры. После выводимого числа должно следовать сообщение
 * «– вот какое число Вы ввели».
 * */
fun main() {
    println("Введите число")

    try {
        val value = readlnOrNull()?.toInt()
        println("$value – вот какое число Вы ввели")
    } catch (e: Exception) {
        println("Введено не корректное значение")
    }
}