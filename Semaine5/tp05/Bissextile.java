// Exercice 4    
class Bissextile extends Program {
    boolean estbissextile(int a){
        boolean bissextile = false;
        if(a % 4 == 0){
            bissextile = true;
            if(a % 100 == 0 && a % 400 != 0){
                bissextile = false;
            }
        } return bissextile;
    }
    int nombreJoursMois(int numeroMois, int annee){
        int jours = 31;
        if(numeroMois == 11 || numeroMois == 4 || numeroMois == 6 || numeroMois == 9){
            jours = 30;
        }else if(numeroMois == 2){
            if(estbissextile(annee)){
                jours = 29;
            } else {
                jours = 28;
            }
        } else if(numeroMois <= 0 || numeroMois>=13){
            jours = 0;
        }
        return jours;
    }
    void algorithm() {
        int cpt = 0;
        for(int i = 2022 ; cpt < 33 ; i-= 1){
            if (estbissextile(i) == true){
                print(i + " ");
                cpt += 1;
            }
        }
        println();
    }
}