package com.company;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;


import org.junit.jupiter.api.Test;

class SnapTest {


    @Test
    void testConstructor() {
        Snap actualSnap = new Snap();
        List<Card> cards = actualSnap.getCards();
        assertEquals(52, cards.size());
        Player player = actualSnap.p;
        assertEquals("Player2", player.getPlayer2());
        assertEquals("Player1", player.getPlayer1());
        Card getResult = cards.get(2);
        assertEquals(Suit.HEART, getResult.getSuit());
        Card getResult1 = cards.get(0);
        assertEquals(Suit.CLUB, getResult1.getSuit());
        assertEquals(CardSymbol.ACE, getResult1.getCardSymbol());
        assertEquals(CardSymbol.ACE, getResult.getCardSymbol());
        Card getResult2 = cards.get(1);
        assertEquals(CardSymbol.ACE, getResult2.getCardSymbol());
        Card getResult3 = cards.get(51);
        assertEquals(CardSymbol.KING, getResult3.getCardSymbol());
        Card getResult4 = cards.get(49);
        assertEquals(CardSymbol.KING, getResult4.getCardSymbol());
        Card getResult5 = cards.get(50);
        assertEquals(CardSymbol.KING, getResult5.getCardSymbol());
        assertEquals(Suit.DIAMOND, getResult4.getSuit());
        assertEquals(Suit.HEART, getResult5.getSuit());
        assertEquals(Suit.DIAMOND, getResult2.getSuit());
        assertEquals(Suit.SPADE, getResult3.getSuit());
    }


}

