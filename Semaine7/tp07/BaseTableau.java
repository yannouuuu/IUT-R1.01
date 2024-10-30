// Exercice 2
class BaseTableaux extends Program {
    int[] creerTableau(int taille) {
        int[] resultat = new int[taille];

        for (int i = 0; i < taille; i++) {
            if (i < taille / 2) {
                resultat[i] = 1;
            } else {
                resultat[i] = 2;
            }
        }

        return resultat;
    }

    int[] creerTableauAleatoire(int taille) {
        int[] resultat = new int[taille];

        for (int i = 0; i < taille; i++) {

            resultat[i] = (int) (random() * 21);
        }

        return resultat;
    }

    void testCreerTableau2() {
        assertArrayEquals(new int[]{1,1,1,1,1,2,2,2,2,2}, creerTableau(10));
        assertArrayEquals(new int[]{1,1,2,2,2}, creerTableau(5));
        assertArrayEquals(new int[]{}, creerTableau(0));
    }

    void testCreerTableauAleatoire() {
        int taille = 100;
        int[] tableauAleatoire = creerTableauAleatoire(taille);

        for (int i = 0; i < taille; i++) {
            assertTrue(tableauAleatoire[i] >= 0 && tableauAleatoire[i] <= 20);
        }
    }
}