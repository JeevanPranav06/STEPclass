package Week5and6problems;

import java.util.Scanner;

public class Level1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // PROBLEM 1
        int[] p1ages = new int[10];
        for (int i = 0; i < p1ages.length; i++) {
            System.out.print("Enter age of student " + (i + 1) + ": ");
            p1ages[i] = sc.nextInt();
        }

        for (int i = 0; i < p1ages.length; i++) {
            if (p1ages[i] < 0) {
                System.out.println("Invalid age");
            } else if (p1ages[i] >= 18) {
                System.out.println("The student with the age " + p1ages[i] + " can vote.");
            } else {
                System.out.println("The student with the age " + p1ages[i] + " cannot vote.");
            }
        }

        // PROBLEM 2
        int[] p2numbers = new int[5];
        for (int i = 0; i < p2numbers.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            p2numbers[i] = sc.nextInt();
        }

        for (int i = 0; i < p2numbers.length; i++) {
            if (p2numbers[i] > 0) {
                if (p2numbers[i] % 2 == 0) {
                    System.out.println(p2numbers[i] + " is positive and even");
                } else {
                    System.out.println(p2numbers[i] + " is positive and odd");
                }
            } else if (p2numbers[i] < 0) {
                System.out.println(p2numbers[i] + " is negative");
            } else {
                System.out.println("Number is zero");
            }
        }

        if (p2numbers[0] > p2numbers[4]) {
            System.out.println("First element is greater than last element");
        } else if (p2numbers[0] < p2numbers[4]) {
            System.out.println("First element is less than last element");
        } else {
            System.out.println("First and last elements are equal");
        }

        // PROBLEM 3
        System.out.print("Enter number: ");
        int p3num = sc.nextInt();
        int[] p3table = new int[10];

        for (int i = 0; i < 10; i++) {
            p3table[i] = p3num * (i + 1);
        }

        for (int i = 0; i < 10; i++) {
            System.out.println(p3num + " * " + (i + 1) + " = " + p3table[i]);
        }

        // PROBLEM 4
        double[] p4array = new double[10];
        double p4total = 0.0;
        int p4index = 0;

        while (true) {
            System.out.print("Enter number: ");
            double p4value = sc.nextDouble();

            if (p4value <= 0 || p4index == 10) {
                break;
            }

            p4array[p4index] = p4value;
            p4index++;
        }

        for (int i = 0; i < p4index; i++) {
            System.out.println(p4array[i]);
            p4total += p4array[i];
        }

        System.out.println("Total = " + p4total);

        // PROBLEM 5
        System.out.print("Enter number: ");
        int p5num = sc.nextInt();
        int[] p5result = new int[4];

        for (int i = 6; i <= 9; i++) {
            p5result[i - 6] = p5num * i;
        }

        for (int i = 6; i <= 9; i++) {
            System.out.println(p5num + " * " + i + " = " + p5result[i - 6]);
        }

        // PROBLEM 6
        double[] p6heights = new double[11];
        double p6sum = 0;

        for (int i = 0; i < p6heights.length; i++) {
            System.out.print("Enter height " + (i + 1) + ": ");
            p6heights[i] = sc.nextDouble();
            p6sum += p6heights[i];
        }

        double p6mean = p6sum / p6heights.length;
        System.out.println("Mean height = " + p6mean);

        // PROBLEM 7
        System.out.print("Enter number: ");
        int p7num = sc.nextInt();

        if (p7num <= 0) {
            System.out.println("Invalid number");
        } else {
            int[] odd = new int[p7num / 2 + 1];
            int[] even = new int[p7num / 2 + 1];
            int oddIndex = 0;
            int evenIndex = 0;

            for (int i = 1; i <= p7num; i++) {
                if (i % 2 == 0) {
                    even[evenIndex++] = i;
                } else {
                    odd[oddIndex++] = i;
                }
            }

            System.out.println("Odd numbers:");
            for (int i = 0; i < oddIndex; i++) {
                System.out.print(odd[i] + " ");
            }

            System.out.println("\nEven numbers:");
            for (int i = 0; i < evenIndex; i++) {
                System.out.print(even[i] + " ");
            }
            System.out.println();
        }

        // PROBLEM 8
        System.out.print("Enter number: ");
        int p8num = sc.nextInt();
        int maxFactor = 10;
        int[] factors = new int[maxFactor];
        int p8index = 0;

        for (int i = 1; i <= p8num; i++) {
            if (p8num % i == 0) {

                if (p8index == maxFactor) {
                    maxFactor *= 2;
                    int[] temp = new int[maxFactor];

                    for (int j = 0; j < factors.length; j++) {
                        temp[j] = factors[j];
                    }

                    factors = temp;
                }

                factors[p8index++] = i;
            }
        }

        System.out.println("Factors:");
        for (int i = 0; i < p8index; i++) {
            System.out.print(factors[i] + " ");
        }
        System.out.println();

        // PROBLEM 9
        System.out.print("Enter rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter columns: ");
        int cols = sc.nextInt();

        int[][] matrix = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Enter element: ");
                matrix[i][j] = sc.nextInt();
            }
        }

        int[] p9array = new int[rows * cols];
        int p9index = 0;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                p9array[p9index++] = matrix[i][j];
            }
        }

        System.out.println("1D Array:");
        for (int i = 0; i < p9array.length; i++) {
            System.out.print(p9array[i] + " ");
        }
        System.out.println();

        // PROBLEM 10
        System.out.print("Enter number: ");
        int p10num = sc.nextInt();

        if (p10num > 0) {
            String[] fizzbuzz = new String[p10num + 1];

            for (int i = 1; i <= p10num; i++) {
                if (i % 3 == 0 && i % 5 == 0) {
                    fizzbuzz[i] = "FizzBuzz";
                } else if (i % 3 == 0) {
                    fizzbuzz[i] = "Fizz";
                } else if (i % 5 == 0) {
                    fizzbuzz[i] = "Buzz";
                } else {
                    fizzbuzz[i] = String.valueOf(i);
                }
            }

            for (int i = 1; i <= p10num; i++) {
                System.out.println("Position " + i + " = " + fizzbuzz[i]);
            }
        }

        sc.close();
    }
}