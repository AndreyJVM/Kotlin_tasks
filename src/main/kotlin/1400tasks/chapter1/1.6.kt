package `1400tasks`.chapter1

/**
 * 1.6  Число π примерно равно 3,1415926. Вывести на экран это
 * число с тремя цифрами в дробной части.
 * Текст '3.142' не использовать.
 * */

fun main() {
    val myPI = 3.1415926
    println(String.format("%.3f", myPI))
}