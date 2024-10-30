// Exercice 1
class MasqueDeChaine extends Program {
    String masque(String phrase, char car) {
        String resultat = "";

        for (int i = 0; i < length(phrase); i++) {
            if (charAt(phrase, i) == car) {
                resultat = resultat + car;
            } else {
                resultat = resultat + '.';
            }
        }
        return resultat;
    }

    void testMasque() {
        assertEquals("a...a...a....", masque("au bal masqué", 'a'));
        assertEquals("................", masque("Tonari no Totoro", 'u'));
        assertEquals(".o......o..o.o.o", masque("Tonari no Totoro", 'o'));
        assertEquals("", masque("", 'z'));
    }

    void _algorithm() {
        testMasque();
    }
}