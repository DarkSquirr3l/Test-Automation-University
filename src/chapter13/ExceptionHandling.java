package chapter13;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling {

    public static void main(String[] args) {

        //createNewFile();
        numbersExceptionHandling();
    }

    public static void createNewFile(){
        File file = new File("resources/invisible.txt");
        try{
            file.createNewFile();
        } catch (IOException e) {
            System.out.println("Directory doesn't exist.");
            e.printStackTrace();
        }
    }

    public static void numbersExceptionHandling() {
        File file = new File("numbers/invisible.txt");
        try{
            Scanner fileReader = new Scanner(file);

            while(fileReader.hasNext()){
                double num = fileReader.nextDouble();
                System.out.println(num);
            }
        } catch(FileNotFoundException | InputMismatchException e){ // multiple exceptions, one line
            e.printStackTrace();
        } finally {
            System.out.println("Finally"); // executes every time
        }
    }
}
