/*
   Programmer Name: Nazim Zerrouki
   Date: 1/17/18
   Program: Lab3b.java
*/

import java.util.*;

public class Lab3b {
   public static void main(String [] args) {
      Scanner ip = new Scanner(System.in);
      String repeat = "y";    
      while (repeat.equalsIgnoreCase("y")) {
         String[] Name = getName();
         double[] Exams = getExams();
         String LetterGrade = getLetterGrade(Exams);
         System.out.println("FirstName" + "\t" + "LastName" + "\t" + "LetterGrade");
         System.out.println();
         display(Name, Exams, LetterGrade);
         System.out.println("Would you like to repeat this program? Say y for yes and n for no:");
         repeat = ip.next();
      }
   }
   
   public static String[] getName() {
      Scanner ip = new Scanner(System.in);
      System.out.println("Please enter the student's first name:");
      String first = ip.next();
      System.out.println("Please enter the student's last name:");
      String last = ip.next();
      String[] name = {first, last};
      return name;
   }
   
   public static double[] getExams() {
      Scanner ip = new Scanner(System.in);
      System.out.println("Please enter the student's first exam score:");
      double exam1 = ip.nextDouble();
      System.out.println("Please enter the student's second exam score:");
      double exam2 = ip.nextDouble();
      System.out.println("Please enter the student's last exam score:");
      double exam3 = ip.nextDouble();
      double[] scores = {exam1, exam2, exam3};
      return scores;
   }
   
   public static String getLetterGrade(double[] scores) {
      double exam1 = scores[0];
      double exam2 = scores[1];
      double exam3 = scores[2];
      double grade = 0.25 * exam1 + 0.30 * exam2 + 0.45 * exam3;
      String letter = "";
      if (grade >= 90){
         letter = "A";
      }
      else if (grade >= 80 && grade < 90) {
         letter = "B";
      }
      else if (grade >= 70 && grade < 80) {
         letter = "C";
      }
      else if (grade >= 60 && grade < 70) {
         letter = "D";
      }
      else if (grade < 60) {
         letter = "F";
      } 
      return letter;    
   }
   
   public static void display(String[] name, double[] scores, String letter) {
      String first = name[0];
      String last = name[1];
      System.out.println(last + "\t" + first + "\t" + letter);
   }
      
}
