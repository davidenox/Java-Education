public class Articolo{
    private int numArticolo;
    private String Introduzione;


    public Articolo(int numArticolo, String Introduzione){
        this.numArticolo = numArticolo;
        this.Introduzione = Introduzione;
    }

    public int getNumArticolo(){
        return numArticolo;
    }

    public String getIntroduzione(){
        return Introduzione;
    }


}