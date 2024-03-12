//class personne

class Personne {
    var nom = ""
    var taille = 0.0
    var poids = 0.0


    constructor(nom: String, taille: Double, poids: Double) {
        this.nom = nom
        this.taille = taille
        this.poids = poids
    }

    fun imc(): Double {
        val IMC: Double = poids / (taille * taille)
        return IMC
    }

    fun afficherIMC() {
        if (imc() < 18.5) {
            println("maigreur")
        }
    }
}


fun main() {
    val imc1 = Personne("Jason", 156.2,58.3)
    println(imc1.afficherIMC())
}

