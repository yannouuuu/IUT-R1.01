// Exercice 2
class Cercle extends Program {
    final double PI = 3.14159;
    int mult = 0;

    double circonference(double r) {
        mult++;
        return PI * 2 * r;
    }

    double aire(double r) {
        mult += 2;
        return PI * r * r;
    }

    double volume(double r) {
        mult += 3;
        return 4.0/3.0 * PI * r * r * r;
    }

    void _algorithm() {
        println("Rayon Circ.  Aire   Volume");
        println("------------------------");
        for (int r = 1; r <= 15; r++) {
            println(r + " " + circonference(r) + " " + aire(r) + " " + volume(r));
        }
        println("Multiplications: " + mult);
    }
}