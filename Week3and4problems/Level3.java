package Week3and4problems;
import java.util.Scanner;

public class Level3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // PROBLEM 1
        System.out.print("Enter year: ");
        int p1year = sc.nextInt();
        if (p1year >= 1582) {
            if (p1year % 4 == 0) {
                if (p1year % 100 == 0) {
                    if (p1year % 400 == 0) {
                        System.out.println("Leap Year");
                    } else {
                        System.out.println("Not a Leap Year");
                    }
                } else {
                    System.out.println("Leap Year");
                }
            } else {
                System.out.println("Not a Leap Year");
            }
        } else {
            System.out.println("Year should be >= 1582");
        }

        // PROBLEM 2
        System.out.print("Enter year: ");
        int p2year = sc.nextInt();
        boolean leap = p2year >= 1582 && ((p2year % 4 == 0 && p2year % 100 != 0) || (p2year % 400 == 0));
        if (leap) {
            System.out.println("Leap Year");
        } else {
            System.out.println("Not a Leap Year");
        }

        // PROBLEM 3
        System.out.print("Enter Physics marks: ");
        double p3phy = sc.nextDouble();
        System.out.print("Enter Chemistry marks: ");
        double p3chem = sc.nextDouble();
        System.out.print("Enter Maths marks: ");
        double p3math = sc.nextDouble();

        double p3avg = (p3phy + p3chem + p3math) / 3;
        char grade;
        String remark;

        if (p3avg >= 80) {
            grade = 'A';
            remark = "Level 4, above agency-normalized standards";
        } else if (p3avg >= 70) {
            grade = 'B';
            remark = "Level 3, at agency-normalized standards";
        } else if (p3avg >= 60) {
            grade = 'C';
            remark = "Level 2, below but approaching agency-normalized standards";
        } else if (p3avg >= 50) {
            grade = 'D';
            remark = "Level 1, well below agency-normalized standards";
        } else if (p3avg >= 40) {
            grade = 'E';
            remark = "Level 1-, too below agency-normalized standards";
        } else {
            grade = 'R';
            remark = "Remedial standards";
        }

        System.out.println("Average Marks: " + p3avg);
        System.out.println("Grade: " + grade);
        System.out.println("Remarks: " + remark);

        // PROBLEM 4
        System.out.print("Enter number: ");
        int p4num = sc.nextInt();
        boolean isPrime = true;

        if (p4num <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i < p4num; i++) {
                if (p4num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        if (isPrime) {
            System.out.println("Prime Number");
        } else {
            System.out.println("Not a Prime Number");
        }

        // PROBLEM 5
        System.out.print("Enter number: ");
        int p5num = sc.nextInt();
        int originalNumber = p5num;
        int p5sum = 0;

        while (originalNumber != 0) {
            int digit = originalNumber % 10;
            p5sum += digit * digit * digit;
            originalNumber = originalNumber / 10;
        }

        if (p5sum == p5num) {
            System.out.println("Armstrong Number");
        } else {
            System.out.println("Not an Armstrong Number");
        }

        // PROBLEM 6
        System.out.print("Enter number: ");
        int p6num = sc.nextInt();
        int p6count = 0;

        while (p6num != 0) {
            p6num = p6num / 10;
            p6count++;
        }

        System.out.println("Number of digits: " + p6count);

        // PROBLEM 7
        System.out.print("Enter weight in kg: ");
        double p7weight = sc.nextDouble();
        System.out.print("Enter height in cm: ");
        double p7heightcm = sc.nextDouble();

        double p7height = p7heightcm / 100;
        double bmi = p7weight / (p7height * p7height);

        System.out.println("BMI: " + bmi);

        if (bmi <= 18.4) {
            System.out.println("Underweight");
        } else if (bmi <= 24.9) {
            System.out.println("Normal");
        } else if (bmi <= 39.9) {
            System.out.println("Overweight");
        } else {
            System.out.println("Obese");
        }

        // PROBLEM 8
        System.out.print("Enter number: ");
        int p8num = sc.nextInt();
        int p8temp = p8num;
        int p8sum = 0;

        while (p8temp != 0) {
            p8sum += p8temp % 10;
            p8temp = p8temp / 10;
        }

        if (p8num % p8sum == 0) {
            System.out.println("Harshad Number");
        } else {
            System.out.println("Not a Harshad Number");
        }

        // PROBLEM 9
        System.out.print("Enter number: ");
        int p9num = sc.nextInt();
        int p9sum = 0;

        for (int i = 1; i < p9num; i++) {
            if (p9num % i == 0) {
                p9sum += i;
            }
        }

        if (p9sum > p9num) {
            System.out.println("Abundant Number");
        } else {
            System.out.println("Not an Abundant Number");
        }

        // PROBLEM 10
        System.out.print("Enter first number: ");
        double p10first = sc.nextDouble();
        System.out.print("Enter second number: ");
        double p10second = sc.nextDouble();
        System.out.print("Enter operator (+,-,*,/): ");
        String op = sc.next();

        switch (op) {
            case "+":
                System.out.println("Result: " + (p10first + p10second));
                break;
            case "-":
                System.out.println("Result: " + (p10first - p10second));
                break;
            case "*":
                System.out.println("Result: " + (p10first * p10second));
                break;
            case "/":
                System.out.println("Result: " + (p10first / p10second));
                break;
            default:
                System.out.println("Invalid Operator");
        }

        // PROBLEM 11
        System.out.print("Enter month: ");
        int m = sc.nextInt();
        System.out.print("Enter day: ");
        int d = sc.nextInt();
        System.out.print("Enter year: ");
        int y = sc.nextInt();

        int y0 = y - (14 - m) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = m + 12 * ((14 - m) / 12) - 2;
        int d0 = (d + x + (31 * m0) / 12) % 7;

        String dayName;

        switch (d0) {
            case 0:
                dayName = "Sunday";
                break;
            case 1:
                dayName = "Monday";
                break;
            case 2:
                dayName = "Tuesday";
                break;
            case 3:
                dayName = "Wednesday";
                break;
            case 4:
                dayName = "Thursday";
                break;
            case 5:
                dayName = "Friday";
                break;
            case 6:
                dayName = "Saturday";
                break;
            default:
                dayName = "Invalid";
        }

        System.out.println("Day of the week: " + dayName);

        sc.close();
    }
}
