package com.qascript;

import java.util.Scanner;

public class DiceGame {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        if(number>6){
            System.out.println("You won the game");
        }
        else {
            System.out.println("You lost the game");
        }
    }
}
