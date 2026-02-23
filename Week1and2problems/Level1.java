package Week1and2problems;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Level1 {
    public static void main(String[] args) {
        // QUESTION 1
        System.out.println("=-=-=-=-=-=QUESTION 1=-=-=-=-=-=");
        int harry_birth_year  = 2000;
        int harry_age = 2024 - harry_birth_year;
        System.out.println("Harry's age in 2024 " + harry_age);
        // QUESTION 2
        System.out.println("=-=-=-=-=-=QUESTION 2=-=-=-=-=-=");
        int math =  94, phy = 95, che = 96;
        int avg = (math + phy + che) / 3;
        System.out.println("Sam's average mark in PCM is " + avg);
        // QUESTION 3
        System.out.println("=-=-=-=-=-=QUESTION 3=-=-=-=-=-=");
        double km = 10.8;
        double miles = 10.8 / 1.6; // 1 km = 1.6 miles
        System.out.println("The distance " + km + " km in miles is " + miles);
        // QUESTION 4
        System.out.println("=-=-=-=-=-=QUESTION 4=-=-=-=-=-=");
        int costPrice = 129;
        int sellingPrice = 191;
        int profit = sellingPrice - costPrice;
        int profitPercent = (profit/costPrice) * 100;
        System.out.println("The cost price is INR " + costPrice + " and Selling Price is INR " + sellingPrice);
        System.out.println("The profit is " + profit + " and the profit percentage is " + profitPercent + "%");
        // QUESTION 5
        System.out.println("=-=-=-=-=-=QUESTION 5=-=-=-=-=-=");
        int totalPens = 14;
        int eachPens = totalPens/ 3;
        int remainingPens = totalPens % 3;
        System.out.println("The Pen per student is " + eachPens + "and the remaining pen not distributed is " + remainingPens);
        // QUESTION 6
        System.out.println("=-=-=-=-=-=QUESTION 6=-=-=-=-=-=");
        float fees = 125000;
        float discountedAmount = fees * 0.1f;
        float discountedPrice = fees - discountedAmount;
        System.out.println("The discount amount INR " + discountedAmount + " and final discounted fee is" + discountedPrice);
        // QUESTION 7
        System.out.println("=-=-=-=-=-=QUESTION 7=-=-=-=-=-=");
        float EarthRadius = 6000;
        float EarthVolume = (float) (4 /3) * (float) Math.PI * (float) Math.pow(EarthRadius, 2);
        System.out.println("The volume of earth in cubic kilometers is " + EarthVolume + " and cubic miles is " + 0.24 * EarthVolume);
        // QUESTION 8
        System.out.println("=-=-=-=-=-=QUESTION 8=-=-=-=-=-=");
        Scanner scanner = new Scanner(System.in);
        float km2;
        float miles2;
        System.out.print("Enter Kilometer: ");
        km2 = scanner.nextInt();
        miles2 = 1.6f * km2;
        System.out.println("The total miles is " + miles2 + " for given " + km2 + " kilometers");
        // QUESTION 9
        System.out.println("=-=-=-=-=-=QUESTION 9=-=-=-=-=-=");
        float fee, discountPercent, discountAmount, finalFee;
        System.out.print("Enter Fee: ");
        fee = scanner.nextFloat();
        System.out.print("Enter Discount Percent: ");
        discountPercent = scanner.nextFloat();
        discountAmount = fee * (discountPercent/100f);
        finalFee = fee - discountAmount;
        System.out.println("The discount amount is INR " + discountAmount + " and final discounted FEE is INR " + finalFee);
        // QUESTION 10
        System.out.println("=-=-=-=-=-=QUESTION 10=-=-=-=-=-=");
        float cm;
        System.out.print("Enter height in cm: ");
        cm = scanner.nextFloat();
        float totalInches = cm / 2.54f;
        float feet = totalInches / 12;
        float inches = totalInches - (12 * feet);
        System.out.println("Your height in cm is " + cm + "while in feet is " + feet + " and inchs is " + inches);
    }
}
