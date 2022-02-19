/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package L9Q2n3;

/**
 *
 * @author adina
 */
public class PersonProfile {
    private String name,gender, birthDate;

    public PersonProfile(String name, String gender, String birthDate) {
        this.name = name;
        this.gender = gender;
        this.birthDate = birthDate;
    }

    public String toString() {
        return "PersonProfile\nName: " + name + "\nGender: " + gender + "\nBirth date: " + birthDate;
    }
    
    
    
    
    
}
