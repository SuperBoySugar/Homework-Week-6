package JavaPrograms;

/** Write a Java Program to print as below.
 */
public class PrintReceipt {

    public static void main(String[] args) {
        PrintReceipt obj = new PrintReceipt();
        obj.printReceipt();
    }

    public void printReceipt(){

        System.out.println("\"+---------------------------+\"");
        System.out.println("\"|                           |\"");
        System.out.println("\"|       CORNOR STORE        |\"");
        System.out.println("\"|                           |\"");
        System.out.println("\"|    2015-03-29 04:38PM     |\"");
        System.out.println("\"|                           |\"");
        System.out.println("\"|    Gallons:     10.870    |\"");
        System.out.println("\"|    Price/gallon: $2.08    |\"");
        System.out.println("\"|                           |\"");
        System.out.println("\"|    Fuel  total: $22.71    |\"");
        System.out.println("\"+---------------------------+\"");
    }
}
