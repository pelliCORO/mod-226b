package uebung03;

import java.util.ArrayList;
import java.util.Date;

public class Bestellung {
    ArrayList<Artikel> artikelListe;
    Date datum;
    Kunde kunde;
    ArrayList<Zahlungsmittel> zahlungmittelListe;

    public ArrayList<Artikel> getArtikelListe() {
        return artikelListe;
    }

    public void setArtikelListe(ArrayList<Artikel> artikelListe) {
        this.artikelListe = artikelListe;
    }

    public Date getDatum() {
        return datum;
    }

    public void setDatum(Date datum) {
        this.datum = datum;
    }

    public Kunde getKunde() {
        return kunde;
    }

    public void setKunde(Kunde kunde) {
        this.kunde = kunde;
    }

    public ArrayList<Zahlungsmittel> getZahlungmittelListe() {
        return zahlungmittelListe;
    }

    public void setZahlungmittelListe(ArrayList<Zahlungsmittel> zahlungmittelListe) {
        this.zahlungmittelListe = zahlungmittelListe;
    }

    public double gesamtPreis() {

        double gesamtPreis = 0;

        for (int i = 0; i < getArtikelListe().size(); i++) {

            gesamtPreis = +getArtikelListe().get(i).anzahlMalPreis();

        }
        return gesamtPreis;


    }

    public double gesamtGewicht() {

        double gesamtGewicht = 0;

        for (int i = 0; i < getArtikelListe().size(); i++) {

            gesamtGewicht = + getArtikelListe().get(i).anzahlMalGewicht();
        }
        return gesamtGewicht;
    }


    public double gesamtBezahlt(){
        double summeBezahlt=0;
        for(int i=0;i<getZahlungmittelListe().size(); i++){

            summeBezahlt = getZahlungmittelListe().get(i).getBetrag();
        }
        return summeBezahlt;
    }



    public boolean istVollständigBezahlt() {
        if (offenerBetrag() == 0) {
            return true;
        }
        else return false;
    }


    public double offenerBetrag() {
        return gesamtPreis() - gesamtBezahlt();


    }

    public Kunde bestelltVon(){
        return getKunde();
    }


}
