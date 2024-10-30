// Exercice 6
class NettoyerChaine extends Program {
    void algorithm(){
        String chaine = " Bonjour ";
        println("Avant nettoyage :");
        println(">"+chaine+"<");
        int longueurChaine = length(chaine);
        if(equals(substring(chaine, 0, 1), " ") || equals(substring(chaine, longueurChaine-1, longueurChaine), " ")){

        } else {
            println("Already perfect");
        }

        println("Après nettoyage :");
        println(">"+chaine+"<");
    }
}