package com.company;

import java.util.ArrayList;

public class District {
    private String title;
    private String city;
    private int districtID;
    private  ArrayList<Officer> officersInTheDistrict;

    public District() {
        this.title = "";
        this.city = "";
        this.districtID = 0;
        this.officersInTheDistrict = new ArrayList<>();

    }
public District(String title, String city, int districtID, ArrayList officersInTheDistrict)
{
        this.title = title;
        this.city = city;
        this.districtID = districtID;
        this.officersInTheDistrict = officersInTheDistrict;

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
    public ArrayList<Officer> getOfficersInTheDistrict() {return officersInTheDistrict; }

    public void setTitle(String title) {
        this.title = title;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public void setDistrictID(int districtID) {
        this.districtID = districtID;
    }
    public void setOfficersInTheDistrict(ArrayList<Officer> officersInTheDistrict) {
        this.officersInTheDistrict = officersInTheDistrict;}

        public String toString() {
            return title + "  " + city + ", " + districtID + ", " + officersInTheDistrict.toString();
        }
        public boolean addNewOfficer(Officer officer) {
            officersInTheDistrict.add(officer);
            return true;
        }
    public boolean removeOfficer(Officer officer) {
        //officersInTheDistrict.
        return true;
    }
    public float calculateAvgLevelInDistrict(){
        int totalLevel = 0;
        for (Officer officer : officersInTheDistrict) {
            totalLevel = totalLevel + officer.calculatedLevel();
        }
        return totalLevel / officersInTheDistrict.size();

    }
}
