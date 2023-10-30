package com.pluralsight;

public class Room {
    //fields
    private int beds;
    private double price;
    private boolean isOccupied;
    private boolean isDirty;
    private boolean isAvailable;

    //getters

    public int getBeds() {
        return beds;
    }

    public double getPrice() {
        return price;
    }

    public boolean isOccupied() {
        return isOccupied;
    }

    public boolean isDirty() {
        return isDirty;
    }

    public boolean isAvailable() {
        return isAvailable;
    }
    //checkIn()
    public void checkIn(){
        isOccupied = true;
        isDirty = true;

    }

    public void checkOut(){
        isOccupied = false;
        isDirty =  true;
    }
    public void cleanRoom(){
        isDirty = false;
    }




}
