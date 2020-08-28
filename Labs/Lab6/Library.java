/*
   Programmer: Nazim Zerrouki
   Program: Lab6b.java
   Date: 2/15/18
*/

public interface Library {
   public String getID(); 
   public void setID(String ID);
   public String getTitle();
   public void setTitle(String title);
}

class TestFile {
   public static void main(String[] args) {
      Library book = new Book("1234", "Harry Potter", "J.K Rowling");
      System.out.println(book);
      System.out.println();
      Library magazine = new Magazine("292", "Magazine", 2018);
      System.out.println(magazine);
      System.out.println();
      Library media = new ElectronicMedia("1234B43", "Hello Hello");
      ElectronicMedia video = new Video(media.getID(), media.getTitle(), 60);
      System.out.println(video);
      System.out.println();
      ElectronicMedia cd = new CD(media.getID(), media.getTitle(), "Rock");
      System.out.println(cd);
   }
}