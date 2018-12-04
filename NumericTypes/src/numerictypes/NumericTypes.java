package numerictypes;

import java.util.Scanner; // Needed for the Scanner class.

/**
   This program demonstrates how numeric types and
   operators behave in Java.
*/

public class NumericTypes
{
   public static void main (String [] args)
   {
      // Create a Scanner object to read input.
       Scanner keyboard = new Scanner(System.in);

      // Identifier declarations
      final int NUMBER = (int) 2.0 ;        // Number of scores
      final int SCORE1 = (int) 100.0;       // First test score
      final int SCORE2 = (int) 95.0;        // Second test score
      final int BOILING_IN_F = (int) 212.0; // Boiling temperature
      int fToC;                     // Temperature Celsius
      double average;               // Arithmetic average
      String output;                // Line of output
      double sum;                   // The sum of the scores

      // TASK #2 Identifier declarations
      String firstName; // To hold the user's first name
      String lastName; // To hold the user's last name
      String fullName; // The user's full name
      
      // TASK #3 Identifier declarations
      String firstInitial; // To hold the user's first initial
      
      // TASK #4 Identifier declarations
      double diameter; // The diameter entered
      double radius; // The radius of the sphere
      double Volume; // The volume of a shpere

      // Find an arithmetic average.
      sum = SCORE1 + SCORE2;
      average = sum/NUMBER;
      output = SCORE1 + " and " + SCORE2 +
               " have an average of " + average;
      System.out.println(output);

      // Convert Fahrenheit temperature to Celsius.
      fToC = (int) ((BOILING_IN_F - 32.0) * (5.0/9.0));
      output = BOILING_IN_F + " in Fahrenheit is " +
               fToC + " in Celsius.";
      System.out.println(output);
      System.out.println();      // To leave a blank line

      // Asking the user for their name
      System.out.print("What is your first name?  ");
      firstName = keyboard.nextLine();
      System.out.print("What is your last name?  ");
      lastName = keyboard.nextLine();
      fullName = firstName + lastName;
      System.out.println("Your name is " + firstName + " " + lastName + ".");
      
      // Playing with the user's name
      firstInitial = firstName;
      char letter = firstInitial.charAt(0);
      String upper = fullName.toUpperCase();
      int stringSize = fullName.length();
      
      System.out.println(letter + " is your first initial.");
      System.out.println(upper);
      System.out.println("You have " + stringSize + " characters in your name.");

      // We're figuring out a sphere
      System.out.print("Enter diameter ");
      diameter = keyboard.nextDouble();
      radius = 0.5 * diameter;
      Volume = (4.0/3.0) * Math.PI * (radius * radius * radius);
      System.out.println("The volume of your sphere is " + Volume);
   }
}