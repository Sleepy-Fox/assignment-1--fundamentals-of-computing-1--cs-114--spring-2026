
import java.util.Scanner;

public class Assignment1Program1 {
  public static void main(String[] args) {

    Scanner scan = new Scanner (System.in) ;
    StringBuilder rev = new StringBuilder();

    String userInput;


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

    System.out.println("The reverse of the string is: " + userInput);



  }
}
