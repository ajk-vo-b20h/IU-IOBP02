/**
 *Klasse OnlineShop mit der Main-Methode
 * Dient zur Uebung und zum Programmeinstieg
 *
 * @author Andreas Kurth
 * @version 1.0
 **/
public class OnlineShop {
    public static void main(String[]args){
        Kunde k1 = new Kunde(1111,"Karl", "Rietmann", "m", "27.05.1986");
        Kunde k2 = new Kunde(1111, "Karl", "Rietmann", "m", "27.05.1986");
        Kunde k3 = new Kunde(2222, "Barbera", "Beispiel", "w", "28.05.1986");
        Kunde k4 = null;
        Kunde k5 = k1;

        /*Vergleich verschiedener komplexer Datentypen*/
        //Ausgabe der Kunden
        System.out.println(k1 + "\n" + "\n" +
                            k2 + "\n" + "\n" +
                            k3 + "\n" + "\n" +
                            k5 + "\n");

        //Ausgabe von ==
        System.out.println("Ist k1 = k2? " + (k1 == k2) + "\n" +
                            "Ist k2 = k3? " + (k2 == k3) + "\n" +
                            "Ist k3 = k4? " + (k3 == k5) + "\n" +
                            "Ist k1 = k4? " + (k1 == k5) + "\n");

        //Testen von equals
        //Block 1
        System.out.println("Equals testen mit dem TryBlock in der Mitte");
        System.out.println("k1 equals to k2? " + (k1.equals(k2)) + "\n" +
                            "k2 equals to k3? " + (k2.equals(k3)) + "\n" +
                            "k3 equals to k4? " + (k3.equals(k4)));
        try {
            System.out.println(k4.equals(k5));
        }
            catch(NullPointerException exception){
                System.out.println("k4 equals k5 wirft eine NullPointerExcebtion, da k4 = null");
            }
        System.out.println("k1 equals to k5? " + (k1.equals(k5)) + "\n");

        //Testen von equals
        //Block 2
        System.out.println("Equals testen mit umfassendem TryBlock");
        try {
            System.out.println("k1 equals to k2? " + (k1.equals(k2)) + "\n" +
                    "k2 equals to k3? " + (k2.equals(k3)) + "\n" +
                    "k3 equals to k4? " + (k3.equals(k4)) + "\n" +
                    "k4 equals to k5? " + (k4.equals(k5)) + "\n" +
                    "k1 equals to k5? " + (k1.equals(k5)) + "\n");
        }
        catch(NullPointerException exception){
            System.err.println("k4 equals k5 wirft eine NullPointerException, da k4 = null");
        }
    }
}
