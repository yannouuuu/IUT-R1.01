// Exercice 9
class Cinema extends Program {
    void algorithm() {
        double prixDuBillet = 12;
        //
        print("Age du spectateur : ");
        int ageSpec = readInt();
        print("Option 3D ? (1 si oui, autre chiffre si non) : ");
        int option3D = readInt();
        print("Abonné ? (1 si oui, autre chiffre si non) : ");
        int estAbonne = readInt();
        //
        if (ageSpec < 10) {
            prixDuBillet /= 2; // Demi-tarif pour les enfants
        } else if (ageSpec < 16 || ageSpec > 60) {
            prixDuBillet -= 3; // Réduction de 3€ pour les jeunes et les seniors
        }
        if (option3D == 1) {
            prixDuBillet += 2; // Supplément de 2€ pour la 3D
        }
        if (estAbonne == 1) {
            prixDuBillet *= 0.8; // Réduction de 20% pour les abonnés
        }
        //
        println("Coût du billet : " + prixDuBillet + " euros");
    }
}