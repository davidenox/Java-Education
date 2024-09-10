import java.util.ArrayList;
import java.util.List;

public class CalcoloBonus {
    public List<String> calcolaBonus(int goalMin, List<Sportivo> sportivi){

        List<String> bonus = new ArrayList<>();
        for(Sportivo sportivo : sportivi){
            if(sportivo.getLivelloStipendiale() >= 3 && sportivo.getTipologia() == "Giocatore"){
                int mesiGoalMin = 0;
                for(int i = 0; i < 12; i++){
                    if(sportivo.goalPerMese[i] >= goalMin){
                        mesiGoalMin++;
                    }
                }
                if (mesiGoalMin > 0) {
                    bonus.add(sportivo.getNome() + " " + sportivo.getCognome() + " ha raggiunto il bonus per " + mesiGoalMin + " mesi");
                    
                }
            }
        }
        return bonus;
    }
}   
