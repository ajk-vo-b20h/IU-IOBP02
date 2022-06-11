import java.util.Objects;

/**
 * Klasse Kunde fuer den Onlineshop
 * Dient zum Lerneinstieg und zum eroeffnen von Kunden
 *
 * @author Andreas Kurth
 * @version 1.0
 */

public class Kunde implements Comparable, Cloneable {
    private int kundennummer;
    private String vorname;
    private String nachname;
    private String geschlecht;
    private String geburtsdatum;

    //Konstruktor
    public Kunde(int client, String prename, String surname, String gender, String birth){
        this.kundennummer = client;
        this.vorname = prename;
        this.nachname = surname;
        this.geschlecht = gender;
        this.geburtsdatum = birth;
    }

    //Getter und Setter Methoden
    public void setKundennummer(int kundennummer){this.kundennummer = kundennummer;}

    public int getKundennummer() {return kundennummer;}

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
        return "Kunden-Objekt enthaelt foglende Daten: " + "\n" +
                "Vorname: " + vorname + "\n" +
                "Nachname: " + nachname + "\n" +
                "Geschlecht: " + geschlecht + "\n" +
                "Geburtsdatum: " + geburtsdatum;
    }

    @Override
    public boolean equals(Object o){
        if(this == o) return true;

        if(this == null) return false;

        if(o instanceof Kunde){
            Kunde k = (Kunde) o;
            return kundennummer == k.kundennummer;
        }
        else
            return super.equals(o);
    }

    @Override
    public int hashCode() {
        String s = this.vorname + this.nachname;
        return s.hashCode();
    }

    @Override
    public int compareTo(Object o) {
        Kunde k = (Kunde) o;
        if (nachname.equals(k.nachname))
            return vorname.compareToIgnoreCase(k.vorname);
        else
            return nachname.compareToIgnoreCase(k.nachname);
    }

    @Override
    public Kunde clone(){
        try{
            Kunde k = (Kunde) super.clone();
            return k;
        }
        catch (CloneNotSupportedException exception){
            System.out.println("Das haette nicht passieren duerfen.");
            return null;
        }
    }
}
