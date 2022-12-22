package main;
import java.util.Scanner;

public class Coffeeshop {
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //ask user for their balance
        //ask user if they want esspresso or americano
        //ask user how many
        //if input o or negative then no output
        //if cant afford then no outputuser get different message depending on the purchase
        System.out.println("--> Input initial balance:");
        String balanceInput = sc.nextLine();
        double balance = Double.parseDouble(balanceInput);
        
        System.out.println("--> What type? 'esspresso' or 'americano'");
        String coffeeInput = sc.nextLine();
        System.out.println("--> How many?");
        int amountInput = Integer.parseInt(sc.nextLine());

        double esspressoPrice = 3.99;
        double americanoPrice = 2.99;

        if (amountInput > 0){
            boolean isEsspresso = coffeeInput.equals("esspresso");
            boolean isAmericano = coffeeInput.equals("americano");
            if(isEsspresso){
                if(balance >= (esspressoPrice * amountInput)){
                    System.out.println("Enjoy esspresso x "+ amountInput);
                }
            }
            if (isAmericano) {
                if(balance >= (americanoPrice * amountInput)){
                    System.out.println("Enjoy americano x " + amountInput);
                }
            }
        }else{
            System.out.println("No coffee - balance 0 or less");
        }
        sc.close();  //closing scanner
    }

    }
