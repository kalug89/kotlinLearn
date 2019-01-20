open class Postac(imie: String) {
    var imie = imie
    var hp = 100
    var sila = 10
    var inteligencja = 10
    var kondycja = 10
    var zrecznosc = 10
    var bystrosc = 10

    fun atakuj(postac: Postac) {
        println("Zadales obrazenia przeciwnikowi $postac rowne $sila")
    }

    fun uzyjOitkiHp() {
        println("Przywrocilem sobie 30HP")
    }
}

class Mag(imie: String) : Postac(imie) {

    var mana = 100

    fun rzucZaklecie(postac: Postac) {

        mana -= 20
        println("Zadales obrazenie magiczne przeciwnikowi ${postac.imie} równe ${postac.inteligencja * 2}")
    }
}
class Wojownik(imie: String) : Postac(imie) {

    var wytrzymalosc = 100

    fun uderzMieczem(postac: Postac) {
        wytrzymalosc -= 20
        println("Zadales obrazenie fizyczne przeciwnikowi ${postac.imie} równe ${postac.sila * 2}")
    }
}

fun main(args: Array<String>) {

    var Malzahar = Mag("Malzahar")
    var Artur = Wojownik("Artur")

    Malzahar.rzucZaklecie(Artur)
    Artur.uderzMieczem(Malzahar)
}
