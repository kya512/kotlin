class Location {

    var nomLoueur:String = ""
    var categorieVoiture:String = ""
    var nbKm:Double = 0.0
    var nbJour:Int = 0

    constructor(nomLoueur:String, categorieVoiture:String, nbKm:Double, nbJour:Int){

    }

    fun montantJour(categorieVoiture: String): Double {

        var result = when (categorieVoiture){

            "Eco" -> 30.0
            "Confort" -> 50.0
            "Luxe" -> 75.0
            else -> 0.0
        }
        return result
    }
}

fun main() {
    var prixLoc = Location("Jimmy","Eco",9.521,7)
    println(prixLoc.montantJour("Eco"))
}
