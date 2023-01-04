package main.petstore;

import java.util.List;
import java.util.Scanner;

public class Application {
    public static void main(String[] args){
        PetStoreService pss = new PetStoreService();
        Scanner sc = new Scanner(System.in);
        boolean shouldLoop = true;
        while (shouldLoop){
            System.out.println("--> Choose: add | purchase | exit");
            List<Pet> allPets = pss.getPets();
            System.out.println("--> Current pets: "+ allPets);
            String input = sc.nextLine();
            if (input.equals("add")){
                System.out.print("-> Name of pet to add: ");
                String name = sc.nextLine();
                System.out.print("-> Sound of pet to add: ");
                String sound = sc.nextLine();
                Pet newPet = new Pet(name, sound);
                pss.addPet(newPet);

            }else if(input.equals("purchase")){
                System.out.print("-> Name of pet to purchase: ");
                String namePet = sc.nextLine();
                pss.purchasePet(namePet);
                
            }else if(input.equals("exit")){
                shouldLoop = false;
                // will break the while loop next time the while loop condition is checked
            }

        }
    }   
    
}