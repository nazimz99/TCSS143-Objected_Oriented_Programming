/* 
   Program Name: Project1B
   Programmer: Nazim Zerrouki
   Date: 01/26/18
*/

import java.util.*;

public class Project1B {
   public static void main(String[] args) {
      int exemptions = getExemptions();
      double salary = getSalary();
      double interest = getInterest();
      double capital = getCapital();
      double charity = getCharity();
      double total = getTotalIncome(interest, capital, salary);
      double adjust = getAdjustedIncome(total, exemptions, charity);
      double tax = getTotalTax(adjust);
      display(exemptions, salary, interest, capital, charity, total, adjust, tax);
   
   }
   
   /* Method: To compute the number of tax exemptions based on user input. */
   
   public static int getExemptions() {
      Scanner ip = new Scanner(System.in); // Declares a scanner.
      System.out.println("Please enter the number of tax exemptions:");
      int exempt = ip.nextInt();          // Sets an integer that stores the user's input as "exempt".          
      return exempt;                      // Returns the integer to be used later.
   }
   
   /* Method: To compute the Gross Salary based on user input. */
   
   public static double getSalary() {
      Scanner ip = new Scanner(System.in); // Declares a scanner.
      System.out.println("Please enter your gross salary:");
      double salary = ip.nextDouble();    // Sets a double value that stores the user's input as "salary".
      return salary;                      // Returns the double value to be used later.
   }
   
   /*Method: To compute the interest income based on user input. */
   
   public static double getInterest() {
      Scanner ip = new Scanner(System.in); // Declares a scanner.
      System.out.println("Please enter your interest income:");
      double interest = ip.nextDouble();   // Sets a double value that stores the user's input as "interest".
      return interest;                     // Returns the double value to be used later.
   }
   
   /*Method: To compute the capital income based on user input. */
   
   public static double getCapital() {
      Scanner ip = new Scanner(System.in);   // Declares a scanner.
      System.out.println("Please enter your capital income:");
      double capital = ip.nextDouble();      // Sets a double value that stores the user's input as "capital".
      return capital;                        // Returns the double value to be used later.
   }
   
   /* Method: To compute the income gained from charitable contributions based on user input. */
   
   public static double getCharity() {
      Scanner ip = new Scanner(System.in);   // Declares a scanner.
      System.out.println("Please enter the amount of charitable contributions:");
      double charity = ip.nextDouble();      // Sets a double value that stores the user's input as "charity".
      return charity;                        // Returns the double value to be used later.
   }
   
   /* Method: To compute the total income by calling the three methods that returns the interest, capital, and salary. */
      
   public static double getTotalIncome(double interest, double capital, double salary) {
      double total = interest + capital + salary;     
      return total;     // Returns the double value to be called by the next method.
   }
   
   /* Method: To compute the adjusted income by calling the three methods that returns the total, exempt, and charity. */
   
   public static double getAdjustedIncome(double total, int exempt, double charity) {
      double adjust = total - (exempt * 1500.00) - charity;
      return adjust;    // Returns the double value to be called by the next method.
   }
   
   /* Method: To compute the total tax paid by calling the method that returns the adjusted income depending on its value. */
   
   public static double getTotalTax(double adjust) {
      double tax = 0;
      if (adjust > 0 && adjust < 10000) {          // Defaults tax to zero if the adjusted income is less than 10000.
         tax = 0; 
      }
      else if (adjust > 10000 && adjust < 32000) {
         tax = 0.15 * (adjust - 10000);           // Tax is computed in this manner if the adjusted income is in between 10000 and 32000.
      }
      else if (adjust > 32000 && adjust < 50000) {
         tax = 0.23 * (adjust - 32000) + (0.15 * 22000);  // Tax is computed in this manner if the adjusted income is in between 32000 and 50000.
      }
      else if (adjust > 50000) {
         tax = 0.28 * (adjust - 50000) + (0.23 * 18000) + (0.15 * 22000);  // Tax is computed in this manner if the adjusted income is above 50000.
      }
      tax = tax * 100;
      tax = (int)tax;
      tax = tax / 100;
      tax = (double)tax;
      return tax;    // Converts the double value to a double value with only two decimal places and returns the double value to be displayed later.
   }
   
   /* Method: Calls all methods to display all of the user's information. */
   
   
   public static void display(int exempt, double salary, double interest, double capital, double charity, double total, double adjust, double tax) {
      System.out.println("Number of Exemptions: " + exempt);
      System.out.println("Gross Salary: $" + salary);
      System.out.println("Interest Income: $" + interest);
      System.out.println("Capital Gains: $" + capital);
      System.out.println("Charitable Contributions: $" + charity);
      System.out.println("Total Income: $" + total);
      System.out.println("Adjusted Income: $" + adjust);
      System.out.println("Total Tax: $" + tax);
   }
   
}