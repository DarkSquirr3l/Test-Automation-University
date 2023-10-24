package chapter6;

public class ChallengePhoneBill {

    private static int count = 0;
    private double baseCost;
    private double planMinutes;
    private String id;
    private double minutesUsed;

    public ChallengePhoneBill(){
        setBaseCost(20);
        setPlanMinutes(600);
        setId("BILL" + count);
        setOverage(0);
        count++;
    }

    public ChallengePhoneBill(int id){
        setBaseCost(20);
        setPlanMinutes(600);
        setId("BILL" + id);
        setOverage(0);
    }

    public ChallengePhoneBill(double baseCost, double planMinutes, double minutesUsed) {
        setBaseCost(baseCost);
        setPlanMinutes(planMinutes);
        setId("BILL" + id);
        setOverage(minutesUsed);
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

    public void setOverage(double minutesUsed){
        this.minutesUsed=minutesUsed;
    }

    public double getOverage(){return minutesUsed;}
}


