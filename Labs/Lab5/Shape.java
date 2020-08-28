/* 
   Programmer: Nazim Zerrouki
   Program: Shape (Lab5b.java)
   Date: 2/01/18
*/

public class Shape {
   protected String color;
   protected boolean filled;
   
   public Shape() {
      color = "green";
      filled = true;
   }
   
   public Shape(String initialColor, boolean Filled){
      color = initialColor;
      filled = Filled;
   }
   
   public String getColor() {
      return color;
   }
   
   public void setColor(String newColor) {
      color = newColor;
   }
   
   public boolean isFilled() {
      return filled;
   }
   
   public void setFilled(boolean newFilled) {
      filled = newFilled;
   }
   
   public String toString() {
      String shape;
      if (!filled) {
         return "a Shape with color of " + color + " and is not filled.";
      }
      return "a Shape with color of " + color + " and is filled.";
   }
}

class ShapeMain {
   public static void main(String[] args) {
      Shape s = new Shape();
      System.out.println("This is " + s);
      System.out.println();
      s.setColor("blue");
      s.setFilled(false);
      System.out.println("This is now " + s);
   }
}