/*
   Programmer: Nazim Zerrouki
   Program: Lab7b.java
   Date: 2/22/18
*/


import java.util.*;
import java.io.*;
import java.lang.*;

public class Collection {
   protected String FirstName;
   protected String LastName;
   protected String CompName;
   protected String Address;
   protected String City;
   protected String County;
   protected String State;
   protected String ZipCode;
   protected String Phone2;
   protected String Email;

   public Collection(String FirstName, String LastName, String CompName, String Address, String City, String County, String State, String ZipCode, String Phone2, String Email) {
      this.FirstName = FirstName;
      this.LastName = LastName;
      this.CompName = CompName;
      this.Address = Address;
      this.City = City;
      this.County = County;
      this.State = State;
      this.ZipCode = ZipCode;
      this.Phone2 = Phone2;
      this.Email = Email;
      
   }
   
   public String getFirstName() {
      return this.FirstName;
   }
   
   public String getLastName() {
      return this.LastName;
   }
   
   public String getCompName() {
      return this.CompName;
   }
   
   public String getAddress() {
      return this.Address;
   }
   
   public String getCity() {
      return this.City;
   }
   
   public String getCounty() {
      return this.County;
   }
   
   public String getState() {
      return this.State;
   }
   
   public String getZipCode() {
      return this.ZipCode;
   }
   
   public String getPhone2() {
      return this.Phone2;
   }
   
   public String getEmail() {
      return this.Email;
   }
   
   public String toString() {
      return "First Name: " + this.getFirstName() + "\nLast Name: " + this.getLastName() + "\nCompany Name: " + this.getCompName() + "\nAddress: " + this.getAddress() + "\nCity: " + this.getCity() + "\nCounty: " + this.getCounty() + "\nState: " + this.getState() + "\nZipCode: " + this.getZipCode() + "\nPhone 2: " + this.getPhone2() + "\nEmail: " + this.getEmail();
   }
}

class Lab7b {
   public static void main(String[] args) throws FileNotFoundException {
      File f = new File("us-500.csv");
      Scanner ip = new Scanner(f);
      String line = "";
      HashMap<String, ArrayList<Collection>> Map = new HashMap<String, ArrayList<Collection>>();
      HashMap<String, String> data = new HashMap<String, String>();
      while (ip.hasNextLine()) {
         line = ip.nextLine();
         String[] lineArr = line.split(",");
         String key = lineArr[8];
         String dKey = lineArr[0] + " " + lineArr[1];
         Map.put(key, new ArrayList<Collection>());
         data.put(dKey, lineArr[6]);
         Collection c = new Collection(lineArr[0], lineArr[1], lineArr[2], lineArr[3], lineArr[4], lineArr[5], lineArr[6], lineArr[7], lineArr[9], lineArr[10]);
         Map.get(key).add(c); 
         data.get(dKey);
         //System.out.println("(XXX-XXX-XXXX): " + key + " \n" +  c + "\n");
      }   
      searchKey(Map);
      duplicateValues(data);
   }
   
   public static void searchKey(HashMap<String, ArrayList<Collection>> map) {
      Scanner input = new Scanner(System.in);
      System.out.println("Enter the phone number to search for in the following format\n(XXX-XXX-XXXX): " );
      String Phone1 = input.next();
      System.out.println(map.get(Phone1));
   }
   
   public static void duplicateValues(HashMap<String, String> map) {
      Scanner ip = new Scanner(System.in);
      System.out.println("Please enter a state: ");
      String State = ip.next();
      for (String key : map.keySet()) {
         if (map.get(key).equals(State)) {
            System.out.println(key);
         }
      }
  } 
   
}
