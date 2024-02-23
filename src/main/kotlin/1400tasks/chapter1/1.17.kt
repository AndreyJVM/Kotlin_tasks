package `1400tasks`.chapter1

/**
 * 1.17. Составить программу вывода на экран следующей информации:
 * а) 2 кг    б) а 1    в) x y
 *    13 17      19 b      5 y
 *
 *    диапазон значений от -2_147_483_648 до 2_147_483_647
 * */
fun main() {
    var a: Int? = null
    var b: Int? = null
    var x: Int? = null
    var y: Int? = null

    println("Задайте значания для неизвестных a, b, x, y:")
    println("Введите число a:")
    while (a == null) {
        try {
            a = readlnOrNull()?.toInt()!!
        } catch (e: Exception) {
            println(
                "Введено не корректное значение\n" +
                        "Введите число a:"
            )
        }
    }

    println("Введите число b:")
    while (b == null) {
        try {
            b = readlnOrNull()?.toInt()!!
        } catch (e: Exception) {
            println(
                "Введено не корректное значение\n" +
                        "Введите число b:"
            )
        }
    }

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

    println("a) 2 кг\n" +
                "   13 17"
    )

    println("б) $a 1\n" +
                "   19 $b"
    )

    println("в) $x $y\n" +
                "   5 $y"
    )
}