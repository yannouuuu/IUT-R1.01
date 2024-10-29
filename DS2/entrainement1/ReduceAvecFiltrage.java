class ReduceAvecFiltrage extends Program {

    // Vous devez d'abord faire les exercices du fichier Reduce.java

    // Ici on s'intéresse à des problèmes où l'entrée est une séquence d'éléments
    // et la sortie et une seule valeur obtenue en combinant les valeurs en entrée (réduction), 
    // mais seuls certains éléments de l'entrée participent à la sortie (filtrage)


    // Exemple:  la fonction int nbOcc (String phrase, char car)
    // (TD 4, Ex. 4) compter le nombre d'occurrences d'un caractère dans une chaine

    // On rappelle la solution de la fonction nbOcc, puis on propose des exercices similaires.
    void testNbOcc() {
        assertEquals(0, nbOcc("", 'a'));
        assertEquals(0, nbOcc("totoro", 'a'));
        assertEquals(3, nbOcc("totoro", 'o'));
    }
    int nbOcc (String phrase, char car) {
        int resultat = 0;
        for (int i = 0; i < length(phrase); i = i+1) {
            // élément de l'entrée: charAt(phrase, i)

            if (charAt(phrase, i) == car) { // condition vérifiée par les éléments de l'entrée qui participent au résultat
                resultat = resultat + 1;
            }
        }
        return resultat;
    }


    // ////////////////////////////////////////////////////////////////////////
    // Exercices réduction avec filtrage
    // ////////////////////////////////////////////////////////////////////////
    
    // **Indications** : Chacun des exercices qui suivent se résoud de manière similaire à la fonction nbOcc.
    // Pour chaque exercice, posez-vous les questions:
    // - quels sont les élément de l'entrée ? comment les énumérer ?
    // - quelle est la valeur initiale pour le résultat ?
    // - quelle est la condition pour qu'un élément de l'entrée participe à la sortie ?
    // - comment combiner l'élément de l'itération en cours avec le résultat partiel ?

    // -------------------------------------------------
    // recette de recouvrement de trop perçu
    void testRecettes () {
        assertEquals(225, recettes(new int[]{5, 10, 2, 25, 200}));
        assertEquals(0, recettes(new int[]{2, 4, 8}));
        assertEquals(0, recettes(new int[]{}));
    }
    // L'entrée est un tableau tropPercu qui contient les sommes versées en trop par une administration.
    // L'administration doit recouvrir ces sommes, mais la procédure de recouvrement coute 20 euro
    // par dossier (frais postaux, traitement, main d'oeuvre).
    // Ainsi, seules les sommes strictement supérieures à 20 euro vont être recouvertes.
    // La fonction doit calculer les recettes qui seront réasilées après recouvrement de toutes les sommes.
    int recettes(int [] tropPercu) {
        return -1;
    }

    // -------------------------------------------------
    // somme des diviseurs
        void testSommeDiviseurs () {
        assertEquals(13, sommeDiviseurs(9)); // 13 = 1 + 3 + 9
        assertEquals(18, sommeDiviseurs(10));  // 18 = 1 + 2 + 5 + 10
        assertEquals(3, sommeDiviseurs(2)); // 3 = 1 + 2
    }
    // En entrée on a un nombre, en sortie la somme de ses diviseurs
    // On peut le voir comme un problème similaire aux précédents, parce que:
    // - les diviseurs d'un nombre n sont inclus dans l'intervalle [1, n], 
    // - on peut alors énumérer tous les nombres de l'intervalle [1, n], 
    //   filtrer pour identifier uniquement les diviseurs, et faire la 
    //   somme des ces diviseurs

    // (Remarque: pour éviter les calculs inutiles, on peut se contenter d'énumérer les nombres
    // de l'intervalle [1, sqrt(n)], mais dans ce cas l'algorithme ne suit pas aussi bien
    // le modèle suggéré pour la réduction avec filtrage.)
    int sommeDiviseurs(int n) {
        return -1;
    }

    // -------------------------------------------------
    // nom propre le plus long
    void testNomProprePlusLong () {
        assertEquals("Kurremkarmerruk", nomProprePlusLong(new String[]{
            "ile", "Lebannen", "dragon", "sorcier", 
            "Tenar", "pretresse", "Tehanu", "Kurremkarmerruk",
            "Ged", "faucon", "trouveur", "nom", "transformer", 
        }));
        assertEquals("A", nomProprePlusLong(new String[] {
            "nomenclature", "charlatan", "A", "libellule"
        }));
        assertEquals("", nomProprePlusLong(new String[] {
            "un", "deux", "cent", "mille-trente-huit"
        }));
        assertEquals("", nomProprePlusLong(new String[]{}));
        assertEquals("", nomProprePlusLong(new String[]{""}));
    }
    // L'entrée est un tableau de mots. 
    // Les mots commençant par une majuscule sont les noms propres.
    // On veut retourner le mot propre le plus long contenu dans le tableau, ou bien
    // la chaine vide si aucun nom propre n'est contenu dans le tableau.
    String nomProprePlusLong (String[] mots) {
        return "";
    }
}