package `1400tasks`.chapter1

/**
 * 1.8 Составить программу вывода на экран числа, вводимого
 * с  клавиатуры. Выводимому числу должно предшествовать сообщение «Вы ввели число».
 *
 */
fun main() {
    println("Введите число")

    try {
        val value = readlnOrNull()?.toInt()
        println("Вы ввели число: $value")
    }catch (e: Exception){
        println("Введено не корректное значение")
    }
}