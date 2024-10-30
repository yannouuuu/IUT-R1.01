// Exercice 4.2
class HTversTTC2 extends Program{
    void algorithm(){
        print("Combien de lignes ? ");
        int nl = readInt();
        print("A partir de ? ");
        int qd = readInt();
        double TVA = 0.598;
        double euro = 0 + qd;

        for(int i=qd ; i<nl ; i=i+1){
            println(euro + " euros HT = " + euro * TVA + " euros TTC.");
            euro = euro + 0.5;
        }
    }
}