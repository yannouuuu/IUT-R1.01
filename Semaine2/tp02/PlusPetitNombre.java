// Exercice 7
class PlusPetitNombre extends Program{
    void algorithm(){
        println("Entrez deux nombres :");
        int premierNb = readInt();
        int deuxiemeNb = readInt();
        if (premierNb > deuxiemeNb) {
            println("Le plus petit nombre est " + deuxiemeNb);
        } else {
            println("Le plus petit nombre est " + premierNb);
        }
    }
}