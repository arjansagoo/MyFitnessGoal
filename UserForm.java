package com.arjansagoo.View;
import java.util.Scanner;

//Create a separate class to retrieve data from user
public class UserForm {

    Scanner userInput = new Scanner(System.in);

    //Create each class for each data received by the user, return the value to then be collected in the main class
    public String NameInput() {
        System.out.println("Please enter your full name");
        String nameCheck = userInput.nextLine();
        return nameCheck;
    }

    public String GenderInput() {
        System.out.println("Please enter your gender");
        String genderCheck = userInput.nextLine();
        return genderCheck;
    }

    public int AgeInput() {
        System.out.println("Please enter your age");
        int ageCheck = userInput.nextInt();
        return ageCheck;
    }

    public int WeightInput() {
        System.out.println("Please enter your weight(lbs)");
        int weightCheck = userInput.nextInt();
        return weightCheck;
    }

    public int HeightInput() {
        System.out.println("Please enter your height(inches)");
        int heightCheck = userInput.nextInt();
        return heightCheck;
    }

    //Get the activity level through a user input
    public int ActivityInput() {
        System.out.println("Please enter your daily activity level");
        System.out.println("Enter 1 for sedentary lifestyle");
        System.out.println("Enter 2 for lightly active");
        System.out.println("Enter 3 for moderately active");
        System.out.println("Enter 4 for very active");
        System.out.println("Enter 5 for extremely active");
        int activityCheck = userInput.nextInt();
        return activityCheck;
    }

    public int BodyGoalInput() {
        System.out.println("Please enter your body goal");
        System.out.println("Enter 1 to lose body weight(fat)");
        System.out.println("Enter 2 to maintain body weight");
        System.out.println("Enter 3 to gain body weight(muscle)");
        int bodyGoalCheck = userInput.nextInt();
        return bodyGoalCheck;
    }
}
