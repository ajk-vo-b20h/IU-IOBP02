/**
 *Klasse OnlineShop mit der Main-Methode
 * Dient zur Uebung und zum Programmeinstieg
 *
 * @author Andreas Kurth
 * @version 1.0
 **/
public class OnlineShop {
    public static void main(String[]args){
        Kunde k = new Kunde(1111,"Karl", "Rietmann", "m", "27.05.1986");
        Kunde k2 = new Kunde(1111, "Karl", "Rietmann", "m", "27.05.1986");
        Kunde k3 = new Kunde(2222, "Barbera", "Beispiel", "w", "28.05.1986");
        Kunde k4 = k;

        /*Vergleich verschiedener komplexer Datentypen*/
        //Ausgabe der Kunden
        System.out.println(k + "\n" + "\n" +
                            k2 + "\n" + "\n" +
                            k3 + "\n" + "\n" +
                            k4 + "\n");

        //Ausgabe von ==
        System.out.println("Ist k = k2? " + (k == k2) + "\n" +
                            "Ist k2 = k3? " + (k2 == k3) + "\n" +
                            "Ist k3 = k4? " + (k3 == k4) + "\n" +
                            "Ist k = k4? " + (k == k4) + "\n");

        //testen von equals
        System.out.println("k equals to k2? " + (k.equals(k2)) + "\n" +
                            "k2 equals to k3? " + (k2.equals(k3)) + "\n" +
                            "k3 equals to k4? " + (k3.equals(k4)) + "\n" +
                            "k equals to k4? " + (k.equals(k4)) + "\n");
    }
}
