package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Officer Cop1 = new Officer("John", "Doe", 1, 5);
        Officer Cop2 = new Officer("Lieutenant", "Colombo", 2, 23);
        Officer Cop3 = new Officer("Komissar", "Rex", 3, 54);
        Officer Cop4 = new Officer("Sherlock", "Holms", 4, 127);
        Officer Cop5 = new Officer("Hercule", "Poirot", 5, 82);
        Officer Cop6 = new Officer("Ace", "Ventura", 6, 96);
        Officer Cop7 = new Officer("Hannibal", "Lecter", 7, 62);


        District District1 = new District("District 1", "Riga", 1234, new ArrayList());
        District District2 = new District("District 2", "Liepaja", 5678, new ArrayList());

        Lawyer Lawyer1 = new Lawyer("Billy", "Flinn", 3579, 78);
        Lawyer Lawyer2 = new Lawyer("Mister", "Bin", 3547, 59);
        Lawyer Lawyer3 = new Lawyer("Roger", "Rabbit", 3244, 92);


        District1.addNewOfficer(Cop1);
        District1.addNewOfficer(Cop2);
        District1.addNewOfficer(Cop3);
        District2.addNewOfficer(Cop4);
        District2.addNewOfficer(Cop5);
        District2.addNewOfficer(Cop6);
        District2.addNewOfficer(Cop7);

        System.out.println("District information: " + District1);
        System.out.println("District information: " + District2);

        System.out.println("Information about Lawyers 1: " + Lawyer1);
        System.out.println("Information about Lawyers 2: " + Lawyer2);
        System.out.println("Information about Lawyers 3: " + Lawyer3);



        ArrayList<Lawyer> storing = new ArrayList<Lawyer>();
        storing.add(Lawyer1);
        storing.add(Lawyer2);
        storing.add(Lawyer3);

        System.out.println(storing);



        int totalNumberOfTheCrimes = 0;
        String theBestLawyer = "";
        int bestResult = 0;
        for (Lawyer lawyer : storing ) {
            totalNumberOfTheCrimes = totalNumberOfTheCrimes + lawyer.getHelpedInCrimesSolving();

            if(lawyer.getHelpedInCrimesSolving() > bestResult){
                theBestLawyer = lawyer.getName() + " " + lawyer.getSurname();
                bestResult = lawyer.getHelpedInCrimesSolving();
            }

        }

        System.out.println("Total number of the crimes: " + totalNumberOfTheCrimes);
        System.out.println("The best lawyer is: " + theBestLawyer);



    }

}
