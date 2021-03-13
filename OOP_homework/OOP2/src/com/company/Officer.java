package com.company;

public class Officer {

    private String name;
    private String surname;
    private int officerID;
    private int crimesSolved;

    //No argument
    public Officer()
    {
        this.name = "";
        this.surname = "";
        this.officerID = 0;
        this.crimesSolved = 23;
    }

    //Argument

    public Officer(String name, String surname, int officerID, int crimesSolved)
    {
        this.name = name;
        this.surname = surname;
        this.officerID = officerID;
        this.crimesSolved = crimesSolved;
    }


    //get and set function


    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getOfficerID() {
        return officerID;
    }

    public int getCrimesSolved() {
        return crimesSolved;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setOfficerID(int officerID) {
        this.officerID = officerID;
    }

    public void setCrimesSolved(int crimesSolved) {
        this.crimesSolved = crimesSolved;
    }

    public String toString() {
        return name + "  " + surname + "(id: " + officerID + ", crimes solved: " + crimesSolved + ")";
    }

    public int calculatedLevel(){
        if (crimesSolved < 20) return 1;
        if (crimesSolved > 20 && crimesSolved < 40) return 2;
        if (crimesSolved > 40) return 3;
        return 0;

    }


}
