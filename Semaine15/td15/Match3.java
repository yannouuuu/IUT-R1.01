class Match3 extends Program{

    final int NB_LIGNES = 5;
    final int NB_COLS = 8;
    final int SCORE_OBJECTIF = 1000;
    final int NB_COUPS_MAX = 20;

    void initialiser (Bonbon [][] plateau){
        Bonbon[] lesBonbons = new Bonbon [] {Bonbon.BLEU, Bonbon.VERT, Bonbon.ROUGE, Bonbon.JAUNE, Bonbon.ORANGE};

        for (int i = 0; i < length(plateau); i++) {
            for (int j = 0; j < length(plateau[i]); j++) {
                plateau[i][j] = lesBonbons[(int) random()*5];
            }
        }
    }

    String toString (Bonbon b){
        return substring("" + b , 0, 1);
    }

    String toString (Bonbon [][] plateau){
        String s = "";
        String colonnes = "  ";
        for (int i = 0; i < length(plateau, 2); i++) {
            colonnes = colonnes + (i+1);
        }

        s = s + colonnes + "\n";
        
        for (int i = 0; i < length(plateau); i++) {
            s = s + (char)('A' + i) + "|";
            for (int j = 0; j < length(plateau, 2); j++) {
                s = s + toString(plateau[i][j]);
            }
        
        return s;
    }

    void afficher (Bonbon [][] plateau){
        print(toString(plateau));
    }

    boolean casesAdjacentes(String coord){
        int diffLigne = abs(charAt(coord, 0) - charAt(coord, 2));
        int diffCol = abs(charAt(coord, 1) - charAt(coord, 3));
        return diffLigne == 1 && diffCol == 0 || diffCol == 1 && diffLigne == 0;
    }

    void testCasesAdjacentes(){
        assertEquals(true, casesAdjacentes("A2B2"));
        assertEquals(true, casesAdjacentes("B1B2"));
        assertEquals(true, casesAdjacentes("B2B1"));
        assertEquals(true, casesAdjacentes("E1A8"));
        assertEquals(false, casesAdjacentes("C1B2"));
        assertEquals(false, casesAdjacentes("D1D1"));
    }

    String demanderEchange(Bonbon[][] plateau){
        return "";
    }

    // Echange les bonbons des coordonées données
    void echanger(Bonbon[][] plateau, ){

    }

    // Remplace par null tous les bonbons qui participent à un alignement (horizontal ou vertical)
    void effacerBonbon(Bonbon[][] plateau){
        return 0;
    }

    // Fait descendre les bonbons dans les emplacement laissés vides
    void gravite(Bonbon[][] plateau){
        
    }

    void remplirTrous(Bonbon[][] plateau){
        
    }

    void _algorithm(){
        Bonbon[][] plateau = new Bonbon[NB_LIGNES][NB_COLS];
        initialiser(plateau);
        
        int score = 0;
        int scoreParCoup;
        int nbCoups = 0;
        while(score < SCORE_OBJECTIF && nbCoups < NB_COUPS_MAX){
            print(toString(plateau));
            String coord = demandeEchange(plateau);
            echanger(plateau, coord);

            do {
                scoreParCoup = effacerBonbon(plateau);  
                gravite(plateau);
                remplirTrous(plateau);
                score = score + scoreParCoup;
                scoreParCoup = score;
            } while (scoreParCoup != 0);



            score = score + scoreParCoup;
            print("Score " + score);
        }

    }

}