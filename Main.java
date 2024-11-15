package mycustompackage;
import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner (System.in);
    boolean doProb1 = true;
    boolean doProb2 = false;
    boolean doProb3 = false;

    if (doProb1){
    //Problem 1
    System.out.println("Please enter a String: ");
    String theWord = sc.nextLine();
    int theCount = 0;
    theWord = theWord.toLowerCase();
    for (int i = 0; i < theWord.length()-1; i++)
    {
      if ((theWord.substring(i,i+1).equals("p")) && (((theWord.substring(i+1,i+2).equals("a")) ||(theWord.substring(i+1,i+2).equals("e")) ||(theWord.substring(i+1,i+2).equals("i")) ||(theWord.substring(i+1,i+2).equals("o")) ||(theWord.substring(i+1,i+2).equals("u")))))
      {
        theCount++;
      }
    }
    System.out.println("Contains p followed by a vowel " + theCount + " times.");
    }
    if (doProb2)
    {
    //Problem 2
    System.out.println("Please enter a String: ");
    String theWord2 = new String();
    theWord2 = sc.nextLine();
    theWord2 = theWord2.toLowerCase();
    String theWord3 = new String();
    for (int i = 0; i < theWord2.length(); i++)
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
    if (doProb3)
    {
      System.out.println("Please enter two strings: ");
      String theWord4 = new String();
      String theWord5 = new String();
      String theWord6 = new String();
      theWord4 = sc.nextLine();
      theWord5 = sc.nextLine();
      if (theWord4.length() == theWord5.length())
      {
        for (int i = theWord4.length()-1; i >= 0; i--)
        {
          theWord6 += theWord5.substring(i,i+1);
          theWord6 += theWord4.substring(i,i+1);
        }
      }
      else
      {
        System.out.println("error");
      }
      System.out.println(theWord6);
    }
  }
}
