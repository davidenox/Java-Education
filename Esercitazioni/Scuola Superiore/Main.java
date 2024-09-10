import java.time.LocalDate;
import java.util.ArrayList;

public class Main{
    public static void main(String[] args){

        Classe classe5A = new Classe("5A", 5, "A", 2005, new ArrayList<>());

        classe5A.addStudente(new Studente("Lucrezia Maria", "Zaccari", "Alatri", LocalDate.of(2005, 02, 19), 2019, false, 0));
        classe5A.addStudente(new Studente("Mario", "Rossi", "Lì", LocalDate.of(2005, 02, 19), 2019, false, 0));
        classe5A.addStudente(new Studente("Giovanni", "Verdi", "Qua", LocalDate.of(2005, 02, 19), 2018, true, 1));
        classe5A.addStudente(new Studente("Giuseppe", "Bianchi", "Là", LocalDate.of(2005, 02, 19), 2019, false, 0));
        classe5A.addStudente(new Studente("Maria", "Gialli", "Altrove", LocalDate.of(2005, 02, 19), 2017, true, 2));

        System.out.println(classe5A + " Numero studenti: " + classe5A.numeroStudenti());

        Classe classe4A = new Classe("4A", 4, "A", 2006, new ArrayList<>());

        classe4A.addStudente(new Studente("Luca", "Rossi","ciao" , LocalDate.of(2006, 8, 20), 2021, false, 0));
        classe4A.addStudente(new Studente("Emma", "Bianchi","ciao3" , LocalDate.of(2006, 3, 5), 2020, true, 1));

        System.out.println(classe4A + " Numero studenti: " + classe4A.numeroStudenti());

        Classe classe3A = new Classe("3A", 3, "A", 2007, new ArrayList<>());

        classe3A.addStudente(new Studente("Luca", "Bianchi","ciao" , LocalDate.of(2007, 8, 20), 2020, false, 0));
        classe3A.addStudente(new Studente("Anna", "Neri","ciao2" , LocalDate.of(2007, 3, 5), 202019, true, 1));

        System.out.println(classe3A + " Numero studenti: " + classe3A.numeroStudenti());

        if (classe5A.haStudentiBocciati()) {
            System.out.println("Ci sono studenti bocciati nella classe " + classe5A + ":");
            for (Studente bocciato : classe5A.studentiBocciati()) {
                System.out.println(bocciato + " - Anni ripetente: " + bocciato.getAnniRipetente());
            }
        }

        if (classe4A.haStudentiBocciati()) {
            System.out.println("Ci sono studenti bocciati nella classe " + classe4A + ":");
            for (Studente bocciato : classe4A.studentiBocciati()) {
                System.out.println(bocciato + " - Anni ripetente: " + bocciato.getAnniRipetente());
            }
        } 

        if (classe3A.haStudentiBocciati()) {
            System.out.println("Ci sono studenti bocciati nella classe " + classe3A + ":");
            for (Studente bocciato : classe3A.studentiBocciati()) {
                System.out.println(bocciato + " - Anni ripetente: " + bocciato.getAnniRipetente());
            }
        }


    }
}