package `1400tasks`.chapter1

/**
 * 1.16. Составить программу вывода на экран следующей информации:
 * а) 5 10    б) 100 t    в) x 25
 * 7 см         1949 v       x y
 *
 * диапазон значений от -2_147_483_648 до 2_147_483_647
 * */

fun main() {
    var x: Int? = null
    var y: Int? = null
    var t: Int? = null
    var v: Int? = null

    println("Задайте значания для неизвестных x, y, t, v:")
    println("Введите число x:")
    while (x == null) {
        try {
            x = readlnOrNull()?.toInt()!!
        } catch (e: Exception) {
            println(
                "Введено не корректное значение\n" +
                        "Введите число x:"
            )
        }
    }

    println("Введите число y:")
    while (y == null) {
        try {
            y = readlnOrNull()?.toInt()!!
        } catch (e: Exception) {
            println(
                "Введено не корректное значение\n" +
                        "Введите число y:"
            )
        }
    }

    println("Введите число t:")
    while (t == null) {
        try {
            t = readlnOrNull()?.toInt()!!
        } catch (e: Exception) {
            println(
                "Введено не корректное значение\n" +
                        "Введите число t:"
            )
        }
    }

    println("Введите число v:")
    while (v == null) {
        try {
            v = readlnOrNull()?.toInt()!!
        } catch (e: Exception) {
            println(
                "Введено не корректное значение\n" +
                        "Введите число v:"
            )
        }
    }

    println("a) 5 10\n" +
            "   7 см")

    println("б) 100 $t\n" +
            "   1949 $v")

    println("в) $x 25\n" +
            "   $x $y")
}