package com.example;

public class StepTracker{

    public int minimum;
    public int steps;
    public int day;
    public int activedays;
    
    public StepTracker(int i) {
        minimum = i;
    }
    public void addDailySteps(int i){
        steps +=i;
        day++;
        if(i >= minimum){
            activedays++;
        }
    }
    public double averageSteps(){

        if(day == 0){
            return 0.0;
        }
        return (double) steps/day;
    }
    public int activeDays(){
        return activedays;
    }

}
//write your class implementation here
