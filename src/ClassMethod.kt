fun ktoWygra(pies1: Pies, pies2: Pies){
    if (pies1.glos == pies2.glos) {
        println("Psy szczekają tak samo")
    } else if (pies1.glos > pies2.glos) {
        println("Pies nr 1 jest głośniejszy")
    } else if(pies1.glos < pies2.glos) {
        println("Pies nr 2 jest głośniejszy")
    } else {
        println("coś się pojebało")
    }
}

class Pies(waga: Int, glos: Int){
    val waga = waga
    val glos = glos

    fun dajGlos(){
        println("Wuf Wuf")
    }
}

fun main(args: Array<String>) {

   var Azor = Pies(1,10)
    var Burek = Pies(50,100)

    ktoWygra(Azor,Burek)

}
