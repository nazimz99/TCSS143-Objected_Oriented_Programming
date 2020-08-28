/*
   Programmer: Nazim Zerrouki
   Program: Lab6b.java
   Date: 2/15/18
*/

public class CD extends ElectronicMedia {
   private String genre;
   
   public CD(String ID, String title, String genre) {
      super(ID, title);
      this.genre = genre;
   }
   
   public String getGenre() {
      return this.genre;
   }
   
   public void setGenre(String newGenre) {
      this.genre = newGenre;
   }
   
   public String toString() {
      return "CD Title: " + super.getTitle() + ", CD Number: " + super.getID() + ", CD Genre: " + this.getGenre();
   }
}