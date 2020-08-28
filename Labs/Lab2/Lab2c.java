/* 
   Program Name: Lab2c.java
   Programmer: Nazim Zerrouki
   Date: 1/11/18
*/

import java.util.Scanner;

public class Lab2c {
   public static void main(String[] args) {
      findHighest(getSales());
     
   }
   
   public static double[] getSales() {
      Scanner ip = new Scanner(System.in);
      System.out.println("Enter the sales figure for the Northeast division:");
      double sales1 = ip.nextDouble();
      System.out.println("Enter the sales figure for the Southeast division:");
      double sales2 = ip.nextDouble();
      System.out.println("Enter the sales figure for the Northwest division:");
      double sales3 = ip.nextDouble();
      System.out.println("Enter the sales figure for the Southwest division:");
      double sales4 = ip.nextDouble();
      while (sales1 < 0 || sales2 < 0 || sales3 < 0 || sales4 < 0){ 
         System.out.println("Invalid input. Please enter a positive sales value.");
         System.out.println();
         System.out.println("Enter the sales figure for the Northeast division:");
         sales1 = ip.nextDouble();
         System.out.println("Enter the sales figure for the Southeast division:");
         sales2 = ip.nextDouble();
         System.out.println("Enter the sales figure for the Northwest division:");
         sales3 = ip.nextDouble();
         System.out.println("Enter the sales figure for the Southwest division:");
         sales4 = ip.nextDouble();

      }
      double[] sales = {sales1, sales2, sales3, sales4};
      return sales;
      
   }
      
   public static void findHighest(double[] sales) {
      double maxSale = 0;
      for (int i = 0; i < sales.length ; i++) {
         if (maxSale < sales[i]) {
            maxSale = sales[i];
         }
      }
      if (maxSale == sales[0]) {
         System.out.println("The highest sales value is:" + " " + maxSale + " " + "from the Northeast division.");
         }
      if (maxSale == sales[1]) {
         System.out.println("The highest sales value is:" + " " + maxSale + " " + "from the Southeast division.");
         }
      if (maxSale == sales[2]) {
         System.out.println("The highest sales value is:" + " " + maxSale + " " + "from the Northwest division.");
         }
      if (maxSale == sales[3]) {
         System.out.println("The highest sales value is:" + " " + maxSale + " " + "from the Southwest division.");
         }
      }

   }
