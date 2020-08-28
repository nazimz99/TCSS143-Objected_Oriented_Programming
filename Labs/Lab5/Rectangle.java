/* 
   Programmer: Nazim Zerrouki
   Program: Rectangle (Lab5b.java)
   Date: 2/01/18
*/

public class Rectangle extends Shape {
   protected double width;
   protected double length;
   
   public Rectangle() {
      width = 1.0;
      length = 1.0; 
   }
   
   public Rectangle(double initialWidth, double initialLength) {
      width = initialWidth;
      length = initialLength;
   }
   
   public Rectangle(double initialWidth, double initialLength, String initialColor, boolean Filled) {
      width = initialWidth;
      length = initialLength;
      super.color = initialColor;
      super.filled = Filled;
   }
   
   public double getWidth() {
      return width;
   }
   
   public void setWidth(double newWidth) {
      width = newWidth;
   }
   
   public double getLength() {
      return length;
   }
   
   public void setLength(double newLength) {
      length = newLength;
   }
   
   public double getArea() {
      return length * width;
   }
   
   public double getPerimeter() {
      return 2 * (length + width);
   }
   
   public void setColor(String newColor) {
      color = newColor;
   }
   
   public void setFilled(boolean newFilled) {
      filled = newFilled;
   }
   
   public String toString() {
      return "a Rectangle with width " + width + ", length " + length + ", area " + this.getArea() + ", and perimeter " + this.getPerimeter() + " which is a subclass of " + super.toString();
   }
}

class RectangleMain {
   public static void main(String[] args) {
      Rectangle r = new Rectangle();
      System.out.println("This is " + r);
      System.out.println();
      r.setColor("Blue");
      r.setFilled(true);
      r.setWidth(5.0);
      r.setLength(6.0);
      System.out.println("This is now " + r);
   }
}