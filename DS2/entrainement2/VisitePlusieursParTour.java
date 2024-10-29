class VisitePlusieursParTour extends Program {

    // Le point commun entre les problèmes dans ce fichier est
    // - prennent en entrée une séquence d'éléments (tableau, chaine de caractères), qu'il faut parcourir avec une boucle
    // - chaque tour de boucle doit visiter plus qu'un élément de la suite
    // Il faut donc faire attention aux indices

    // ----------------------------------------------------------------
    // Exercice corrigé: tableau est trié
    // (TD 8, Ex. 1)
    void testEstTrie () {
        assertEquals(true, estTrie(new int[]{2,4,6,6,7}));
        assertEquals(false, estTrie(new int[]{2,1,6,7,8}));
        assertEquals(true, estTrie(new int[]{}));
        assertEquals(true, estTrie(new int[]{1}));
    }
    // Chaque tour de boucle va comparer deux éléments consécutifs à la recherche d'une 
    // violation de l'ordre croissant
    // Appartient par ailleurs à la catégorie Find
    boolean estTrie (int[] tab) {
        boolean mauvaisOrdreTrouve = false;
        int i = 1;  
        while (i < length(tab) && !mauvaisOrdreTrouve) {
            if (tab[i-1] > tab[i]) {
                mauvaisOrdreTrouve = true;
            }
            i = i+1;
        }
        return !mauvaisOrdreTrouve;
    }

    // ---------------------------------------------------------------
    // Exercice : fusionner nom et note
    void testRegrouperNomNote() {
        assertEquals(
            "Anna : 14\nBetty : 13\nCherif : 12\n",
            regrouperNomNote(new String[]{"Anna", "14", "Betty", "13", "Cherif", "12"})
        );
        assertEquals("", regrouperNomNote(new String[0]));
    }

    // L'entrée est un tableau de chaines de caractères de longueur paire 
    // dans lequel se suivent le nom d'un·e étudiant·e, sa note,
    // le nom d'un·e étudiant·e, une note, etc... (les notes sont représentées par des chaines de caractères).
    // On voudrit produire une chaine qui met en correspondante chaque nom avec la note, séparés par des passages à la ligne
    String regrouperNomNote (String[] nomsEtNotes) {
        return "";
    }

    // ---------------------------------------------------------------
    // Exercice : extraire les lettres doubles d'une phrase
    void testExtraireDoubles () {
        assertEquals("ll ll ee ", extraireDoubles("Quelle belle journee"));
        assertEquals("cc rr tt tt ss ll ", extraireDoubles("En l'occurrence cette chouette me casse les oreilles"));
        assertEquals("ss ", extraireDoubles("Ca ne m'interesse pas"));
        assertEquals("", extraireDoubles("Aurevoir"));
        assertEquals("", extraireDoubles(""));
    }
    // Entrée : une chaine de caractères
    // Sortie : toutes les occurrences de lettres doubles dans l'ordre dans lequel elles apparaissent dans la chaine, 
    //          séparées par des espaces
    String extraireDoubles (String phrase) {
        return "";
    }

    // ---------------------------------------------------------------
    // Exercice : réduire les suites de même caractère
    void testGarderUneSeule () {
        assertEquals("Quele bele journe", garderUneSeule("Quelle belle journee"));
        assertEquals("En l'ocurence cete chouete me case les oreiles", garderUneSeule("En l'occurrence cette chouette me casse les oreilles"));
        assertEquals("Ca ne m'interese pas", garderUneSeule("Ca ne m'interesse pas"));
        assertEquals("Aurevoir", garderUneSeule("Aurevoir"));
        assertEquals("a", garderUneSeule("aaaaa"));
        assertEquals("", garderUneSeule(""));
    }
    // Entrée : une chaine de caractères
    // Sortie : la chaine dans laquelle on ne garde une lettres qui si elle est différente de la lettre qui la suit
    String garderUneSeule(String phrase) {
        return "";
    }

    // /////////////////////////////////////////////////////////////////
    // SOLUTIONS ETAT DE L'ART (seraient faites par un·e programmeur·se expérimenté·e)
    // /////////////////////////////////////////////////////////////////

    boolean estTrieEtatDeLart (int[] tab) {
        int i = 1;
        while (i < length(tab) && tab[i-1] <= tab[i]) {
            i = i+1;
        }
        return i >= length(tab);
    }
    
}