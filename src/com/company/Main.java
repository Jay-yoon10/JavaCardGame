package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        boolean gameContinue = true;


        Snap startGame = new Snap();
        Scanner in = new Scanner(System.in);

        while (gameContinue){
                startGame.gameStart();
            System.out.println("The Game is over! Please input 'Yes' to restart the game, otherwise press any other button.");
            if(!in.nextLine().equalsIgnoreCase("Yes")){

                gameContinue = false;
            }
        }
    in.close();
    }
}
