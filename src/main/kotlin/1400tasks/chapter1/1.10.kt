package `1400tasks`.chapter1

/**
 * 1.10. Составить программу, которая запрашивает имя человека
 * и  повторяет его на экране.
 * */

fun main() {
    println("Введите ваше имя:")

    try {
        val userName = readlnOrNull()
        println("$userName, Привет!")
    } catch (e: Exception) {
        println("Введено не корректное значение")
    }
}