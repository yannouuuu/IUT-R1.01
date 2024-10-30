// Exercice 1.2
class ConditionsSurChaines extends Program {
    void algorithm (){
        String a = readString();
        String b = readString();
        String c = readString();

        // Écrire les conditions à la place des valeurs false

        // Condition la longueur de a est inférieure à 5
        boolean condLongAinf5 = length(a) < 5 ;//À MODIFIER
        // Condition a et b sont la même chaîne
        boolean condAEgalB = equals(a, b) ;//À MODIFIER
        // Condition la première lettre de b précède la première lettre de a d’après l’ordre du dictionnaire
        boolean condBprecedeA = charAt(b, 0) > charAt(a, 0);//À MODIFIER
        // (Optionnel) Condition c est un prefixe de a
        boolean condCprefixeDeA = false // equals(substring(c, 0, 3) == substring(a, 0, 3))  /*equals(substring(c, 0, 3) && substring(a, 0, 3))*/ ;//À MODIFIER
        // Condition la longueur de a est plus grande que celle de c
        boolean condAplusLongueQueC = (length(a)>length(c)) ;//À MODIFIER

        // Ce qui suit sert à tester vos conditions; ne pas le modifier
        if (condLongAinf5) {
        println("\"" + a + "\" a moins de 5 caractères");
        } else {
        println("\"" + a + "\" a 5 caractères ou plus");
        }

        if (condAEgalB) {
        println("\"" + a + "\"=\"" + b + "\"");
        } else {
        println("\"" + a + "\" n'est pas égal à \"" + b + "\"");
        }

        if (condBprecedeA) {
        println("\""+b+"\" est avant \"" + a + "\" dans le dictionnaire");
        } else {
        println("\""+b+"\" n'est pas avant \"" + a + "\" dans le dictionnaire");
        }

        if (condCprefixeDeA) {
        println("\"" + c + "\" est préfixe de \"" + a + "\"");
        } else {
        println("\"" + c + "\" n'est pas préfixe de \"" + a + "\"");
        }

        if (condAplusLongueQueC) {
        println("\"" + a + "\" est plus long que \"" + c + "\"");
        } else {
        println("\"" + c + "\" est au moins aussi long que \"" + a + "\"");
        }
    }
}