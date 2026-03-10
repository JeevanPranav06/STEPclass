package Week3and4problems;

import java.util.Scanner;

public class Level1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // PROBLEM 1
        System.out.print("Enter number: ");
        int numberDiv5 = sc.nextInt();
        boolean divisibleBy5 = numberDiv5 % 5 == 0;
        System.out.println("Is the number " + numberDiv5 + " divisible by 5? " + divisibleBy5);

        // PROBLEM 2
        System.out.print("Enter number1: ");
        int p2n1 = sc.nextInt();
        System.out.print("Enter number2: ");
        int p2n2 = sc.nextInt();
        System.out.print("Enter number3: ");
        int p2n3 = sc.nextInt();
        boolean firstSmallest = p2n1 < p2n2 && p2n1 < p2n3;
        System.out.println("Is the first number the smallest? " + firstSmallest);

        // PROBLEM 3
        System.out.print("Enter number1: ");
        int p3n1 = sc.nextInt();
        System.out.print("Enter number2: ");
        int p3n2 = sc.nextInt();
        System.out.print("Enter number3: ");
        int p3n3 = sc.nextInt();
        boolean firstLargest = p3n1 > p3n2 && p3n1 > p3n3;
        boolean secondLargest = p3n2 > p3n1 && p3n2 > p3n3;
        boolean thirdLargest = p3n3 > p3n1 && p3n3 > p3n2;
        System.out.println("Is the first number the largest? " + firstLargest);
        System.out.println("Is the second number the largest? " + secondLargest);
        System.out.println("Is the third number the largest? " + thirdLargest);

        // PROBLEM 4
        System.out.print("Enter number: ");
        int p4num = sc.nextInt();
        if (p4num >= 0) {
            int p4sum = p4num * (p4num + 1) / 2;
            System.out.println("The sum of " + p4num + " natural numbers is " + p4sum);
        } else {
            System.out.println("The number " + p4num + " is not a natural number");
        }

        // PROBLEM 5
        System.out.print("Enter age: ");
        int p5age = sc.nextInt();
        if (p5age >= 18) {
            System.out.println("The person's age is " + p5age + " and can vote.");
        } else {
            System.out.println("The person's age is " + p5age + " and cannot vote.");
        }

        // PROBLEM 6
        System.out.print("Enter number: ");
        int p6num = sc.nextInt();
        if (p6num > 0) {
            System.out.println("positive");
        } else if (p6num < 0) {
            System.out.println("negative");
        } else {
            System.out.println("zero");
        }

        // PROBLEM 7
        System.out.print("Enter month: ");
        int p7month = sc.nextInt();
        System.out.print("Enter day: ");
        int p7day = sc.nextInt();
        boolean spring = (p7month == 3 && p7day >= 20) || (p7month == 4) || (p7month == 5) || (p7month == 6 && p7day <= 20);
        if (spring) {
            System.out.println("Its a Spring Season");
        } else {
            System.out.println("Not a Spring Season");
        }

        // PROBLEM 8
        System.out.print("Enter countdown number: ");
        int p8counter = sc.nextInt();
        while (p8counter >= 1) {
            System.out.println(p8counter);
            p8counter--;
        }

        // PROBLEM 9
        System.out.print("Enter countdown number: ");
        int p9counter = sc.nextInt();
        for (int i = p9counter; i >= 1; i--) {
            System.out.println(i);
        }

        // PROBLEM 10
        double p10total = 0.0;
        System.out.print("Enter number: ");
        double p10value = sc.nextDouble();
        while (p10value != 0) {
            p10total += p10value;
            System.out.print("Enter number: ");
            p10value = sc.nextDouble();
        }
        System.out.println("Total is " + p10total);

        // PROBLEM 11
        double p11sum = 0.0;
        while (true) {
            System.out.print("Enter number: ");
            double p11value = sc.nextDouble();
            if (p11value <= 0) {
                break;
            }
            p11sum += p11value;
        }
        System.out.println("Total is " + p11sum);

        // PROBLEM 12
        System.out.print("Enter number: ");
        int p12n = sc.nextInt();
        if (p12n >= 0) {
            int p12formula = p12n * (p12n + 1) / 2;
            int p12loop = 0;
            int i = 1;
            while (i <= p12n) {
                p12loop += i;
                i++;
            }
            System.out.println("Formula result: " + p12formula);
            System.out.println("While loop result: " + p12loop);
            System.out.println("Both computations correct? " + (p12formula == p12loop));
        } else {
            System.out.println("The number is not a natural number");
        }

        // PROBLEM 13
        System.out.print("Enter number: ");
        int p13n = sc.nextInt();
        if (p13n >= 0) {
            int p13formula = p13n * (p13n + 1) / 2;
            int p13loop = 0;
            for (int j = 1; j <= p13n; j++) {
                p13loop += j;
            }
            System.out.println("Formula result: " + p13formula);
            System.out.println("For loop result: " + p13loop);
            System.out.println("Both computations correct? " + (p13formula == p13loop));
        } else {
            System.out.println("The number is not a natural number");
        }

        // PROBLEM 14
        System.out.print("Enter number: ");
        int p14num = sc.nextInt();
        if (p14num > 0) {
            int factorial = 1;
            int k = 1;
            while (k <= p14num) {
                factorial *= k;
                k++;
            }
            System.out.println("Factorial is " + factorial);
        } else {
            System.out.println("Enter positive integer");
        }

        // PROBLEM 15
        System.out.print("Enter number: ");
        int p15num = sc.nextInt();
        if (p15num > 0) {
            int factorial2 = 1;
            for (int m = 1; m <= p15num; m++) {
                factorial2 *= m;
            }
            System.out.println("Factorial is " + factorial2);
        } else {
            System.out.println("Enter positive integer");
        }

        sc.close();
    }
}
