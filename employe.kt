import java.time.LocalDate

class employe {
    var matricule:String= ""
    var nom:String= ""
    var prenom:String = ""
    var anneeEmbauche:Int = 0
    var salaire:Double= 0.0


    constructor(matricule:String,nom:String,prenom:String,anneeEmbauche:Int,salaire:Double){

        this.matricule = matricule
        this.nom = nom
        this.prenom = prenom
        this.anneeEmbauche = anneeEmbauche
        this.salaire = salaire
    }

    fun anciennete(): Int{
        return LocalDate.now().year - anneeEmbauche
    }

    fun AugmentationDuSalaire(): Double{

        if(this.anciennete()<10){
            salaire *= 0.05
        }
        else if(this.anciennete()<5){
            salaire *= 0.02
        }
        else{
            salaire *= 0.1
        }
        return salaire
    }

    fun afficherEmploye(){

        println("Matricule : ${matricule}\nNom complet : ${nom.lowercase()} ${prenom.capitalize()}\n" +
                "Ancienneté : ${anneeEmbauche}\nSalaire : ${salaire}")
    }
}

fun main() {
    val emp1 = employe("PL-AAA-AK","Fernand","Paul",2020,2000.0)
    println(emp1.anciennete())
    println(emp1.AugmentationDuSalaire())
    println(emp1.afficherEmploye())
}