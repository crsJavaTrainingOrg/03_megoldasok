import java.util.ArrayList;

public class Konyvtar{
    
    private boolean elerhetoe;
    private ArrayList<Konyv> konyvek = new ArrayList<Konyv>();
    
    public void konyvHozzaadasa(String cim, String szerzo){
        Konyv k = new Konyv(cim,szerzo);
        konyvek.add(k);
        elerhetoe = true;
    }
    
    public Konyv kolcsonzes(String cim, String szerzo){
        for(Konyv k : konyvek){
            if(k.getCim().equals(cim)&&k.getSzerzo().equals(szerzo)&& elerhetoe==true){
                elerhetoe = false;
                
                return k;
                
            }
        }
        return null;
    }
    public boolean visszavisz(Konyv konyv){
        for(Konyv k : konyvek){
            if(k == konyv){
                
                elerhetoe = true;
                return true;
                
            }
            
        }
        return false;
    }
    
}
                
                
        

