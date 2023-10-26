package chapter8;

public class TextProcessor {

    public static void main(String[] args){
       countWords("I'm looking forward to completing this course!");
        reverseString("Scooby Doo");
    }

    /**
     * splits a string into an array by tokenizing it
     * @param text full string to be split
     */
    public static void countWords(String text){
        var words = text.split(" ");
        int numberOfWords = words.length;


        String message = String.format("Your text contains %d words:", numberOfWords);
        System.out.println(message);

        for (String word : words) {
            System.out.println(word);
        }
    }

    public static void reverseString(String text){
        for(int i=text.length()-1; i>=0; i--){
            System.out.print(text.charAt(i));
        }
    }
}
