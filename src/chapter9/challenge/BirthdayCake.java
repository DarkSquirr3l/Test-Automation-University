package chapter9.challenge;

public class BirthdayCake extends Cake{

    protected int candles;

    public BirthdayCake(){
        super("vanilla");
    }

    public int getCandles() {
        return candles;
    }

    public void setCandles(int candles) {
        this.candles = candles;
    }
}
