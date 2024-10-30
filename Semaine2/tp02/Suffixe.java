// Exercice 5
class Suffixe extends Program{
    void algorithm(){
        print("Entrez une chaine de caractère : ");
        String mot = readString();

        int longueurMot = length(mot);
        print("Nombre de lettres de fin souhaitées : ");
        int nbLettres = readInt();

        if (longueurMot >= nbLettres){
            String fin = substring(mot, longueurMot - nbLettres, longueurMot);
            println("Résultat :" + fin);
        } else {
            print("Erreur, pas assez de caractères !");
        }
    }
}