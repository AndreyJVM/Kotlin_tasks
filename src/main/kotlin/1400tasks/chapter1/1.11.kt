package `1400tasks`.chapter1

/**
 * Составить программу, которая запрашивает название
 * футбольной команды и  повторяет его на экране со словами
 * « - это чемпион!».
 * */

fun main() {
    println("Введите имя вашей любимой футбольной команды:")

    try {
        val soccerName = readlnOrNull()
        println("$soccerName - это чемпион!")
    } catch (e: Exception) {
        println("Введено не корректное значение")
    }
}