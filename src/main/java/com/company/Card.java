package com.company;

public class Card {
    public  CardSymbol cardSymbol;
    public  Suit suit;
    public Value value;

    public Card(CardSymbol cardSymbol,Suit suit,  Value value){
        this.suit = suit;
        this.cardSymbol = cardSymbol;
        this.value = value;
    }

    public String toString(){

        return cardSymbol + " of " + suit;
    }
    public Suit getSuit() {

        return suit;
    }
    public CardSymbol getCardSymbol() {

        return cardSymbol;
    }
    public Value getValue() {

        return value;
    }

}
enum Suit {
    CLUB("♣"),
    DIAMOND("♦"),
    HEART("♥"),
    SPADE("♠");

    Suit(String suit) {
    }
}
enum CardSymbol{
    ACE("A"),
    TWO("2"),
    THREE("3"),
    FOUR("4"),
    FIVE("5"),
    SIX("6"),
    SEVEN("7"),
    EIGHT("8"),
    NINE("9"),
    TEN("10"),
    JACK("J"),
    QUEEN("Q"),
    KING("K");

    CardSymbol(String cardSymbol) {
    }
}
enum Value{
    FOURTEEN,
    TWO,
    THREE,
    FOUR,
    FIVE,
    SIX,
    SEVEN,
    EIGHT,
    NINE,
    TEN,
    ELEVEN,
    TWELVE,
    THIRTEEN;

}