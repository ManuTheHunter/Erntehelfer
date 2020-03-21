package com.Byteschupser.Erntehelfer.ViewModel;

public class Arbeitgeber {

    String firma;
    String vorname;
    String nachname;
    String mailadresse;
    boolean mailadresseOeffentlich;
    String telefonnummer;
    boolean telefonnummerOeffentlich;
    String ort;
    int plz;
    String straße;
    int hausnummer;

    public String getFirma() {
        return firma;
    }

    public void setFirma(String firma) {
        this.firma = firma;
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

    public String getMailadresse() {
        return mailadresse;
    }

    public void setMailadresse(String mailadresse) {
        this.mailadresse = mailadresse;
    }

    public boolean isMailadresseOeffentlich() {
        return mailadresseOeffentlich;
    }

    public void setMailadresseOeffentlich(boolean mailadresseOeffentlich) {
        this.mailadresseOeffentlich = mailadresseOeffentlich;
    }

    public String getTelefonnummer() {
        return telefonnummer;
    }

    public void setTelefonnummer(String telefonnummer) {
        this.telefonnummer = telefonnummer;
    }

    public boolean isTelefonnummerOeffentlich() {
        return telefonnummerOeffentlich;
    }

    public void setTelefonnummerOeffentlich(boolean telefonnummerOeffentlich) {
        this.telefonnummerOeffentlich = telefonnummerOeffentlich;
    }

    public String getOrt() {
        return ort;
    }

    public void setOrt(String ort) {
        this.ort = ort;
    }

    public int getPlz() {
        return plz;
    }

    public void setPlz(int plz) {
        this.plz = plz;
    }

    public String getStraße() {
        return straße;
    }

    public void setStraße(String straße) {
        this.straße = straße;
    }

    public int getHausnummer() {
        return hausnummer;
    }

    public void setHausnummer(int hausnummer) {
        this.hausnummer = hausnummer;
    }
}
