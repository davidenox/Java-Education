import java.util.ArrayList;
public class Fabbrica<Prodotto> {
    private double tempoAssemblaggio;
    private double costoManodopera;
    private double fattoreGuadagno;
    private double costoGiornalieroProduzione;
    private ArrayList<Prodotto> prodotti;
    
    public Fabbrica(double costoManodopera, double fattoreGuadagno, double costoGiornalieroProduzione) {
        this.costoManodopera = costoManodopera;
        this.fattoreGuadagno = fattoreGuadagno;
        this.costoGiornalieroProduzione = costoGiornalieroProduzione;
        ArrayList<Prodotto> prodotti = new ArrayList<Prodotto>();

    }

    public void inserimento(Prodotto prodotto) {
        prodotti.add(prodotto);
    }

    public void setFattoreGuadagno(double fattoreGuadagno) {
        this.fattoreGuadagno = fattoreGuadagno;
    }





}
