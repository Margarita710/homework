package com.company;

import java.util.*;
import java.util.concurrent.ArrayBlockingQueue;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        //Assignment 1
        ArrayList<String> words = new ArrayList<String>();
        words.add("Computer");
        words.add("Plate");
        words.add("Chair");
        words.add("Girl");
        words.add("Boy");
        words.add("Cat");
        words.add("Dog");
        words.add("Shirt");
        words.add("Determination");


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

        System.out.println(bubbleSort(words));

        //Assignment 2

        String sentenceA = "Mom";
        String sentence2 = "";
        for (int i = sentenceA.length() - 1; i >= 0; i--) {
            sentence2 = sentence2 + sentenceA.charAt(i);
        }
        System.out.println(sentence2);
        if (sentenceA.equalsIgnoreCase(sentence2)) {
            System.out.println("It is palindrome!");
        } else {
            System.out.println("It is not palindrome:(");
        }


        String sentence3 = "Madam, in Eden, I'm Adam".replaceAll("[ ,?'!]", "");
        String sentence4 = "";
        for (int i = sentence3.length() - 1; i >= 0; i--) {
            sentence4 = sentence4 + sentence3.charAt(i);
        }
        System.out.println(sentence4);
        if (sentence3.equalsIgnoreCase(sentence4)) {
            System.out.println("It is palindrome!");
        } else {
            System.out.println("It is not palindrome:(");
        }


        String sentence31 = "Madam, in Eden, I'm Adam".replaceAll("[ ,?'!]", "");
        Stack<Character> myStack = new Stack<>();
        String sentence41 = "";
        for (int i = 0; i < sentence31.length(); i++) {
            myStack.push(sentence31.charAt(i));
        }

        while (myStack.size() > 0) {
            sentence41 = sentence41 + myStack.pop();
        }
        System.out.println(sentence41);
        if (sentence3.equalsIgnoreCase(sentence41)) {
            System.out.println("It is palindrome!");
        } else {
            System.out.println("It is not palindrome:(");
        }


        String sentence32 = "Madam, in Eden, I'm Adam".replaceAll("[ ,?'!]", "");
        ArrayBlockingQueue<Character> myQueue1 = new ArrayBlockingQueue(sentence32.length());
        String sentence42 = "";
        for (int i = sentence32.length() - 1; i >= 0; i--) {
            myQueue1.put(sentence32.charAt(i));
        }

        while (myQueue1.size() > 0) {
            sentence42 = sentence42 + myQueue1.take();
        }
        System.out.println(sentence42);
        if (sentence32.equalsIgnoreCase(sentence42)) {
            System.out.println("It is palindrome!");
        } else {
            System.out.println("It is not palindrome:(");
        }


        String sentence33 = "Madam, in Eden, I'm Adam".replaceAll("[ ,?'!]", "");
        Deque<Character> myDequeue1 = new ArrayDeque<Character>();
        String sentence43 = "";
        for (int i = sentence33.length() - 1; i >= 0; i--) {
            myDequeue1.addLast(sentence3.charAt(i));
        }

        while (myDequeue1.size() > 0) {
            sentence43 = sentence43 + myDequeue1.removeFirst();
        }
        System.out.println(sentence43);
        if (sentence33.equalsIgnoreCase(sentence43)) {
            System.out.println("It is palindrome!");
        } else {
            System.out.println("It is not palindrome:(");
        }

        //Assignment 3/ HashMap

        HashMap<String, Double> prices = new HashMap<String, Double>();

        prices.put("Milk", 0.99);
        prices.put("Pizza", 3.99);
        prices.put("Bread", 2.50);
        prices.put("Caviar", 9.99);
        prices.put("Meat", 10.00);
        prices.put("Cheese", 15.00);
        prices.put("Oranges", 2.50);
        prices.put("Sweets", 0.75);
        int nn = 0;
        double maxPrice = 0;
        double minPrice = 9999999;
        String minProduct = "";
        String maxProduct = "";
        for (Map.Entry mm : prices.entrySet()) {
            if (((double) mm.getValue()) < 1.00) {
                //System.out.println("Products are under 1,00 eur: " + m.getKey());
                nn++;
            }
            if (((double) mm.getValue()) < minPrice) {
                minPrice = ((double) mm.getValue());
                minProduct = mm.getKey().toString();
            }
            if (((double) mm.getValue()) > maxPrice) {
                maxPrice = ((double) mm.getValue());
                maxProduct = mm.getKey().toString();
            }
        }
        System.out.println("Products are under 1,00 eur: " + nn);
        System.out.println("The lowest price is for: " + minProduct);
        System.out.println("The largest price is for: " + maxProduct);


        HashMap<String, Double> prices2 = new HashMap<String, Double>();
        prices2.put("Kiwi", 3.50);
        prices2.put("Apples", 1.50);
        prices2.put("Tea", 4.75);
        prices2.put("Sugar", 1.25);
        prices2.put("Coffee", 3.75);
        prices2.put("Cookies", 1.45);

        prices.putAll(prices2);
        System.out.println("How many products are at the list: " + prices.size());


        //Assignment 3/ HashTable

        hashTableTest();

    }


    public static void hashTableTest() {
        //Assignment 3/ HashTable

        Hashtable<String, Double> prices = new Hashtable<String, Double>();

        prices.put("Milk", 0.99);
        prices.put("Pizza", 3.99);
        prices.put("Bread", 2.50);
        prices.put("Caviar", 9.99);
        prices.put("Meat", 10.00);
        prices.put("Cheese", 15.00);
        prices.put("Oranges", 2.50);
        prices.put("Sweets", 0.75);
        int n = 0;
        double maxPrice = 0;
        double minPrice = 9999999;
        String minProduct = "";
        String maxProduct = "";
        for (Map.Entry m : prices.entrySet()) {
            if (((double) m.getValue()) < 1.00) {
                n++;
            }
            if (((double) m.getValue()) < minPrice) {
                minPrice = ((double) m.getValue());
                minProduct = m.getKey().toString();
            }
            if (((double) m.getValue()) > maxPrice) {
                maxPrice = ((double) m.getValue());
                maxProduct = m.getKey().toString();
            }
        }
        System.out.println("Products are under 1,00 eur: " + n);
        System.out.println("The lowest price is for: " + minProduct);
        System.out.println("The largest price is for: " + maxProduct);


        HashMap<String, Double> prices2 = new HashMap<String, Double>();
        prices2.put("Kiwi", 3.50);
        prices2.put("Apples", 1.50);
        prices2.put("Tea", 4.75);
        prices2.put("Sugar", 1.25);
        prices2.put("Coffee", 3.75);
        prices2.put("Cookies", 1.45);

        prices.putAll(prices2);
        System.out.println("How many products are at the list: " + prices.size());

    }

    public static ArrayList<String> bubbleSort(ArrayList<String> myArray) {
        boolean sorted = false;
        long bubbleCounter = 0;
        while (!sorted) {
            sorted = true;
            bubbleCounter++;
            for (int i = 0; i < myArray.size() - bubbleCounter; i++) {
                if (myArray.get(i).charAt(0) > myArray.get(i + 1).charAt(0)) {
                    String temp = myArray.get(i);
                    myArray.set(i, myArray.get(i + 1));
                    //myArray.get(i) = myArray.get(i + 1);
                    myArray.set(i + 1, temp);
                    sorted = false;
                }
            }
        }
        return myArray;
    }
}

