package main.textreader;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * this class contain mathods that can read files
 */
public class TextFileService {

    /**
     * method to read from file
     * @param filename a string rep the name (realtive path) to the text
     * @return the contents of the dile rep by filename
     * @throws FileNotFoundException
     */
    public String readStringFromFile(String filename){
        File textFile = new File(filename);
        Scanner textScanner;
        String text = "";
        try {
            textScanner = new Scanner(textFile);
            text = textScanner.nextLine();
        } catch (FileNotFoundException e) {
            System.out.println("Could not find the file.");
        }
      
        return text;

    }
    
}
