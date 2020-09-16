package uebung03;

public class Adresse {

    String strassenName;
    String strassenNummer;
    String ort;
    int postleitzahl;

    public Adresse(String strassenName, String strassenNummer, String ort, int postleitzahl) {
        this.strassenName = strassenName;
        this.strassenNummer = strassenNummer;
        this.ort = ort;
        this.postleitzahl = postleitzahl;
    }

    public String getStrassenName() {
        return strassenName;
    }

    public void setStrassenName(String strassenName) {
        this.strassenName = strassenName;
    }

    public String getStrassenNummer() {
        return strassenNummer;
    }

    public void setStrassenNummer(String strassenNummer) {
        this.strassenNummer = strassenNummer;
    }

    public String getOrt() {
        return ort;
    }

    public void setOrt(String ort) {
        this.ort = ort;
    }

    public int getPostleitzahl() {
        return postleitzahl;
    }

    public void setPostleitzahl(int postleitzahl) {
        this.postleitzahl = postleitzahl;
    }

    public boolean pruefeAdresse() {
        if (strassenName == null) {
            return false;
        } else if (strassenNummer == null) {
            return false;
        } else if (ort == null) {
            return false;
        } else if (postleitzahl == 0) {
            return false;
        } else {
            return true;
        }

    }

    public void erstelleEtikette() {
        System.out.println(strassenName + strassenNummer + ort + postleitzahl);
    }
}
