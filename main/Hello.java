package main;
import java.util.Scanner;

public class Hello{
    /**
     * I wanto to create program that that uses the Scanner.
     */
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);  //Reading from System.in
        System.out.println("Input a value: "); 
        int number = sc.nextInt();
        System.out.println("You inputted " + number); 
        if (number > 0){
            System.out.println("Positive number inputted");
        }else if (number < 0){
            System.out.println("Negative number inputted");
        }else{
            System.out.println("Number cero inputted"); 
        }
        sc.close();  //Closing scanner
    }
}