//package main.messageencoder;

import java.util.Scanner;

/**
 * This program encodes a message from a string to numbers.
 * Each letter is replaced by a two-digit number starting from 01 for 'a'.
 * The encoded message is returned as a string.
 */
public class MessageEncoder {

    /**
     * Main method to run the program.
     * Encodes a sample message and prints the encoded message to the console.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("--> Input message to encode:");
        String message = sc.nextLine();
        String encodedMessage = encodeMessage(message);
        System.out.println("Encoded message: " + encodedMessage);
        sc.close();
    }

    /**
     * Encodes a message from a string to numbers.
     * Each letter is replaced by a two-digit number starting from 01 for 'a'.
     * Other characters are not encoded and are included in the encoded message as-is.
     *
     * @param message the message to be encoded
     * @return the encoded message as a string
     */
    public static String encodeMessage(String message) {
        String encodedMessage = "";

        // Convert the message to lowercase to make the encoding case-insensitive
        message = message.toLowerCase();

        // Iterate through each character of the message
        for (int i = 0; i < message.length(); i++) {
            char c = message.charAt(i);
            if (Character.isLetter(c)) {
                // Calculate the code for each letter by subtracting the ASCII value of 'a'
                int code = (int) c - 96;

                // Add a leading zero if the code is less than 10 to ensure that all codes are two digits
                if (code < 10) {
                    encodedMessage += "0";
                }

                // Append the code to the encoded message string
                encodedMessage += code;
            } else {
                // Append non-letter characters to the encoded message as-is
                encodedMessage += c;
            }
        }
        return encodedMessage;
    }

}

