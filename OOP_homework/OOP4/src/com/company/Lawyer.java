package com.company;

public class Lawyer extends Person{


    private int lawyerID;
    private int helpedInCrimesSolving;


    public Lawyer()
    {

        this.lawyerID = 0;
        this.helpedInCrimesSolving = 0;
    }



    public Lawyer(String name, String surname, int lawyerID, int helpedInCrimesSolving)
    {

        super(name,surname);
        this.lawyerID = lawyerID;
        this.helpedInCrimesSolving = helpedInCrimesSolving;
    }


    public int getLawyerID() {
        return lawyerID;
    }

    public int getHelpedInCrimesSolving() {
        return helpedInCrimesSolving;
    }


    public void setLawyerID(int lawyerID) {
        this.lawyerID = lawyerID;
    }

    public void setHelpedInCrimesSolving(int helpedInCrimesSolving) {
        this.helpedInCrimesSolving = helpedInCrimesSolving;
    }

    public String toString() {
        return getName() + "  " + getSurname() + "(id: " + lawyerID + ", Helped in crime solving: " + helpedInCrimesSolving + ")";
    }

}
