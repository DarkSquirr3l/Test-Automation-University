package chapter4;

import java.util.Scanner;

public class LetterSearch {

    public static void main(String[] args) {

        //Get test to search through
        System.out.println("Enter a line of text:");
        Scanner sc = new Scanner(System.in);
        String text = sc.next();
        sc.close();

        //Search the text for the letter A
        boolean letterFound = false;

        for (int i=0; i < text.length(); i++) {
            char currentLetter = text.charAt(i);
            if (currentLetter == 'A' || currentLetter == 'a') {
                letterFound = true;
                break;
            }
        }

        if (letterFound) {
            System.out.println("This text contains the letter 'A'.");
        } else {
            System.out.println("This text does not contain the letter 'A'.");
        }
        
    }
}
