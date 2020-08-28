/* 
   Programmer: Nazim Zerrouki
   Program: Author.java (Lab 5a)
   Date: 1/27/18
*/

public class Author {
   protected String name;
   protected String email;
   protected char gender;

   public Author(String Name, String Email, char Gender) {
      name = Name;
      email = Email;
      gender = Gender;
   }
     
   public String getName() {
      return name;
   }
   
   public String getEmail() {
      return email;
   }
   
   public void setEmail(String newEmail) {
      email = newEmail;
   } 
   
   public char getGender() {
      return gender;
   }
      
   public String toString() {
      String Author = name + "(" + gender + ") at " + email;
      return Author;
   }
}


 class TestAuthor {
   public static void main(String[] args) {
      Author ahTeck = new Author("Tan Ah Teck", "ahTeck@somewhere.com", 'm');
      //anAuthor.getName("Tan Ah Teck");
      //anAuthor.getEmail("ahTeck@somewhere.com");
      //anAuthor.getGender('m');
      System.out.println(ahTeck);
      ahTeck.setEmail("paul@nowhere.com");
      System.out.println("name is: " + ahTeck.getName());
      System.out.println("email is: " + ahTeck.getEmail());
      System.out.println("gender is: " + ahTeck.getGender());
   }
}

