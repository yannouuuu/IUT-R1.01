// Exercice 8
class FizzBuzz extends Program{
    void algorithm(){
        print("Entrez un nombre : ");
        int nombre = readInt();
        if (nombre % 3 == 0 && nombre % 5 == 0) {
            println("fizzbuzz");
        } else if (nombre % 5 == 0) {
            println("buzz");
        } else if (nombre % 3 == 0) {
            println("fizz");
        } else {
            println(nombre);
        }
    }
}