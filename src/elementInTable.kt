fun main(args: Array<String>) {

    var table = listOf(11, 22, 33, 44, 55, 66)

    println("Mamy 6 elementów w tablicy. $table")
    println("Wpisz cyfrę od 1 do 6 wby wybrać element w tablicy")
    println("1 to pierwszy element a 6 to ostatni")
    try {
        var userChose: Int = readLine()!!.toInt()
        //Nie zadziałała mi lizba 7
        if (userChose < 1 || userChose > 6) throw IllegalArgumentException("Wpisz poprawną liczbę")

        println(table[userChose - 1])
    } catch (wyjatek: NumberFormatException) {
        println(wyjatek)
        println("Dane wejściowe są nieprawidłowe")
    } catch (wyjatek: ArithmeticException) {
        println(wyjatek.message)
    } catch (wyjatek: IllegalArgumentException) {
        println(wyjatek.message)
    }
}
