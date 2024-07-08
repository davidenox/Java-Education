import java.util.Date;

public class Componenti {
    private String nome;
    private String provenienza;
    private double costo;
    private double tempoOrdinazione;
    private int quantita;
    private double tempoRealizzazione;

    public Componenti(String nome, String provenienza, double costo, double tempoOrdinazione, double tempoRealizzazione, String quantita) {
        this.nome = nome;
        this.provenienza = provenienza;
        this.costo = costo;
        this.tempoOrdinazione = tempoOrdinazione;
        this.tempoRealizzazione = tempoRealizzazione;
        this.quantita = Integer.parseInt(quantita);
    }

    public int getQuantita() {
        return quantita;
    }
    
    public String getNome() {
        return nome;
    }

    public String getProvenienza() {
        return provenienza;
    }

    public double getCosto() {
        return costo;
    }   

    public double getTempoOrdinazione() {
        return tempoOrdinazione;
    }

    public double getTempoRealizzazione() {
        return tempoRealizzazione;
    }

}
