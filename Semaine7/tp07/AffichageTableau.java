// Exercice 1
class AffichageTableau extends Program {
    String toString(int[] tab) {
        String resultat="";
        for (int i = 0; i < length(tab); i++) {
            resultat += tab[i]+" ";

        }
        return resultat;
    }

    String toString(String[] tab) {
        String chaine = "";
        for(int i = 0; i < length(tab); i++) {
            chaine += tab[i]+" ";
        }
        return chaine;
    }

    void testToString_tabString () {
        assertEquals("un deux trois ", toString(new String[]{"un", "deux", "trois"}));
        assertEquals("", toString(new String[0]));
    }

    void testToString_tabInt () {
        assertEquals("1 2 3 ", toString(new int[]{1,2,3}));
        assertEquals("", toString(new int[0]));
    }

    void algorithm() {
        int[] tabInt = new int[]{20, 30, 50};
        String[] tabStr = new String[]{"Alan", "Turing"};
        println(toString(tabInt));
        println(toString(tabStr));
    }
}