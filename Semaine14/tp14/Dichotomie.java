class Dichotomie extends Program{
    int rechDico(int[] tab, int val, int idebut, int ifin){
        int milieu = ((ifin-idebut)/2) + idebut;
        println("m : " + milieu);
        println("d : " + idebut);
        println("f : " + ifin);
        print("\n");
        if(ifin-idebut == 0){
            return -1;
        } else if(tab[milieu] == val){
            return milieu;
        } else if(tab[milieu] < val){
            idebut = milieu + 1 ;
            return rechDico(tab, val, idebut, ifin);
        } else{
            ifin = milieu - 1;
            return rechDico(tab, val, idebut, ifin);
        }
    }

    void algorithm(){
        int[] tab = {2, 5, 7, 12, 45, 78, 99};
        println(rechDico(tab, 99, 0, length(tab)));

    }
}