package com.entertainment.client;

import com.entertainment.DisplayType;
import com.entertainment.Television;

/*
 * Application main-class, i.e., the class definition with the main() method.
 * Purpose: create a few instances of Television and give them a test-drive.
 */
class TelevisionClient {

    // This is the application starting point - at runtime, the app starts here.
    public static void main(String[] args) {
        System.out.println(Television.getInstanceCount() + " instances have been created.");
        System.out.println();

        // Create an instance of Television and set its properties via setter calls.
        Television tv1 = new Television();
        tv1.setBrand("Samsung");
        tv1.setVolume(Television.MIN_VOLUME);
        tv1.setDisplay(DisplayType.CRT);

        // create a 2nd instance of Television via the brand-volume ctor
        Television tv2 = new Television("Sony", Television.MAX_VOLUME);
        //tv2.setBrand("Sony");
        //tv2.setVolume(50);

        // create a 3rd Television object by specifying only the brand in the ctor call
        Television tv3 = new Television("LG", Television.MIN_VOLUME, DisplayType.OLED);

        tv1.turnOn();
        tv1.turnOff();
        tv2.turnOn();
        tv2.turnOff();
        tv3.turnOn();
        tv3.turnOff();

        System.out.println();

        //System.out.println(tv1.toString());
        System.out.println(tv1);            //toString() automatically called
        System.out.println(tv2);
        System.out.println(tv3);
        System.out.println(Television.getInstanceCount() + " instances.");

    }
}