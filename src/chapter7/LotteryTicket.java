package chapter7;

import java.util.Arrays;
import java.util.Random;

public class LotteryTicket {

    public static final int LENGTH = 6;
    public static final int MAX_TICKET_NUMBER = 59;

    public static void main(String[] args){

        int[] ticket = generateNumbers();
        Arrays.sort(ticket);
        generateTicket(ticket);
    }

    public static int[] generateNumbers(){

        int[] ticket = new int[LENGTH];

        Random random = new Random();

        for(int i=0; i<LENGTH; i++){
            int randomNumber;
            //Generate random number then search list to make sure entry is unique, nad try again if not.
            do{
                randomNumber = random.nextInt(MAX_TICKET_NUMBER) + 1;
            } while (search(ticket, randomNumber));

            ticket[i] = randomNumber;
        }

        return ticket;
    }

    /**
     * Does a sequential search on the array.
     * @param array Array to search through.
     * @param numberToSearchFor Value to search for.
     * @return true if found, false if not.
     */

    public static boolean search(int[] array, int numberToSearchFor){

        /*This is an enhanced loop.
         *It iterates through 'array' and each time assigns the current element to 'value'.
         */
        for(int value : array){
            if(value == numberToSearchFor) {
                return true;
            }
        }
        return false;
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
