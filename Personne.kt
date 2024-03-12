//class personne

class Personne {
    var nom: String = ""
    var taille: Double = 0.0
    var poids: Double = 0.0
    var age: Int = 0


    constructor(nom: String, taille: Double, poids: Double,age: Int) {
        this.nom = nom
        this.taille = taille
        this.poids = poids
        this.age = age
    }

    fun calculImc(): Double {
        val IMC: Double = poids / (taille * taille)
        return IMC
    }

    fun afficherImc() {
        if (age >= 20 && age <= 65) {
            println("L'Imc de Mme/Mr $nom ,pour $taille cm est de ${(poids / (taille * taille))} ")
        } else {
            println("indéterminable car l'age ne rentre pas dans les critères")
        }
    }
}

fun main() {
    val imc1 = Personne("Jason", 1.85,79.0,24)
    println(imc1.afficherImc())
}

