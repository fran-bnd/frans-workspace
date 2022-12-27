package main.chatbot;

import java.util.Scanner;

public class Application {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("--> Input first language");
        String language1 = sc.nextLine();
        System.out.println("--> Input first language");
        String language2 = sc.nextLine();

        ChatbotService chatService1 = new ChatbotService();
        chatService1.language = language1;
        String result1 =chatService1.helloMessage();
        System.out.println(result1);
        String result11 =chatService1.goodbyeMessage();
        System.out.println(result11);
        ChatbotService chatService2 = new ChatbotService();
        chatService2.language = language2;
        String result2 =chatService2.helloMessage();
        System.out.println(result2);
        String result22 =chatService2.goodbyeMessage();
        System.out.println(result22);

        sc.close();
    }  
}
