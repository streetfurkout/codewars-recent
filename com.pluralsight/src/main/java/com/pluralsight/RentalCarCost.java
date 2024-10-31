package com.pluralsight;

import java.util.Scanner;

public class RentalCarCost {
    public static int rentalCarCost(int d) {
        final int dailyRate = 40;
        int totalCost = d * dailyRate;

        // Apply discounts
        if (d >= 7) {
            totalCost -= 50; // $50 off for 7 or more days
        } else if (d >= 3) {
            totalCost -= 20; // $20 off for 3 or more days
        }

        return totalCost; // Return the total cost
    }
}