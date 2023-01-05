package main.setsandmaps;

import java.util.Scanner;

public class Application {

    public static void main(String[] args){
        NumberSetService nss = new NumberSetService();
        Scanner sc = new Scanner(System.in);
        boolean shouldLoop = true;

        while (shouldLoop){
            System.out.println(nss.numbers);
            System.out.println("--> Choose: add | check | remove | exit");
            String input = sc.nextLine();

            if (input.equals("add")){
                nss.addTwoNumbers(Integer.parseInt(sc.nextLine()));

            }else if(input.equals("check")){
                boolean b = nss.checkNumbers(Integer.parseInt(sc.nextLine()));
                if (b){
                    System.out.println("-> Number exists");
                }else{
                    System.out.println("-> Number does not exists");
                }
            }else if(input.equals("remove")){
                String numberInput = sc.nextLine();
                int number = Integer.parseInt(numberInput);
                nss.removeNumber(number);
                
            }else if(input.equals("exit")){
                shouldLoop = false;
                // will break the while loop next time the while loop condition is checked
            }
            
        }
        
    sc.close();
    }
    
}
