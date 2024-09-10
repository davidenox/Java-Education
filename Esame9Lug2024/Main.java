import java.util.ArrayList;
import java.util.List;

public class Main{
    public static void main(String[] args){

        Registro registro = new Registro();
        
        Sportivo mario = new Sportivo("Mario", "Rossi", "Giocatore", 4, registro);
        Sportivo giovanni = new Sportivo("Giovanni", "Bianchi", "Allenatore", 3, registro);
        Sportivo luca = new Sportivo("Luca", "Verdi", "Giocatore", 2, registro);
        Sportivo marco = new Sportivo("Marco", "Bianchi", "Giocatore", 3, registro);
        Sportivo luigi = new Sportivo("Luigi", "Longo", "Medico", 4, registro);
        Sportivo luigio = new Sportivo("Luigio", "Longo", "Medico", 4, registro);

        mario.setGoalPerMese(1, 5);
        mario.setGoalPerMese(2, 3);
        mario.setGoalPerMese(3, 2);
        mario.setGoalPerMese(4, 1);
        mario.setGoalPerMese(5, 0);
        mario.setGoalPerMese(6, 0);
        mario.setGoalPerMese(7, 0);
        mario.setGoalPerMese(8, 0);
        mario.setGoalPerMese(9, 0);
        mario.setGoalPerMese(10, 0);
        mario.setGoalPerMese(11, 0);
        mario.setGoalPerMese(12, 0);

        luca.setGoalPerMese(1, 8);
        luca.setGoalPerMese(2, 8);
        luca.setGoalPerMese(3, 8);
        luca.setGoalPerMese(4, 8);
        luca.setGoalPerMese(5, 0);
        luca.setGoalPerMese(6, 0);
        luca.setGoalPerMese(7, 0);
        luca.setGoalPerMese(8, 0);
        luca.setGoalPerMese(9, 0);
        luca.setGoalPerMese(10, 0);
        luca.setGoalPerMese(11, 0);
        luca.setGoalPerMese(12, 0);

        marco.setGoalPerMese(1, 0);
        marco.setGoalPerMese(2, 0);
        marco.setGoalPerMese(3, 8);
        marco.setGoalPerMese(4, 0);
        marco.setGoalPerMese(5, 0);
        marco.setGoalPerMese(6, 4);
        marco.setGoalPerMese(7, 0);
        marco.setGoalPerMese(8, 0);
        marco.setGoalPerMese(9, 2);
        marco.setGoalPerMese(10, 0);
        marco.setGoalPerMese(11, 0);
        marco.setGoalPerMese(12, 0);

        registro.addSportivo(mario);
        registro.addSportivo(giovanni);
        registro.addSportivo(luca);
        registro.addSportivo(marco);
        registro.addSportivo(luigi);
        registro.addSportivo(luigio);

        CalcoloBonus calcoloBonus = new CalcoloBonus();
        List<String> bonus = calcoloBonus.calcolaBonus(3, registro.getSportivi());
        for(String b : bonus){
            System.out.println(b);
        }

        Sportivo sportivo1 = new Sportivo("Mario", "Medico", "2023-01");
        Sportivo sportivo2 = new Sportivo("Luigi", "Allenatore", "2023-01");
        Sportivo sportivo3 = new Sportivo("Giovanni", "Allenatore", "2023-02");
        Sportivo sportivo4 = new Sportivo("Luca", "Allenatore", "2023-02");
        Sportivo sportivo5 = new Sportivo("Marco", "Medico", "2023-01");

        List<Sportivo> sportivi = new ArrayList<>();
        sportivi.add(sportivo1);
        sportivi.add(sportivo2);
        sportivi.add(sportivo3);
        sportivi.add(sportivo4);
        sportivi.add(sportivo5);

        AssunzioniRicorrenti AssunzioniRicorrenti = new AssunzioniRicorrenti();
        List<String> duplicati = AssunzioniRicorrenti.rilevaAssunzioniRicorrenti(sportivi);
        for (String d : duplicati) {
            System.out.println(d);
        }
    }
}