package ba.unsa.etf.rpr;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ClanskaKarta {
    Clan clan;
    TipClanarine tipClanarine;
    double cijenaClanarine;
    LocalDate datumUclanjenja;
    LocalDate datumIsteka;
    List<Knjiga> iznajmljeneKnjige;
    List<Knjiga> iznajmljivaneKnjige;
    static int brojClanske=000001;

    public ClanskaKarta(Clan clan, TipClanarine tipClanarine, LocalDate datumUclanjenja) {
        this.clan = clan;
        this.tipClanarine = tipClanarine;
        this.datumUclanjenja = datumUclanjenja;
        if(tipClanarine==TipClanarine.GODIŠNJA) datumIsteka=datumUclanjenja.plusYears(1);
        else if(tipClanarine==TipClanarine.POLUGODIŠNJA) datumIsteka=datumUclanjenja.plusMonths(6);
        iznajmljeneKnjige=new ArrayList<>();
        iznajmljivaneKnjige=new ArrayList<>();
        cijenaClanarine=obracunajCijenu(clan);
    }
    double obracunajCijenu(Clan clan){
        if(clan.getZanimanje()==Zanimanje.PENZIONER || clan.getZanimanje()==Zanimanje.STUDENT || clan.getZanimanje()==Zanimanje.UČENIK){
            if(tipClanarine==TipClanarine.GODIŠNJA) return 15.0;
            else if(tipClanarine==TipClanarine.POLUGODIŠNJA) return 10.0;
        }
        else if(clan.getZanimanje()==Zanimanje.RADNIK || clan.getZanimanje()==Zanimanje.DRUGO){
            if(tipClanarine==TipClanarine.GODIŠNJA) return 17.0;
            else if(tipClanarine==TipClanarine.POLUGODIŠNJA) return 12.0;
        }
        return 0.0;
    }
}
