// Exercice 6
class NettoyerChaine extends Program {
    void algorithm(){
        String chaine = " Bonjour  ";
        println("Avant nettoyage :");
        println(">"+chaine+"<");
        int longueurChaine = length(chaine);
        if(equals(substring(chaine, 0, 1), " ") || equals(substring(chaine, longueurChaine-1, longueurChaine), " ")) {
            int debut = 0;
            while (debut < longueurChaine && equals(substring(chaine, debut, debut + 1), " ")) {
                debut++;
            }
            int fin = longueurChaine - 1;
            while (fin >= 0 && equals(substring(chaine, fin, fin + 1), " ")) {
                fin--;
            }
            chaine = substring(chaine, debut, fin + 1);
            longueurChaine = fin - debut + 1;
        }
        println("Après nettoyage :");
        println(">"+chaine+"<");
    }
}