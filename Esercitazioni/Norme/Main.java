import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Creazione di una lista di leggi
        List<Legge> leggi = new ArrayList<>();

        // Creazione di leggi con articoli
        Legge legge1 = new Legge(TipoLegge.Decreto, LocalDate.of(2023, 5, 15), "Intestazione legge 1","allegati","conclusioni");
        for (int i = 1; i <= 21; i++) { // Questa legge ha 21 articoli
            legge1.aggiungiArticolo(new Articolo(i, "Testo dell'articolo " + i));
        }

        Legge legge2 = new Legge(TipoLegge.Ordinanza, LocalDate.of(2023, 7, 20), "Intestazione legge 2","allegati","conclusioni");
        for (int i = 1; i <= 15; i++) { // Questa legge ha 15 articoli
            legge2.aggiungiArticolo(new Articolo(i, "Testo dell'articolo " + i));
        }

        Legge legge3 = new Legge(TipoLegge.Decreto, LocalDate.of(2022, 8, 12), "Intestazione legge 3","allegati","conclusioni");
        for (int i = 1; i <= 22; i++) { // Questa legge ha 22 articoli
            legge3.aggiungiArticolo(new Articolo(i, "Testo dell'articolo " + i));
        }

        // Aggiungere le leggi alla lista
        leggi.add(legge1);
        leggi.add(legge2);
        leggi.add(legge3);

        // Mostrare le leggi con più di 20 articoli
        List<String> leggiConPiuDi20Articoli = mostraLeggiConPiuDi20Articoli(leggi);

        // Stampare il risultato
        for (String legge : leggiConPiuDi20Articoli) {
            System.out.println(legge);
        }
    }

    // Metodo per filtrare le leggi con più di 20 articoli
    public static List<String> mostraLeggiConPiuDi20Articoli(List<Legge> leggi) {
        List<String> risultato = new ArrayList<>();
        for (Legge legge : leggi) {
            if (legge.numeroArticoli() > 20) {
                risultato.add(legge.toString());
            }
        }
        return risultato;
    }
}