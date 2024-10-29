class FastSearch extends Program {

    void testFastSearch () {
	// Test avec tableau de taille puissance de 2
	int[] tab = new int[]{2,4,6,8,10,12,14,16,18,20,22,24,26,28,30,32};
	for (int i = 0; i < length(tab); i++) {
	    assertEquals(i, fastSearch(tab, 2*(i+1)));
	}
	for (int i = 0; i < length(tab)+1; i++) {
	    assertEquals(-1, fastSearch(tab, 2*i+1));
	}
	
	// taille du tableau = puissance de 2 - 1 (cas souvent problématique)
	tab = new int[]{2,4,6,8,10,12,14,16,18,20,22,24,26,28,30};
	for (int i = 0; i < length(tab); i++) {
	    assertEquals(i, fastSearch(tab, 2*(i+1)));
	}
	for (int i = 0; i < length(tab)+1; i++) {
	    assertEquals(-1, fastSearch(tab, 2*i+1));
	}

	// Test des cas limite
	tab = new int[]{1};
	assertEquals(0, fastSearch(tab, 1));
	assertEquals(-1, fastSearch(tab, 0));
	assertEquals(-1, fastSearch(tab, 2));

	tab = new int[0];
	assertEquals(-1, fastSearch(tab, 0));
    }

}
