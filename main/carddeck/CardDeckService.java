package main.carddeck;

import java.util.Arrays;

public class CardDeckService {

    String[] cards;
    // A contructor that allows instantiation of a deck of 'n' cards
    public CardDeckService(int n){
        cards = new String[n];
    }

    // set card n's name to the name provided by user
    public void setCardName(int n, String name){
        cards[n] = name;
    }

    // use a for loop to append all the cards to a string and return it
    public String cardDecjAsString(){
        /**
        String buildingString = "";
        for (int i=0; i < cards.length; i++){
            buildingString = buildingString + cards[i] + ", ";
        }
        return buildingString;
        */
        
        // using Java method for arrays
        return Arrays.toString(cards);
    }
    
}
