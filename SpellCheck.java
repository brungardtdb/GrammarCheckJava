/**************************************************************
SpellCheck.java
Author: David Brungardt

This application prompts the user to enter a sentence.
If the first letter is capitalized and the sentence has punctuation, the
application will read back the sentence.
If the sentence lacks a capitalized first letter, the application will
add one.
If the sentence lacks punctuation, the application will add a period
to the end.
****************************************************************/
import java.util.Scanner;

public class SpellCheck
{
  public static void main(String[] args)
  {
    Scanner in = new Scanner (System.in);

    String userSentence = ""; // This is the original sentence
    String correctedSentence = ""; // Sentence with grammatical corrections

    char ch = ' '; // Temp character holder

    //Get sentence from user
    System.out.println("Please enter a sentence: ");
    userSentence = in.nextLine();

    // Check sentence, correct any errors, and allow user to enter again
    do {
      // Get first character
      ch = userSentence.charAt(0);

      // Check to make sure first character is a capital letter
      if (!Character.isUpperCase(ch))
      {
        ch = Character.toUpperCase(ch);

        correctedSentence = Character.toString(ch);
      }
      else
      {
        correctedSentence = Character.toString(ch);
      }

      // add the rest of the characters to the sentence
      for (int i = 1; i < userSentence.length() ; i++)
      {
        correctedSentence = correctedSentence + userSentence.charAt(i);
      }

      // Check to make sure last character is a punctuation character
      ch = userSentence.charAt(userSentence.length() - 1);

      // If sentence lacks punctuation, add a period.
      if (ch != '.' && ch != '!' && ch != '?')
      {
        correctedSentence = correctedSentence + '.';
      }

      // Print correct sentence back to user
      System.out.println("\n" + correctedSentence);

      // Allow user to quit or enter another sentence to be corrected
      System.out.println("\nEnter another sentence (or press \'Q\' to quit: )");
      userSentence = in.nextLine();

      // Allow to user to continue until they decide to quit spellcheck
    } while (!userSentence.equalsIgnoreCase("Q"));
  } // End of main method
}
