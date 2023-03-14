package JavaPrograms;

import java.util.Scanner;

/**
 * Write a Java program to convert a decimal number to binary number. Input Data:
 * Input a Decimal Number : 5
 * Expected Output Binary number is: 101
 */
public class DecimalToBinary {

    public static void main(String[] args) {
        decimal();
    }
    public static void decimal() {

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a Decimal number: ");
        int decimal = scan.nextInt();
        String binary = Integer.toBinaryString(decimal);
        System.out.println("Binary number is " + binary);

        scan.close();

    }
}
