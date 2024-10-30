/**
* Exercice 7
*
* Ce programme détermine le nombre minimal de coupures
* à restituer pour une somme donnée. Les coupures utilisables
* sont les billets de 20, 10, 5 et les pièces de 2 et 1 euros.
*
* @author yann.secq@univ-lille1.fr
*/
class RenduMonnaie extends Program {
    void algorithm(){
        int somme, nb20, nb10, nb5, nb2, nb1, reste;
        print("Quelle est le montant que vous souhaitez rendre en monnaie ?");
        somme = readInt();

        nb20 = somme / 20;
        reste = somme % 20;
        nb10 = reste / 10;
        reste = reste % 10;
        nb5 = reste / 5;
        reste = reste % 5;
        nb2 = reste / 2;
        reste = reste % 2;
        nb1 = reste / 1;
        reste = reste % 1;

        // à vous de compléter ce qui suit par les calculs permettant le nombre de chaque coupure nécessaire.
        println("Nombre de billets de 20 : " + nb20);
        println("Nombre de billets de 10 : " + nb10);
        println("Nombre de billets de 5 : " + nb5);
        println("Nombre de pièces de 2 : " + nb2);
        println("Nombre de pièces de 1 : " + nb1);
    }
}