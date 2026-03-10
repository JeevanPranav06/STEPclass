package Week5and6problems;

import java.util.Scanner;

public class Level3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // PROBLEM 1
        System.out.print("Enter number: ");
        int number = sc.nextInt();

        int temp = number;
        int count = 0;

        while (temp != 0) {
            count++;
            temp /= 10;
        }

        int[] digits = new int[count];
        temp = number;

        for (int i = 0; i < count; i++) {
            digits[i] = temp % 10;
            temp /= 10;
        }

        int[] frequency = new int[10];

        for (int i = 0; i < digits.length; i++) {
            frequency[digits[i]]++;
        }

        for (int i = 0; i < 10; i++) {
            if (frequency[i] > 0) {
                System.out.println("Digit " + i + " Frequency = " + frequency[i]);
            }
        }

        sc.close();
    }
}
