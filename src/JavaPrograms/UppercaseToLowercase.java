package JavaPrograms;

import java.util.Scanner;

/**
 * Write a program to convert the upper case to lower case
 */

public class UppercaseToLowercase {

    public static void main(String[] args) {

        uppertolower();
    }

    public static void uppertolower() {

        Scanner s = new Scanner(System.in);
        System.out.print("Enter the string to be converted to Lowercase: ");
        String str = s.nextLine();

        str = str.toLowerCase(); // convert string to
        System.out.println("String convert to Lowercase: " + str);

        s.close();
    }

}