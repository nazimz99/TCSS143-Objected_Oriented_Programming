/*
   Programmer: Nazim Zerrouki
   Program: Lab6b.java
   Date: 2/15/18
*/

public class Book implements Library {
   private String ID;
   private String title;
   private String author;
   
   public Book(String ID, String title, String author) {
      this.ID = ID;
      this.title = title;
      this.author = author;
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
   
   public String getAuthor() {
      return this.author;
   }
   
   public void setAuthor(String newAuthor) {
      this.author = newAuthor;
   }
   
   public String toString() {
      //return "Book ID: " + this.getID() + ", Book Title: " + this.getTitle() + ", and Author: " + this.getAuthor();
      return "Author: " + this.getAuthor();
   }
   
}