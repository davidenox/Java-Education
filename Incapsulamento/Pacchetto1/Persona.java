package Pacchetto1;

public class Persona {

    // String nome; // accessibile a main
    private String nome;        
    private String cognome;     // accessibile solo a Persona

    Persona(String nome, String cognome) {
        // this.setNome(nome);  // non serve, posso accedere direttamente, ma posso farlo anche così
        // this.setCognome(cognome);    // non serve, posso accedere direttamente, ma posso farlo anche così
        this.nome = nome;
        this.cognome = cognome;
    }

    Persona(Persona persona){
        this.copy(persona);
    }


    public String getNome(){
        return nome;
    }

    public String getCognome(){
        return cognome;
    }

    public void setCognome(String cognome){
        this.cognome = cognome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void copy(Persona persona){
        this.setNome(persona.getNome());
        this.setCognome(persona.getCognome());
    }
    
}
