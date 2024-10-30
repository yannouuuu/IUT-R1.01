// Exercice 3
class Repetition extends Program{
    void algorithm(){
        String mot = readString();
        int midlength = length(mot)/2;
        String premiereMoitie = substring(mot, 0, midlength);
        String deuxiemeMoitie = substring(mot, midlength, length(mot));
        boolean repetition = equals(premiereMoitie, deuxiemeMoitie);
        println(mot + " : " + repetition);
    }
}