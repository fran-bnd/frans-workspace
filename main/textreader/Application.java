package main.textreader;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) throws FileNotFoundException{
        TextFileService tfs = new TextFileService();
        Scanner fileNameScanner = new Scanner(System.in);
        System.out.println("--> Input file name with source path:");
        String fileName = fileNameScanner.nextLine();
        String contents = tfs.readStringFromFile(fileName);
        System.out.println(contents);
        System.out.println("Thank you for using the file reading app! Bye");
        
        fileNameScanner.close();
    }
    
}
