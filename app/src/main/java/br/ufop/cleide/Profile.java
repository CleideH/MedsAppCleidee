package br.ufop.cleide;

import java.util.ArrayList;
import java.util.Calendar;

/**
 * Created by cleid on 11/12/2017.
 */

public class Profile {



    private String name;
    private String dtbirth;
    private String bloodType;
    private String bloodPressure;
    private int heartBeats;
    private String vaccinesTaken;//vaccines taken
    private String allergies;
    private String weight;
    private String height;
    private String previousSurgeries;
    private String diseases;
    private String gender;

    public Profile(String name, String dtbirth, String bloodType,
                   String bloodPressure,String vaccinesTaken, String allergies, int heartBeats, String weight, String height, String gender,
                   String previousSurgeries,String diseases
    ) {
        this.name = name;
        this.dtbirth = dtbirth;
        this.bloodType = bloodType;
        this.bloodPressure = bloodPressure;
        this.heartBeats = heartBeats;
        this.vaccinesTaken = vaccinesTaken;
        this.allergies = allergies;
        this.weight = weight;
        this.height = height;
        this.previousSurgeries = previousSurgeries;
        this.diseases = diseases;

    }


    public Profile(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDtbirth() {
        return dtbirth;
    }

    public void setDtbirth(String dtbirth) {
        this.dtbirth = dtbirth;
    }

    public String getBloodType() {
        return bloodType;
    }

    public void setBloodType(String bloodType) {
        this.bloodType = bloodType;
    }

    public String getBloodPressure() {
        return bloodPressure;
    }

    public void setBloodPressure(String bloodPressure) {
        this.bloodPressure = bloodPressure;
    }

    public int getHeartBeats() {
        return heartBeats;
    }

    public void setHeartBeats(int heartBeats) {
        this.heartBeats = heartBeats;
    }

    public String getVaccinesTaken() {
        return vaccinesTaken;
    }

    public String getAllergies() {
        return allergies;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getPreviousSurgeries() {
        return previousSurgeries;
    }

    public String getDiseases() {
        return diseases;
    }
    public String getGender(){return gender;}
    public void setGender(String gender){this.gender = gender;}

}

