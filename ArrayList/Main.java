package ArrayList;
import java.util.ArrayList;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){

        // Scanner scanner = new Scanner(System.in);

        // ArrayList<ArrayList<String>> classi = new ArrayList();

        // ArrayList<String> classe1 = new ArrayList<String>();
        // classe1.add("Mario");
        // classe1.add("Luigi");

        // ArrayList<String> classe2 = new ArrayList<String>();
        // classe2.add("Anna");
        // classe2.add("Orazio");
        
        // classi.add(classe1);
        // classi.add(classe2);

        // for(int i = 0; i < classi.size(); i++){
        //     System.out.println();
        //     for(int j = 0; j < classi.get(i).size(); j++){
        //         System.out.println(classi.get(i).get(j));
        //     }
        // }

        // System.out.println("Inserisci il nome della classe: ");
        // String nomeClasse = scanner.nextLine();

        // System.out.println("ciao " + nomeClasse);

        // double a = Math.random();
        // System.out.println(a);

        // int[] numeri = {1, 2, 3, 4, 5};
        // String[][] classi2 = new String[3][3];
        // classi2[0][0] = "Mario";
        // classi2[0][1] = "Luigi";
        // classi2[0][2] = "Anna";
        // classi2[1][0] = "Orazio";
        // classi2[1][1] = "Giovanni";
        // classi2[1][2] = "Giovanna";
        // classi2[2][0] = "Giovanni";
        // classi2[2][1] = "Giovanna";
        // classi2[2][2] = "Giovanni";


        // for(int i = 0; i < classi2.length; i++){
        //     System.out.println();
        //     for(int j = 0; j < classi2[i].length; j++){
        //         System.out.println(classi2[i][j] + "");
        //     }
        // }
        // persone.add(1);
        // persone.add(10);
        // persone.add(100);

        // persone.set(2, 1000);
        // persone.remove(0);
        // persone.clear();

        // for(int i = 0; i < persone.size(); i++){
        //     System.out.println(persone.get(i));
        // }

        String nome3 = "cristian";
        
        // boolean risultato = nome3.equalsIgnoreCase("Cristian"); // true
        // boolean risultato = nome3.equals("Cristian"); // false
        // int risultato = nome3.length(); // 8
        // char risultato = nome3.charAt(7); // n 
        // int risultato = nome3.indexOf("i"); // 2
        // boolean risultato = nome3.isEmpty(); // false
        // String risultato = nome3.toUpperCase(); // CRISTIAN
        // String risultato = nome3.toLowerCase(); // cristian
        // String risultato = nome3.trim(); //cristian
        // String risultato = nome3.replace('i', 'w'); // crwstwan

        System.out.println(risultato);


        // Metodi overloaded


        int doppioInt = addizione(2, 3);
        int triploInt = addizione(5, 10, 9);
        double doppioDouble = addizione(2.5, 6.3);

        System.out.println(doppioInt);

    }
    static int addizione(int a, int b){
        return a + b;
        return result;
    }
    
    static int addizione(int a, int b, int c){
        return a + b;
        return result;
    }
    static double addizione(double a, double b){
        return a + b;
        return result;
    }

}