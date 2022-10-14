package week3;
import java.util.Scanner; // import the Scanner class

public class Ex50 {
    Scanner myObj = new Scanner(System.in);
    String userName;

    // Enter username and press Enter
    System.out.println("Enter username");
    userName = myObj.nextLine();

    System.out.println("Username is: " + userName);
    /*
    word = myObj.nextLine();

    char character1 = word.charAt(0);
    char character2 = word.charAt(1);
    char character3 = word.charAt(2);

    System.out.println( character1);
    System.out.println( character2);
    System.out.println( character3);

     */
}
