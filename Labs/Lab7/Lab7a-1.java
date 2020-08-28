/*
   Programmer: Nazim Zerrouki
   Program: Lab7a.java
   Date: 2/21/18
*/


import java.util.*;
import java.io.*;

public class Lab7a {
   public static void main(String[] args) throws FileNotFoundException {
      File f = new File("us-500.csv");
      Scanner ip = new Scanner(f);
      HashSet<Integer> set = new HashSet<Integer>();
      String line = "";
      while (ip.hasNextLine()) {
         line = ip.nextLine();
         String[] lineArr = line.split(",");
         String str = lineArr[7];
         int num = Integer.parseInt(str);
         set.add(num);
      }
      System.out.println(oddSet(set));
      System.out.println(evenSet(set));
      String choice = userMenu();
      HashSet<Integer> set2 = new HashSet<Integer>();
      if (choice.equalsIgnoreCase("a")) {
         set2 = evenSet(set);
      }
      if (choice.equalsIgnoreCase("b")) {
         set2 = oddSet(set);
      }
      minMax(set2);
   }
   
   public static HashSet<Integer> oddSet(HashSet<Integer> set) {
      HashSet<Integer> odds = new HashSet<Integer>();
      for (int n : set) {
         if (n % 2 == 1) {
            odds.add(n);
         }
      }
      return odds;
   }
   
   public static HashSet<Integer> evenSet(HashSet<Integer> set) {
      HashSet<Integer> evens = new HashSet<Integer>();
      for (int n : set) {
         if (n % 2 == 0) {
            evens.add(n);
         }
      }
      return evens;
   }
   
   public static String userMenu() {
      Scanner ip = new Scanner(System.in);
      System.out.println("Choose the following options: ");
      System.out.println("a.	Display minimum and maximum value assigned as an even zipcode \nb. Display minimum and maximum value assigned as a odd zipcode");
      String choice = ip.next();
      return (String) choice;

      /* Integer oddMax = 0;
      Integer evenMax = 0;
      for (int n : set) {
         if (n % 2 == 0) {
            if (evenMax < n) {
               evenMax = n;
            }
         }
         if (n % 2 == 1) {
            if (oddMax < n) {
               oddMax = n;
            }
         }  
      }
      Integer oddMin = oddMax;
      Integer evenMin = evenMax;
      for (int n : set) {
         if (n % 2 == 0) {
            if (evenMin > n) {
               evenMin = n;
            }
         }
         if (n % 2 == 1) {
            if (oddMin > n) {
               oddMin = n;
            }
         }
      }
      System.out.println("The maximum even value is " + evenMax);
      System.out.println("The maximum odd value is " + oddMax);
      System.out.println("The minimum even value is " + evenMin);
      System.out.println("The minimum odd value is " + oddMin); */
   } 
   
   public static void minMax(HashSet<Integer> set) {
      int max = 0;
      for (int n : set) {
         if (max < n) {
            max = n;
         }
      }
      int min = max;
      for (int n : set) {
         if (min > n) {
            min = n;
         }
      }
      System.out.println("The maximum value is " + max);
      System.out.println("The minimum value is " + min);  
   }

}