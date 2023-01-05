package main.setsandmaps;

import java.util.Scanner;

public class Application2 {
    public static void main(String[] args){

    DictionaryService ds =  new DictionaryService();
    Scanner sc = new Scanner(System.in);
    boolean shouldLoop = true;

        while (shouldLoop){
            System.out.println(ds.words);
            System.out.println("--> Choose: put | get | remove | exit");
            String input = sc.nextLine();

            if (input.equals("put")){
                String key = sc.nextLine();
                String word = sc.nextLine();
                ds.addWordDefinitionPair(key, word);

            }else if(input.equals("get")){
                String key = sc.nextLine();
                String word = ds.retriveDefinition(key);
                System.out.println("Value: " + word);

            }else if(input.equals("remove")){
                String key = sc.nextLine();
                ds.removeDefinition(key);

            }else if(input.equals("exit")){
                shouldLoop = false;
                // will break the while loop next time the while loop condition is checked
            }
            
        }

    sc.close();
    }
}
