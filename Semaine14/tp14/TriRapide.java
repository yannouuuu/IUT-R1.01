class TriRapide extends Program {

    // ------------------------------------------------------------------------------
    // Fonctions de test pour le tri rapide
    // ------------------------------------------------------------------------------

    /** Partitionne la partie du tableau comprise entre les indices idebut et ifin, 
     * en mettant au début du tableau les valeurs inférieures à pivot, et 
     * en mettant à la fin du tableau les valeurs supérieurs ou égales au pivot.
     * Retourne le premier indice tel que, après le partitionnement, cet indice contient une 
     * valeur supérieure ou égale à pivot.
     * On suppose que le pivot est une valeur qui se trouve dans le tableau, donc le tableau a au moins une case.
     * @param tab le tableau à partitionner
     * @idebut l'indice de début de la partie du tableau à partitionner, doit être un indice valide
     * @ifin l'indice de fin de la partie du tableau à partitionner, doit être un indice valide
     * @pivot la valeur pivot servant pour le partitionnement, doit être un indice valide
     */
    int partitionner(int[] tab, int idebut, int ifin, int pivot) {
        // Cas de base : tableau vide
        if (ifin < idebut) {
            return idebut;
        }
        
        // Cas avec un seul élément
        if (ifin == idebut) {
            if (tab[idebut] < pivot) {
                return idebut + 1;  // L'élément est plus petit que le pivot
            }
            return idebut;         // L'élément est plus grand ou égal au pivot
        }
        
        // Cas récursifs selon les équations
        if (tab[idebut] < pivot) {
            return partitionner(tab, idebut + 1, ifin, pivot);
        }
        if (tab[ifin] >= pivot) {
            return partitionner(tab, idebut, ifin - 1, pivot);
        }
        
        // Cas où on doit échanger tab[idebut] et tab[ifin]
        int temp = tab[idebut];
        tab[idebut] = tab[ifin];
        tab[ifin] = temp;
        return partitionner(tab, idebut + 1, ifin - 1, pivot);
    }

    void testPartitionner () {
		int[] tab;
		int[] tabAttendu;
		int pivot;
		int idebut;
		int ifin;
		int attendu;
		int resultat;

		// Nous commençons par des partitionnements du tableau entier

		// Ce tablau est déjà partitionné pour le pivot 3
		tab = new int[]{1,2,5,3};
		pivot = 3;
		idebut = 0;
		ifin = length(tab)-1;
		attendu = 2;
		tabAttendu = new int[]{1,2,5,3};
		resultat = partitionner(tab, idebut, ifin, pivot);
		assertEquals(attendu, resultat);
		assertArrayEquals(tabAttendu, tab);

		// Dans ce tableau les valeurs 1 et 5 devront être échangées
		tab = new int[]{2,5,2,4,1,4,4};
		pivot = 4;
		idebut = 0;
		ifin = length(tab)-1;
		attendu = 3;
		tabAttendu = new int[]{2,1,2,4,5,4,4};
		resultat = partitionner(tab, idebut, ifin, pivot);
		assertEquals(attendu, resultat);
		assertArrayEquals(tabAttendu, tab);

		// Dans ce tableau toutes les valeurs devront être échangées
		tab = new int[]{4,4,4,2,2,2};
		pivot = 4;
		idebut = 0;
		ifin = length(tab)-1;
		attendu = 3;
		tabAttendu = new int[]{2,2,2,4,4,4};
		resultat = partitionner(tab, idebut, ifin, pivot);
		assertEquals(attendu, resultat);
		assertArrayEquals(tabAttendu, tab);

		// C'est un test où seule une portion du tableau est concerné (celle qui ne contient pas 0)
		// les valeurs 4 et 3 devront être échangées
		tab = new int[]{0,0, 4,2,3,5, 0,0,0};
		pivot = 4;
		idebut = 2;
		ifin = 5;
		attendu = 4;
		tabAttendu = new int[]{0,0, 3,2,4,5, 0,0,0};
		resultat = partitionner(tab, idebut, ifin, pivot);
		assertEquals(attendu, resultat);
		assertArrayEquals(tabAttendu, tab);
    }

    /** Trie la portion entre les indices idebut et ifin du tableau donné en paramètre. */
    void triRapide (int[] tab, int idebut, int ifin) {
        // Cas de base : tableau vide ou avec une seule case
        if (ifin <= idebut) {
            return;
        }
        
        // Visualisation de l'appel récursif
        profondeur++;
        afficher(tab, idebut, ifin);
        
        // Code existant
        int pivot = tab[ifin];
        int m = partitionner(tab, idebut, ifin, pivot);
        
        int temp = tab[m];
        tab[m] = tab[ifin];
        tab[ifin] = temp;
        
        triRapide(tab, idebut, m - 1);
        triRapide(tab, m + 1, ifin);
        
        // Fin de l'appel récursif
        profondeur--;
    }

    void testTriRapide() {

		int[] tab;
		int[] tabAttendu;

		// Un tableau déjà trié ne doit pas être modifié
		tab = new int[]{1,2,3,4,5};
		tabAttendu = new int[]{1,2,3,4,5};
		triRapide(tab, 0, length(tab)-1);
		assertArrayEquals(tabAttendu, tab);
		
		tab = new int[]{5,3,2,1,4};
		tabAttendu = new int[]{1,2,3,4,5};
		triRapide(tab, 0, length(tab)-1);
		assertArrayEquals(tabAttendu, tab);

		// Un test où les indices idebut et ifin ne sont pas le début et la fin du tableau
		tab = new int[]{9,8,7,  6,5,4,  3,2,1};
		tabAttendu = new int[]{9,8,7,  4,5,6,  3,2,1};
		triRapide(tab, 3, 5);
		assertArrayEquals(tabAttendu, tab);	
    }


    // ------------------------------------------------------------------------------
    // Fonctions utilitaires pour la dernière question
    // ------------------------------------------------------------------------------
    /** Mélange le tableau donné en paramètre, en effectuant des permutations de valeurs. */
    void melanger (int[] tab) {
		for (int i = 0; i < length(tab); i++) {
			// Tirer au hasard 2 indices x et y dont les valeurs seront permutées
			int x = (int)(random()*length(tab));
			int y = (int)(random()*length(tab));
			int tmp = tab[x];
			tab[x] = tab[y];
			tab[y] = tmp;
		}
		}

		// La fonction void melanger (int[] tab) ne peut pas être testée par une fonction de test
		// car elle fait des permutations aléatoires
		
		/** Crée un tablau contenant les valeurs   1, 2, ..., taille   pour une taille donnée. */
		int[] creerTableauOrdonne (int taille) {
		int[] tab = new int[taille];
		for (int i = 0; i < taille; i++) {
			tab[i] = i+1;
		}
		return tab;
    }

    void testCreerTableauOrdonne () {
		assertArrayEquals(new int[]{1,2,3,4}, creerTableauOrdonne(4));
		assertArrayEquals(new int[]{1,2}, creerTableauOrdonne(2));
		}

		/** Construit une chaîne de caractères pour la partie d'un tableau comprise entre les indices idebut et ifin. 
		 * @param tab le tablau à afficher
		 * @param idebut l'indice du début de la partie du tableau, doit être un indice valide de tab
		 * @param ifin l'indice de fin de la partie du tableau, doit être un indice valide de tab
		 */
		String toString (int[] tab, int idebut, int ifin) {
		String res = "[" + idebut + "," + ifin + "] ";
		res = res + tab[idebut];
		for (int i = idebut+1; i <= ifin; i++) {
			res = res + ", " + tab[i];
		}
		return res;
    }

    void testToString () {
		assertEquals("[0,2] 1, 2, 3", toString(new int[]{1,2,3,4,5}, 0, 2));
		assertEquals("[1,4] 2, 3, 4, 5", toString(new int[]{1,2,3,4,5,6,7,8}, 1, 4));
    }

    int profondeur; // variable globale pour faire l'indentation dans l'affichage
                    // compte la profondeur d'appels récursifs, qui est aussi la hauteur de
                    // l'arbre d'évaluation
    void afficher (int[] tab, int idebut, int ifin) {
		for (int i = 0; i < profondeur; i++)
			print("|  ");
		println(toString(tab, idebut, ifin));
    }
    

    void algorithm () {
		int[] tab = creerTableauOrdonne(20);
		int[] tabAttendu = creerTableauOrdonne(20);
		melanger(tab);
		triRapide(tab, 0, length(tab)-1);

		println();
		println("Résultat: " + toString(tab, 0, length(tab)-1));
    }
    

    
}
