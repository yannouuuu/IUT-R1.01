class Vecteurs extends Program {

    /** La fonction readVector doit saisir les trois éléments du vecteur auprès de l'utilisateur. */
    void testReadVector() {
	// En supposant que l'utilisateur saisit les nombres 1, 2 ,3 ...
	assertArrayEquals(new int[]{1,2,3}, readVector());
    }


    
    /** La fonction equals retourne vrai si les deux vecteurs donnés en paramètre contiennent les mêmes valeurs, et retourne faux sinon. */
    void testEquals() {
	assertTrue(equals(new int[]{1,1,1}, new int[]{1,1,1}));
	assertFalse(equals(new int[]{1,1,2}, new int[]{1,1,1}));
    }
 


    /** La fonction toString retourne la représentation d'un vecteur sous forme de chaine de caractères. */
    void testToString() {
	int[] v = new int[]{1,2,3};
	assertEquals("[1, 2, 3]", toString(v));
    }
    

    /** La fonction add calcule la somme de deux vecteurs.
     *  Rappelons que si v1=[x,y,z] et v2=[a,b,c], alors la somme de v1 et v2 est le vecteur
     *  [x+a, y+b, z+c] */
    void testAdd() {
	int[] v1 = new int[]{1,2,3};
	int[] v2 = new int[]{-1,-2,-3};
	assertArrayEquals(new int[]{0,0,0}, add(v1,v2));
    }


    
    /** La fanction scalarProduct calcule le produit scalaire de deux vecteurs.
     *  Rappelons que si v1=[x,y,z] et v2=[a,b,c], alors la somme de v1 et v2 est le nombre
     *  x*a + y*b + z*c */
    void testScalarProduct() {
	assertEquals(6, scalarProduct(new int[]{1,1,1}, 
				      new int[]{1,2,3}));
	assertEquals(-14, scalarProduct(new int[]{1,2,3}, 
					new int[]{-1,-2,-3}));
    }

}
