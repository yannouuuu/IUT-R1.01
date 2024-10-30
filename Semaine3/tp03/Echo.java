// Exercice 1
class echo extends Program{
    void algorithm() {
        String phrase = readString();
        int n = readInt();
        for(int i=0 ; i<n ; i=i+1){
            println(phrase);
        }
    }
}