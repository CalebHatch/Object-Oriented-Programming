package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Given the price of a meal and a percentage to use for the tip, this program calculates " +
                "the tip, this program calculates the tip, the tax, and the total amount of the bill.\n");

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the cost of the meal (without dollar sign): ");
        double userMealCost = sc.nextDouble();

        System.out.println("Enter the tip percentage (without percentage sign): ");
        double userTipPercentage = sc.nextDouble();
        double realTipPercentage = (userTipPercentage / 100);

        // Calculates the real costs of the three values
        double taxCost = (userMealCost * .032);
        double tipCost = (userMealCost * realTipPercentage);
        double totalMealCost = (userMealCost + taxCost + tipCost);

        // Rounds all the values that will be outputted to the user
        double taxCostRounded = Math.round(taxCost * 100.0) / 100.0;
        double tipCostRounded = Math.round(tipCost * 100.0) / 100.0;
        double totalMealCostRounded = Math.round(totalMealCost * 100.0) / 100.0;

        System.out.println("The tip is: $" + tipCostRounded);
        System.out.println("The tax is: $" + taxCostRounded);
        System.out.println("The total bill is: $" + totalMealCostRounded);
        System.out.println("Goodbye.");
    }
}
