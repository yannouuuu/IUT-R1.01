// Exercice 4
class NiOuiNiNon extends Program{
    void algorithm(){
        String mot = "";
        while(!equals(toLowerCase(mot),"oui") && !equals(mot,"non")){
            mot = readString();
        }
        println("Perdu !");
    }
}