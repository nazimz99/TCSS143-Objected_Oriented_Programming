/* 
   Programmer: Nazim Zerrouki
   Program: Square (Lab5b.java)
   Date: 2/01/18
*/

public class Square extends Rectangle {

   public Square() {
      super();
   }
   
   public Square(double side) {
      super(side, side);
   }
   
   public Square(double side, String initialColor, boolean Filled) {
      super(side, side);
      color = initialColor;
      filled = Filled;
   }
      
   public void setSide(double newSide) {
      super.setWidth(newSide);
      super.setLength(newSide);
   }
   
   public double getArea() {
      return super.width * super.length;
   }
   
   public double getPerimeter() {
      return 4 * super.width;
   }
   
   public void setColor(String newColor) {
      super.setColor(newColor);
   }
   
   public void setFilled(boolean newFilled) {
      super.setFilled(newFilled);
   }
   
   public String toString() {
      return "a Square with side " + super.width + ", area " + this.getArea() + ", and perimeter " + this.getPerimeter() + " is a subclass of " + super.toString();
   }
}

class TestSquare {
   public static void main(String[] args) {
      Square sq = new Square(5, "yellow", true);
      System.out.println("This is " + sq);
      System.out.println();
      sq.setSide(6.4);
      sq.setColor("red");
      sq.setFilled(false);
      System.out.println("This is now " + sq);
   }
}