package JavaPrograms;
/** Write a program for a calculator with addition, subtraction, multiplication and division
 * methods all with parameters and use string concatenation methods.
 */

import java.util.Scanner;

public class Calculator {

    // Static Method
    public static double addition(double num1, double num2) {
        return num1 + num2;
    }

    // Static Method
    public static double subtraction(double num1, double num2) {
        return num1 - num2;
    }

    //Instance Method
    public double multiplication(double num1, double num2) { return num1 * num2; }

    // Instance Method
    public double division(double num1, double num2) { return num1 / num2; }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the First number: ");
        double num1 = scanner.nextDouble();
        System.out.println("Enter the Second number: ");
        double num2 = scanner.nextDouble();
        System.out.println("");

        scanner.close();

        System.out.println("addition of two number is: " + addition(num1, num2));
        System.out.println("subtraction of two number is: " + subtraction(num1, num2));

        Calculator cal = new Calculator(); // object to call Instance Method
        cal.multiplication(num1, num2);
        System.out.println("multiplication of two number is: " + cal.multiplication(num1, num2));
        cal.division(num1, num2);
        System.out.println("Division of two number is: " + cal.division(num1, num2));


    }
}
