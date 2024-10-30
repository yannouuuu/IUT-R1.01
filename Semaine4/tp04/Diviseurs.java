// Exercice 3
class Diviseurs extends Program {
    void algorithm(){
        // print("Liste des diviseurs de 10 : 1, 2, 5, 10");
        // println("Liste des diviseurs de 36 : 1, 2, 4, 12, 18, 36");

        int saisie = readInt();
        int parfait = 0;
        for(int i = saisie; i > 0; i--){
            if (saisie % i == 0) {
                print(i + " ");
                parfait = parfait + i;
            }
        }
        if (parfait == 2 * saisie) {
            println("Nombre parfait !");
        }
    }
}