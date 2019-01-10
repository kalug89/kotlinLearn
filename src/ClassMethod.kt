fun ktoWygra(pies1: Pies, pies2: Pies) {
    if (pies1.glos == pies2.glos) {
        println("Takie same te burki")
    }
    if (pies1.glos > pies2.glos) {
        println("Pies ne 1 wygrywa")
    }
    if (pies1.glos < pies2.glos) {
        println("Pies nr dwa wygrywa")
    }
}

class Pies(waga: Int, glos: Int) {
    var waga = waga
    var glos = glos

    fun dajGlos() {
        println("Wuf! Wuf!")
    }
}

fun main(args: Array<String>) {


    var Azor = Pies(1, 10)
    var Burek = Pies(50, 100)

    ktoWygra(Azor, Burek)


}