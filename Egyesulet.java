import java.util.ArrayList;

public class Egyesulet{
    private ArrayList<Tag> tagok = new ArrayList<Tag>();
    
    public boolean tagHozzaadas(Tag tag){
        for(Tag t:tagok){
            if(t.getCim().equals(tag.getCim())&&t.getNev().equals(tag.getCim())){
                return false;
            }
            
            
        }
        tagok.add(tag);
        return true;
    }
    public ArrayList<Tag> kiNemFizetett(int osszeg){
        ArrayList<Tag> kinemfizetett = new ArrayList<Tag>();
        for(Tag t: tagok){
            if(osszeg - t.getFizetettOsszeg() > 0){
                kinemfizetett.add(t);
            }
        }
        return kinemfizetett;
    }
}
