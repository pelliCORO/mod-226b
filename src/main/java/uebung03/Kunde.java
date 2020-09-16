package uebung03;

import java.util.ArrayList;

public class Kunde {

    String vorname;
    String nachname;
    int alter;
    char geschlecht;
    Adresse adresse;
    ArrayList<Bestellung> bestellungen;

    public Kunde(String vorname, String nachname, int alter, char geschlecht){
        this.vorname = vorname;
        this.nachname = nachname;
        this.alter = alter;
        this.geschlecht = geschlecht;
    }

    public ArrayList<Bestellung> getBestellungen() {
        return bestellungen;
    }

    public void setBestellungen(ArrayList<Bestellung> bestellungen) {
        this.bestellungen = bestellungen;
    }

    public String getVorname() {
        return vorname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public String getNachname() {
        return nachname;
    }

    public void setNachname(String nachname) {
        this.nachname = nachname;
    }

    public int getAlter() {
        return alter;
    }

    public void setAlter(int alter) {
        this.alter = alter;
    }

    public char getGeschlecht() {
        return geschlecht;
    }

    public void setGeschlecht(char geschlecht) {
        this.geschlecht = geschlecht;
    }

    public Adresse getAdresse() {
        return adresse;
    }

    public void setAdresse(Adresse adresse) {
        this.adresse = adresse;
    }

    public Bestellung zeigeBezahlteBestellungen(){
        // istVollständigBezahlt == true

        return null;
    }

    public Bestellung zeigeLetzteBestellung(){

        //letzter Index in der Liste
        return null;
    }
    public double zeigeOffenenBetrag() {
        // summe der offen betraege = 0
        double summeOffen = 0;
        // iteriere über alle bestellen
        for (int i = 0; i < getBestellungen().size(); i++) {
            // frage jede bestellung nach dem offenen betrag
            if (getBestellungen().get(i).istVollständigBezahlt() == false) {

                // addiere zu summe
                summeOffen = +getBestellungen().get(i).offenerBetrag();
            }

        }
        // am ende return summe
        return summeOffen;

    }

    public Adresse wohnhaftIn(){

        return getAdresse();
    }

    public boolean pruefeAdresse(){
        return adresse.pruefeAdresse();
    }



}
