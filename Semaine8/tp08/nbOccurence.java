/* 
 * Tout les exercices sont dans le même fichier pour ce TP
 * Référez vous à la présentation et aux énoncés
 * 
 * TOUT N'EST PAS FINI 
*/
class nbOccurence extends Program {
    int nbFois(String[] tab, String mot) {
        int accu = 0;
        for(int i=0; i < length(tab); i++) {
            if (tab[i] == mot) {
                accu++;
            }
        }
        return accu;
    }

    int[] frequences (String[] motsCles, String[] mots) {
        int [] tab = new int [length(motsCles)];
        for (int i = 0; i < length(motsCles); i++) {
            tab[i]=nbFois(mots, motsCles[i]);
        }
        return tab;
    }

    String[] motsDifferents (String[] mots) {
        String[] motsDiff = new String[length(mots)];
        for (int i = 0; i < length(motsDiff); i++) {
            motsDiff[i] = "";
        }
        int indiceDiff=0;
        for (int i=0; i < length(mots); i++) {
            if (nbFois(motsDiff, mots [i]) == 0) {
                motsDiff[indiceDiff]=mots[i];
                indiceDiff++;
            }
        }
        return sousTableau(motsDiff, indiceDiff);
    }

    String[] sousTableau(String[] tab, int taille) {
        int sousTaille = taille;
        if (length(tab) < taille || taille < 0) {
            sousTaille = length(tab);
        }
        String[] sousTab = new String[sousTaille];
        for (int i = 0; i < sousTab.length; i++) {
            sousTab[i] = tab[i];
        }
        return sousTab;
    }

    boolean estLettre(char c){

    }

    String[] lesMots(String texte){
        for (int i = 0; i < length(mot) ; i++) {
            if (!estLettre(charAt(txt, i)) && length(mot) != 0) {

            }
        }
    }


    void testNbFois () {
        String[] tab = new String[]{"je", "tu", "tu", "elle", "je", "je"};
        // "je" apparait 3 fois dans tab
        assertEquals(3, nbFois(tab, "je"));
        assertEquals(2, nbFois(tab, "tu"));
        assertEquals(0, nbFois(tab, "il"));
    }

    void testFrequences () {
        String[] motsCles = new String[]{"je", "tu", "elle"};
        int[] freq = new int[]{3, 2, 1};
        String[] mots = new String[]{"je", "tu", "tu", "elle", "je", "je"};
        assertArrayEquals(freq, frequences(motsCles, mots));
    }

    void testMotsDifferentsV2 () {
        String[] mots = new String[]{"je", "tu", "tu", "elle", "je", "je"};
        String[] mu = new String[]{"je", "tu", "elle"};
        assertArrayEquals(mu,motsDifferents(mots));
    }

    void testSousTableau () {
        assertArrayEquals(new String[]{"a", "b", "c"},
            sousTableau(new String[]{"a", "b", "c", "d", "e"}, 3));
        assertArrayEquals(new String[]{"a", "b"},
            sousTableau(new String[]{"a", "b"}, 5));
        assertArrayEquals(new String[]{},
            sousTableau(new String[]{"a", "b", "c"}, 0));
        assertArrayEquals(new String[]{"a", "b"},
            sousTableau(new String[]{"a", "b"}, -5));
        // L’assertion suivante sert à tester qu’on retourne bien une copie du tableau
        // et non le tableau lui-même
        String[] tab = new String[]{"a", "b"};
        assertNotEquals(tab, sousTableau(tab, 2));
        assertNotEquals(tab, sousTableau(tab, 3));
        assertNotEquals(tab, sousTableau(tab, -1));
    }

    void testLesMots () {
        assertArrayEquals(new String[]{"je", "tu", "elle", "je", "tu"},
        lesMots("je tu elle je tu"));
        assertArrayEquals(new String[]{"je", "tu", "elle", "je", "tu"},
        lesMots(" je tu,   elle . je tu ! "));
    }
}