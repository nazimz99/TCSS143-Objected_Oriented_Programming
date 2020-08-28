/* 
   Programmer: Nazim Zerrouki
   Program: Circle (Lab5b.java)
   Date: 2/01/18
*/
import java.lang.*;

public class Circle extends Shape {
   private double radius;
   
   public Circle() {
      radius = 1.0;
   }
   
   public Circle(double initialRadius) {
      radius = initialRadius;
   }
   
   public Circle(double initialRadius, String initialColor, boolean Filled) {
      radius = initialRadius;
      super.color = initialColor;
      super.filled = Filled;
      
   }
   
   public double getRadius() {
      return radius;
   }
   
   public void setRadius(double newRadius) {
      radius = newRadius;
   }
   
   public double getArea() {
      double area = Math.PI * radius * radius;
      return area;
   }
   
   public double getPerimeter() {
      double perimeter = Math.PI * 2 * radius;
      return perimeter;
   }
   
   public void setColor(String newColor) {
      super.color = newColor;
   }
   
   public void setFilled(boolean newFilled) {
      super.filled = newFilled;
   }
   
   public String toString() {
      return "a Circle with radius " + radius + ", area " + this.getArea() + ", and circumference " + this.getPerimeter( ) + " which is a subclass of " + super.toString();
   }
}

class CircleMain {
   public static void main (String[] args) {
      Circle c = new Circle();
      System.out.println("This is " + c);
      System.out.println();
      c.setRadius(6.0);
      c.setColor("Blue");
      c.setFilled(false);
      System.out.println("This is now " + c);
   }
}