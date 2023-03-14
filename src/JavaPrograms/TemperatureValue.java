package JavaPrograms;

import java.util.Scanner;

/** Write a program to insert any temperature value in degree Fahrenheit and
 * convert to degree Celsius ((F − 32) × 5/9 = 0°C).
 */

public class TemperatureValue {

    public static void main(String[] args){

        temperature();

    }
    public static void temperature(){

        Scanner s = new Scanner(System.in);
        System.out.println("Enter Fahrenheit Value: ");
        int f = s.nextInt();
        int celsius = ((5*(f - 32)) / 9);
        System.out.println(f + "Degree of Fahrenheit is equal to " + celsius + "in Celsius");

        s.close();

    }
}
