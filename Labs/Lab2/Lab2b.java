/* 
   Program Name: Lab2b.java
   Programmer: Nazim Zerrouki
   Date: 1/10/18
*/

public class Lab2b {
   public static void main(String[] args) {
      double investment = 1000.00;
      double deposit = 100.00;
      double interest = 1.065;
      double initial = calcInitialBalance(investment, interest);
      double investments = calcNextBalance(initial, interest, deposit);
      double total = calcTotalBalance(initial, investments);
      display(total);
      
   }
      
   public static double calcInitialBalance(double investment, double interest) {
      double value = investment * interest;
      System.out.println("year:" + " " + "1" + "\t" + "current balance:" + " " + investment + "\t" + "deposit:" + " " + "0" + "\t" +  "interest:" + " " + "6.5%" + "\t" + "new balance:" + " " + value);
      System.out.println();
      return value;
   }
   
   public static double calcNextBalance(double value, double interest, double deposit) {
      double amount = value;
      double val = value;
      for (int years = 2; years <= 25; years++) {
         amount += deposit;
         amount *= interest;
         System.out.println("year:" + " " + years  + "\t" + "current balance:" + " " + val + "\t" + "deposit:" + " " + deposit + "\t" + "interest:" + " " + "6.5%" + "\t" + "new balance:" + " " + amount );
         System.out.println();
         val += deposit;
         val *= interest; 
         }
      return amount;
   }     
   

   public static double calcTotalBalance(double value, double amount) {
      double balance = value + amount;
      return balance;
   }
     
   public static void display (double balance) {
      System.out.println("The total balance in your savings account is" + " " + balance);
   
   }
}