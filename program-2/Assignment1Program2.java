import java.util.Scanner;
import java.lang.Math;
import java.text.DecimalFormat;

public class Assignment1Program2 {
  public static void main(String[] args) {

    int targetNumber;
    int targetBase;
    Scanner scan = new Scanner(System.in);
    DecimalFormat fourPlaces = new DecimalFormat("0000");



    System.out.print("Please enter a base (2-9): ");
    targetBase = scan.nextInt();

    double result = Math.pow(targetBase, 4);
    double largestNumber = result - 1;

    System.out.println("The maximum, 4-digit, base 10 number in base " + targetBase + " is " + largestNumber);
    System.out.print("Now, enter a base 10 number in the range 0 to " + largestNumber + " to convert: ");
    targetNumber = scan.nextInt();


    String result2 = Integer.toString(targetNumber, targetBase);

    System.out.println(targetNumber + "(base 10) = " + result2 + "(base " + targetBase + ")");

  }
}
