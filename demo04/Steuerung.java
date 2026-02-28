package interfacesJ126.demo04;

public class Steuerung {

    public static void main(String[] args) {
        
        Auto a = new Auto("Mini");
        Auto b = new Auto("Golf");

        System.out.println(a.getModell());
        System.out.println(a.getVerkaufspreis());

        System.out.println(b.getModell());
        System.out.println(b.getVerkaufspreis());
        
        // Ist die Variable preis im Interface public oder private?

        System.out.println(a.preis);

        // Zugreifbar - auch über den Klassennamen?

        System.out.println(Auto.preis);

        // Ist die Variable preis im Interface veränderbar?

        // Auto.preis = 40000;

        // Nein --> Der Wert in der Variable preis ist konstant.

        // Merke: Variablen, die innerhalb eines Interfaces definiert werden sind immer
        //
        // public static final - öffentlich statisch und konstant.

    }
}
