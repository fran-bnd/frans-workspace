package main.timer;

import java.util.Scanner;

public class Application {

    public static void main(String[] args){
        
        TimerService timerService = new TimerService();
       
        Scanner sc = new Scanner(System.in);
        System.out.println("--> Input starting integer number");
        String startInput = sc.nextLine(); 
        int starter = Integer.parseInt(startInput);
        System.out.println("--> Input starting integer number");
        String countInput = sc.nextLine(); 
        int count = Integer.parseInt(countInput);
        
        //String output = timerService.count(starter,count);
        String output = timerService.countEvenNumbers(starter,count);
        System.out.println(output);

        sc.close();
    }
        
}       
