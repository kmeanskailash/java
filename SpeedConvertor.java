package com.basic.TimBuchhk;

public class SpeedConvertor {
     public static long toMilesPerHour(double kilometersPerHour)
     {
    	if(kilometersPerHour<0)
    		return -1;
    	else
    		return (Math.round(kilometersPerHour/1.609));
     }
     public static void printConversion(double kilometersPerHour)
     {
    	 if(kilometersPerHour<0)
    	 {
    		 System.out.println("Invalid Value");
    	 }
    	 else
    	 {
    		 long milesPerHour = toMilesPerHour(kilometersPerHour);
    		 System.out.println(kilometersPerHour+ "km/h = "+milesPerHour+" mi/h");
    	 }
     }
	public static void main(String[] args) {
		System.out.println(toMilesPerHour(75.3));
	}

}
