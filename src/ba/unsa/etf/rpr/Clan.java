package ba.unsa.etf.rpr;

public class Clan {
    private String ime;
    private String prezime;
    private String adresa;
    private String brojTelefona;
    private Zanimanje zanimanje;

    public Clan(String ime, String prezime, String adresa, String brojTelefona, Zanimanje zanimanje) {
        this.ime = ime;
        this.prezime = prezime;
        this.adresa = adresa;
        this.brojTelefona = brojTelefona;
        this.zanimanje = zanimanje;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public String getAdresa() {
        return adresa;
    }

    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }

    public String getBrojTelefona() {
        return brojTelefona;
    }

    public void setBrojTelefona(String brojTelefona) {
        this.brojTelefona = brojTelefona;
    }

    public Zanimanje getZanimanje() {
        return zanimanje;
    }

    public void setZanimanje(Zanimanje zanimanje) {
        this.zanimanje = zanimanje;
    }
}
