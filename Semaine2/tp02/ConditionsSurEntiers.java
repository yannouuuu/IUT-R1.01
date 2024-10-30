// Exercice 1.1
class ConditionsSurEntiers extends Program {
    void algorithm (){
        int a = readInt();
        int b = readInt();
        int c = readInt();

        // Écrire les conditions à la place des valeurs false


        // Condition a est supérieur à 5.
        boolean a_superieur_a_5 = a >= 5 ; // MODIFIER false pour définir la bonne condition
        // Condition la somme de a et b est égale à c.
        boolean a_plus_b_egal_c = a + b == c ; // MODIFIER false pour définir la bonne condition
        // Condition b est inférieur à a et à c
        boolean b_inferieur_à_a_et_à_c = b <= a && b <= c;// À MODIFIER
        // Condition a,b,c vont du plus petit au plus grand
        boolean a_b_c_ordonnes = a < b && b < c && c > a  ; // À MODIFIER
        // Condition c n’est pas le plus petit des trois nombres
        boolean c_n_est_pas_le_plus_petit = c > a && c > b ; // À MODIFIER

        // Ce qui suit sert à tester vos conditions ; ne pas le modifier
        if (a_superieur_a_5) {
            println(a + " est supérieur à 5");
        } else {
            println(a + " n'est pas supérieur à 5");
        }

        if (a_plus_b_egal_c) {
            println(a + "+" + b + "=" + c);
        } else {
            println(a + "+" + b + " n'est pas égal à " + c);
        }

        if (b_inferieur_à_a_et_à_c) {
            println(b + " est inférieur à " + a + " et à " + c);
        } else {
            println("Il est faux que " + b + " est inférieur à " + a + " et à " + c);
        }

        if (a_b_c_ordonnes) {
            println("Il est vrai que " + a + "<=" + b + "<=" + c);
        } else {
            println("Il n'est pas vrai que " + a + "<=" + b + "<=" + c);
        }

        if (c_n_est_pas_le_plus_petit) {
            println(c + " n'est pas le plus petit parmi "+a+", "+b+", "+c);
        } else {
            println(c + " est le plus petit parmi "+a+", "+b+", "+c);
        }
    }
}