package com.company;

import java.util.Arrays;
import java.util.Random;

public class Main {
    //Assignment 1
    public static void main(String[] args) {
        String[] words = {"Computer", "Plate", "Chair", "Girl", "Boy", "Cat", "Dog", "Shirt", "Determination"};

        int n = 0;
        int m = 0;
        int r = 0;
        int w = 0;
        int q = 0;
        for (String word : words) {


            if (word.charAt(0) == 'C') {
                System.out.println(word);
                n++;
            }
            if (word.charAt(word.length() - 1) == 'e') {
                System.out.println(word);
                m++;
            }
            if (word.length() == 5) {
                System.out.println(word);
                r++;
            }

            if (word.matches(".*[eE].*")) {
                System.out.println(word);
                w++;
            }
            if (word.matches(".*te.*")) {
                System.out.println(word);
                q++;
            }
        }
        System.out.println("Summa C " + n);
        System.out.println("Summa e " + m);
        System.out.println("Summa length equals 5: " + r);
        System.out.println("Matches E: " + w);
        System.out.println("Matches TE: " + q);


        //Assignment 2
        String text = "Climb mountains not so the world can see you, but so you can see the world";
        int i = 0;
        String[] words2 = text.split(" ");
        System.out.println("Amount of words: " + words2.length);
        System.out.println("AMount of the: " + count(text, "the"));
        for (String textwithS : words2) {

            if (textwithS.matches(".*[Ss].*")) {
                i++;
            }
        }
        System.out.println("Matches words with Ss: " + i);

        for (String multipwords : words2) {

            if (count(text, multipwords) > 1) {
                System.out.println("Found multiple times: " + multipwords);
            }
        }

        System.out.println("New text: " + text.replaceAll("you", "You"));

        //Assignment 3

        String name = "John";
        if (name.matches("[a-zA-Z]+")) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }

        String username = "s20surname";
        if (username.matches("[a-z]{1}[0-9]{2}[a-z]+")) {
            System.out.println("True");
        } else {
            System.out.println("False");

        }

        String personCodeOfLatvian = "121200-11311";
        if (personCodeOfLatvian.matches("[0-9]{6}-[0-9]{5}")) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
        //Assignment 4

        String[] deck = new String[52];
        int x = 0;


        for (cardsuits suit : cardsuits.values()) {
            for (cardvalues value : cardvalues.values()) {
                deck[x] = suit.toString() + " " + value.toString();
                x++;
            }

        }

        Random rand = new Random();

        for (int ii = 0; i < deck.length; i++) {
            int randomIndex = rand.nextInt(deck.length);
            String temp = deck[randomIndex];
            deck[randomIndex] = deck[ii];
            deck[ii] = temp;
        }
        System.out.println("Random first card: " + deck[0]);
    }

    public static int count(String str, String target) {
        return (str.length() - str.replace(target, "").length()) / target.length();
    }

enum cardsuits {
    Spades, Clubs, Hearts, Diamonds
}

enum cardvalues {
    Two, Three, Four, Five, Six, Seven, Eight, Nine, Ten, Jack, Queen, King, Ace
}

}

