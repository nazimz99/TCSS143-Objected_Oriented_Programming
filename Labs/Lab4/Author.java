/* 
   Programmer: Nazim Zerrouki
   Program: Author.java (Lab 4c)
   Date: 1/27/18
*/

public class Author {
   private String name;
   private String email;
   private char gender;

   public Author(String Name, String Email, char Gender) {
      name = Name;
      email = Email;
      gender = Gender;
   }
     
   public String getName(String newName) {
      name = newName;
      return name;
   }
   
   public String getEmail(String startEmail) {
      email = startEmail;
      return email;
   }
   
   public void setEmail(String newEmail) {
      email = newEmail;
   } 
   
   public char getGender(char newGender) {
      gender = newGender;
      return gender;
   }
      
   public String toString() {
      return name + "(" + gender + ")at " + email;
   }
}

class TestAuthor {
   public static void main(String[] args) {
      Author anAuthor = new Author("Tan Ah Teck", "ahTeck@somewhere.com", 'm');
      //anAuthor.getName("Tan Ah Teck");
      //anAuthor.getEmail("ahTeck@somewhere.com");
      //anAuthor.getGender('m');
      System.out.println(anAuthor);
      anAuthor.setEmail("paul@nowhere.com");
      System.out.println(anAuthor);
   }
}

