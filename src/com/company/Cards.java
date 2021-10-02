package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Cards {
    public static void main(String[] args) {
        int[] deck = new int[52];
        String[] suits = {"Spades", "Hearts", "Clubs", "Diamonds"};
        String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9",
                "10", "Jack", "Queen", "King"};

        // Initialize cards
        for (int i = 0; i < deck.length; i++)
            deck[i] = i;

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number:");
        int input =scan.nextInt();
        String suit = suits[deck[input] / 13];
        String rank = ranks[deck[input] % 13];

        System.out.println("Card number " + deck[input] + ": "
                + rank + " of " + suit);



    }
}
