package ba.unsa.etf.rpr;

import java.util.ArrayList;
import java.util.List;

public class Biblioteka {
    private List<Knjiga> knjige=new ArrayList<>();
    private List<Clan> clanovi=new ArrayList<>();

    void dodajClana(Clan clan){
        clanovi.add(clan);
    }
    void dodajKnjigu(Knjiga knjiga){
        knjige.add(knjiga);
    }
}
