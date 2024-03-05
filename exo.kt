// kotlin variables et exp condi

//1.a
fun bonjour(){
    println("Quel est ton nom ?")
    val nom = readln().toString()
    println("Bonjout $nom")
}
//1.b
fun elmt(){
    val nb1 = 10
    val nb2 = 5
    println("La somme est de ${nb1 + nb2}")
    println("La difference est de ${nb1 - nb2}")
    println("Le produit est de ${nb1 * nb2}")
    println("Le quotient est de ${nb1 / nb2}")
}

//1.1
fun tarif_reduit(){
    println("Quel est ton age ?")
    val age = readln().toInt()
    println(if (age<26)"Vous avez droit au tarif reduit" else "Vous n'avez pas droit au tarif reduit")
}

//1.2

fun produit(){
    val c1 = 1
    val c2 = -4
    println("${c1*c2}")
    println(if("${c1*c2}"< 0.toString())"produit negatif" else "produit positif")
}

fun main(){
    println(bonjour())
    println(tarif_reduit())
    println(elmt())
    println(produit())
}


