class Compte {
    var solde:Double = 0.0

    constructor(solde:Double){
        this.solde

    }
    fun getBalance():Double{
        return solde //afficher le solde actuel
    }
    fun deposer(n:Int):Double {
        this.solde += n
        return this.solde
    }
    fun retirer (n:Int):Double {
        var nouveau = deposer(500)
        var calcul = nouveau - n
        return calcul
    }
}
