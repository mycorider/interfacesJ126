package interfacesJ126.demo03;

public class Steuerung {

    public static void main(String[] args) {
        
        Auto a = new Auto("Mini");
        Auto b = new Auto("Golf");

        System.out.println(a.getModell());
        System.out.println(a.getVerkaufspreis());

        System.out.println(b.getModell());
        System.out.println(b.getVerkaufspreis());

        
    }
}
