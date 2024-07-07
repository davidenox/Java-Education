public class Persona {
    private String nome;
    private String cognome;

    Persona(String nome, String cognome) {
        this.nome = nome;
        this.cognome = cognome;
    }

    Persona(Persona persona) {
        this.copy(persona);
    }

    public String getNome() {
        return nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public void copy(Persona persona) {
        this.setNome(persona.getNome());
        this.setCognome(persona.getCognome());
    }

    public void saluta() {
        System.out.println("Ciao!");
    }

    
}
