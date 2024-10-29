class Map extends Program {

    // Dans tous les problèmes listés ci-dessous, 
    // l'entrée est un tableau, une chaine de caractères ou un intervalle d'entiers, càd d'une séquence d'éléments,
    // et la sortie est également une séquence d'éléments.
    // Dans les cas plus simples, **pour chaque élément de l'entrée, on produit exactement un élément en sortie.**

    // - la fonction void affichageVertical (String phrase)
    //   (TD 4, Ex. 1) chaque lettre de la chaine phrase donne lieu à l'affichage d'une ligne
    // - l'algorithme ConversionEuroYens 
    //   (TP 4, Ex. 1) chaque nombre de l'intrevalle [1, 11] correspondant à une 
    //   somme en euro produit en sortie un nombre qui correspond à une somme en yen
    // - la fonction String phraseToMin (String phrase)
    //   (TD 5, Ex. 1) chaque lettre de la chaine phrase donne lieu à cette même lettre
    //   minuscule dans la chaine de résultat
    // - mais aussi :
    //   les classes Tva1 et Tva2 : (TP 5, Ex. 5) 
    //   la fonction double[] sur20 (double[] notes) : (TD 7, Ex. 5)
    //   la fonction String toString (int[] tab) : (TP 7, Ex. 1)
    //   la fonction String masque (String phrase, char car) : (TP 4, Ex. 5)

    // Tous ces algorithmes sont résolus de manière similaire:
    // - énumérer les éléments en entrée avec une boucle,
    // - à chaque tour de boucle, produire l'élément de la sortie

    // Dans d'autres cas, seuls certains éléments de l'entrée contribuent à la sortie.
    // On parle alors de filtrage des éléments; voir MapAvecFiltrage.java

    // On rappelle d'abord la solution de certains des problèmes ci-dessus,
    // puis on propose des exercices qui se résolvent de manière similaire.

    final double TAUX_CONVERSION_EURO_YEN = 135.9;
    void conversionEuroYens () {
        for (int euro = 1; euro <= 11; euro = euro+1) { // 
            // élément de l'entrée : euro
            // élément de la sortie : la chaine affichée
            println("" + euro + " euro = " + (TAUX_CONVERSION_EURO_YEN)*euro + " yens.");
        }
    }
    
    // Enlever le commentaire pour tester covresionEuroYens
    /*
    void algorithm () {    
        conversionEuroYens();
    }
    */

    void testToString () {
        assertEquals("2 6 7 ", toString(new int[]{2,6,7}));
        assertEquals("-10 -20 ", toString(new int[]{-10, -20}));
        assertEquals("", toString(new int[]{}));
    }
    String toString (int[] tab) {
        String resultat = "";
        for (int i = 0; i < length(tab); i = i+1) {
            // élément de l'entée: tab[i]
            // élément de la sortie: la chaine ajoutée à resultat
            resultat = resultat + tab[i] + " ";
        }
        return resultat;
    }

    void testMasque () {
        assertEquals("", masque("", 'z'));
        assertEquals("................", masque("Tonari no Totoro", 'u'));
        assertEquals(".o......o..o.o.o", masque("Tonari no Totoro", 'o'));
    }
    String masque (String phrase, char car) {
        String resultat = "";
        for (int i = 0; i < length(phrase); i = i+1) {
            // élément de l'entrée: charAt(phrase,i)
            // élément de la sortie: car ou '.' en fonction de l'élément de l'entrée
            if (charAt(phrase, i) == car) {
                resultat = resultat + car;
            } else {
                resultat = resultat + '.';
            }
        }
        return resultat;
    }

    // ////////////////////////////////////////////////////////////////////////
    // Exercices
    // ////////////////////////////////////////////////////////////////////////
    
    // **Indications** : Chacun des exercices qui suivent se résoud de manière similaire que les algorithmes ci-dessus.
    // Pour chaque exercice, posez-vous les questions:
    // - quels sont les élément de l'entrée ? comment les énumérer ?
    // - comment obtenir l'élément de la sortie à partir de l'élément de l'entrée ?

    // -------------------------------------------------
    // table de multiplication d'un nombre
    void testTableMultiplication () {
        assertEquals("4 8 12 16 20 24 28 32 36 40 ", tableMultiplication(4));
        assertEquals("7 14 21 28 35 42 49 56 63 70 ", tableMultiplication(7));
        assertEquals("0 0 0 0 0 0 0 0 0 0 ", tableMultiplication(0));
    }
    // Étant donné un nombre entier, retourner sa table de multiplication (càd ses multiples par les nombre de 1 à 10)
    // sous forme d'une chaine de caractères, les multiples séparés par des espaces
    String tableMultiplication (int n) {
        println("tab mult");
        return "";
    }

    
    // -------------------------------------------------
    // tableau des valeurs absolues
    void testValeursAbsolues () {
        assertArrayEquals(new int[]{1,2,3,4,5,6}, valeursAbsolues(new int[]{-1,-2,3,4,-5,-6}));
        assertArrayEquals(new int[]{10,15}, valeursAbsolues(new int[]{10,15}));
        assertArrayEquals(new int[]{}, valeursAbsolues(new int[]{}));
    }
    // Étant donné un tableau d'entiers tab, retourner un tableau dont les valeurs 
    // sont les valeurs absolues des valeurs dans tab
    int[] valeursAbsolues (int[] tab) {
        return new int[0];
    }


    // -------------------------------------------------
    // application d'un bonus
    void testBonus () {
        assertArrayEquals(new int[]{15,12,4,20}, bonus(new int[]{13,10,2,18}));
        assertArrayEquals(new int[]{19,20,20,20}, bonus(new int[]{17,18,19,20})); 
        assertArrayEquals(new int[]{}, bonus(new int[]{}));
    }
    // Ayant donné un exercice insolvable en DS, les enseignant·es décident d'augmenter de 2 toutes les notes.
    // La fonction prend en entrée un tableau d'entiers et produit en sortie un tableau où chaque entier est augmenté de 2
    // Si la note ainsi obtenue est supérieure à 20, on la ramène à 20.
    int[] bonus (int[] tab) {
        return new int[0];
    }

    // -------------------------------------------------
    // tout en minuscules
    void testTabEnMinuscules () {
        assertArrayEquals(new String[]{"ail", "chou", "brocoli"}, 
                tabEnMinuscules(new String[]{"Ail", "CHOU", "BrOcOli"}));
        assertArrayEquals(new String[]{"pizza", "ravioli", ""}, 
                tabEnMinuscules(new String[]{"pizza", "ravioli", ""}));
    }
    // Étant donné un tableau de chaines de caractères tab, retourner un tableau où chacunes des chaines 
    // en entrée est en minuscules. 
    // Vous devriez d'abord (re)définir les fonctions char enMinuscule (char car) et String phraseEnMin(String phrase)
    // de l'Ex. 1 TD 5, qui vous utiliserez pour passer en minuscules les éléments du tableau.
    String[] tabEnMinuscules(String[] tab) {
        return new String[0];
    }
}
