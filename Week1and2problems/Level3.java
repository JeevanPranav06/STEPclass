package Week1and2problems;

import java.util.Scanner;

public class Level3 {
    public static void main (String[] args) {
        // PROBLEM 1
        int celcius1, farenheit;
        Scanner scanner  = new Scanner(System.in);
        System.out.print("Enter Celsius: ");
        celcius1 = scanner.nextInt();
        farenheit = (int) (celcius1 * (9/5)) + 32;
        System.out.printf("The %d celcius is %d farenheit", celcius1, farenheit);

        // PROBLEM 2
        int celcius2, farenheit2;
        System.out.print("Enter Farenheit: ");
        farenheit2 = scanner.nextInt();
        celcius2 = (int) ((farenheit - 32)  * (5/9));
        System.out.printf("The %d celcius is %d farenheit", celcius2, farenheit2);

        // PROBLEM 3
        int salary, bonus, total;
        System.out.print("Enter salary: ");
        salary = scanner.nextInt();
        System.out.print("Enter bonus: ");
        bonus = scanner.nextInt();
        total = salary + bonus;
        System.out.printf("The %d ");
    }
}
