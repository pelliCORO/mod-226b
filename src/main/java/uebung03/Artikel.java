package uebung03;

public class Artikel {

    String name;
    double preis;
    double gewicht;
    int anzahl;


    public Artikel(String name, double preis, double gewicht, int anzahl) {
        this.name = name;
        this.preis=preis;
        this.gewicht=gewicht;
        this.anzahl=anzahl;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPreis() {
        return preis;
    }

    public void setPreis(double preis) {
        this.preis = preis;
    }

    public double getGewicht() {
        return gewicht;
    }

    public void setGewicht(double gewicht) {
        this.gewicht = gewicht;
    }

    public int getAnzahl() {
        return anzahl;
    }

    public void setAnzahl(int anzahl) {
        this.anzahl = anzahl;
    }


    public double anzahlMalPreis() {
        return getPreis() * getAnzahl();

    }

    public double anzahlMalGewicht() {
        return getGewicht() * getAnzahl();

    }
}
