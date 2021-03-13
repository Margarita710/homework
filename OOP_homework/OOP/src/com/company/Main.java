package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Officer Cop1 = new Officer("John", "Doe", 1, "Purvciems", 15);
        System.out.println(Cop1.toString());
        Officer Cop2 = new Officer("Lieutenant", "Colombo", 2, "NY", 21);
        System.out.println(Cop2.toString());
        Officer Cop3 = new Officer("Komissar", "Rex", 3, "Wien", 56);
        System.out.println(Cop3.toString());


        ArrayList<Officer> District99 = new ArrayList<Officer>();
        District99.add(Cop1);
        District99.add(Cop2);
        District99.add(Cop3);

        int level1Total = 0, levelMoreTotal = 0;

        for (Officer officer: District99) {
            if (officer.calculatedLevel() == 1) {
                level1Total++;
            }
            if (officer.calculatedLevel() > 1) {
                levelMoreTotal++;
            }
            if (officer.getName() == "John") {
                System.out.println("Officer with name JOHN : " + officer.getSurname());
            }
        }
        System.out.println("How many Officers are with level 1 : " + level1Total);
        System.out.println("How many Officers are with level more than 1 : " + levelMoreTotal);

    }


}
