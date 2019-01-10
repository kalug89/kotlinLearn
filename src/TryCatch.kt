import kotlin.math.sqrt


fun pierwiasek(liczba: Double): Double {
    if (liczba < 0) throw ArithmeticException("Nie istnieje pierwiasek z liczny ujemnej!")
    return sqrt(liczba)
}

fun main(args: Array<String>) {
    println("Podaj liczbę do rozpierwiastkowania")

    var liczba: String = readLine()!!

    try {
        println(pierwiasek(liczba.toDouble()))
    } catch (wyjatek: NumberFormatException) {
        println(wyjatek)
        println("Dane wejściowe są nieprawidłowe")
    } catch (wyjatek: ArithmeticException) {
        println(wyjatek.message)
    }

}