package chapter6;

public class ChallengePhoneBillBuilder {

    public static void main(String[] args){

        ChallengePhoneBill bill1 = new ChallengePhoneBill();
        ChallengePhoneBill bill2 = new ChallengePhoneBill(123);
        ChallengePhoneBill bill3 = new ChallengePhoneBill(25, 500, 400);
        ChallengePhoneBill bill4 = new ChallengePhoneBill(20, 420, 851);

        bill1.generateBill();
        bill2.generateBill();
        bill3.generateBill();
        bill4.generateBill();
    }
}
