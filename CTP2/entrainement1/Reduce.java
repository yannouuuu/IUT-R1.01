class Reduce extends Program {
    
    // Dans tous les problèmes listés ci-dessous, l'entrée est un tableau, une chaine de caractères ou un intervalle d'entiers (càd d'une séquence d'éléments), 
    // tandis que la sortie est une valeur unique.
    // L'algorithme va produire cette valeur en **combinant les éléments** de l'entée. 
    // On peut également dire qu'on *réduit* les éléments de l'entrée à une seule valeur.

    // Dans une réduction simple, tous les éléments de l'entrée participent au résultat final.

    // - la fonction int somme (int n)
    //   (TD 4, Ex. 2) calculer la sommes des entiers de 1 à n
    // - la fonciton int factorielle (int n)
    //   (TP 4, Ex. 2) calculer la factorielle de n, càd le produit des entiers de 1 à n
    // - la fonction int min (int[] tab) 
    //   (similaire à TP 7, Ex. 4) trouver la valeur minimale dans un tableau

    // Ces algorithmes sont résolus de manière similaire:
    // - déclarer un variable qui est la combinaison des éléments à produire (le résultat)
    // - énumérer les éléments en entrée avec une boucle
    // - combiner chaque élément en entrée avec le résultat partiel obtenu jusque présent

    // Dans d'autres cas seuls certains éléments participent au résultat final, on parle alors de filtrage.
    // Voir ReduceAvecFiltrage.java

    void testSomme() {
        assertEquals(1, somme(1));
        assertEquals(3, somme(2));
        assertEquals(6, somme(3));
        assertEquals(10, somme(4));
        assertEquals(0, somme(0));
    }
    int somme (int n) {
        // La variable pour stoquer la combinaison. Sa valeur initiale doit être correcte
        // au cas où la séquence d'éléments est vide.
        int resultat = 0;

        for (int i = 1; i <= n; i = i+1) {
            // élément de l'entrée: le nombre i
            // participation de cet élément au résultat final: addition avec le résultat partiel
            resultat = resultat + i;
        }
        return resultat;
    }

    void testMin () {
        assertEquals(12, min(new int[]{33, 89, 12, 44, 900}));
        assertEquals(-15, min(new int[]{24, 35, -9, 10, -15}));
        assertEquals(100000, min(new int[]{100000}));
    }
    // Trouve le minimum dans un tableau d'entiers contenant au moins un élément.
    // Cette fonction n'a pas de sens si le tableau est vide (si aucun élément n'est donné, il n'y a pas de minimum).

    int min (int[] tab) {
        // Ici le premier élément est particulier puisqu'il est utilisé pour initialiser la variable de resultat
        int resultat = tab[0];
        // Chacun des autres éléments participe de la même manière au résultat final
        for (int i = 1; i < length(tab); i = i+1) {
            // élément de l'entrée : tab[i]
            if (tab[i] < resultat) {
                resultat = tab[i];
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
    // - quelle est la valeur initiale pour le résultat ?
    // - comment combiner l'élément de l'itération en cours avec le résultat partiel ?

    // -------------------------------------------------
    // produit des nombres d'un tableau
    void testProduit () {
        assertEquals(-90, produit(new int[]{2,-5,9}));
        assertEquals(81, produit(new int[]{3,3,3,3}));
        assertEquals(1, produit(new int[]{}));
    }
    // Étant donné un tableau d'entiers, calculer le produit des nombres du tableau
    int produit (int[] tab) {
        return -1;
    }

    // -------------------------------------------------
    // moyenne de notes
    void testMoyenne () {
        assertEquals(10.0, moyenne(new double[]{10.0, 5.0, 15.0, 10.0}));
        assertEquals(12.5, moyenne(new double[]{12.0, 13.0}));
    }
    // Étant donné un tableau de notes non vide, calculer la moyenne de ces notes
    // Attention, ce n'est pas une réduction simple comme les précédentes. 
    // Le résultat final est obtenu après une opération supplémentaire.
    // D'abord on *réduit* les éléments en leur somme, ensuite on divise cette somme par le nombre
    // d'éléments pour obtenir le résultat final.
    // Cependant le traitement appliqué est tous les éléments est le même.
    double moyenne (double[] tab) {
        return -1.0;
    }

}