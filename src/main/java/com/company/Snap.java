package com.company;

import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Snap extends CardGame{

    private CardGame c;
    public Player p =new Player("Player1", "Player2" );


    public Snap(){

    }
    public void gameStart(){
        c = new CardGame();
        shuffle();
        Suit previousCardSymbol = null;
        boolean timeout = false;
        int turn = 0;
        Random r = new Random();
        Scanner sc = new Scanner(System.in);

        while (!timeout) {
            String currentPlayer = (turn % 2 == 0) ? p.player1 : p.player2;

            int time = 2000 ;

            try {
                TimeUnit.MILLISECONDS.sleep((long) time);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            Card nextCard = c.dealCard();

            if (nextCard == null) {
                System.out.println("No more Cards left in the deck!, Game is a draw");
                return;
            }
            System.out.println("Please Press Enter to get a new card");
            sc.nextLine();
            System.out.println(currentPlayer + " receives a card " + nextCard);

            turn++;

            if (nextCard.getSuit() == previousCardSymbol) {
                timeout = true;
            }
            previousCardSymbol = nextCard.getSuit();
            }

            int timeForPlayer1 = 1000 ;
            int timeForPlayer2 = 1000 ;


            if(timeForPlayer1 == timeForPlayer2){
                String result = String.format("SNAP! Congratulation!! %s is the WINNER!",
                        timeForPlayer2 > timeForPlayer1 ? p.player2 : p.player1);
                try {
                    TimeUnit.MILLISECONDS.sleep((long) Math.min(timeForPlayer1, timeForPlayer2));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(result);
//                try{
//                    TimeUnit.MILLISECONDS.sleep((long) timeForPlayer1);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//                String.format("SNAP! Congratulation!! %s is the WINNER!",
//                        timeForPlayer1 < timeForPlayer2 ? p.player1 : p.player2);
            }
            else {
                                try{
                    TimeUnit.MILLISECONDS.sleep((long) timeForPlayer1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                String.format("SNAP! Congratulation!! %s is the WINNER!",
                        timeForPlayer1 > timeForPlayer2 ? p.player1 : p.player2);
//                String result = String.format("SNAP! Congratulation!! %s is the WINNER!",
//                        timeForPlayer1 < timeForPlayer2 ? p.player1 : p.player2);
//                try {
//                    TimeUnit.MILLISECONDS.sleep((long) Math.min(timeForPlayer1, timeForPlayer2));
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//                System.out.println(result);
            }
    }

}
