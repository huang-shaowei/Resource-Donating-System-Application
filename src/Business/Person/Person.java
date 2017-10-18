/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Person;

import Business.Vitals.VitalsHistory;

/**
 *
 * @author Trupti
 */
public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private String gender;
    private String locality;
    private long phoneNumber;
    private String personID;
    private String recommendations;

    public String getRecommendations() {
        return recommendations;
    }

    public void setRecommendations(String recommendations) {
        this.recommendations = recommendations;
    }


    private static int perCounter =900;
    
    private VitalsHistory vitalsHistory;
    
    public Person()
    {
        this.vitalsHistory = new VitalsHistory();
        perCounter++;
        personID = "Person-"+perCounter;
    }

  
    
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPersonID() {
        return personID;
    }

    public void setPersonID(String personID) {
        this.personID = personID;
    }

    public String getLocality() {
        return locality;
    }

    public void setLocality(String locality) {
        this.locality = locality;
    }


    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public VitalsHistory getVitalsHistory() {
        return vitalsHistory;
    }

    public void setVitalsHistory(VitalsHistory vitalsHistory) {
        this.vitalsHistory = vitalsHistory;
    }
    
    @Override
    public String toString() {
        return firstName+" "+lastName ;
    }


}
