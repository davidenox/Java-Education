import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AssunzioniRicorrenti {

    public List<String> rilevaAssunzioniRicorrenti(List<Sportivo> sportivi) {
        
        List<String> ricorrenti = new ArrayList<>();
        Map<String, List<Sportivo>> assunzioniMeseTipo = new HashMap<>();
        for (Sportivo sportivo : sportivi) {
            String chiave = sportivo.getDataAssunzione() + "_" + sportivo.getTipologia();
            List<Sportivo> lista = assunzioniMeseTipo.get(chiave);
            if (lista == null) {
                lista = new ArrayList<>();
                assunzioniMeseTipo.put(chiave, lista);
            }
            lista.add(sportivo);
        }
        for (List<Sportivo> assunzioni : assunzioniMeseTipo.values()) {
            if (assunzioni.size() > 1) {
                ricorrenti.add("Assunzione duplicata di " + assunzioni.get(0).getTipologia() +" nel " + assunzioni.get(0).getDataAssunzione());
            }
        }
        return ricorrenti;
    }

}
