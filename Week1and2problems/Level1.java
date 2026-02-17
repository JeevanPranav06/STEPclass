package Week1and2problems;

public class Level1 {
    public static void main(String[] args) {
        // QUESTION 1
        int harry_birth_year  = 2000;
        int harry_age = 2024 - harry_birth_year;
        System.out.println("Harry's age in 2024 " + harry_age);
        // QUESTION 2
        int math =  94, phy = 95, che = 96;
        int avg = (math + phy + che) / 3;
        System.out.println("Sam's average mark in PCM is " + avg);
        // QUESTION 3
        double km = 10.8;
        double miles = 10.8 / 1.6; // 1 km = 1.6 miles
        System.out.println("The distance " + km + " km in miles is " + miles);
        // QUESTION 4
        int costPrice = 129;
        int sellingPrice = 191;
        int profit = sellingPrice - costPrice;
        int profitPercent = (profit/costPrice) * 100;
        System.out.println("The cost price is INR " + costPrice + " and Selling Price is INR " + sellingPrice);
        System.out.println("The profit is " + profit + "and the profit percentage is " + profitPercent + "%");
        // QUESTION 5
        int totalPens = 14;
        int eachPens = totalPens/ 3;
        int remainingPens = totalPens % 3;
        System.out.println("The Pen per student is " + eachPens + "and the remaining pen not distributed is " + remainingPens);
        // QUESTION 6
        float fees = 125000;
        float discountedAmount = fees * 0.1f;
        float discountedPrice = fees - discountedAmount;
        System.out.println("The discount amount INR " + discountedAmount + " and final discounted fee is" + discountedPrice);
    }
}
