class ManipulationSimultanee extends Program {

    // Les problèmes de ce fichier requierent de parcourir simultanément plusieurs séquences 
    // (tableaux, chaines de caractères) 

    // ---------------------------------------------------------
    // Exercice corrigé : élément du pendu
    void testAffichageMotPendu () {
        assertEquals("u**x", affichageMotPendu("unix", new boolean[]{true, false, false, true}));
        assertEquals("****", affichageMotPendu("unix", new boolean[]{false, false, false, false}));
        assertEquals("unix", affichageMotPendu("unix", new boolean[]{true, true, true, true}));
        assertEquals("", affichageMotPendu("", new boolean[0]));
    }
    // Étant donné un mot caché à trouver dans le jeu pendu (String), 
    // et un masque indiquant les lettres trouvées (tableau de booleens de même taille que le mot),
    // on veut produire l'affichge pour le jeu du Pendu qui contiendra les lettres trouvées à leur place,
    // et les lettres non trouvées remplacées par des étoiles
    String affichageMotPendu(String motCache, boolean[] lettresTrouvees) {
        String resultat = "";
        for (int i = 0; i < length(motCache); i=i+1) {
            if (lettresTrouvees[i]) {
                resultat = resultat + charAt(motCache, i); 
            } else {
                resultat = resultat + "*";
            }
        }
        return resultat;
    }

    // ---------------------------------------------------------------
    // Exercice : afficher nom et note
    void testRegrouperNomNote() {
        assertEquals(
            "Anna : 14\nBetty : 13\nCherif : 12\n",
            afficherNomNote(new String[]{"Anna", "Betty", "Cherif"},
                            new int[]{14, 13, 12})
        );
        assertEquals("", afficherNomNote(new String[0], new int[0]));
    }
    // On a en entrée deux tableaux: un tableau de noms (String[]) et un tableau de notes (int[]) de même taille
    // Le second contient les notes des étudiant·es du premier, dans le même ordre
    // On voudrait regrouper en couples Nom : note
    String afficherNomNote (String[] noms, int[] notes) {
        return "";
    }

    // -----------------------------------------------------------------
    // Exercice: masque complexe
    void testMasqueTypeCaractere () {
        assertEquals("2001*************espace", masqueTypeCaractere("2001 Odycee de l'espace", "0000*************AAAAAA"));
        assertEquals("", masqueTypeCaractere("",""));
        assertEquals("*****", masqueTypeCaractere("a34b0", "*****"));
        assertEquals("cha***u", masqueTypeCaractere("chapeau", "AAA000A"));
    }
    // On a en entrée une phrase et un masque (chaines de caractères de même taille)
    // Le masque est composé des charactères 'A', '0', '*' seulement, signifiant
    // - 'A' on garde le caractère seulement si c'est un charactère alphabétique (une lettre)
    // - '0' on garde le caractère seulement si c'est un caractère numérique (chiffre)
    // - '*' le caractère est caché (remplacé par une étoile)
    // La sortie est le résultat de l'application du masque
    String masqueTypeCaractere (String phrase, String masque) {
        return "";
    }

}