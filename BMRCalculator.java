package com.arjansagoo.Controller;
import java.util.Scanner;
import com.arjansagoo.Model.Person;
import com.arjansagoo.Controller.ActivityLevelCalculator;

public class BMRCalculator {

    //Create variables to populate from the Person class
    private String name;
    private String gender;
    private int age;
    private int weight;
    private int height;
    private double bmr = 0.0;
    private int finalBMR = 0;

    public BMRCalculator(Person selectedPerson) {
        this.name = selectedPerson.getName();
        this.gender = selectedPerson.getGender();
        this.age = selectedPerson.getAge();
        this.weight = selectedPerson.getWeight();
        this.height = selectedPerson.getHeight();
    }

    //Check gender class to determine if they are male or female to calculate the bmr
    private int checkGender() {
        if(this.gender.equalsIgnoreCase("male")){
            return 1;
        } else if (this.gender.equalsIgnoreCase("female")){
            return 2;
        } else return 0;
    }

    //Calculate bmr class for the bmr formula based on user input data
    public int calculateBMR() {
        if (this.checkGender() == 1) {
             bmr = (66 + (6.3 * this.weight) + (12.9 * this.height) - (6.8 * this.age));
             return finalBMR = (int)bmr;

        } else if (this.checkGender() == 2) {
             bmr = 655 + (4.3 * this.weight) + (4.7 * this.height) - (4.7 * this.age);
            return finalBMR = (int)bmr;
        }
         else if (this.checkGender() == 0){
            return finalBMR;
        }
         return finalBMR;
    }

    public int calculateTDEE() {
        return finalBMR;
    }
}
