package interfacesJ126.demo06;

public class Steuerung {

    public static void main(String[] args) {
        
        Auto a = new Auto("Mini",20000);
        Auto b = new Auto("Golf", 15000);

        System.out.println(a.getModell());
        System.out.println(a.getVerkaufspreis());

        System.out.println(b.getModell());
        System.out.println(b.getVerkaufspreis());
        
    }
}
