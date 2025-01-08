// Exercice 3
class Votons extends Program {
    boolean estAdopte(boolean[] votes) {
        int pour = 0;
        int contre = 0;

        for (int i = 0 ; i < length(votes) ; i++) {
            boolean vote = votes[i];
            if (vote) {
                pour++;
            } else {
                contre++;
            }
        }
        return pour > contre;
    }

    void testEstAdopte() {
        assertEquals(false, estAdopte(new boolean[]{true, false}));
        assertEquals(true, estAdopte(new boolean[]{true, true, false}));
    }
}