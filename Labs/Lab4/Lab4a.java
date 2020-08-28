/*
   Programmer: Nazim Zerrouki
   Program: Lab4a.java
   Date: 1/24/18
*/

import java.io.*;
import java.util.*;

public class Lab4a {
   public static void main(String[] args) throws FileNotFoundException {
     File f = new File("DavidCopperfield.txt");
     Scanner ip = new Scanner(f);
     int wordCount = 0;
     int lineCount = 0;
     int[] count = count(wordCount, lineCount);
     output(count);
     
   }
      
   public static int[] count(int wordCount, int lineCount) throws FileNotFoundException {
      File f = new File("DavidCopperfield.txt");
      Scanner ip = new Scanner(f);
      Scanner ip2 = new Scanner(f);
      while (ip.hasNext()) {
         ip.next();
         wordCount++;
      }
      while (ip2.hasNextLine()) {
         ip2.nextLine();
         lineCount++;
      }
   //System.out.println("Total number of words: " + wordCount);
   //System.out.println("Total number of lines: " + lineCount);
   int[] array = {wordCount, lineCount};
   return array;
   }
   
   public static void output(int[] array) throws FileNotFoundException {
      File f = new File("DavidCopperfield.txt");
      int wordCount = array[0];
      int lineCount = array[1];
      System.out.println("Total number of words: " + wordCount);
      System.out.println("Total number of lines: " + lineCount);
      PrintStream output = new PrintStream(new File("Results.txt"));
      output.println("Enter the file name: " + f);
      output.println("Total number of words: " + wordCount);
      output.println("Total number of lines: " + lineCount);
   } 
}