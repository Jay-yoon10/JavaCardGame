package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CardTest {

    //Write a test case for Card
    //Test case should check if the card is created with the correct suit, cardSymbol and value
    //Test case should check if the toString method returns the correct value

    @Test
    void testCard() {
        Card card = new Card(CardSymbol.ACE, Suit.CLUB);
        assertEquals(Suit.CLUB, card.getSuit());
        assertEquals(CardSymbol.ACE, card.getCardSymbol());
        assertEquals("ACE of CLUB", card.toString());
    }

}