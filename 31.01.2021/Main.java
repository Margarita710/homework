package com.company;

import java.util.Scanner;

public class Main {
        //Assignment 2.1
    public static void main(String[] args) {


        //Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday
/*
        //int Day = -4;
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter day");

        int Day = myObj.nextInt();

        if (Day >= 1 && Day <= 7) {
        switch (Day) {
            case 1:
                System.out.println("It is working day");
                break;
            case 2:
                System.out.println("It is working day");
                break;
            case 3:
                System.out.println("It is working day");
                break;
            case 4:
                System.out.println("It is working day");
                break;
            case 5:
                System.out.println("It is working day");
                break;
            case 6:
                System.out.println("It is holiday");
                break;
            case 7:
                System.out.println("It is holiday");
                break;
            default:
                System.out.println("Error");
                break;

        }

        }

        // Assignment 2.2
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter grade level");
        char grade_level = myObj.nextLine().charAt(0);

        //char grade_level = 'Z';

        switch (grade_level) {
            case 'A':
            case 'B':
                System.out.println("Perfect! You are so clever!");
                    break;
            case 'C':
                    System.out.println("Good! But you can do better!");
                    break;
            case 'D':
            case 'E':
                System.out.println("It is not good! You should study!");
                    break;
            case 'F':
                    System.out.println("Fail! You need to repeat the exam!");
                    break;
                default:
                    System.out.println("Error");
                    break;

            }

        }
*/                   // Assignment 2.3


        //double a= 2;
        //double b= 3;


        Scanner myObj = new Scanner(System.in);

        System.out.println("Enter first number");
        double a = myObj.nextDouble();
        System.out.println("Enter calculation option");
        char option= myObj.next().charAt(0); //Why nextLine() doesn't work here????
        System.out.println("Enter second number");
        double b = myObj.nextDouble();


        switch (option) {
            case '+':
                System.out.println("Result:" +(a + b));
                break;
            case '-':
                System.out.println("Result:" +(a - b));
                break;
            case '/':
                System.out.println("Result:" +(a / b));
                break;
            case '*':
                System.out.println("Result:" +(a * b));
                break;
            case '%':
                System.out.println("Result:" +(a % b));
                break;
            case 'p':
                System.out.println("Result:" +(a+" and "+b));
                break;
            case 'b':
                if (a > b){
                    System.out.println("Result:" +(a));
                    break;}
                else if (b > a){
                    System.out.println("Result:" +(b));
                    break;
                }
                else if (b == a){
                    System.out.println("Result: Numbers are equal");
                    break;
                }
            case 's':
                if (a < b){
                    System.out.println("Result:" +(a));
                    break;}
                else if (b < a){
                    System.out.println("Result:" +(b));
                    break;
                    }
                else if (b == a){
                    System.out.println("Result: Numbers are equal");
                    break;
                }
        }

    }


}