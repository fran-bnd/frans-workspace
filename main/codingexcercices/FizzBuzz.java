
import java.util.Scanner;

public class FizzBuzz {

    /**
     * Return "Fizz" if a number n is divisible by 3, "Buzz" if divisible by 5, and "FizzBuzz" if divisible by both.
     *
     * This is coding problem that will make use of the modulus (%) operator, which can help us calculate if a number
     * is perfectly divisible by another number.
     * The modulus operator returns the remainder after a division (eg 8%3=2).
     *
     * @param n the number that will determine the fizzbuzz result.
     * @return if a number is divisible by 3, return 'Fizz'. if a number is divisible by 5, return 'Buzz'. If
     * divisible by both, return 'FizzBuzz'. If none of these are true, return a blank string "".
     */

     public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        System.out.println("Insert num: ");
        int n = sc.nextInt(); 
        

        for (int i = 0 ; i < n ; i++){

        String  response = "";
        if (i % 3 == 0){
            response = response + "Fizz";
         }
        if (i % 5 == 0){
           response = response + "Buzz";
         }

        System.out.println(i + " " + response);
        }

        sc.close();
    }
    
}
