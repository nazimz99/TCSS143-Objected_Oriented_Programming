/*
   Programmer Name: Nazim Zerrouki
   Date: 1/17/18
   Program: Lab3c.java
*/

import java.util.*;

public class Lab3c {
   public static void main(String [] args) {
      int[] Array = getArray();
      countEvenOdds(Array);
   }
   
   public static int[] getArray() {
      int[] array = new int[15];
      for (int i = 0; i < array.length; i++) {
         Random r = new Random();
         int num = r.nextInt(20) + 1;
         array[i] = num;
      }
      //System.out.println(Arrays.toString(array));
      return array;
   }
   
   public static void countEvenOdds(int[] array) {
      int evens = 0;
      int odds = 0;
      for (int i = 0; i < array.length; i++) {
         System.out.print(array[i] + " ");
         if (array[i] % 2 == 0) {
            evens++;
         }
         else {
            odds++;
         }   
      }
      System.out.println();
      System.out.println("Even Count:" + " " + evens);
      System.out.println("Odd Count:" + " " + odds);
      
   }
   
}