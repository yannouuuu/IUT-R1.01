// Exercice 2
class MemeLongueur extends Program{
    void algorithm () {
        String mot1 = "pomme";
        String mot2 = "mange";
        int longueurMot1 = length(mot1);
        int longueurMot2 = length(mot2);
        boolean memeLongueur = longueurMot1 == longueurMot2;
        println ("Les deux mots sont de la même longueur : " + memeLongueur);
    }
}