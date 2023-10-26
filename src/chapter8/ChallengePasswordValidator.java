package chapter8;

import java.util.Scanner;

public class ChallengePasswordValidator {

    public static final String userName = "test.user@testing.com";
    public static final String currentPassword = "Password123";
    public static  String newPassword;
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args){
        System.out.println("Please log in to change your password.");
        inputValidation("user name", userName);
        inputValidation("password", currentPassword);
        System.out.println("You have logged in successfully.");
        passwordEntry();
        System.out.println("New password set successfully!");
    }

    public static void inputValidation(String field, String variable) {
        String message = String.format("Enter your %s:", field);
        while (true) {
            System.out.println(message);
            String userInput = sc.next();

            if (userInput.equals(variable)) {
                break;
            } else
                System.out.println("Incorrect please try again.");
        }
    }

    public static void passwordEntry(){
        boolean validated = false;
        while(!validated) {
            System.out.println("Enter new password:");
            newPassword = sc.next();
            validated = validatePassword(newPassword);
            if (!validated){
                System.out.println(
                        "Password needs to have at least 8 characters, " +
                        "one upper case letter, one special character, " +
                        "and must not include your username or old password."
                );
            }
        }
    }

    public static boolean validatePassword(String password) {
        boolean result = false;
        for (int i = 0; i < password.length(); i++) {
            if (Character.isUpperCase(password.charAt(i))) {
                result = true;
            }
        }
        for (int j = 0; j < password.length(); j++) {
            if (!Character.isLetterOrDigit(password.charAt(j))) {
                result = true;
            }
        }

        if(!result){
            return result;
        }

        return password.length() > 8 && !password.equals(userName) && !password.equals(currentPassword);
    }
}
