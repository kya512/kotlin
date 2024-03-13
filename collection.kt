//Exo kotlin collection

val planetes = arrayOf("mercure", "Venus", "terre", "Mars", "Jupiter", "saturne",
    "Uranus", "Neptune")

fun premier(tab : Array<String>){
    println(tab.first())
}

fun dernier(tab : Array<String> ){
    println(tab[7])
}

fun index(tab : Array<String>){
    println(tab.indexOf("terre"))
}

fun change(tab : Array<String>): Array<String>{
    tab[2] = "La Terre"

    return tab
}

fun start(tab : Array<String>){
    println(tab.filter { it.uppercase().startsWith('M')})
}

fun maj(tab : Array<String>){
    println(tab.map {it.capitalize()})
}

//Exercice 2

fun mutable() {
    val entiers = mutableListOf<Int>()
    for(i in 1..10){
        entiers.add( (1..100).random())
    }
    println(entiers)
    println("La somme des entiers est de ${entiers.sum()}")
    println("le plus petit des entiers est de ${entiers.min()}")
    println("le plus grand des entiers est de ${entiers.max()}")

    val pairs = mutableListOf<Int>()//liste d'entiers
    val impairs = mutableListOf<Int>()//liste d'entiers

    for ( nombre in entiers){
        if ( nombre % 2 == 0){
            pairs.add(nombre) //ajt la variables pairs dans la variable entiers
        }
        else{
            impairs.add(nombre) //ajt la variables impairs dans la variable entiers
        }
    }
    println("liste des nombres pairs ${pairs}")
    println("liste des nombres impairs ${impairs}")
}

//Exercice 4

fun serie(n : Int): List<Int> {
    val liste = mutableListOf<Int>()
    for (i in 1..n) {
        liste.add(i)
    }
    return liste
}

fun serieInverse(n: Int): List<Int> {
    fun serieInverse(n: Int): List<Int> {
        val tab = serie(5).reversed()//on apelle la fonction serie(n) puis on fait la methode reversed()
                                    // pour inverser la liste
        return tab //on retourne la variable
    }