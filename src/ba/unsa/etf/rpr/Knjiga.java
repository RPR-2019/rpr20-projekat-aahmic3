package ba.unsa.etf.rpr;

import java.util.Map;

public class Knjiga {
    private String naziv;
    private String autor;
    private Map<Integer, Boolean> primijerci;


    public Knjiga(String naziv, String autor) {
        this.naziv = naziv;
        this.autor = autor;
        primijerci.put(1,true);
    }

    public void dodajPrimjerak(){
        primijerci.put(primijerci.size()+1, true);
    }

    public int dajBrojPrimjeraka(){
        return primijerci.size();
    }

    public int dajBrojDostupnih(){
        int dostupne=0;
        for (Map.Entry<Integer, Boolean> pair : primijerci.entrySet()) {
            if(pair.getValue()) dostupne++;
        }
        return dostupne;
    }
}
