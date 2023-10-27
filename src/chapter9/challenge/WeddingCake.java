package chapter9.challenge;

public class WeddingCake extends Cake{

    protected int tiers;

    public WeddingCake(){
        super("fruit");
    }

    public int getTiers() {
        return tiers;
    }

    public void setTiers(int tiers) {
        this.tiers = tiers;
    }
}
