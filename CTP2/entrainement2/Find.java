class Find extends Program {

    // Dans les problèmes de cette catégorie, 
    // l'entrée est une séquence d'éléments (tableau, chaine de caractères, intervalle),
    // et la sortie peut être:
    // (a) un élément de la séquence qui satisfait une certaine condition, ou bien
    // (b) un boolean qui indique si 
    //        (b1) certains éléments, ou 
    //        (b2) tous les éléments, ou 
    //        (b3) aucun élément, 
    //    satisfont une certaine condition.
    // Le cas b) peut être vu comme cas particulier de a).

    // La solution de ces problèmes a comme particularité qu'il n'est pas toujours nécessaire de parcourir
    // toute la séquence (contrairement aux catégories Map et Reduce).
    // Ainsi une boucle à détection d'évènement est la plus adaptée.

    // Nous donnons trois exercices corrigés issus ou inspirés des TDs/TPs, 
    // et des exercices similaires après chaque exercice corrigé.


    // ////////////////////////////////////////////////////
    // Catégorie (a)
    // ////////////////////////////////////////////////////

    // ----------------------------------------------
    // Exercice corrigé: Trouver une valeur dans un tableau 
    // (TD 7, Ex. 3)
    void testIndiceDe () {
        assertEquals(2, indiceDe(new int[]{1,3,5,7,9}, 5));
        assertEquals(1, indiceDe(new int[]{4,5,5,5}, 5));
        assertEquals(-1, indiceDe(new int[]{1,3,5,7,9}, 2));
        assertEquals(-1, indiceDe(new int[0], 10));
    }
    // Prend en entrée un tableau d'entiers et un nombre, et retourne ou bien le plus petit indice
    // du tableau qui contient ce nombre, ou bien -1 si le tableau ne contient pas ce nombre.
    // (Remarque: ce n'est pas la solution la plus efficace, mais elle est donnée car jugée plus lisible.
    //  Voir en fin de fichier pour une solution de l'état de l'art.)
    int indiceDe (int[] tab, int nombre) {
        boolean trouve = false;
        int resultat = -1;
        int i = 0;
        while (i < length(tab) && ! trouve) { 
            if (tab[i] == nombre) {
                trouve = true;                 
                resultat = i;
            }
            i = i+1;
        }
        return resultat;
    }

    // -----------------------------------------------
    // Exercice : trouver l'indice du premier nombre négatif dans un tableau
    void testIndiceDeNegatif () {
        assertEquals(2, indiceDeNegatif(new int[]{1,3,-5,-7,-9}));
        assertEquals(1, indiceDeNegatif(new int[]{4,-5,5,-5}));
        assertEquals(-1, indiceDeNegatif(new int[]{1,3,0,7,9}));
        assertEquals(-1, indiceDeNegatif(new int[0]));
    }
    // Prend en entrée un tableau d'entiers, retourne ou bien le plus petit indice
    // du tableau qui contient ce nombre négatif, ou bien -1 si le tableau ne contient pas de nombre négatif
    int indiceDeNegatif (int[] tab) {
        return -1;
    }


    // ------------------------------------------------
    // Exercice : trouver le premier nombre négatif
    void testPremierNegatif () {
        assertEquals(-5, premierNegatif(new int[]{1,3,-5,-7,-9}));
        assertEquals(-5, premierNegatif(new int[]{4,-5,5,-5}));
        assertEquals(1, premierNegatif(new int[]{1,3,0,7,9}));
        assertEquals(1, premierNegatif(new int[0]));
    }
    // Cette fois-ci on ne doit retourner le premier nombre négatif (et non son indice)
    // On retourne 1 si aucun nombre négatif
    int premierNegatif (int[] tab) {
        return 1;
    }

    // ------------------------------------------------
    // Exrecice : trouver l'indice de la dernière occurrence
    void testDernierIndiceDe () {
        assertEquals(2, dernierIndiceDe(new int[]{1,3,5,7,9}, 5));
        assertEquals(3, dernierIndiceDe(new int[]{4,5,5,5}, 5));
        assertEquals(-1, dernierIndiceDe(new int[]{1,3,5,7,9}, 2));
        assertEquals(-1, dernierIndiceDe(new int[0], 10));
    }
    // Similaire à indiceDe, mais cette fois-ci on cherche l'indice de la dernière occurrence
    // Astuce: parcourir le tableau de la fin vers le début
    int dernierIndiceDe (int[] tab, int valeur) {
        return -1;
    }


    // ////////////////////////////////////////////////////
    // Catégorie (b1)
    // ////////////////////////////////////////////////////

    // ----------------------------------------------
    // Exercice corrigé: Tester si une valeur est présente dans un tableau
    // (TD 7, Ex. 3)
    void testEstPresent () {
        assertEquals(true, estPresent(new int[]{1,3,5,7,9}, 5));
        assertEquals(true, estPresent(new int[]{4,5,5,5}, 5));
        assertEquals(false, estPresent(new int[]{1,3,5,7,9}, 2));
        assertEquals(false, estPresent(new int[0], 10));
    }
    // Prend en entrée un tableau d'entiers et un nombre, et retourne vrai ssi le nombre est présent dans le tableau
    // (Remarque: ce n'est pas la solution la plus efficace, mais elle est donnée car jugée plus lisible.
    //  Voir en fin de fichier pour une solution de l'état de l'art.)
    boolean estPresent (int[] tab, int nombre) {
        boolean trouve = false;
        int i = 0;
        while (i < length(tab) && ! trouve) { 
            if (tab[i] == nombre) {
                trouve = true;                 
            }
            i = i+1;
        }
        return trouve;
    }

    // ----------------------------------------------
    // Exercice: Contient une trés bonne note
    void testContientTresBonneNote() {
        assertEquals(true, contientTresBonneNote(new double[]{10.0, 17.0, 15.0, 10.0}));
        assertEquals(false, contientTresBonneNote(new double[]{12.0, 13.0}));
        assertEquals(true, contientTresBonneNote(new double[]{12.0, 13.0, 16.0}));
        assertEquals(false, contientTresBonneNote(new double[0]));
    }
    // L'entrée est un tableau de notes de type double.
    // Une très bonne note est une note supérieure ou égale à 16
    // Retourne vrai si et seulement si le tableau contient au moins une très bonne note
    boolean contientTresBonneNote (double[] notes) {
        return false;
    }

    // ----------------------------------------------
    // Exercice: Contient nom propre
    void testContientNomPropre () {
        assertEquals(true, contientNomPropre(new String[]{
            "terre", "Tenar", "oiseau", "labyrinthe"
        }));
        assertEquals(true, contientNomPropre(new String[] {
            "nomenclature", "charlatan", "A", "libellule"
        }));
        assertEquals(false, contientNomPropre(new String[] {
            "un", "deux", "cent", "mille-trente-huit"
        }));
        assertEquals(false, contientNomPropre(new String[]{}));
        assertEquals(false, contientNomPropre(new String[]{""}));
    }
    // L'entrée est un tableau de mots. 
    // Les mots commençant par une majuscule sont les noms propres.
    // On veut tester si le tableau contient (au moins) un nom propre
    // (Astuce: vous pouvez définir la fonction boolean estMajuscule(char c) qui retourne vrai si et seulement si car est une majuscule.) 
    boolean contientNomPropre (String[] noms) {
        return false;
    }

    // ////////////////////////////////////////////////////
    // Catégories (b2) et (b3)
    // ////////////////////////////////////////////////////

    // On va voir sur un exemple que les problèmes des catégories (b2) et (b3) 
    // se résolvent de la même manière que les problèmes de la catégorie (b1).
    // Étudier ces trois fonctions
    // - boolean contientPositif (int[] tab) : retourne vrai ssi tab contient au moins un nombre positif (càd nombre >=0)
    // - boolean aucunPositif (int[] tab) : retourne vrai ssi tab ne contient aucun nombre positif (càd nombre >= 0)
    // - boolean tousPositifs (int[] tab) : retourne vrai ssi tab chaque nombre dans tab est positif (càd nombre >= 0)

    void testSurPresencePositifs () {
        int[] pos = new int[]{1,2,3,4};
        int[] neg = new int[]{-1,-2,-3,-4};
        int[] lesDeux = new int[]{-1,2,-3,4};

        assertEquals(true, contientPositif(pos));
        assertEquals(false, aucunPositif(pos));
        assertEquals(true, tousPositifs(pos));

        assertEquals(false, contientPositif(neg));
        assertEquals(true, aucunPositif(neg));
        assertEquals(false, tousPositifs(neg));

        assertEquals(true, contientPositif(lesDeux));
        assertEquals(false, aucunPositif(lesDeux));
        assertEquals(false, tousPositifs(lesDeux));
    }

    // Détecter les similarités et les différences entre ces fonctions
    boolean contientPositif(int[] tab) {
        boolean positifTrouve = false;
        int i = 0;
        while (i < length(tab) && !positifTrouve) {
            if (tab[i] >= 0) {
                positifTrouve = true;
            }
            i = i+1;
        }
        return positifTrouve;
    }

    boolean aucunPositif(int[] tab) {
        boolean positifTrouve = false;
        int i = 0;
        while (i < length(tab) && !positifTrouve) {
            if (tab[i] >= 0) {
                positifTrouve = true;
            }
            i = i+1;
        }
        return !positifTrouve;
    }

    boolean tousPositifs(int[] tab) {
        boolean negatifTrouve = false;
        int i = 0;
        while (i < length(tab) && !negatifTrouve) {
            if (tab[i] < 0) {
                negatifTrouve = true;
            }
            i = i+1;
        }
        return !negatifTrouve;
    }

    // En s'inspirant des solutions ci-dessus, faire les fonctions demandées ci-dessous
    // Astuce: une fonction boolean estNomPropre (String mot) pourrait s'avérer utile

    // ---------------------------------------------------
    // Exercice: aucun nom propre
    void testAucunNomPropre () {
        assertEquals(false, aucunNomPropre(new String[]{
            "terre", "Tenar", "oiseau", "labyrinthe"
        }));
        assertEquals(false, aucunNomPropre(new String[] {
            "nomenclature", "charlatan", "A", "libellule"
        }));
        assertEquals(true, aucunNomPropre(new String[] {
            "un", "deux", "cent", "mille-trente-huit"
        }));
        assertEquals(true, aucunNomPropre(new String[]{}));
        assertEquals(true, aucunNomPropre(new String[]{""}));
    }
    // Retourne vrai ssi le tableau donné en entrée ne contient aucun nom propre
    boolean aucunNomPropre (String[] mots) {
        return false;
    }

    // ---------------------------------------------------
    // Exercice: noms propres seulement
    void testTousNomsPropres () {
        assertEquals(true, tousNomsPropres(new String[]{
            "Tehanu", "Tenar", "Vesce", "Karego-At"
        }));
        assertEquals(false, tousNomsPropres(new String[]{
            "terre", "Tenar", "oiseau", "labyrinthe"
        }));
        assertEquals(false, tousNomsPropres(new String[] {
            "nomenclature", "charlatan", "A", "libellule"
        }));
        assertEquals(false, tousNomsPropres(new String[] {
            "un", "deux", "cent", "mille-trente-huit"
        }));
        assertEquals(true, tousNomsPropres(new String[]{}));
        assertEquals(false, tousNomsPropres(new String[]{""}));
    }
    // Retourne vrai ssi le tableau donné en entrée contient uniquement des noms propres
    boolean tousNomsPropres (String[] mots) {
        return false;
    }

    // -------------------------------------------------
    // Exercice: accepté à l'unanimité
    void testAccepteUnanimite () {
        assertEquals(true, accepteUnanimite(new boolean[]{true, true, true, true}));
        assertEquals(false, accepteUnanimite(new boolean[]{false, true, true}));
        assertEquals(false, accepteUnanimite(new boolean[]{false, false}));
    }
    // L'entrée est un tableau non vide de votes (boolean) : true est un vote pour, false est un vote contre
    // Retourne vrai ssi tous les votes sont pour
    boolean accepteUnanimite (boolean[] votes) {
        return false;
    }

    // --------------------------------------------------
    // Exercice: rejeté à l'unanimité
    // L'entrée est un tableau non vide de votes (boolean) : true est un vote pour, false est un vote contre
    // Retourne vrai ssi tous les votes sont contre
    
    void testRefuseUnanimite () {
        assertEquals(false, refuseUnanimite(new boolean[]{true, true, true, true}));
        assertEquals(false, refuseUnanimite(new boolean[]{false, true, true}));
        assertEquals(true, refuseUnanimite(new boolean[]{false, false}));
    }
    // L'entrée est un tableau non vide de votes (boolean) : true est un vote pour, false est un vote contre
    // Retourne vrai ssi tous les votes sont contre
    boolean refuseUnanimite (boolean[] votes) {
        return false;
    }


    // /////////////////////////////////////////////////////////////////
    // SOLUTIONS ETAT DE L'ART (seraient faites par un·e programmeur·se expérimenté·e)
    // /////////////////////////////////////////////////////////////////

    // Juste après la fin du while
    // if (i == length(tab)):
    //    on est sorti de la boucle à cause de la condition i < length(tab), 
    //    donc tab[i] != nombre a été vrai pour toutes les valeurs de i,
    //    donc nombre n'est pas présent dans le tableau
    // else
    //    on est sorti de la boucle à cause de la condition tab[i] == nombre,
    //    donc i est l'indice recherché
    int indiceDeEtatDeLart (int[] tab, int nombre) {
        int i = 0;
        while (i < length(tab) && tab[i] != nombre) {
            i = i+1;
        }
        int resultat;
        if (i >= length(tab)) { 
            resultat = -1;
        } else {
            resultat = i;
        }
        return resultat;
    }

    boolean estPresentEtatDeLart (int[] tab, int nombre) {
        int i = 0;
        while (i < length(tab) && tab[i] != nombre) {
            i = i+1;
        }
        return i < length(tab);
    }

    boolean contientPositifEtatDeLart (int[] tab) {
        int i = 0;
        while (i < length(tab) && tab[i] < 0) {
            i = i+1;
        }
        return i < length(tab);
    }

    boolean aucunPositifEtatDeLart (int[] tab) {
        int i = 0;
        while (i < length(tab) && tab[i] < 0) {
            i = i+1;
        }
        return i >= length(tab);
    }

    boolean tousPositifsEtatDeLart (int[] tab) {
        int i = 0;
        while (i < length(tab) && tab[i] >= 0) {
            i = i+1;
        }
        return i >= length(tab);
    }

}