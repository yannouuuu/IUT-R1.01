// Exercice 3
class Verlan extends Program {
    void algorithm(){
        String mot = "malin";
        int tailleMot = length(mot);
        int indiceMilieu = tailleMot/2;
        String debut = substring(mot, 0, indiceMilieu);
        String fin = substring(mot, indiceMilieu, tailleMot);
        println(fin+debut);
    }
}