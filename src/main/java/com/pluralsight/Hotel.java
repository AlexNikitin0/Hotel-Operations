package com.pluralsight;

public class Hotel {

    private String name;
    private int numberOfSuites;
    private int numberOfRooms;
    private int bookedSuites;

    private int availableSuites;
    private int bookedRooms;
    private int availableRooms;

    //constructor(s)

    public Hotel(String name, int numberOfRooms,int numberOfSuites){
        this.name = name;
        this.numberOfRooms = numberOfRooms;
        this.numberOfSuites = numberOfSuites;
        this. bookedRooms = 0;
        this.bookedSuites = 0;
    }

    public Hotel(String name, int numberOfRooms, int numberOfSuites, int bookedRooms, int bookedSuites){
        this.name = name;
        this.numberOfRooms = numberOfRooms;
        this.numberOfSuites = numberOfSuites;
        this. bookedRooms = bookedRooms;
        this.bookedSuites = bookedSuites;
    }

    //method for user to book room if available

    public boolean bookRoom(int numberOfRooms, boolean isSuite){
        boolean bool = false;
        if(isSuite = true){
            this.bookedSuites += numberOfRooms;
            this.availableSuites = this.availableSuites - numberOfRooms;
            if(bookedSuites > numberOfSuites){
                bool = false;
            }else bool = true;

        }//end first
         if(isSuite = false){
            this.bookedRooms += numberOfRooms;
             this.availableRooms = this.availableRooms - numberOfRooms;
            if(bookedRooms > this.numberOfRooms){
                bool =  false;

            }else bool = true;
        }//end second
        return bool;
    }//end method

    public int getAvailableSuites(){
        return availableSuites;
    }

    public int getAvailableRooms(){
        return availableRooms;
    }

}//end class
