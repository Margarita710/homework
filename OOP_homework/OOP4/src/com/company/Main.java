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


        District1.addNewPerson(Cop1);
        District1.addNewPerson(Cop2);
        District1.addNewPerson(Cop3);
        District1.addNewPerson(Lawyer1);
        District1.addNewPerson(Lawyer2);
        District2.addNewPerson(Cop4);
        District2.addNewPerson(Cop5);
        District2.addNewPerson(Cop6);
        District2.addNewPerson(Cop7);
        District2.addNewPerson(Lawyer3);

        System.out.println("District information: " + District1);
        System.out.println("District information: " + District2);



        ArrayList<District> storing = new ArrayList<District>();
        storing.add(District1);
        storing.add(District2);


        int maxPeople = 0;
        String theBiggestDistrict = "";
        for (District district : storing ) {
            if(district.getPersonsInTheDistrict().size() > maxPeople){
                theBiggestDistrict = district.getTitle();
                maxPeople = district.getPersonsInTheDistrict().size();
            }
            else if (district.getPersonsInTheDistrict().size() == maxPeople){
                theBiggestDistrict = theBiggestDistrict + " and " + district.getTitle();
            }

        }

        System.out.println("The biggest district is: " + theBiggestDistrict);

    }

}
