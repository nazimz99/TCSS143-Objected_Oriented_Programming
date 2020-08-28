/*
   Programmer: Nazim Zerrouki
   Program: Lab6b.java
   Date: 2/15/18
*/

public class ElectronicMedia implements Library {
   protected String ID;
   protected String title;
   
   public ElectronicMedia(String ID, String title) {
      this.ID = ID;
      this.title = title;
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
}