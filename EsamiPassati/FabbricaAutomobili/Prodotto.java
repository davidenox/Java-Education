import java.lang.reflect.Array;
import java.util.ArrayList;

public class Prodotto {
    String identificativo;
    String etichetta;
    String costoProduzione;
    String prezzoVendita;

    public Prodotto(String identificativo, String etichetta, String costoProduzione, String prezzoVendita) {
        this.identificativo = identificativo;
        this.etichetta = etichetta;
        this.costoProduzione = costoProduzione;
        this.prezzoVendita = prezzoVendita;
        ArrayList<Componenti> componenti = new ArrayList<Componenti>();
    }

}