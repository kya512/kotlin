class Location {

    var nomLoueur: String = ""
    var categorieVoiture: String = ""
    var nbKm: Double = 0.0
    var nbJour: Int = 0

    constructor(nomLoueur: String, categorieVoiture: String, nbKm: Double, nbJour: Int) {

        this.nomLoueur = nomLoueur
        this.categorieVoiture = categorieVoiture
        this.nbKm = nbKm
        this.nbJour = nbJour

    }

    fun montantJour(categorieVoiture: String): Double {

        var result = when (categorieVoiture) {

            "Eco" -> 30.0
            "Confort" -> 50.0
            "Luxe" -> 75.0
            else -> 0.0
        }
        return result
    }

    fun montantLocation(nbJour: Int, prix: Double): Double {
        return prix * nbJour
    }

    fun kmSupplementaire(): Double {
        return if (nbKm > 100) {
            return nbKm - 100
        } else {
            return nbKm
        }
    }

    fun pxKmSupplementaire(): Double {
        return if (nbKm > 100) {
            return (0.5 * kmSupplementaire())
        }
        else {
            return 0.0
        }
    }

    fun montantTotal():Double{
        return pxKmSupplementaire() + kmSupplementaire()
    }
}

fun main() {
    var prixLoc = Location("Jimmy","Eco",5.000,7)
    println(prixLoc.montantJour("Eco"))
    println(prixLoc.montantLocation(7,30.0))
    println(prixLoc.kmSupplementaire())
    println(prixLoc.pxKmSupplementaire())
    println(prixLoc.montantTotal())
}
