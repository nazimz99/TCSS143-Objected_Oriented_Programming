/*
   Programmer: Nazim Zerrouki
   Program: Lab6b.java
   Date: 2/20/18
*/
import java.util.*;
public class Programmer extends Employee {
   private int lines;
   
   public Programmer() {
      super();
      this.lines = 0;
   }
   
   public Programmer(String name, String ID, int lines) {
      super(name, ID);
      this.lines = lines;
   }
   
   public int getLines() {
      return this.lines;
   }
   
   public void setLines(int newLines) {
      this.lines = newLines;
   }
   
   public int work() {
      Random r = new Random();
      int work = ((((r.nextInt(101) + 50) / 100)) * this.getLines());
      return work;
   }
   
   public String toString() {
      return super.toString() + " Written Lines: " + this.work();
   }
}