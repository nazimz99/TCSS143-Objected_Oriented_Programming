/*
   Programmer: Nazim Zerrouki
   Program: Lab6b.java
   Date: 2/15/18
*/

public class Magazine implements Library {
   private String ID;
   private String title;
   private int year;
   
   public Magazine(String ID, String title, int year) {
      this.ID = ID;
      this.title = title;
      this.year = year;
   }
   
   public String getID() {
      return this.ID; 
   }
   
   public void setID(String newID) {
      this.ID = newID;
   }
   
   public String getTitle() {
      return this.title;
   }
   
   public void setTitle(String newTitle) {
      this.title = newTitle;
   }
   
   public int getYear() {
      return this.year;
   }
   
   public void setYear(int newYear) {
      this.year = newYear;
   }
   
   public String toString() {
      return "Year of publication: " + this.getYear();
   }

}
