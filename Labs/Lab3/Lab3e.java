/*
   Programmer: Nazim Zerrouki
   Date: 1/19/18  
   Program: Lab3e.java
*/

import java.util.*;

public class Lab3e {
   public static void main(String[] args) {
      int[][] array = getArrays();
      boolean result = magicSquare(array);
      System.out.println();
      if (result == true) {
         System.out.println("This is a magic square.");
      }
      else {
         System.out.println("This is not a magic square.");
      }
   }
   
   public static int[][] getArrays() {
      Scanner ip = new Scanner(System.in);
      int[][] array = new int[3][];
      array[0] = new int[3];
      array[1] = new int[3];
      array[2] = new int[3];
      System.out.println("Please enter 3 numbers from 1 to 9 for the first array:");
      for (int i = 0; i < 3; i++) {
         int num = ip.nextInt();
         if (num >= 1 && num <= 9) {
            array[0][i] = num;
         }
         else {
            System.out.println("Sorry, but you entered an incorrect value.");
            System.out.println();
            System.out.println("Please enter another number from 1 to 9 for the first array until 3 have been entered:");
            i--;
         }
      }
      System.out.println("Please enter 3 numbers from 1 to 9 for the second array:");
      for (int i = 0; i < 3; i++) {
         int num = ip.nextInt();
         if (num >= 1 && num <= 9) {
            array[1][i] = num;
         }
         else {
            System.out.println("Sorry, but you entered an incorrect value.");
            System.out.println();
            System.out.println("Please enter another number from 1 to 9 for the second array until three have been entered:");
            i--;
         }     
      }  
      System.out.println("Please enter another from 1 to 9 for the last array:");
      for (int i = 0; i < 3; i++) {
         int num = ip.nextInt();
         if (num >= 1 && num <= 9) {
            array[2][i] = num;
         }
         else {
            System.out.println("Sorry, but you entered an incorrect value.");
            System.out.println();
            System.out.println("Please enter another number from 1 to 9 for the last array until three have been entered:");
            i--;
         }     
      } 
   System.out.println(); 
   System.out.println(Arrays.toString(array[0]));
   System.out.println(Arrays.toString(array[1]));
   System.out.println(Arrays.toString(array[2])); 
   return array; 
   }
   
   public static boolean magicSquare(int[][] array) {
   
      int rowSum1 = 0;
      int rowSum2 = 0;
      int rowSum3 = 0;
      int colSum1 = 0;
      int colSum2 = 0;
      int colSum3 = 0;
      int diagSum1 = 0;
      int diagSum2 = 0;
      int count = 0;
      while (count < 3) {
         rowSum1 += array[0][count];
         rowSum2 += array[1][count];
         rowSum3 += array[2][count];
         colSum1 += array[count][0];
         colSum2 += array[count][1];
         colSum3 += array[count][2];
         count++;
      }
      int i = 0;
      while (i < 3) {
         diagSum1 += array[i][i];
         diagSum2 += array[i][2-i];
         i++;   
      }  
       
      if (rowSum1 == rowSum2 && rowSum1 == rowSum3 && rowSum1 == colSum1 && rowSum1 == colSum2 && rowSum1 == colSum3 && rowSum1 == diagSum1 && rowSum1 == diagSum2) {
         return true;
      }
      return false;
   }
   
}
   