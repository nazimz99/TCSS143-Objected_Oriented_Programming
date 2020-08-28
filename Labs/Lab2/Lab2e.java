/* 
   Program Name: Lab2e.java
   Programmer: Nazim Zerrouki
   Date: 1/13/18
*/

import java.util.Scanner;

public class Lab2e {
   public static void main(String[] args) {
      double weight = getWeight();
      double cost = getCost(weight);
      display(cost);   
   }

   public static double getWeight() {
      Scanner ip = new Scanner(System.in);
      System.out.println("Please enter the weight of the package:");
      double weight = ip.nextDouble();
      return weight;
   }
   
   public static double getCost(double weight) {
      double cost = 0;
      if (weight < 5) { 
         cost = 3;
      }
      else if (weight > 5 && weight < 10) {
         cost = 3 + (.25 * (weight - 5));
      }
      else if (weight > 10 && weight < 15) {
         cost = 5.50 + (.20 * (weight - 10));
      }
      else if (weight > 15) {
         cost = 8.50 + (.10 * (weight - 15));
      }
      cost = cost * 100;
      cost = (int)cost;
      cost = (double)cost / 100;
      return cost;
   }
   
   public static void display(double cost) {
      System.out.println("The price of your package is" + " " + "$" + cost);
   }
                 
}

