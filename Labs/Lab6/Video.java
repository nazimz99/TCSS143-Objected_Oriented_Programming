/*
   Programmer: Nazim Zerrouki
   Program: Lab6b.java
   Date: 2/15/18
*/

public class Video extends ElectronicMedia {
   private int length;
   
   public Video(String ID, String title, int length) {
      super(ID, title);
      this.length = length;
   }
   
   public int getLength() { 
      return this.length;
   }
   
   public void setLength(int newLength) {
      this.length = newLength;
   }
   
   public String toString() {
      return "Title: " + super.getTitle() + ", Video Number: " + super.getID() + ", Video Length: " + this.getLength() + " minutes";
   }
}