// Exercice 2
class Saisons extends Program {
    String saisonMeteorologique (int mois){
        String saisons = "";
        if (mois == 1 || mois == 2 || mois == 12) {
            saisons = "Hiver";
        } else if (mois >= 3 && mois <= 5) {
            saisons = "Printemps";
        } else if (mois >= 6 && mois <= 8 ){
            saisons = "Ete";
        } else if (mois >= 9 && mois <= 11) {
            saisons = "Automne";
        } else {
            saisons = "Erreur";
        }
        return saisons;
    }

    int nombreJoursMois (int numeroMois){
        int nbJours;
        if (numeroMois == 1 || numeroMois == 3 || numeroMois == 5|| numeroMois == 7|| numeroMois == 8 || numeroMois == 10 || numeroMois == 12) {
            nbJours = 31;
        } else if (numeroMois == 4 || numeroMois == 6 || numeroMois == 9 || numeroMois == 11) {
            nbJours = 30;
        } else if (numeroMois == 2) {
            nbJours = 28;
        } else {
            nbJours = 0;
        }
        return nbJours;
    }

/*  PAS EU LE TEMPS
    String saisonAstronomique (int jour, int mois){
        String saison = "";
        if (saison == ) {

        }
    } */


    void algorithm(){
        int total = 0;
        for (int m=0; m<=13; m++){
            println("mois " + m + " : " + saisonMeteorologique(m) + ", " + nombreJoursMois(m) + " jours");
            total = total + nombreJoursMois(m);
        }
    println("Nombre de jours total : " + total);
    }
}