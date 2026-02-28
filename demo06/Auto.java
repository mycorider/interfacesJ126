package interfacesJ126.demo06;

public class Auto implements Verkaufbar{
    
    private String modell;
    private double grundwert;
    private static double verkaufsfaktor = 1.2;

    public Auto(String pModell, double pGrundwert){

        this.modell = pModell;
        this.grundwert = pGrundwert;
    }

    @Override
    public double getVerkaufspreis(){

        return grundwert * verkaufsfaktor;
    }

    public String getModell(){

        return modell;
    }
}
