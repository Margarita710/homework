package com.company;

import java.util.ArrayList;

public class District {
    private String title;
    private String city;
    private int districtID;
    private  ArrayList<Person> personsInTheDistrict;

    public District() {
        this.title = "";
        this.city = "";
        this.districtID = 0;
        this.personsInTheDistrict = new ArrayList<>();

    }
public District(String title, String city, int districtID, ArrayList personsInTheDistrict)
{
        this.title = title;
        this.city = city;
        this.districtID = districtID;
        this.personsInTheDistrict = personsInTheDistrict;

}
    public String getTitle() {
        return title;
    }
    public String getCity() {
        return city;
    }
    public int getDistrictID() {
        return districtID;
    }
    public ArrayList<Person> getPersonsInTheDistrict() {return personsInTheDistrict; }

    public void setTitle(String title) {
        this.title = title;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public void setDistrictID(int districtID) {
        this.districtID = districtID;
    }
    public void setPersonsInTheDistrict(ArrayList<Person> personsInTheDistrict) {
        this.personsInTheDistrict = personsInTheDistrict;}

        public String toString() {
            return title + "  " + city + ", " + districtID + ", " + personsInTheDistrict.toString();
        }
        public boolean addNewPerson(Person person) {
            personsInTheDistrict.add(person);
            return true;
        }
    public boolean removePerson(Person person) {
        return true;
    }
    public float calculateAvgLevelInDistrict(){
        int totalLevel = 0;
        int officerCount = 0;
        for (Person person : personsInTheDistrict) {
            if (person instanceof Officer) {
                totalLevel = totalLevel + ((Officer)person).calculatedLevel();
                officerCount++;
            }
        }
        return totalLevel / officerCount;

    }
}
