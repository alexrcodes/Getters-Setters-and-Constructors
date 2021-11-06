package com.company;

public class Car {
    private int doors;
    private int gears;
    private String ModelName;
    private String Color;

    //Constructor
    //- used to set all the fields in the class without using setters
    public Car(int doors, int gears, String ModelName, String Color ){
        this.doors = doors;
        this.gears = gears;
        this.ModelName = ModelName;
        this.Color = Color;
    }

    /*Setters set the values in the fields (ModelName)
    public void setModelName(String ModelName){
        this.ModelName = ModelName;  //set the data type with this keyword
    }*/

    //Getters return the values assigned by Setters
    public String getModelName(){
        return this.ModelName;       //get our ModelName to print
    }

    public int getDoors(){
        return this.doors;
    }

    public String getColor() {
        return Color;
    }

    public int getGears() {
        return gears;
    }
}
