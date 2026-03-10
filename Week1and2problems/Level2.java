package Week1and2problems;
import java.util.Scanner;

public class Level2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Basic Calculator
        float number1, number2, res;
        String o;
        System.out.print("Enter number 1: ");
        number1 = scanner.nextFloat();
        System.out.print("Enter number 2: ");
        number2 = scanner.nextFloat();
        System.out.print("Enter Operation [A/S/M/D]: ");
        o = scanner.nextLine().toLowerCase();
        switch (o) {
            case "a" -> {
                res = number1 + number2;
                System.out.println(number1 + " + " + number2 + " = " + res);
            }
            case "s" -> {
                res = number1 - number2;
                System.out.println(number1 + " - " + number2 + " = " + res);
            }
            case "m" -> {
                res = number1 * number2;
                System.out.println(number1 + " x " + number2 + " = " + res);
            }
            case "d" -> {
                res = number1 / number2;
                System.out.println(number1 + " / " + number2 + " = " + res);
            }
            default -> System.out.println("Invalid operator");
        }

        // PROBLEM 2
        float base, height, area;
        System.out.print("Enter Base: ");
        base = scanner.nextFloat();
        System.out.print("Enter Height: ");
        height = scanner.nextFloat();
        area = 0.5f * height * base;
        System.out.println("Area = " + area);

        //  PROBLEM 3
        float perimeter, side;
        System.out.println("Enter perimeter of square: ");
        perimeter = scanner.nextFloat();
        side = perimeter/4;
        System.out.println("Side of said square is: " + side);

        // PROBLEM 4
        float feet, yards, miles;
        System.out.print("Enter feet: ");
        feet = scanner.nextFloat();
        yards = (float)(1/3) * feet;
        miles = yards / 1760;
        System.out.println("The distance in yards is " + yards + " while the distance in miles is " + miles);

        // PROBLEM 5
        int unitPrice, quantity, total;
        System.out.print("Enter Price: ");
        unitPrice = scanner.nextInt();
        System.out.print("Enter Quantity: ");
        quantity = scanner.nextInt();
        total = unitPrice * quantity;
        System.out.println("The total price is INR " + total + " if the quantity is " + quantity + " and unit price is INR " + unitPrice);

        // PROBLEM 6
        int num1, num2, q, r;
        System.out.print("Enter num 1: ");
        num1 = scanner.nextInt();
        System.out.print("Enter num 2: ");
        num2 = scanner.nextInt();
        q = num1 / num2;
        r = num1 % num2;
        System.out.println("The quotient is " + q + " and Reminder is " + r + "of two number " + num1 + " and " + num2);

        // PROBLEM 7
        int a, b, c, o1, o2, o3, o4;
        System.out.print("Enter a: ");
        a = scanner.nextInt();
        System.out.print("Enter a: ");
        b = scanner.nextInt();
        System.out.print("Enter a: ");
        c = scanner.nextInt();
        o1 = a + b * c;
        o2 = a * b + c;
        o3 = c + a / b;
        o4 = a % b + c;
        System.out.println("the results are: " + o1 + " , " + o2 + " , " + o3 + " , " + o4);

        // PROBLEM 8
        double a1, b2, c2, oa, ob, oc, od;
        System.out.print("Enter a: ");
        a1 = scanner.nextDouble();
        System.out.print("Enter a: ");
        b2 = scanner.nextDouble();
        System.out.print("Enter a: ");
        c2 = scanner.nextDouble();
        oa = a1 + b2 * c2;
        ob = a1 * b2 + c2;
        oc = c2 + a1 / b2;
        od = a1 % b2 + c2;
        System.out.println("the results are: " + oa + " , " + ob + " , " + oc + " , " + od);
    }

}
