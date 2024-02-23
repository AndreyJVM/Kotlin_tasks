package `1400tasks`.chapter1

/**
 * 1.13. Напишите программу, в  которую вводится целое число,
 * после чего на экран выводится следующее и  предыдущее целое
 * число.
 * Например, при вводе числа 15 на экран должно быть выведено:
 * Следующее за числом 15 число – 16.
 * Для числа 15 предыдущее число – 14.
 * */

fun main() {
    println("Введите число")

    try {
        val value = readlnOrNull()?.toInt()
        if (value != null) {
            println("Следующее за числом $value число – ${value.inc()}.\n" +
                    "Для числа $value предыдущее число –  ${value.dec()}.")
        }
    } catch (e: Exception) {
        println("Введено не корректное значение")
    }
}