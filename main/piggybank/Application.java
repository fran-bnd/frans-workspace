package main.piggybank;

import java.util.Scanner;

public class Application {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("--> Input command: 'deposit' or 'break'");
        PiggyBankService bankService = new PiggyBankService();
        PiggyBank banksession = new PiggyBank();

        while(banksession.broken==false){
            String input = sc.nextLine();
            if(input.equals("deposit")){
                // deposit quarter
                bankService.depositQuarter();
                System.out.println("+ $0.25");
            }else if(input.equals("break")){
                // break and display the total ampunt conain
                double finalbalance = bankService.breakPiggyBank();
                System.out.println("--> Balance: $" + finalbalance);
                banksession.broken = true;
            }
        }
        sc.close();
    }

}
