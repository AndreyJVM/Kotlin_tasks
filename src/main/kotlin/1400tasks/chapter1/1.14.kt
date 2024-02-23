package `1400tasks`.chapter1

/**
 * 1.14. Составить программу вывода на экран в одну строку трех
 * любых чисел, вводимых с клавиатуры, с двумя пробелами между
 * ними.
 *  диапазон значений от -2_147_483_648 до 2_147_483_647
 * */

fun main() {
    var value1: Int? = null
    var value2: Int? = null
    var value3: Int? = null


    println("Введите 3 любых числа")

    println("Введите первое число")
    while (value1 == null) {
        try {
            value1 = readlnOrNull()?.toInt()!!
        } catch (e: Exception) {
            println(
                "Введено не корректное значение\n" +
                        "Введите первое число"
            )
        }
    }

    println("Введите второе число")
    while (value2 == null) {
        try {
            value2 = readlnOrNull()?.toInt()!!
        } catch (e: Exception) {
            println(
                "Введено не корректное значение\n" +
                        "Введите второе число"
            )
        }
    }

    println("Введите третие число")
    while (value3 == null) {
        try {
            value3 = readlnOrNull()?.toInt()!!
        } catch (e: Exception) {
            println(
                "Введено не корректное значение\n" +
                        "Введите третие число"
            )
        }
    }

    println("$value1  $value2  $value3")
}