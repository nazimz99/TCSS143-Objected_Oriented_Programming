/* 
   Programmer: Nazim Zerrouki
   Program: Book.java (Lab 5a)
   Date: 1/31/18
*/

import java.util.*;

public class Book  {
   private String name;
   private Author author;
   private double price;
   private int qty;
   
   public Book (String initialName, Author author, double initialPrice) {
      name = initialName;
      this.author = author;
      price = initialPrice;
      qty = 1;
   }
   
   public Book (String initialName, Author author, double initialPrice, int initialQty) {
      name = initialName;
      this.author = author;
      price = initialPrice;
      qty = initialQty;
   }
   
   public String getName() {
      return name;
   }
   
   public Author getAuthor() {
      return author;
   }
   
   public String getAuthorName() {
      return author.getName();
   }
   
   public String getAuthorEmail() {
      return author.getEmail();
   }
   
   public char getAuthorGender() {
      return author.getGender();
   }
   
   public double getPrice() {
      return price;
   }
   
   public void setPrice(double newPrice) {
      price = newPrice;  
   }
   
   public int getQty() {
      return qty;
   }
   
   public void setQty(int newQty) {
      qty = newQty;
   }
   
   public String toString() {
      return name + " " + author.toString() + " " + price + " " + qty;
   }
}

class TestBook {
   public static void main(String[] args) {
      Author ahTeck = new Author("Tan Ah Teck", "ahTeck@somewhere.com", 'm');
      Book dummyBook = new Book("Java for dummy", ahTeck, 1995, 99);
      System.out.println(dummyBook);
      
      dummyBook.setPrice(29.95);
      dummyBook.setQty(28);
      System.out.println("name is: " + dummyBook.getName());
      System.out.println("price is: " + dummyBook.getPrice());
      System.out.println("qty is: " + dummyBook.getQty());
      System.out.println("Author is: " + dummyBook.getAuthor());  
      System.out.println("Author's name is: " + dummyBook.getAuthorName());
      System.out.println("Author's email is: " + dummyBook.getAuthorEmail());
      Book anotherBook = new Book("more Java",       
         new Author("Paul Tan", "paul@somewhere.com", 'm'), 29.95);
      System.out.println(anotherBook);  
   }
}