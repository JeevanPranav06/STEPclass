package Week5and6problems;

import java.util.Scanner;

public class Level2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // PROBLEM 1
        double[] salary = new double[10];
        int[] years = new int[10];
        double[] bonus = new double[10];
        double[] newSalary = new double[10];
        double totalBonus = 0;
        double totalOldSalary = 0;
        double totalNewSalary = 0;
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter salary of employee " + (i + 1) + ": ");
            salary[i] = sc.nextDouble();

            System.out.print("Enter years of service: ");
            years[i] = sc.nextInt();

            if (salary[i] < 0 || years[i] < 0) {
                System.out.println("Invalid input");
                i--;
                continue;
            }
        }
        for (int i = 0; i < 10; i++) {
            if (years[i] > 5) {
                bonus[i] = salary[i] * 0.05;
            } else {
                bonus[i] = salary[i] * 0.02;
            }

            newSalary[i] = salary[i] + bonus[i];
            totalBonus += bonus[i];
            totalOldSalary += salary[i];
            totalNewSalary += newSalary[i];

            System.out.println("Old Salary: " + salary[i] + " Bonus: " + bonus[i] + " New Salary: " + newSalary[i]);
        }
        System.out.println("Total Bonus Payout = " + totalBonus);
        System.out.println("Total Old Salary = " + totalOldSalary);
        System.out.println("Total New Salary = " + totalNewSalary);

        // PROBLEM 2
        int[] ages = new int[3];
        double[] heights = new double[3];
        String[] names = {"Amar", "Akbar", "Anthony"};

        for (int i = 0; i < 3; i++) {
            System.out.print("Enter age of " + names[i] + ": ");
            ages[i] = sc.nextInt();

            System.out.print("Enter height of " + names[i] + ": ");
            heights[i] = sc.nextDouble();
        }

        int youngestIndex = 0;
        int tallestIndex = 0;

        for (int i = 1; i < 3; i++) {
            if (ages[i] < ages[youngestIndex]) {
                youngestIndex = i;
            }

            if (heights[i] > heights[tallestIndex]) {
                tallestIndex = i;
            }
        }

        System.out.println("Youngest friend: " + names[youngestIndex]);
        System.out.println("Tallest friend: " + names[tallestIndex]);

        // PROBLEM 3
        System.out.print("Enter number: ");
        int number = sc.nextInt();

        int maxDigit = 10;
        int[] digits = new int[maxDigit];
        int index = 0;

        while (number != 0 && index < maxDigit) {
            digits[index++] = number % 10;
            number /= 10;
        }

        int largest = 0;
        int secondLargest = 0;

        for (int i = 0; i < index; i++) {
            if (digits[i] > largest) {
                secondLargest = largest;
                largest = digits[i];
            } else if (digits[i] > secondLargest && digits[i] != largest) {
                secondLargest = digits[i];
            }
        }

        System.out.println("Largest digit: " + largest);
        System.out.println("Second largest digit: " + secondLargest);

        // PROBLEM 4
        System.out.print("Enter number: ");
        int num2 = sc.nextInt();

        int size = 10;
        int[] digits2 = new int[size];
        int idx = 0;

        while (num2 != 0) {
            if (idx == size) {
                size *= 2;
                int[] temp = new int[size];

                for (int i = 0; i < digits2.length; i++) {
                    temp[i] = digits2[i];
                }

                digits2 = temp;
            }

            digits2[idx++] = num2 % 10;
            num2 /= 10;
        }

        int largest2 = 0;
        int secondLargest2 = 0;

        for (int i = 0; i < idx; i++) {
            if (digits2[i] > largest2) {
                secondLargest2 = largest2;
                largest2 = digits2[i];
            } else if (digits2[i] > secondLargest2 && digits2[i] != largest2) {
                secondLargest2 = digits2[i];
            }
        }

        System.out.println("Largest digit: " + largest2);
        System.out.println("Second largest digit: " + secondLargest2);

        // PROBLEM 5
        System.out.print("Enter number: ");
        int revNum = sc.nextInt();

        int count = 0;
        int tempNum = revNum;

        while (tempNum != 0) {
            count++;
            tempNum /= 10;
        }

        int[] digitArray = new int[count];

        for (int i = 0; i < count; i++) {
            digitArray[i] = revNum % 10;
            revNum /= 10;
        }

        System.out.println("Digits in reverse order:");
        for (int i = 0; i < digitArray.length; i++) {
            System.out.print(digitArray[i] + " ");
        }
        System.out.println();

        // PROBLEM 6
        System.out.print("Enter number of persons: ");
        int persons = sc.nextInt();

        double[] weight = new double[persons];
        double[] height = new double[persons];
        double[] bmi = new double[persons];
        String[] status = new String[persons];

        for (int i = 0; i < persons; i++) {
            System.out.print("Enter weight (kg): ");
            weight[i] = sc.nextDouble();

            System.out.print("Enter height (m): ");
            height[i] = sc.nextDouble();

            bmi[i] = weight[i] / (height[i] * height[i]);

            if (bmi[i] <= 18.4) status[i] = "Underweight";
            else if (bmi[i] <= 24.9) status[i] = "Normal";
            else if (bmi[i] <= 39.9) status[i] = "Overweight";
            else status[i] = "Obese";
        }

        for (int i = 0; i < persons; i++) {
            System.out.println("Height: " + height[i] + " Weight: " + weight[i] + " BMI: " + bmi[i] + " Status: " + status[i]);
        }

        // PROBLEM 7
        System.out.print("Enter number of persons: ");
        int people = sc.nextInt();

        double[][] personData = new double[people][3];
        String[] weightStatus = new String[people];

        for (int i = 0; i < people; i++) {
            System.out.print("Enter weight (kg): ");
            personData[i][0] = sc.nextDouble();

            System.out.print("Enter height (m): ");
            personData[i][1] = sc.nextDouble();

            personData[i][2] = personData[i][0] / (personData[i][1] * personData[i][1]);

            if (personData[i][2] <= 18.4) weightStatus[i] = "Underweight";
            else if (personData[i][2] <= 24.9) weightStatus[i] = "Normal";
            else if (personData[i][2] <= 39.9) weightStatus[i] = "Overweight";
            else weightStatus[i] = "Obese";
        }

        for (int i = 0; i < people; i++) {
            System.out.println("Height: " + personData[i][1] + " Weight: " + personData[i][0] + " BMI: " + personData[i][2] + " Status: " + weightStatus[i]);
        }

        // PROBLEM 8
        System.out.print("Enter number of students: ");
        int students = sc.nextInt();

        double[] percentages = new double[students];
        char[] grades = new char[students];

        for (int i = 0; i < students; i++) {
            System.out.print("Enter physics marks: ");
            double phy = sc.nextDouble();

            System.out.print("Enter chemistry marks: ");
            double chem = sc.nextDouble();

            System.out.print("Enter maths marks: ");
            double math = sc.nextDouble();

            if (phy < 0 || chem < 0 || math < 0) {
                System.out.println("Invalid marks");
                i--;
                continue;
            }

            percentages[i] = (phy + chem + math) / 3;

            if (percentages[i] >= 80) grades[i] = 'A';
            else if (percentages[i] >= 70) grades[i] = 'B';
            else if (percentages[i] >= 60) grades[i] = 'C';
            else if (percentages[i] >= 50) grades[i] = 'D';
            else if (percentages[i] >= 40) grades[i] = 'E';
            else grades[i] = 'R';
        }

        for (int i = 0; i < students; i++) {
            System.out.println("Percentage: " + percentages[i] + " Grade: " + grades[i]);
        }

        // PROBLEM 9
        System.out.print("Enter number of students: ");
        int stu = sc.nextInt();

        double[][] marks = new double[stu][3];
        double[] percent = new double[stu];
        char[] grade = new char[stu];

        for (int i = 0; i < stu; i++) {
            System.out.print("Physics: ");
            marks[i][0] = sc.nextDouble();

            System.out.print("Chemistry: ");
            marks[i][1] = sc.nextDouble();

            System.out.print("Maths: ");
            marks[i][2] = sc.nextDouble();

            percent[i] = (marks[i][0] + marks[i][1] + marks[i][2]) / 3;

            if (percent[i] >= 80) grade[i] = 'A';
            else if (percent[i] >= 70) grade[i] = 'B';
            else if (percent[i] >= 60) grade[i] = 'C';
            else if (percent[i] >= 50) grade[i] = 'D';
            else if (percent[i] >= 40) grade[i] = 'E';
            else grade[i] = 'R';
        }

        for (int i = 0; i < stu; i++) {
            System.out.println("Percentage: " + percent[i] + " Grade: " + grade[i]);
        }

        // PROBLEM 10
        System.out.print("Enter number: ");
        int freqNum = sc.nextInt();

        int[] digitFreq = new int[10];

        while (freqNum != 0) {
            int digit = freqNum % 10;
            digitFreq[digit]++;
            freqNum /= 10;
        }

        for (int i = 0; i < 10; i++) {
            if (digitFreq[i] > 0) {
                System.out.println("Digit " + i + " frequency: " + digitFreq[i]);
            }
        }

        sc.close();
    }
}
