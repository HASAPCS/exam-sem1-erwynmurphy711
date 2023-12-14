package com.example;

import java.util.List;

public class FuelDepot {
    /** The robot used to move the filling mechanism */
    private FuelRobot filler;

    /** The list of fuel tanks */
    private List<FuelTank> tanks;

    /**
     * Constructs a FuelDepot object.
     *
     * @param filler The robot used to move the filling mechanism.
     * @param tanks  The list of fuel tanks.
     */
    public FuelDepot(FuelRobot filler, List<FuelTank> tanks) {
        this.filler = filler;
        this.tanks = tanks;
    }

    // Method to implement for a)
    public int nextTankToFill(int threshold) {
        int count = 0;
        int lowest = 99999999;
        int index = 0;
        while(count < tanks.size()){
            if( tanks.get(count).getFuelLevel() < lowest){
                lowest = tanks.get(count).getFuelLevel();
            }
            count++;
        }
        if(threshold > lowest){
            for(int i = 0; i < tanks.size()-1; i++){
                if(lowest == tanks.get(i).getFuelLevel()){
                    index = i;
                }
            }
            
            return index;
        }

        return filler.getCurrentIndex();
        // Your implementation here
    }

    // Method to implement for b)
    public void moveToLocation(int locIndex) {
        filler.setCurrentIndex(locIndex);
        // Your implementation here
    }
}
