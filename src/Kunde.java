/**
 * Klasse Kunde fuer den Onlineshop
 * Dient zum Lerneinstieg und zum eroeffnen von Kunden
 *
 * @author Andreas Kurth
 * @version 1.0
 */

public class Kunde {
    private String vorname;
    private String nachname;
    private String geschlecht;
    private String geburtsdatum;

    //Konstruktor
    public Kunde(String prename, String surname, String gender, String birth){
        this.vorname = prename;
        this.nachname = surname;
        this.geschlecht = gender;
        this.geburtsdatum = birth;
    }

    //Getter und Setter Methoden
    public void setVorname(String prename){
        this.vorname = prename;
    }

    public String getVorname(){
        return vorname;
    }

    public void setNachname(String surname){
        this.nachname = surname;
    }

    public String getNachname(){
        return nachname;
    }

    public void setGeschlecht(String gender){
        this.geschlecht = gender;
    }

    public String getGeschlecht(){
        return geschlecht;
    }

    public void setGeburtsdatum(String birth){
        this.geburtsdatum = birth;
    }

    public String getGeburtsdatum(){
        return geburtsdatum;
    }

    /**
     *Ueberschriebene toString Methode
     */
    @Override
    public String toString(){
        return "Kunden-Objekt enthält foglende Daten: " + "\n" +
                "Vorname: " + vorname + "\n" +
                "Nachname: " + nachname + "\n" +
                "Geschlecht: " + geschlecht + "\n" +
                "Geburtsdatum: " + geburtsdatum;
    }
}
