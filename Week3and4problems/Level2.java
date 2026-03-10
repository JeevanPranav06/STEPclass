package Week3and4problems;

import java.util.Scanner;

public class Level2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // PROBLEM 1
        System.out.print("Enter number: ");
        int p1num = sc.nextInt();
        if (p1num >= 1) {
            for (int i = 1; i <= p1num; i++) {
                if (i % 2 == 0) {
                    System.out.println(i + " is even");
                } else {
                    System.out.println(i + " is odd");
                }
            }
        }

        // PROBLEM 2
        System.out.print("Enter salary: ");
        double p2salary = sc.nextDouble();
        System.out.print("Enter years of service: ");
        int p2years = sc.nextInt();
        double p2bonus = 0;
        if (p2years > 5) {
            p2bonus = p2salary * 0.05;
        }
        System.out.println("Bonus amount is " + p2bonus);

        // PROBLEM 3
        System.out.print("Enter number: ");
        int p3num = sc.nextInt();
        for (int i = 6; i <= 9; i++) {
            System.out.println(p3num + " * " + i + " = " + (p3num * i));
        }

        // PROBLEM 4
        System.out.print("Enter number: ");
        int p4num = sc.nextInt();
        if (p4num > 0) {
            for (int i = 1; i <= p4num; i++) {
                if (i % 3 == 0 && i % 5 == 0) {
                    System.out.println("FizzBuzz");
                } else if (i % 3 == 0) {
                    System.out.println("Fizz");
                } else if (i % 5 == 0) {
                    System.out.println("Buzz");
                } else {
                    System.out.println(i);
                }
            }
        }

        // PROBLEM 5
        System.out.print("Enter number: ");
        int p5num = sc.nextInt();
        int p5i = 1;
        if (p5num > 0) {
            while (p5i <= p5num) {
                if (p5i % 3 == 0 && p5i % 5 == 0) {
                    System.out.println("FizzBuzz");
                } else if (p5i % 3 == 0) {
                    System.out.println("Fizz");
                } else if (p5i % 5 == 0) {
                    System.out.println("Buzz");
                } else {
                    System.out.println(p5i);
                }
                p5i++;
            }
        }

        // PROBLEM 6
        System.out.print("Enter Amar age: ");
        int amarAge = sc.nextInt();
        System.out.print("Enter Akbar age: ");
        int akbarAge = sc.nextInt();
        System.out.print("Enter Anthony age: ");
        int anthonyAge = sc.nextInt();

        System.out.print("Enter Amar height: ");
        double amarHeight = sc.nextDouble();
        System.out.print("Enter Akbar height: ");
        double akbarHeight = sc.nextDouble();
        System.out.print("Enter Anthony height: ");
        double anthonyHeight = sc.nextDouble();

        if (amarAge < akbarAge && amarAge < anthonyAge) {
            System.out.println("Youngest is Amar");
        } else if (akbarAge < amarAge && akbarAge < anthonyAge) {
            System.out.println("Youngest is Akbar");
        } else {
            System.out.println("Youngest is Anthony");
        }

        if (amarHeight > akbarHeight && amarHeight > anthonyHeight) {
            System.out.println("Tallest is Amar");
        } else if (akbarHeight > amarHeight && akbarHeight > anthonyHeight) {
            System.out.println("Tallest is Akbar");
        } else {
            System.out.println("Tallest is Anthony");
        }

        // PROBLEM 7
        System.out.print("Enter number: ");
        int p7num = sc.nextInt();
        if (p7num > 0) {
            for (int i = 1; i < p7num; i++) {
                if (p7num % i == 0) {
                    System.out.println(i);
                }
            }
        }

        // PROBLEM 8
        System.out.print("Enter number: ");
        int p8num = sc.nextInt();
        int p8i = 1;
        if (p8num > 0) {
            while (p8i < p8num) {
                if (p8num % p8i == 0) {
                    System.out.println(p8i);
                }
                p8i++;
            }
        }

        // PROBLEM 9
        System.out.print("Enter number: ");
        int p9num = sc.nextInt();
        int greatestFactor = 1;
        for (int i = p9num - 1; i >= 1; i--) {
            if (p9num % i == 0) {
                greatestFactor = i;
                break;
            }
        }
        System.out.println("Greatest factor is " + greatestFactor);

        // PROBLEM 10
        System.out.print("Enter number: ");
        int p10num = sc.nextInt();
        int p10factor = 1;
        int p10counter = p10num - 1;
        while (p10counter >= 1) {
            if (p10num % p10counter == 0) {
                p10factor = p10counter;
                break;
            }
            p10counter--;
        }
        System.out.println("Greatest factor is " + p10factor);

        // PROBLEM 11
        System.out.print("Enter number: ");
        int p11num = sc.nextInt();
        if (p11num > 0 && p11num < 100) {
            for (int i = 100; i >= 1; i--) {
                if (i % p11num == 0) {
                    System.out.println(i);
                }
            }
        }

        // PROBLEM 12
        System.out.print("Enter number: ");
        int p12num = sc.nextInt();
        System.out.print("Enter power: ");
        int p12power = sc.nextInt();
        int p12result = 1;
        for (int i = 1; i <= p12power; i++) {
            p12result *= p12num;
        }
        System.out.println("Result is " + p12result);

        // PROBLEM 13
        System.out.print("Enter number: ");
        int p13num = sc.nextInt();
        int p13counter = 100;
        if (p13num > 0 && p13num < 100) {
            while (p13counter >= 1) {
                if (p13counter % p13num == 0) {
                    System.out.println(p13counter);
                }
                p13counter--;
            }
        }

        // PROBLEM 14
        System.out.print("Enter number: ");
        int p14num = sc.nextInt();
        System.out.print("Enter power: ");
        int p14power = sc.nextInt();
        int p14result = 1;
        int p14counter = 0;
        while (p14counter < p14power) {
            p14result *= p14num;
            p14counter++;
        }
        System.out.println("Result is " + p14result);

        sc.close();
    }
}