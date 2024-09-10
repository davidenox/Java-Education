import java.time.LocalDate;
import java.util.List;

public class Legge {
    private TipoLegge tipologia;
    private LocalDate data;
    private String intestazione;
    private String allegati;
    private String conclusioni;
    private List<Articolo> articoli;

    public Legge(TipoLegge tipologia, LocalDate data, String intestazione, String allegati, String conclusioni){
        this.tipologia = tipologia;
        this.data = data;
        this.intestazione = intestazione;
        this.allegati = allegati;
        this.conclusioni = conclusioni;
    }

    public TipoLegge getTipologia(){
        return tipologia;
    }

    public LocalDate getData(){
        return data;
    }

    public String getIntestazione(){
        return intestazione;
    }

    public String getAllegati(){
        return allegati;
    }

    public String getConclusioni(){
        return conclusioni;
    }

    public void recuperaLegge(){
        System.out.println("Tipologia: " + tipologia + "\nData: " + data);
    }

    @Override
    public String toString() {
        return "legge:" + tipologia.name().toLowerCase() + ":" + data.getYear() + "-" + data.getMonthValue() + "-" + data.getDayOfMonth();
    }

    public void aggiungiArticolo(Articolo articolo) {
        articoli.add(articolo);
    }

    public int numeroArticoli() {
        return articoli.size();
    }
}

