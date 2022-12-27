package main.chatbot;

public class ChatbotService {

    String language;

    public String helloMessage(){
        if (language.equals("english")){
            return "Hello!";
        }else if (language.equals("spanish")){
            return "Hola!";
        }else if (language.equals("hawaian")){
            return "Aloha!";
        }
        return "No language detected";
    }

    public String goodbyeMessage(){
        if (language.equals("english")){
            return "Bye.";
        }else if (language.equals("spanish")){
            return "Chau.";
        }else if (language.equals("hawaian")){
            return "Mahalo.";
        }
        return "No language detected";
    }
    
}
