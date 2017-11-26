import java.util.ArrayList;

public class Csoport{
    
    private ArrayList<Tanulo> tanulok = new ArrayList<Tanulo>();
    

    public boolean tanuloHozzaadasa(Tanulo tanulo){
        
        for(Tanulo t : tanulok){
            if(t.getId().equals(tanulo.getId())){
                return false;

            }

        }
        tanulok.add(tanulo);
        return true;
    }
    public ArrayList<Tanulo> pozJegyTanulok(){
        ArrayList<Tanulo> pozJegyTanulok = new ArrayList<Tanulo>();
        for(Tanulo t : tanulok){
            if(t.getJegy() < 5){
                pozJegyTanulok.add(t);
            }
        }
        return pozJegyTanulok;
    }
}
                

    
