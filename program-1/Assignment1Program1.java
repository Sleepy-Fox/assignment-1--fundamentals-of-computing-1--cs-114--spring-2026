
import java.util.Scanner;
import java.util.Random;

public class Assignment1Program1 {
  public static void main(String[] args) {

    Scanner scan = new Scanner (System.in) ;
    StringBuilder rev = new StringBuilder();

    Random randomGenerator = new Random();

    String userInput;
    int userFahrenheit;
    int Celsius;
    int randomNum;


    System.out.println("KK        KK      WW                              WW");
    System.out.println("KK      KK        WW              WW              WW");
    System.out.println("KK    KK          WW            WW  WW            WW");
    System.out.println("KK  KK            WW          WW      WW          WW");
    System.out.println("KK    KK          WW        WW          WW        WW");
    System.out.println("KK      KK        WW      WW              WW      WW");
    System.out.println("KK        KK      WW    WW                  WW    WW");
    System.out.println("KK          KK    WW  WW                      WW  WW");
    System.out.println("KK           KK   WW                              WW");

    System.out.println("Enter a five character string:");
    userInput = scan.nextLine();
    userInput = rev.append(userInput).reverse().toString();
    userInput = userInput.substring(1, 4);

    System.out.println("Enter a Fahrenheit temperature:");
    userFahrenheit = scan.nextInt();
    Celsius = (userFahrenheit - 32) * 5 / 9;

    randomNum = randomGenerator.nextInt(16384 - 32 + 1) + 32;

    System.out.println("Your new string is " + Celsius + userInput + randomNum);



  }
}
