//Exercices class Nombre

class Voiture {
    var marque: String = ""
    var modele: String = ""
    var vitesse: Int = 0

    constructor() {
    }

    constructor(marque: String, modele: String, vitesse: Int) {
        this.marque = marque
        this.modele = modele
        this.vitesse = vitesse
    }

    fun accelerer(vitesse: Int): String {
        this.vitesse += vitesse
        return "La vitesse est a $vitesse km/h"
    }
}

fun main(){
    val v1 = Voiture("","",0)
    var v2 = Voiture("Volvo","V50", 0)
    v1.marque = "Peugoet"
    v1.modele = "308"
    v1.vitesse = 0

    println(v2.modele)
    println(v1.accelerer(60))
    println(v2.accelerer(40))
}
