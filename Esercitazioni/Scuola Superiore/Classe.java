import java.util.ArrayList;
import java.util.List;

public class Classe {
    private String nomeClasse;
    private int annoCorso;
    private String sezione;
    private int annoNascitaTipico;
    private List<Studente> studenti;

    public Classe(String nomeClasse, int annoCorso, String sezione, int annoNascitaTipico, List<Studente> studenti) {
        this.nomeClasse = nomeClasse;
        this.annoCorso = annoCorso;
        this.sezione = sezione;
        this.annoNascitaTipico = annoNascitaTipico;
        this.studenti = new ArrayList<>();
    }

    public void addStudente(Studente studente) {
        studenti.add(studente);
    }

    public int numeroStudenti() {
        return studenti.size();
    }

    public boolean haStudentiBocciati() {
        for (Studente studente : studenti) {
            if (studente.isBocciato()) {
                return true;
            }
        }
        return false;
    }

    public List<Studente> studentiBocciati() {
        List<Studente> bocciati = new ArrayList<>();
        for (Studente studente : studenti) {
            if (studente.isBocciato()) {
                bocciati.add(studente);
            }
        }
        return bocciati;
    }

    public String toString() {
        return "Classe: " + nomeClasse + ", Anno di corso: " + annoCorso + ", Sezione: " + sezione;
    }
}
