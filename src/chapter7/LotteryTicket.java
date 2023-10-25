package chapter7;

import java.util.Random;

public class LotteryTicket {

    public static final int LENGTH = 6;
    public static final int MAX_TICKET_NUMBER = 59;

    public static void main(String[] args){

        int[] ticket = generateNumbers();
        generateTicket(ticket);
    }

    public static int[] generateNumbers(){

        int[] ticket = new int[LENGTH];

        Random random = new Random();

        for(int i=0; i<LENGTH; i++){
            ticket[i] = random.nextInt(MAX_TICKET_NUMBER) + 1;
        }

        return ticket;
    }

    public static void generateTicket(int[] ticket){

        for (int i=0; i<LENGTH; i++){
            if (i == LENGTH -1){
                System.out.print(ticket[i]);
            } else
                System.out.print(ticket[i] + " | ");
        }
    }
}
