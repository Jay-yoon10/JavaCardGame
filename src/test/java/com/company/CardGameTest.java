package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CardGameTest {

    // Write a test case for CardGameTest
    // Test case should check if the game is started with the correct number of cards

    @Test
    void testCardGame() {
        CardGame cardGame = new CardGame();
        assertEquals(52, CardGame.getDeckOfCards().size());
    }
}