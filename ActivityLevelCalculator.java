package com.arjansagoo.Controller;

public class ActivityLevelCalculator {

    //Create variables for each activity level
    private double userActivitySelection;
    private double sedentaryLifestyle = 1.200;
    private double lightlyActive = 1.375;
    private double moderatelyActive = 1.550;
    private double veryActive = 1.725;
    private double extremelyActive = 1.900;

    //Determine which activity level the user has selected
    public ActivityLevelCalculator(int userSelection){
        if(userSelection == 1){
            userActivitySelection = this.sedentaryLifestyle;
        }
        else if(userSelection == 2){
            userActivitySelection = this.lightlyActive;
        }
        else if(userSelection == 3){
            userActivitySelection = this.moderatelyActive;
        }
        else if(userSelection == 4){
            userActivitySelection = this.veryActive;
        }
        else if (userSelection == 5){
            userActivitySelection = this.extremelyActive;
        }
        else {
            System.out.println("Please enter in correct number");
        }
    }

    public double getUserSelection() {
        return userActivitySelection;
    }

//    public void setUserSelection(double userSelection) {
//        this.userSelection = userSelection;
//    }


    //getters and setters are for future implementation for dynamic values

}
