package com.company;

import java.util.Calendar;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Assigment 1
        short a = 4727;
        short b = 6068;
        System.out.println("The largest variable is:" + Math.max(a, b));
        System.out.println("The smallest variable is:" + Math.min(a, b));
        //if(!(a==b)){
        System.out.println("Both variable are equal:" + (a == b));
        if (!(a % 2 == 0) || !(b % 2 == 0)) {
            System.out.println("Some number is odd");
        }
        if (a % 2 == 0 || b % 2 == 0) {
            System.out.println("Some number is even");
        }

        if (a < 0 || b < 0) {
            System.out.println("Some number is negative");
        }

        if (a > 0 || b > 0) {
            System.out.println("Some number is positive");
        }

        if (a < 100 || b < 100) {
            System.out.println("Some number is less than 100");
        }


        // Assigment 2

        byte time = 100;
        if (time < 12 && time > 0) {
            System.out.println("Good Morning Sunshine!");
        } else if (time >= 13 && time < 19) {
            System.out.println("Good Afternoon. Work Hard!");
        } else if (time >= 20 && time < 24) {
            System.out.println("Good Evening. Get some rest!");
        } else {
            System.out.println("wrong time");
        }

        // Assigment 3


        short day = 15;
        short month = 10;
        short year = 2021;

        if (day > 31 || day < 1 || month > 12 || month < 1 || year < 1) {
            System.out.println("Wrong");
        } else
            System.out.println("Date:" + year + "/" + month + "/" + day);

        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter day");

        String Day = myObj.nextLine();
        System.out.println("Enter month");

        String Month = myObj.nextLine();
        System.out.println("Enter year");

        String Year = myObj.nextLine();
        System.out.println("Please select the date formatting. 1 - YYYY/MM/DD, 2- YYYY.MM.DD");

        int format = myObj.nextInt();
        if(format == 1)
            System.out.println("Date is: " + Year + "/" + Month + "/" + Day);
        else if(format == 2)
            System.out.println("Date is: " + Year + "." + Month + "." + Day);
        else
            System.out.println("Format is Wrong");


        //Assignment 1.4 alt

        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter day");

        int Day = myObj.nextInt();
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.DAY_OF_YEAR, Day);
        System.out.println(cal.getDisplayName(Calendar.MONTH,Calendar.LONG_FORMAT,Locale.ENGLISH));

        //Assignment 1.5

        Scanner myObj = new Scanner(System.in);
        System.out.println("Please enter WorkingHoursInDay");

        int workingHoursInDay = myObj.nextInt();

        //short workingHoursInDay = -10;
        if (workingHoursInDay >= 0 && workingHoursInDay <= 24) {
            //System.out.println("");
            if (workingHoursInDay <=8)
                System.out.println("Salary:" + workingHoursInDay * 10);
            else if (workingHoursInDay > 8)
                System.out.println("Salary:" + (80 +(workingHoursInDay - 8) * 15));
        }
        else
            System.out.println("Wrong hours");


    }

           }



