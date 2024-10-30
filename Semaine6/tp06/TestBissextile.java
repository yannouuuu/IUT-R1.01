// Exercice 3
class TestBissextile extends Program {
    boolean estbissextile(int a) {
        boolean bissextile = false;
        if(a % 4 == 0) {
            bissextile = true;
            if(a % 100 == 0 && a % 400 != 0) {
                bissextile = false;
            }
        }
        return bissextile;
    }

    int nombreJoursMois(int numeroMois, int annee) {
        int jours = 31;
        if(numeroMois == 4 || numeroMois == 6 || numeroMois == 9 || numeroMois == 11) {
            jours = 30;
        } else if(numeroMois == 2) {
            if(estbissextile(annee)) {
                jours = 29;
            } else {
                jours = 28;
            }
        } else if(numeroMois <= 0 || numeroMois >= 13) {
            jours = 0;
        }
        return jours;
    }

    void testBissextile() {
        // Test des années non bissextiles
        assertEquals(false, estbissextile(2013));
        assertEquals(false, estbissextile(2006));
        assertEquals(false, estbissextile(1999));
        assertEquals(false, estbissextile(1000));

        // Test des années bissextiles
        assertEquals(true, estbissextile(2000));
        assertEquals(true, estbissextile(2012));
        assertEquals(true, estbissextile(2024));
        assertEquals(true, estbissextile(1600));
    }

    void _algorithm() {
        testBissextile();
        int cpt = 0;
        for(int i = 2022; cpt < 33; i -= 1) {
            if(estbissextile(i)) {
                print(i + " ");
                cpt += 1;
            }
        }
        println();
    }
}