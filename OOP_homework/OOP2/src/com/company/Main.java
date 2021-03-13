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

            District1.addNewOfficer(Cop1);
            District1.addNewOfficer(Cop2);
            District1.addNewOfficer(Cop3);
            District2.addNewOfficer(Cop4);
            District2.addNewOfficer(Cop5);
            District2.addNewOfficer(Cop6);
            District2.addNewOfficer(Cop7);

        System.out.println("District information: " + District1);
        System.out.println("District information: " + District2);


            System.out.println(District1.calculateAvgLevelInDistrict());
            System.out.println(District2.calculateAvgLevelInDistrict());

            ArrayList<District> districts = new ArrayList<District>();
            districts.add(District1);
            districts.add(District2);

            int howManyOfficersAreInBothDistricts = 0;
            float averageLevelOfBothDistricts = 0;
            for (District district : districts ) {
                    howManyOfficersAreInBothDistricts = howManyOfficersAreInBothDistricts + district.getOfficersInTheDistrict().size();
                    averageLevelOfBothDistricts = averageLevelOfBothDistricts + district.calculateAvgLevelInDistrict();


            }

            System.out.println(howManyOfficersAreInBothDistricts);
            System.out.println(averageLevelOfBothDistricts / districts.size());

            if (District1.calculateAvgLevelInDistrict() > District2.calculateAvgLevelInDistrict()) {
                    System.out.println("District 1 is the best ");

            }
            else
                    System.out.println("District 2 is the best ");

            District1 = null;
            System.out.println(Cop1);
        }
}
