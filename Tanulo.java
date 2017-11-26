public class Tanulo{
    
    private String nev;
    private String id;
    private int jegy;
    
    public Tanulo(String nev, String id, int jegy){
        this.nev = nev;
        this.id = id;
        this.jegy = jegy;
    }
    public String getNev(){
        return nev;
    }
    public String getId(){
        return id;
    }
    public int getJegy(){
        return jegy;
    }
}
