package m226A;

import java.util.ArrayList;

public class Firma {
    String firmenname;
    String strassenname;
    int strassennummer;
    ArrayList<Kunde> kunden;

    public Firma() {
    kunden = new ArrayList<>();
    }



    public String getFirmenname() {

        return firmenname;
    }

    public void setFirmenname(String firmenname) {

        this.firmenname = firmenname;
    }

    public String getStrassenname() {

        return strassenname;
    }

    public void setStrassenname(String strassenname) {

        this.strassenname = strassenname;
    }

    public int getStrassennumme() {

        return strassennummer;
    }

    public void setStrassennumme(int strassennumme) {

        strassennummer = strassennumme;
    }

    public ArrayList<Kunde> getKunden() {
        return kunden;
    }

    public void setKunden(ArrayList<Kunde> kunden) {

        this.kunden = kunden;
    }

    public  void addKunde(String vorname, String nachname) {
        Kunde kunde =  new Kunde();
        kunde.setVorname(vorname);
        kunde.setNachname(nachname);
        ArrayList<Kunde> kundenListe = this.getKunden();
        kundenListe.add(kunde);
        System.out.println("fertig");
    }


    public void delKunde(String nachname){
        for (Kunde kunde: kunden){
            if(nachname.equals(kunde.getNachname())){
                kunden.remove(kunde);
                break;
            }
        }
    }
}
