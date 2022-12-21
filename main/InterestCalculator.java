package main;
import java.util.Scanner;

public class InterestCalculator {
    /**
     * Ask usser for initial balance and annual interest rate,
     * and print to the console the balance after 1 year.
     * @param args
     */
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // Ask user for initial balance and anual interest rate
        System.out.println("--> Input initial balance:");
        String balanceInput = sc.nextLine();
        // convert the received string into a double
        double balance = Double.parseDouble(balanceInput);
        System.out.println("--> Input interest rate percentage:");
        String interestInput = sc.nextLine();
        // convert the received string into a double
        double interest = Double.parseDouble(interestInput);
        // perform the interest calculation
        double result = calculateBalanceAfterYear(balance, interest);
        // send that data back to the console
        System.out.println("Balance after one year: " + result);

        sc.close();  //Closing scanner
    }
    
    /**
     * Add the amount recieved from interest to the original amount
     * @param principal
     * @param apy
     * @return the final balance after interest
     */
    public static double calculateBalanceAfterYear( double principal, double apy){
        return principal + calculateProfit(principal, apy);
    }

    /**
     * Calculateing the profit
     * @param principal
     * @param apy
     * @return profit gained from principal * apy
     */
    public static double calculateProfit(double principal, double apy){
        return principal * apy/100;
    }
}