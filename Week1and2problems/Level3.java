package Week1and2problems;

import java.util.Scanner;

public class Level3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // PROBLEM 1
        System.out.print("Enter celsius: ");
        double celsius = sc.nextDouble();
        double fahrenheitResult = (celsius * 9/5) + 32;
        System.out.println("The " + celsius + " celsius is " + fahrenheitResult + " fahrenheit");

        // PROBLEM 2
        System.out.print("Enter fahrenheit: ");
        double fahrenheit = sc.nextDouble();
        double celsiusResult = (fahrenheit - 32) * 5/9;
        System.out.println("The " + fahrenheit + " fahrenheit is " + celsiusResult + " celsius");

        // PROBLEM 3
        System.out.print("Enter salary: ");
        double salary = sc.nextDouble();
        System.out.print("Enter bonus: ");
        double bonus = sc.nextDouble();
        double income = salary + bonus;
        System.out.println("The salary is INR " + salary + " and bonus is INR " + bonus + ". Hence Total Income is INR " + income);

        // PROBLEM 4
        System.out.print("Enter name: ");
        String name = sc.next();
        System.out.print("Enter from city: ");
        String fromCity = sc.next();
        System.out.print("Enter via city: ");
        String viaCity = sc.next();
        System.out.print("Enter destination city: ");
        String toCity = sc.next();
        System.out.print("Enter distance from city to via city: ");
        double fromToVia = sc.nextDouble();
        System.out.print("Enter distance from via city to final city: ");
        double viaToFinalCity = sc.nextDouble();
        System.out.print("Enter time from city to via city: ");
        double timeFromToVia = sc.nextDouble();
        System.out.print("Enter time from via city to final city: ");
        double timeViaToFinalCity = sc.nextDouble();
        double totalDistance = fromToVia + viaToFinalCity;
        double totalTime = timeFromToVia + timeViaToFinalCity;
        System.out.println("The Total Distance travelled by " + name + " from " + fromCity + " to " + toCity + " via " + viaCity + " is " + totalDistance + " km and the Total Time taken is " + totalTime + " minutes");

        // PROBLEM 5
        System.out.print("Enter number1: ");
        int number1 = sc.nextInt();
        System.out.print("Enter number2: ");
        int number2 = sc.nextInt();
        int temp = number1;
        number1 = number2;
        number2 = temp;
        System.out.println("The swapped numbers are " + number1 + " and " + number2);

        // PROBLEM 6
        System.out.print("Enter side1: ");
        double side1 = sc.nextDouble();
        System.out.print("Enter side2: ");
        double side2 = sc.nextDouble();
        System.out.print("Enter side3: ");
        double side3 = sc.nextDouble();
        double perimeter = side1 + side2 + side3;
        double rounds = 5000 / perimeter;
        System.out.println("The total number of rounds the athlete will run is " + rounds + " to complete 5 km");

        // PROBLEM 7
        System.out.print("Enter number of chocolates: ");
        int numberOfChocolates = sc.nextInt();
        System.out.print("Enter number of children: ");
        int numberOfChildren = sc.nextInt();
        int chocolatesEach = numberOfChocolates / numberOfChildren;
        int remainingChocolates = numberOfChocolates % numberOfChildren;
        System.out.println("The number of chocolates each child gets is " + chocolatesEach + " and the number of remaining chocolates are " + remainingChocolates);

        // PROBLEM 8
        System.out.print("Enter principal: ");
        double principal = sc.nextDouble();
        System.out.print("Enter rate: ");
        double rate = sc.nextDouble();
        System.out.print("Enter time: ");
        double time = sc.nextDouble();
        double simpleInterest = principal * rate * time / 100;
        System.out.println("The Simple Interest is " + simpleInterest + " for Principal " + principal + ", Rate of Interest " + rate + " and Time " + time);

        // PROBLEM 9
        System.out.print("Enter weight in pounds: ");
        double weight = sc.nextDouble();
        double kg = weight / 2.2;
        System.out.println("The weight of the person in pounds is " + weight + " and in kg is " + kg);

        // PROBLEM 10
        System.out.print("Enter number of students: ");
        int numberOfStudents = sc.nextInt();
        int handshakes = (numberOfStudents * (numberOfStudents - 1)) / 2;
        System.out.println("The maximum number of handshakes possible are " + handshakes);

        // PROBLEM 11
        System.out.print("Enter weight in pounds: ");
        double pound = sc.nextDouble();
        double kilogram = pound / 2.2;
        System.out.println("The weight of the person in pound is " + pound + " and in kg is " + kilogram);

        sc.close();
    }
}