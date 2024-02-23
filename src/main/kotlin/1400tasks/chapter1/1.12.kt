package `1400tasks`.chapter1

/**
 * 1.12 Напишите программу, в которую вводится имя человека
 * и выводится на экран приветствие в виде слова «Привет», после
 * которого должна стоять запятая, введенное имя и восклицательный знак.
 * После запятой должен стоять пробел, а  перед восклицательным знаком пробела быть не должно.
 * */

fun main() {
    println("Введите ваше имя:")

    try {
        val userName = readlnOrNull()
        println("Привет, $userName!")
    } catch (e: Exception) {
        println("Введено не корректное значение")
    }
}