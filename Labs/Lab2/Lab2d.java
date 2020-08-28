/* 
   Program Name: Lab2d.java
   Programmer: Nazim Zerrouki
   Date: 1/12/18
*/

import java.util.Scanner;

public class Lab2d {
   public static void main(String[] args) {
      double price = getPrice();
      double[] tender = getTender(price);
      double change = getChange(tender);
      splitChange(change);
   
   }
   
   public static double getPrice() {
      Scanner ip = new Scanner(System.in);
      System.out.println("Please enter the price of the item bought:");
      double price = ip.nextDouble();
      return price;
   }
   
   public static double[] getTender(double price) {
      double i = 0;
      double remain = price;
      Scanner ip = new Scanner(System.in);
      System.out.println("Please enter the amount of cash tendered:");
      double tender = ip.nextDouble();
      while (tender < remain) {
         remain = remain - tender;
         remain = remain * 100;
         remain = (int)remain;
         remain = (double)remain / 100;
         i += 1;
         System.out.println("The remaining price is" + " " + remain);
         System.out.println("Please enter the amount of cash tendered:");
         tender = ip.nextDouble();
      }
      double[] list = {i, price, tender, remain};
      return list;
   }
   
   public static double getChange(double[] list) {
      double i = list[0];
      double price = list[1];
      double tender = list[2];
      double remain = list[3];
      double change = 0;
      if (i == 0) {
         change = tender - price;
         change = change * 100;
         change = (int)change;
         change = (double)change / 100;
      }
      if (i > 0) {
         change = tender - remain;
         change = change * 100;
         change = (int)change;
         change = (double)change / 100;
      }      
      System.out.println("The change due is:" + " " + change);
      return change;
   }
   
   public static void splitChange(double change) {
      double cents = change * 100;
      int dollars = (int)change;
      int quarters = (int)cents % 100 / 25;
      int dimes = (int)cents % 100 % 25 / 10;
      int nickels = (int)cents % 100 % 25 % 10 / 5;
      int pennies = (int)cents % 100 % 25 % 10 % 5;
      if (dollars == 1) { 
         System.out.println("This is" + " " + dollars + " " + "dollar," + " " + quarters + " " + "quarters," + " " + dimes + " " + "dimes," + " " + nickels + " " + "nickels, and" + " " + pennies + " " + "pennies.");
      }
      if (quarters == 1) {
         System.out.println("This is" + " " + dollars + " " + "dollars," + " " + quarters + " " + "quarter," + " " + dimes + " " + "dimes," + " " + nickels + " " + "nickels, and" + " " + pennies + " " + "pennies.");
      }
      if (dimes == 1) {
          System.out.println("This is" + " " + dollars + " " + "dollars," + " " + quarters + " " + "quarters," + " " + dimes + " " + "dime," + " " + nickels + " " + "nickels, and" + " " + pennies + " " + "pennies.");
      }
      if (nickels == 1) {
          System.out.println("This is" + " " + dollars + " " + "dollars," + " " + quarters + " " + "quarters," + " " + dimes + " " + "dimes," + " " + nickels + " " + "nickel, and" + " " + pennies + " " + "pennies.");
      }
      if (pennies == 1) {
         System.out.println("This is" + " " + dollars + " " + "dollars," + " " + quarters + " " + "quarters," + " " + dimes + " " + "dimes," + " " + nickels + " " + "nickels, and" + " " + pennies + " " + "penny.");
      }
   }
}
