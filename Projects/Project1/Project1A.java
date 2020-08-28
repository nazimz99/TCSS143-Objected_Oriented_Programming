/* 
   Program Name: Project 1A
   Programmer: Nazim Zerrouki
   Date: 01/26/18
*/


public class Project1A {

   /* Method: To display the mirror by calling the methods. 
      Parameters: Size which is influenced by the programmer's input. */
   
   public static void main(String[] args) {
     drawWidth(4);
     drawInterior1(4);
     drawInterior2(4);
     drawWidth(4);
   }
   
   /* Method: To draw the top and bottom of the mirror using a nested for loop. */
   
   public static void drawWidth(int size) {
      for (int i = 1; i <= 2; i++) {         // For loop using variable i to iterate over two lines.
         System.out.print("#");
         for (int j = 1; j <= 4; j++) {      // Prints out the length of the top and bottom depending on the size paramter.
            for (int k = 1; k <= size; k++) {
               System.out.print("-");
            }
         } 
      System.out.print("#");
      System.out.println(); 
      }
   }
   
   /* Method: To create the top half of the mirror. */
   
   public static void drawInterior1(int size) { 
      for (int i = 1; i <= size; i++) {                     // Iterates over a certain number of lines depending on the size parameter.
         System.out.print("|");
         int spaces = ((4 * size) - (4 * (i - 1)) - 4) / 2; // Declares a variable that calculates the number of spaces in between the diamonds.
         for (int j = 1; j <= spaces; j++) {                // A nested for loop used to print out the number of spaces on the left side for each line depending on the value of the variable known as "spaces".
            System.out.print(" ");
         }
       System.out.print("<>");
         for (int j = 1; j < i; j++) {
            for (int k = 1; k <= 4; k++) {                  // A separate for nested loop used to print the number of dots depending on which line of the mirror that is being programmed.
              System.out.print(".");                        // The number of dots increments by 4 (represented by the variable k) each time the variable i is incremented.
            }   
         }
         System.out.print("<>");
         for (int j = 1; j <= spaces; j++) {
            System.out.print(" ");                          // A nested for loop used to print out the number of spaces on the left side for each line depending on the value of the variable known as "spaces".

      }
      System.out.print("|");
      System.out.println();
   }
}

   /* Method: To create the bottom half of the mirror. */
   
   public static void drawInterior2(int size) {
      for (int i = size; i >= 1; i--) {                     // Iterates over a certain number of lines depending on the size parameter.
         int spaces = ((4 * size) - (4 * (i - 1)) - 4) / 2; // Declares a variable that calculates the number of spaces in between the diamonds. 
         System.out.print("|");
         for (int j = spaces; j >= 1; j--) {                // A separate nested for loop used to print out the number of spaces on the left side of the diamonds.
            System.out.print(" ");                          // Because i is being decremented from "size" to 1, then the number of left spaces is incremented by two as j is decremented.
         }                                                  // The variable "spaces" is at its lowest when variable i is at its highest.
      System.out.print("<>");
         for (int j = 1; j < i; j++){
            for (int k = 1; k <= 4; k++) {                  // A separate nested for loop used to print out the number of dots depending on what the value of the variable i is.
               System.out.print(".");                       // The number of dots decrements by 4 each time the variable i is decremented.
            }
         }
         System.out.print("<>");
         for (int j = spaces; j >=1; j--) {
            System.out.print(" ");                          // A separate nested for loop used to print out the number of spaces on the left side of the diamonds.
         }
      System.out.print("|");
      System.out.println();
      }
   }

}
    

   