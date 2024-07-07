public class Persona {

    String nome;
    String cognome;
    // int eta;
    // String colorePreferito;
    // static int numeroPersone;


    Persona(String nome, String cognome/* , int eta, String colorePreferito*/){
        
        this.nome = nome;
        this.cognome = cognome;
        // numeroPersone++;
        // System.out.println(numeroPersone);

        // this.eta = eta;
        // this.colorePreferito = colorePreferito;
    }

    void saluta(){

        System.out.println("Ciao, mi chiamo " + this.nome);
        
    }

    // void addizione(int a, int b){
    //     int result = a + b;
    //     this.qwerty(result);
    // }

    // void qwerty(int prova){
    //     System.out.println("Da qwerty: " + prova);
    

    public String toString(){
        String stringa = "Nome: " + this.nome + "\nCognome: " + this.cognome/* + "\nEtà: " + this.eta + "\nColore preferito: " + this.colorePreferito*/;
        return stringa;
    }

    // void saluta(Persona personaDaSalutare){
    //     System.out.println("Ciao " + personaDaSalutare.nome + " io sono " + this.nome);
    // }

    // static void mostraNumPersone(){
    //     System.out.println("Numero persone: " + numeroPersone);
    // }

    // Ereditarietà


}
