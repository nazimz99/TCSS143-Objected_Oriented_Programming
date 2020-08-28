/*
   Programmer: Nazim Zerrouki
   Date: 1/18/18  
   Program: Lab3d.java
*/

import java.util.*;

public class Lab3d {
   public static void main(String[] args) {
      Scanner ip = new Scanner(System.in);
      int[] listID = new int[10];
      int[] listSales = new int[10];
      System.out.println("Enter the ID of each employee:");
      for (int i = 0; i < listID.length; i++) {
         int ID = ip.nextInt();
         listID[i] = ID;
      }
      System.out.println("Enter the sales of each employee:");
      for (int i = 0; i < listSales.length; i++) {
         int sale = ip.nextInt();
         listSales[i] = sale;
      }
      System.out.println("ID" + "\t" + "Sales");
      System.out.println();
      for (int i = 0; i < listID.length; i++) {
         System.out.println(listID[i] + "\t" + "\t" + "$" + listSales[i]);
      }
      highestSales(listID, listSales);
      lowestSales(listID, listSales);
      int avg = averageSales(listSales);
      System.out.println("The employee IDs with sales below the average are:");
      System.out.println();
      for (int i = 0; i < listID.length; i++) {
         if (listSales[i] < avg) {
            System.out.println(listID[i]);
         }
      }
      System.out.println();
      System.out.println("The employee IDs with sales above the average are:");
      System.out.println();
       for (int i = 0; i < listID.length; i++) {
         if (listSales[i] > avg) {
            System.out.println(listID[i]);
         }
      }
      System.out.println();
      searchID(listID, listSales); 
   } 
   
   public static void highestSales(int[] listID, int[] listSales) {
      int max = 0;
      int index = 0;
      for (int i = 0; i < listID.length; i++) {
         if (max < listSales[i]) {
            index = i;
            max = listSales[index]; 
         }
      }
      System.out.println();
      System.out.println("Employee with ID number" + " " + listID[index] + " " + "had the highest sales figure" + " " + "$" + max);
      
   }
   
   public static void lowestSales(int[] listID, int[] listSales) {
      int min = listSales[0];
      int index = 0;
      for (int i = 0; i < listID.length; i++) {
         if (min > listSales[i]) { 
            index = i;
            min = listSales[index];
         }
      }
      System.out.println("Employee with ID number" + " " + listID[index] + " " + "had the lowest sales figure" + " " + "$" + min);
   }
   
   public static int averageSales(int[] listSales) {
      int total = 0;
      for (int i = 0; i < listSales.length; i++) {
         total += listSales[i];
      }
      int avg = total / listSales.length;
      System.out.println("The average sales record is" + " " + "$" + avg);
      System.out.println();
      return avg;
   }
   
   public static void searchID(int[] listID, int[] listSales) {
      Scanner ip = new Scanner(System.in);
      System.out.println("Please enter the target ID:");
      int targetID = ip.nextInt();
      int index = 0;
      for (int i = 0; i < listID.length; i++) {
         if (listID[i] == targetID) {
            index = i;
            System.out.println("The target ID is" + " " + listID[index] + " " + "with the sales number" + " " + "$" + listSales[index]);
         }
      }
      while (listID[index] != targetID) {
         System.out.println("The ID you entered was not found.");
         System.out.println("Please enter the target ID:");
         index = 0;
         targetID = ip.nextInt();
         for (int i = 0; i < listID.length; i++) {
            if (listID[i] == targetID) {
               index = i;
               System.out.println("The target ID is" + " " + listID[index] + " " + "with the sales number" + " " + "$" + listSales[index]);
            }
         }
      }
   }

}
