public class Tag{
    private String nev;
    private String cim;
    private int fizetettOsszeg;
    
    public Tag (String nev, String cim, int fizetettOsszeg){
        this.nev = nev;
        this.cim = cim;
        this.fizetettOsszeg = fizetettOsszeg;
    }
    
    public String getNev(){
        return nev;
    }
    public String getCim(){
        return cim;
    }
    public int getFizetettOsszeg(){
        return fizetettOsszeg;
    }
    public void fizetettOsszegBeallit(int osszeg){
        fizetettOsszeg = osszeg;
    }
}
        
       
    
    
   
