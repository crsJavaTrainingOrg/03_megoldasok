import java.util.ArrayList;
public class Naplo{
    private ArrayList<String> bejegyzesek = new ArrayList<String>();
    private String nev;
    private String ujBejegyzes;

    public Naplo(String nev){
        ArrayList<String> bejegyzesek = new ArrayList<String>();

    }

    public void bejegyzesHozzaadas(String bejegyzes){
        if(bejegyzes.length()>=10 && bejegyzes !=null){
            bejegyzesek.add(bejegyzes);
        }
    }

    public boolean bejegyzesFelulirasa(String regiBejegyzes, String ujBejegyzes){
        this.ujBejegyzes = ujBejegyzes;
        for(int i = 0; i<bejegyzesek.size();i++){
            if(bejegyzesek.get(i).equals(regiBejegyzes)){
               bejegyzesek.set(i, ujBejegyzes);

            }
        }
        return true;

    }
    public double atlagHosszusag(){
        int sum = 0;
        
        for(String s :bejegyzesek){
            sum = sum + s.length();
        }
        double atlag = sum / bejegyzesek.size();
        return atlag;
    }
    public ArrayList<String> utolsoBejegyzesek(int n){
        ArrayList<String> utolsobejegyzesek = new ArrayList<String>();
        if(bejegyzesek.size()>n){
            for(int i = 1; i<=n; i++){
                utolsobejegyzesek.add(bejegyzesek.get(bejegyzesek.size()-i));
                
            }
        }
        return utolsobejegyzesek;
    }
    
            
    


}
