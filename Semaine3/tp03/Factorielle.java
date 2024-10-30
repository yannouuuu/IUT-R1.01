// Exercice 3
class Factorielle extends Program{
    void algorithm(){
        int i,fact=1;
        int number= readInt();
        for(i=1 ; i<=number ; i++){
            fact=fact*i;
        }
        println(fact);
    }
}