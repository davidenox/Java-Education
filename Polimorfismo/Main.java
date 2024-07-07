import java.util.Scanner;
import java.util.InputMismatchException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {

        // Studente studente1 = new Studente("Luca", "Rossi");
        // Studente studente2 = new Studente("Anna", "Verdi");
        // Insegnante insegnante1 = new Insegnante("Marco", "Verdi");

        // Persona[] classe = {studente1, studente2, insegnante1}; 

        // for(Persona persona : classe){
        //     persona.saluta();
        // }

// // Gestire le exceptions

//         Scanner scanner = new Scanner(System.in);


//         try{
//             System.out.println("Inserisci un numero: ");
//             int x = scanner.nextInt();
//             System.out.println("Inserisci il secondo numero: ");
//             int y = scanner.nextInt();
    
//             int result = x/y;
    
//             System.out.println("Il risultato della divisione è: " + result);
//         }catch (ArithmeticException e){
//             System.out.println("Non puoi dividere per zero");
//         }catch( InputMismatchException e){
//             System.out.println("Devi inserire un numero");
//         }catch(Exception e){
//             System.out.println("Errore generico");
//         }finally{
//             scanner.close();            
//         }

// Lavorare con i file
        File file = new File("prova.txt");
        if (file.exists()){
            System.out.println("Il file esiste");
            System.out.println("Il percorso del file è: " + file.getPath());
            System.out.println("Il percorso assoluto del file è: " + file.getAbsolutePath());
            System.out.println(file.isFile());
            file.delete();
        }else{
            System.out.println("Il file non esiste");
        }

        try {
            FileWriter writer = new FileWriter("prova.txt");
            writer.write("Ciao sono io"); //scrive / sostituisce se rieseguito
            writer.append(" e sono un file di testo"); //aggiunge   
            writer.append(" e sono un file di merda");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        } 
        try {
            FileReader reader = new FileReader("prova.txt");
            int data = reader.read();

            while(data != -1){
                System.out.print((char)data);
                data = reader.read();
            }
            System.out.println(data);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }catch (IOException e) {
            e.printStackTrace();
        }
// Casting
        double x = 9.5f;
        System.out.print(x); //Implicito

        int y = (int)9.5;
        System.out.print(y); //Esplicito
// Data e ora

        LocalDate a = LocalDate.now();
        System.out.println(a);
        LocalTime b = LocalTime.now();
        System.out.println(b);
        LocalDateTime c = LocalDateTime.now();
        System.out.println(c);

        DateTimeFormatter d = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println(a.format(d));

//HashMap
        HashMap<String, String> capitali = new HashMap<String, String>();

        capitali.put("Italia", "Roma");
        capitali.put("Francia", "Parigi");
        capitali.put("Germania", "Berlino");
        capitali.put("Inghilterra", "Londra");

        System.out.println(capitali);

        capitali.remove("Francia");
        System.out.println(capitali);

        capitali.clear();
        System.out.println(capitali);

// Iteratori

        ArrayList<String> persone = new ArrayList<String>();
        persone.add("Luca");
        persone.add("Anna");
        persone.add("Marco");
        persone.add("Paolo");

        Iterator<String> it = persone.iterator();

        // System.out.println(it.next());
        // System.out.println(it.next());
        // System.out.println(it.next());
        // System.out.println(it.next()); BRUTTISSIMO

        while(it.hasNext()){
            String persona = it.next();
            // System.out.println(it.next());  // Molto meglio
            if(persona == "Anna"){
                it.remove();
            }
        }
        System.out.println(persone);










    }
}