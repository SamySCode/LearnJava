package SelfTaught;

import java.lang.Math;

public class Methods {
    public static void main(String[] args) {
        //KPH TO MPH converter
        double kilometersPerHour = 1.25; //Defining value to convert
        printConversion(kilometersPerHour);
    }

    public static long toMilesPerHour(double kilometersPerHour){ //creating method with kph as parameter to convert

        if(kilometersPerHour >= 0){ 
            kilometersPerHour = kilometersPerHour / 1.609; //converts kph to mph
            Math.round(kilometersPerHour); // rounds double to be returned as a long 
            return Math.round(kilometersPerHour); // returns mph
        }
        return -1;// else returns -1
    }

    public static void printConversion(double kilometersPerHour){ //creating method with kph to pass to toMilesPerHour method
        long milesPerHour = toMilesPerHour(kilometersPerHour); //define milesPerHour with method
        if(kilometersPerHour >= 0){
        System.out.println(kilometersPerHour + " km/h = " + milesPerHour + " mi/h"); // prints kph to mph
    } else{
        System.out.println("invalid value"); // if less than 0 show invalid
    }
}
}