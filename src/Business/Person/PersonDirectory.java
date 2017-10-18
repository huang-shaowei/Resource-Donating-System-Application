/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Person;

import java.util.ArrayList;

/**
 *
 * @author Trupti
 */
public class PersonDirectory {
    private ArrayList<Person> personDirectory;
    
    public PersonDirectory()
    {
        personDirectory = new ArrayList<>();
    }

    public ArrayList<Person> getPersonList() {
        return personDirectory;
    }

    public void setPersonList(ArrayList<Person> personDirectory) {
        this.personDirectory = personDirectory;
    }
    
    public Person createPerson()
    {
        Person person = new Person();
        personDirectory.add(person);
        return person;
    }
    
    public void deletePerson(Person person)
    {
        personDirectory.remove(person);
    }
    
    public Person searchPerson(String searchPer)
    {
        for(Person per : personDirectory)
        {
            if(per.getPersonID().equalsIgnoreCase(searchPer))
            {
                return per;
            }
            else if(per.getFirstName().equalsIgnoreCase(searchPer))
            {
                return per;
            }
        }
        return null;
    }
}
