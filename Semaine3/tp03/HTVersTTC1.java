// Exercice 4.1
class HTversTTC1 extends Program{
    void algorithm(){
        double TVA = 0;
        int euro = 0;
        print("Combien de lignes ? ");
        int nl = readInt();
        for(int i=0 ; i<nl ; i=i+1){
            euro=euro+1;
            TVA = TVA + 1.196;
            println(euro + " euros HT = " + TVA + " euros TTC.");
        }
    }
}