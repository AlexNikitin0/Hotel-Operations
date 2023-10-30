package com.pluralsight;

public class Reservation {
    //fields
   private String roomType;
    private double price;
    private int numberOfNights;
    private boolean isWeekend;

    //constructor

    public Reservation(String roomType,double price,int numberOfNights,boolean isWeekend){
        this.roomType = roomType;
        this.price = price;
        this. numberOfNights = numberOfNights;
        this. isWeekend = isWeekend;
    }

    private double total;
    //getters
    public String getRoomType(){
        return roomType;
    }
    public double getPrice(){
        return price;
    }
    public int getNumberOfNights(){
        return numberOfNights;
    }
    public double getTotal(){
        return total;
    }

    //setters

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public void setNumberOfNights(int numberOfNights){
        this.numberOfNights = numberOfNights;
    }

    public void setIsWeekend(boolean isWeekend){
        this.isWeekend = isWeekend;
    }
}
