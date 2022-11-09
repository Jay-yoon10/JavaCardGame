package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PlayerTest {

    // Test for players
    @Test
    void testPlayer() {
        Player player = new Player("John", "Doe");
        assertEquals("John", player.getPlayer1());
        assertEquals("Doe", player.getPlayer2());
    }
}