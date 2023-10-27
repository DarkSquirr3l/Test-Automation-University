package chapter9.challenge;

public class Cake {

    protected String flavour;
    protected double price;

    public Cake(){

    }

    public Cake (String flavour){
        setFlavour(flavour);
        setPrice(24.99);
    }

    public String getFlavour() {
        return flavour;
    }

    public void setFlavour(String flavour) {
        this.flavour = flavour;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
