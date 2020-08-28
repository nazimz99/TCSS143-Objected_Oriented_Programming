/*
   Programmer: Nazim Zerrouki
   Program: Lab6b.java
   Date: 2/20/18
*/
import java.util.*;
public abstract class Employee {
   protected String name;
   protected String ID;
   
   public Employee() {
      this.name = "N/A";
      this.ID = "N/A";
   }
   
   public Employee(String name, String ID) {
      this.name = name;
      this.ID = ID;
   }
   
   public String getName() {
      return this.name;
   }
   
   public void setName(String newName) {
      this.name = newName;
   }
   
   public String getID() {
      return this.ID;
   }
   
   public void setID(String newID) {
      this.ID = newID;
   }
   
   public abstract int work();
   
   public String toString() {
      return "Name: " + this.getName() + " ID: " + this.getID();
   }
   
}