import java.util.ArrayList;
import java.util.List;

public class Registro {
    private List<Sportivo> sportivi;
    
    public Registro(){
        sportivi = new ArrayList<>();
    }

    public void addSportivo(Sportivo sportivo){
        sportivi.add(sportivo);
    }

    public List<Sportivo> getSportivi(){
        return sportivi;
    }
}
