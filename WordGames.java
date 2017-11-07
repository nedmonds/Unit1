import java.util.Scanner;

class WordGames {

  public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

    System.out.println();

    System.out.println("Hello and welcome to Noah's word games (kinda)");

    System.out.println("Press Enter to Start");
    String enter = input.nextLine();
    String goToNextLine = goToNextLine(enter);
    System.out.println(goToNextLine);

        System.out.println();

    System.out.print("Tell me your name: ");
    String name = input.nextLine();
    String insultedName = insult(name);
    System.out.println(insultedName);

    System.out.println();

    System.out.print("Give me a first word: ");
    String first = input.nextLine();
    System.out.print("Give me a second word: ");
    String second = input.nextLine();
    System.out.println();
    System.out.println(makeAbba(first,second));

        System.out.println();

    System.out.println("Give me your first name: ");
    String firstName = input.nextLine();
    System.out.println();
    String enlightenedName = enlightened(name);
    System.out.println(enlightenedName);

        System.out.println();

    System.out.println("Give me the name of your first pet: ");
    String petName = input.nextLine();
    System.out.println();
    String fakeNicePetName = fakeNice(petName);
    System.out.println(fakeNicePetName);

        System.out.println();

    System.out.println("What's the name of your highschool?: ");
    String highschool = input.nextLine();
    System.out.println();
    String slanderedHighschool = slandered(highschool);
    System.out.println(slanderedHighschool);

        System.out.println();

    System.out.println("What kind of car do you have?: ");
    String car = input.nextLine();
    System.out.println();
    String rudeCar = rude(car);
    System.out.println(rudeCar);

        System.out.println();

    System.out.println("Which college are you planning to attend?: ");
    String college = input.nextLine();
    System.out.println();
    String elitistCollege = elitist(college);
    System.out.println(elitistCollege);

        System.out.println();

    System.out.println("What's your favorite sport?");
    String sport = input.nextLine();
    System.out.println();
    String meanToSport = meanTo(sport);
    System.out.println(meanToSport);

        System.out.println();

    System.out.println("What's your favorite OS?: ");
    String OS = input.nextLine();
    System.out.println();
    String neutralOS = neutral(OS);
    System.out.println(neutralOS);

        System.out.println();

    System.out.println("What's your favorite color");
    String color = input.nextLine();
    System.out.println();
    String complimentColor = compliment(color);
    System.out.println(complimentColor);

        System.out.println();

    System.out.println("Ok that's the end :)");
    System.out.println();
    
  }

  public static String insult(String n){
    return n + " You slimy weasel";
  }
  public static String makeAbba(String a, String b){
  return  a + b + b + a;
  }

  public static String enlightened(String n){
    return "Saint " + n;
  }

  public static String fakeNice(String n){
    return n  + " Is such a good name!";
  }

  public static String slandered(String n){
    return "Haha " + n + " is the worst highschool";
  }

  public static String rude(String n){
    return "Lol " + n + "'s suck so much";
  }

  public static String elitist(String n) {
    if(n.equals("Harvard") || (n.equals("Harvard University") || (n.equals("harvard") || (n.equals("harvard university"))))) {
      return "Nice, you might do something with your life";
    }
    else{
      return "Harvard is better you suck";
    }
  }

  public static String meanTo(String n) {
    if(n.equals("Basketball") || (n.equals("basketball"))) {
      return "Good Choice";
  }
    else{
      return "Hmm... I think Basketball is better";
    }
  }

  public static String neutral (String n) {
    return "I agree, " + n + " is nice";
  }

  public static String compliment (String n) {
    return "Ooo I like " + n + " too!";
  }

  public static String goToNextLine (String n) {
    return " ";
  }

}
