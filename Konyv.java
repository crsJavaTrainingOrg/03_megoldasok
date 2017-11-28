public class Konyv{

    private String szerzo;
    private String cim;
    private boolean elerhetoe;

    public Konyv(String cim, String szerzo){
        this.cim = cim;
        this.szerzo = szerzo;

    }

    public String getCim(){
        return cim;
    }

    public String getSzerzo(){
        return szerzo;
    }
}
