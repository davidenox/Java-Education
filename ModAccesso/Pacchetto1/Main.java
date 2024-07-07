package Pacchetto1;
import Pacchetto2.*;

/*          class       package          subclass          world
 * public    +            +                +                +
 * protected +            +                +                -
 * default   +            +                -                -
 * private   +            -                -                - 
 */

public class Main{

    public static void main(String[] args){

        A prova = new A();
        System.out.println(prova.nome); // non me lo fa fare perchè non posso accedere a B da Main
        
    }
}