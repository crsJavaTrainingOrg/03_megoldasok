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
        for(String b: bejegyzesek){
            if(regiBejegyzes.equals(b)){
                b.replace(regiBejegyzes, ujBejegyzes);

            }
        }
        return true;

    }


}
