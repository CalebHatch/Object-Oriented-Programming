package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
	    System.out.println("This program converts a temperature in degrees Celsius into \n" +
            "a temperature in degrees Fahrenheit. Enter a temperature in\n" +
            "degrees Celsius: ");

        double celsiusTemp = sc.nextDouble();
        double fahrenheitTemp = (celsiusTemp * 1.8) + 32;

        System.out.println(celsiusTemp + " degrees is equal to " + fahrenheitTemp + " degrees Fahrenheit. \n" +
                "Goodbye.");
    }
}
