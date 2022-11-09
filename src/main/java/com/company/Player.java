package com.company;

import lombok.Data;

@Data
public class Player {

    public String player1;
    public String player2;

    public Player(String player1, String player2) {
        this.player1 = player1;
        this.player2 = player2;

    }
}
