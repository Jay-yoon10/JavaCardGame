package com.company;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class CardGame {
    public static ArrayList<Card> deckOfCards = new ArrayList<>();

    public  CardGame(){
        deckOfCards.clear();
        for(CardSymbol cardSymbol : CardSymbol.values()){
//            System.out.println("Printing enums of CardSymbol :" + Arrays.toString(cardSymbol.values()));
            for(Suit suit : Suit.values()){
//                System.out.println("Printing enums of suit :" + suit);
                for(Value value : Value.values()){
//                    System.out.println("Printing enums of value :" + value);
                    deckOfCards.add(new Card(cardSymbol,suit,  value ));

                }
            }
        }
    }
    public Card dealCard(){
        if(!deckOfCards.isEmpty()){
            return deckOfCards.remove(0);
        }
        else{
            return null;
        }
    }

    public void shuffle(){
        Collections.shuffle(deckOfCards);
    }

    public List<Card> getCards(){
        return deckOfCards;
    }

}
