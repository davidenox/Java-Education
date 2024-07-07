public class Insegnante extends Persona{

    String materiaInsegnata;
    // String[] classi = {"1D", "2D", "3D"};

    Insegnante(String nome, String cognome, String materiaInsegnata){
        super(nome, cognome);
        this.materiaInsegnata = materiaInsegnata;
        
    }
    void insegna(){
        System.out.println("Sto insegnando... ");
    }


    @Override
    void saluta(){
        System.out.println("Buongiorno ragazzi!");
        
    }
    
}
