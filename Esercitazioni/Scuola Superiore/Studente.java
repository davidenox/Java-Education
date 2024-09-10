import java.time.LocalDate;

public class Studente {
    private String nome;
    private String cognome;
    private String luogoNascita;
    private LocalDate dataNascita;
    private int annoIscrizione;
    private boolean bocciato;
    private int anniRipetente;

    public Studente(String nome, String cognome, String luogoNascita, LocalDate dataNascita, int annoIscrizione, boolean bocciato, int anniRipetente) {
        this.nome = nome;
        this.cognome = cognome;
        this.luogoNascita = luogoNascita;
        this.dataNascita = dataNascita;
        this.annoIscrizione = annoIscrizione;
        this.bocciato = bocciato;
        this.anniRipetente = anniRipetente;
    }

    public String getNome() {
        return nome;
    }

    public String getCognome() {
        return cognome;
    }

    public String getLuogoNascita() {
        return luogoNascita;
    }

    public LocalDate getDataNascita() {
        return dataNascita;
    }

    public int getAnnoIscrizione() {
        return annoIscrizione;
    }

    public boolean isBocciato() {
        return bocciato;
    }

    public int getAnniRipetente() {
        return anniRipetente;
    }

    @Override
    public String toString() {
        return cognome + " " + nome + " (" + dataNascita + ", " + luogoNascita + ")";
    }

}
