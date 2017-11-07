import java.util.Scanner;

public class TextGame {

  public static void main(String[] args) {
    int magicNumber = 42;
    int guess = 0;

System.out.println();
System.out.println("Welcome to the Magic Number Game!");
System.out.println();

    while (guess != magicNumber){


      guess = readInt("Take a guess ");
      if(guess != magicNumber){
        System.out.println("Nope that's not correct :(");
        if(guess - magicNumber <= Math.abs(10)){
          System.out.println("You're very close!");
          System.out.println();
        }
      }
    }
    System.out.println();
    System.out.println("Hurrah! You got the Magic Number!");
  }

  public static int readInt(String prompt) {
    Scanner input = new Scanner(System.in);
    System.out.println(prompt);
    int guess = input.nextInt();
    input.nextLine();
    return guess;
  }

  public static String goToNextLine (String n) {
    return " ";
  }
}
