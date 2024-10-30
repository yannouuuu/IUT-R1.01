// Exercice é
class EuroToYen extends Program{
    void algorithm(){
        int euro = 1;
        double yen = 135.90;
        print("Combien de lignes souhaitez-vous ? ");
        int n = readInt();
        for(int i=1 ; i<n ; i=i+1){
            yen = yen + 135.90;
            euro = euro + 1;
            println(euro + "euros = " + yen + " yens.");
        }
    }
}