// Exercice 1
class DessineIUT extends Program{
    void dessineligne(int n, char c){
        for(int i = 0 ; i < n ; i += 1){
            print(c);
        }
        println();
    }

    void dessineextreme(int n, char c){
        print(c);
        for(int i = 0 ; i < n - 2; i += 1){
            print(' ');
        }
        print(c);
        println();
    }

    void dessinemilieu(int n, char c){
        for(int i = 0; i < n / 2 ; i += 1){
            print(' ');
        }
        print(c);
        for(int u = n ; u > n/2 ; u -= 1){
            print(' ');
        }
        println();
    }

    void dessinei(int n, char c){
        dessineligne(n, c);
        for(int i = 0; i < n - 2 ; i += 1){
            dessinemilieu(n, c);
        }
        dessineligne(n,c);
        println();
    }

    void dessineu(int n, char c){
        for(int i = 0 ; i < n - 1; i += 1){
            dessineextreme(n, c);
        }
        dessineligne(n,c);
        println();
    }

    void dessinet(int n, char c){
        dessineligne(n, c);
        for(int i = 0 ; i < n - 1 ; i += 1){
            dessinemilieu(n, c);
        }
    }

    void algorithm(){
        print("Taille : ");
        int taille = readInt();
        dessinei(taille,'I');
        dessineu(taille,'U');
        dessinet(taille,'T');
    }
}