package com.company;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;

class CardGameTest {

    // Write a test case for CardGameTest
    // Test case should check if the game is started with the correct number of cards


    @Test
    void testConstructor() {
        CardGame actualCardGame = new CardGame();
        ArrayList<Card> actualDeckOfCards = CardGame.getDeckOfCards();
        ArrayList<Card> expectedCards = CardGame.deckOfCards;
        List<Card> cards = actualCardGame.getCards();
        assertSame(expectedCards, cards);
        assertSame(cards, actualDeckOfCards);
    }

    @Test
    void testConstructor2() {
        List<Card> cards = (new CardGame()).getCards();
        assertEquals(52, cards.size());
        Card getResult = cards.get(49);
        assertEquals(Suit.DIAMOND, getResult.getSuit());
        Card getResult1 = cards.get(1);
        assertEquals(Suit.DIAMOND, getResult1.getSuit());
        assertEquals(CardSymbol.ACE, getResult1.getCardSymbol());
        assertEquals(CardSymbol.KING, getResult.getCardSymbol());
        Card getResult2 = cards.get(2);
        assertEquals(CardSymbol.ACE, getResult2.getCardSymbol());
        Card getResult3 = cards.get(0);
        assertEquals(CardSymbol.ACE, getResult3.getCardSymbol());
        Card getResult4 = cards.get(50);
        assertEquals(CardSymbol.KING, getResult4.getCardSymbol());
        Card getResult5 = cards.get(51);
        assertEquals(CardSymbol.KING, getResult5.getCardSymbol());
        assertEquals(Suit.HEART, getResult4.getSuit());
        assertEquals(Suit.SPADE, getResult5.getSuit());
        assertEquals(Suit.HEART, getResult2.getSuit());
        assertEquals(Suit.CLUB, getResult3.getSuit());
    }


    @Test
    void testDealCard() {
        CardGame cardGame = new CardGame();
        cardGame.dealCard();
        assertEquals(51, cardGame.getCards().size());
    }


    @Test
    void testShuffle() {
        CardGame cardGame = new CardGame();
        cardGame.shuffle();
        assertEquals(52, cardGame.getCards().size());
    }
}