package JavaPrograms;
/** Write a Java program to print the area and perimeter of a rectangle. Test Data: Width = 5.5 Height = 8.5 Expected Output:
 *  Area is 5.6 * 8.5 = 47.60 Perimeter is 2 * (5.6 + 8.5) = 28.20
  */
import java.util.Scanner;
public class AreaAndPerimeterOfRactangle {

    public void ractangle(){

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the width of ractangle: ");
        double width = scan.nextDouble();
        System.out.print("Enter the height of ractangle");
        double height = scan.nextDouble();

        double area = width * height;
        double perimeter = 2 * (width + height);

        System.out.println("Area of Ractangle is: " + area);
        System.out.println("Perimeter of Ractangle is: " + perimeter);

        scan.close();

    }

    public static void main(String[] args) {
        AreaAndPerimeterOfRactangle obj = new AreaAndPerimeterOfRactangle();
        obj.ractangle();


    }
}
