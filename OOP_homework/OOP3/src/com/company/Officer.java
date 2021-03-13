package com.company;

public class Officer extends Person{


    private int officerID;
    private int crimesSolved;

    public Officer()
    {

        this.officerID = 0;
        this.crimesSolved = 23;
    }



    public Officer(String name, String surname, int officerID, int crimesSolved)
    {

        super(name, surname);
        this.officerID = officerID;
        this.crimesSolved = crimesSolved;
    }


    public int getOfficerID() {
        return officerID;
    }

    public int getCrimesSolved() {
        return crimesSolved;
    }



    public void setOfficerID(int officerID) {
        this.officerID = officerID;
    }

    public void setCrimesSolved(int crimesSolved) {
        this.crimesSolved = crimesSolved;
    }

    public String toString() {
        return getName() + "  " + getSurname() + "(id: " + officerID + ", crimes solved: " + crimesSolved + ")";
    }

    public int calculatedLevel(){
        if (crimesSolved < 20) return 1;
        if (crimesSolved > 20 && crimesSolved < 40) return 2;
        if (crimesSolved > 40) return 3;
        return 0;

    }


}
