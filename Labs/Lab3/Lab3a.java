/*
   Programmer Name: Nazim Zerrouki
   Date: 1/17/18
   Program: Lab3a.java
*/

import java.util.*;

public class Lab3a {
   public static void main(String [] args) {
      int random = randomNumber();
      int guess = userGuess(random);
      lowHigh(random, guess);
      
   }
   
   public static int randomNumber() {
      Random r = new Random();
      int num = r.nextInt(100);
      return num;
   }
   
   public static int userGuess(int num) {
      Scanner ip = new Scanner(System.in);
      System.out.println("Please guess the random number:");
      int guess = ip.nextInt();
      return guess;
   }
   
   public static void lowHigh(int num, int guess) {
      Scanner ip = new Scanner(System.in);
      int count = 0;
      while (guess != num) {
         if (guess < num) {
            count++;
            System.out.println("Your guess is under the random number.");
            System.out.println();
            System.out.println("Please guess the random number:");
            guess = ip.nextInt();
         }
         else if (guess > num) {
            count++;
            System.out.println("Your guess is above the random number.");
            System.out.println();
            System.out.println("Please guess the random number:");
            guess = ip.nextInt();
         }
      }
     count++;
     System.out.println("The number of attempts:" + " " + count);
   }
}