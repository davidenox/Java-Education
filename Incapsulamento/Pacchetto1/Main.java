package Pacchetto1;

public class Main {
    public static void main(String[] args) {
        // Incapsulamento
        // Persona persona = new Persona("Luca", "Rossi");
        // System.out.println(persona.getNome());
        // // System.out.println(persona.cognome); // ERRORE: cognome has private access in Pacchetto1.Persona
        // System.out.println(persona.getCognome());

        // persona.setCognome("Verdi");
        // System.out.println(persona.getCognome());


// Copiare oggetti
        Persona persona1 = new Persona("Luca", "Rossi");
        Persona persona2 = new Persona(/*/"Marco", "Verdi");
        persona2.copy(persona1); // copia persona1 in persona2
        persona1.setNome("orazio"); // modifica persona1
        // ora prima copio e poi modificando solo p1 non modifico p2, sono indipendenti*/persona1);

        // persona2 = persona1; // persona2 punta a persona1 ma non va a modificare nulla

        // persona1.setNome("orazio"); // persona1 e persona2 puntano allo stesso oggetto, quindi se modifico uno, modifico anche l'altro

        // System.out.println(persona1);
        // System.out.println(persona2);
        // System.out.println();
        // System.out.println(persona1.getNome());
        // System.out.println(persona1.getCognome());
        // System.out.println(persona2.getNome());
        // System.out.println(persona2.getCognome());


// Interfacce
        // Leone leone = new Leone();
        // Gazzella gazzella = new Gazzella();
        // Pesce pesce = new Pesce();

        // gazzella.scappa();
        // leone.caccia();
        // pesce.scappa();
        // pesce.caccia();

    }


}