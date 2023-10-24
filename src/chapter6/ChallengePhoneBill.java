package chapter6;

public class ChallengePhoneBill {

    private static final double OVERAGE_RATE = 0.1;
    private static final double TAX_RATE = 0.2;

    private static int count = 0;
    private double baseCost;
    private double planMinutes;
    private String id;
    private double minutesUsed;

    public ChallengePhoneBill(){
        setBaseCost(20);
        setPlanMinutes(600);
        setId("BILL" + count);
        setMinutesUsed(0);
        count++;
    }

    public ChallengePhoneBill(int id){
        setBaseCost(20);
        setPlanMinutes(600);
        setId("CSTM" + id);
        setMinutesUsed(0);
    }

    public ChallengePhoneBill(double baseCost, double planMinutes, double minutesUsed) {
        setBaseCost(baseCost);
        setPlanMinutes(planMinutes);
        setId("BILL" + count);
        setMinutesUsed(minutesUsed);
        count++;
    }

    public void setBaseCost(double baseCost) {
        this.baseCost = baseCost;
    }

    public double getBaseCost(){return baseCost;}

    public void setPlanMinutes(double planMinutes){
        this.planMinutes = planMinutes;
    }

    public double getPlanMinutes(){return planMinutes;}

    public void setId(String id){
        this.id = id;
    }

    public String getId(){return id;}

    public void setMinutesUsed(double minutesUsed){
        this.minutesUsed=minutesUsed;
    }

    public double getMinutesUsed(){return minutesUsed;}

    public double minutesOver(){
        return Math.max(0, getMinutesUsed() - getPlanMinutes());
    }

    public double calculateOverage(){
        return minutesOver() * OVERAGE_RATE;
    }

    public double calculatePreTaxTotal(){
        return getBaseCost() + calculateOverage();
    }

    public double calculateTax(){
        return calculatePreTaxTotal() * TAX_RATE;
    }

    public void generateBill(){
        System.out.println("*** PHONE BILL ***");
        System.out.println("Bill ID: " + getId());
        System.out.println("Minutes used: " + String.format("%.2f", getMinutesUsed()));
        System.out.println("Minutes over: " + String.format("%.2f", minutesOver()));
        System.out.println("Base cost: £" + String.format("%.2f", getBaseCost()));
        System.out.println("Extra cost: £" + String.format("%.2f", calculateOverage()));
        System.out.println("Tax: £" + String.format("%.2f", calculateTax()));
        System.out.println("Total: £" + String.format("%.2f", (calculatePreTaxTotal() + calculateTax())));
        System.out.println(" ");
    }
}


