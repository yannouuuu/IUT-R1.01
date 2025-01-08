class Recursivite extends Program{
/*
    int nbOccurence(String chaine, char lettre){
        int nbOccurence = 0;
        for(int i=0; i<length(chaine); i++){
            if(lettre == charAt(chaine, i)){
                nbOccurence++;
            }
        }
        return nbOccurence;
    }*/

   int nbOccurence(String chaine, char lettre){
        if(length(chaine) == 0){
            return 0; 
        } else if(lettre == charAt(chaine, 0)){
            return 1 + nbOccurence(substring(chaine, 1, length(chaine)), lettre);
        } else {
            return nbOccurence(substring(chaine, 1, length(chaine)), lettre);
        }
   }

   

    void algorithm(){
       print(nbOccurence("test", 't'));
    }
}
