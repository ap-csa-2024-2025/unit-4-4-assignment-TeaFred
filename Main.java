package mycustompackage;
import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    //Problem 1
    Scanner sc = new Scanner (System.in);
    System.out.println("Please enter a String: ");
    String theWord = sc.nextLine();
    int theCount = 0;
    theWord = theWord.toLowerCase();
    for (int i = 0; i < theWord.length(); i++)
    {
      if ((theWord.substring(i,i+1).equals("p")) && (((theWord.substring(i+1,i+2).equals("a")) ||(theWord.substring(i+1,i+2).equals("e")) ||(theWord.substring(i+1,i+2).equals("i")) ||(theWord.substring(i+1,i+2).equals("o")) ||(theWord.substring(i+1,i+2).equals("u")))))
      {
        theCount++;
      }
    }
    System.out.println("Contains p followed by a vowel " + theCount + " times.");
    //Problem 2
    System.out.println("Please enter a String: ");
    String theWord2 = new String();
    theWord2 = sc.nextLine();
    theWord2 = theWord2.toLowerCase();
    String theWord3 = new String();
    for (int i = 0; i < theWord.length(); i++)
    {
      if (!(theWord2.substring(i, i+1).equals("e")) && !(theWord2.substring(i, i+1).equals("t")) 
      && !(theWord2.substring(i, i+1).equals("a")) 
      && !(theWord2.substring(i, i+1).equals("i")) 
      && !(theWord2.substring(i, i+1).equals("o")))
      {
        theWord3 += theWord2.substring(i, i+1);
      }
    }
    System.out.println(theWord3);
  }

  public static boolean isPrime(int N)
  {
    // TODO: Replace and write your code below
    return false;
  }
}
