public class Studente extends Persona{

    Studente(String nome, String cognome) {
        super(nome, cognome);
    }


    @Override
    public void saluta() {
        System.out.println("Buongiorno professore sono " + this.getNome() + " " + this.getCognome() + "!");
    }
}
