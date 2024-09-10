public class Sportivo{

    private String nome;
    private String cognome;
    public int[] goalPerMese;
    private String dataAssunzione;

    private String tipologia;
    private String numeroIscrizione;
    private int livelloStipendiale;

    public Sportivo(String nome, String cognome, String tipologia, int livelloStipendiale, Registro registro){
        this.nome = nome;
        this.cognome = cognome;
        this.tipologia = tipologia;
        this.livelloStipendiale = livelloStipendiale;
        this.numeroIscrizione = "TEAM: "+ numeroIscrizione;
        this.goalPerMese = new int[12];
    }

    public Sportivo(String nome,String tipologia,String dataAssunzione){
        this.nome = nome;
        // this.cognome = cognome;
        this.tipologia = tipologia;
        this.dataAssunzione = dataAssunzione;
    }

    public String getNome(){
        return nome;
    }

    public String getCognome(){
        return cognome;
    }

    public String getTipologia(){
        return tipologia;
    }

    public String getNumeroIscrizione(){
        return numeroIscrizione;
    }

    public int getLivelloStipendiale(){
        return livelloStipendiale;
    }

    public String getDataAssunzione(){
        return dataAssunzione;
    }

    public void setGoalPerMese(int mese, int reti){
        this.goalPerMese[mese - 1] = reti;
    }



}
