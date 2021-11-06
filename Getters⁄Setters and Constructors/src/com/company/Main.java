package com.company;

import java.awt.*;

public class Main {

    public static void main(String[] args) {
        Car Audi = new Car(2, 6, "R8", "Wolf Grey");    //initialized and set the obj(Audi) in the Car class | constructor is always called as we create our obj(Audi)
        System.out.println(Audi.getModelName());    //gets the model name
        System.out.println(Audi.getDoors());        //gets # of doors
        System.out.println(Audi.getGears());        //gets # of gears
        System.out.println(Audi.getColor());        //gets color of car
    }
}
