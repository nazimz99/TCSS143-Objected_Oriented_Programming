/*
   Programmer: Nazim Zerrouki
   Program: Lab4a.java
   Date: 1/24/18
*/

import java.io.*;
import java.util.*;

public class Lab4b {
   public static void main(String[] args) throws FileNotFoundException {
      File f = new File("population.txt");
      Scanner ip = new Scanner(f);
      popularity();
   }
   
   public static void popularity() throws FileNotFoundException {
      File f = new File("population.txt");
      Scanner ip = new Scanner(f);
      Scanner input = new Scanner(System.in);
      System.out.println("Please enter a name in the file:");
      String name = input.next();
      int popularity = 0;
      int year = 1900;
      boolean found = false;
      while (ip.hasNext()) {
         String Name = ip.next();
         if (name.equalsIgnoreCase(Name)) {
            found = true;
            System.out.println();
            System.out.println(name + ": ");
            System.out.println();
            while (ip.hasNextInt()) {
               popularity = ip.nextInt();
               System.out.println(year + ": " + popularity);
               year += 10;
            }
            break;
         }
      }
      if (!found) {
         System.out.println(name + " was not found in the file.");
      }

  }  

}