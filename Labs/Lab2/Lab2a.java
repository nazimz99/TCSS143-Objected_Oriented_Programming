/* 
   Program Name: Lab2a.java
   Programmer: Nazim Zerrouki
   Date: 1/10/18
*/

public class Lab2a {
   public static void main(String[] args) {
      double price = 20.00;
      double tip = 0.15;
      double total = calcTipAmount(price, tip);
      double total2 = calcTotalCost(total, price);
      display(total2);
   }

   public static double calcTipAmount(double price, double tip) {
      double tip_value = (tip * price);
      return tip_value;
   }
   
   public static double calcTotalCost(double tip_value, double price) {
      double total_cost = tip_value + price;
      return total_cost;
   }

   public static void display(double total_cost) {
      System.out.println("The total cost of the meal is" + " " + total_cost);
   }
}
   
   