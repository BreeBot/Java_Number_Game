import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
  public static final int NUMBER_CEILING = 10;
  public static int getRandom() {
    Random random = new Random();
    return random.nextInt(NUMBER_CEILING);
  }

  public static void main(String[] args) {
    int randomNum = getRandom();
    System.out.println(randomNum);

    // your code here
    //The user should be prompted to select a number from 0-9
    System.out.println("Gambler, enter a number between 0 and 9");
    Scanner scanner = new Scanner(System.in);
    String userInput = scanner.nextLine();
    int numConversion = Integer.parseInt(userInput);

    //If the user's input matches the random number generated,
    // tell them that they've won. Else, they've lost.
    if(randomNum == numConversion){
      System.out.println("You've won!");
    } else if (numConversion < 0 || numConversion>9){
      System.out.println("roll again!");

    } else {
      System.out.println("wanh, wanh, you've lost");

    }
  }
}
