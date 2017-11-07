import java.util.Scanner;

public class Calculator {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Please type a number and I will tell you if it is even: ");
    int userNum = input.nextInt();
    if(userNum%2==0){
      System.out.println("Your number is even!");
    }
    else{
      System.out.println("Your number is odd :(");
    }

    System.out.println("Please type another number and I will tell you if your first number is divisible by it: ");
    int userNum2 = input.nextInt();
    if(userNum%userNum2==0){
      System.out.println("It is divisible!");
    }
    else{
      System.out.println("It is not divisible :(");
    }


  }
  /**
  * returns true if a given number is even, false if it is not.
  **/
    public static boolean isEven (int n) {
      return (n%2==0);
    }

    /** Given two numbers, returns tre if the first is divisible by the second
    *@param num The number to be divided.
    *@param divisor The number to divide by.
    *@return True if num is divisible by divisor, false otherwise.
    **/
    public static boolean isDivisibleBy(int num, int divisor) {
      return(num%divisor==0);
    }

}
