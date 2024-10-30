// Exercice 4
class Dessins extends Program {
    String trianglePlein(int taille, char caractere) {
        String resultat = "";
        for (int i = 1; i <= taille; i++) {
            for (int j = 1; j <= i; j++) {
                resultat += caractere;
            }
            if (i < taille) resultat += " ";
        }
        return resultat;
    }

    String triangleCreux(int taille, char caractere) {
        String resultat = "";
        for (int i = 1; i <= taille; i++) {
            for (int j = 1; j <= i; j++) {
                if (j == 1 || j == i || i == taille) {
                    resultat += caractere;
                } else {
                    resultat += " ";
                }
            }
            if (i < taille) resultat += " "; // Ajout d'un espace entre les lignes
        }
        return resultat;
    }

    String croix(int taille, char caractere) {
        String resultat = "";
        for (int i = 0; i < taille; i++) {
            for (int j = 0; j < taille; j++) {
                if (i == j || i + j == taille - 1) {
                    resultat += caractere;
                } else {
                    resultat += ".";
                }
            }
            if (i < taille - 1) resultat += " ";
        }
        return resultat;
    }

    void testTrianglePlein() {
        assertEquals("*", trianglePlein(1, '*'));
        assertEquals("o oo", trianglePlein(2, 'o'));
        assertEquals("+ ++ +++", trianglePlein(3, '+'));
    }

    void testTriangleCreux() {
        assertEquals("O", triangleCreux(1, 'O'));
        assertEquals("O OO", triangleCreux(2, 'O'));
        assertEquals("O O O OOO", triangleCreux(3, 'O'));
    }

    void testCroix() {
        assertEquals("X", croix(1, 'X'));
        assertEquals("X.X .X. X.X", croix(3, 'X'));
        assertEquals("X...X .X.X. ..X.. .X.X. X...X", croix(5, 'X'));
    }

    void algorithm() {
        println("Test des fonctions :");
        testTrianglePlein();
        testTriangleCreux();
        testCroix();
        println("Tous les tests ont passé avec succès !");

        int taille = readInt();
        char caractere = readChar();

        println("Triangle Plein :");
        println(trianglePlein(taille, caractere));

        println("Triangle Creux :");
        println(triangleCreux(taille, caractere));

        println("Croix :");
        println(croix(taille, caractere));
    }
}