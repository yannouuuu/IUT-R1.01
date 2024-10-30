/**
* Exercice 1
* Types manquants
* @author yann.secq@univ-lille.fr
*/
class JeuxDeType extends Program {
    void algorithm(){
        String prenom = "Ada";
        String nom = "Lovelace";
        int naissance = 1815;
        int annee = 2022;
        int age = annee - naissance;
        char initiale = charAt(prenom,0);
        println(initiale + ". " + nom + " aurait eu " + age + "ans en " + annee);
    }
}