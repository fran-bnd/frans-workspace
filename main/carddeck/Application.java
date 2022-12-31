package main.carddeck;

import java.util.Scanner;

public class Application {
    
    /**
     * 1- ask user size of card deck
     * 2- user types 'name' of each ine if the cards
     * 3- print all cards in deck
     * @param args
     */
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        System.out.println("--> Input amount of cards in the deck");
        String cardsInput = sc.nextLine(); 
        int deckLenght = Integer.parseInt(cardsInput);
        CardDeckService cardDeckService = new CardDeckService(deckLenght);

        String currentCards = "";
        // repeat pattern for deckLenght times
        for(int i=0; i < deckLenght; i++){
            System.out.print("Card " + i + ": ");
            String cardName = sc.next();
            cardDeckService.setCardName(i, cardName); 
            currentCards = cardDeckService.cardDecjAsString();
        }
        System.out.println("This is your deck: " + currentCards);
        sc.close();
    }
}
