
import java.util.Scanner;

public class Calculator {
    /**
     * I wanto to create a calculator able to multiply and devide numbers
     * Inputs are numbers and actions user want to perform
     */
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("--> Input first number");
        double n1 = sc.nextDouble();
        System.out.println("--> Input second number");
        double n2 = sc.nextDouble();
        System.out.println("--> Select operation: 'multiply' or 'divide'");
        String operation = sc.next();

        if(operation.equals("multiply")){
            double result = multiply(n1, n2);
            System.out.println("Result =" + result);
        } else if(operation.equals("divide")){
            double result = devide(n1, n2);
            System.out.println("Result = " + result);
        }
    
        sc.close();  //Closing scanner
    }

    public static double multiply(double a, double b){
        return a * b;
    }

    public static double devide(double a, double b){
        return a / b;
    }
}