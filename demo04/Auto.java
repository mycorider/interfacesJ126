package interfacesJ126.demo04;

public class Auto implements Verkaufbar{
    
    private String modell;

    public Auto(String pModell){

        this.modell = pModell;
    }

    @Override
    public double getVerkaufspreis(){

        return preis;
    }

    public String getModell(){

        return modell;
    }
}
