/*
   Programmer: Nazim Zerrouki
   Program: Problem 2
   Date: 3/04/18
*/

// Declare instance variables.
public class Item {
   private String name;
   private int weight;
   private int value;
   private int size;
   
   //Invoke Constructor and initialize instance variables.
   public Item(String name, int weight, int value, int size) {
      this.name = name;
      this.weight = weight;
      this.value = value;
      this.size = size;
   }
   
   // Method: Returns name of Item.
   // Parameters: None
   // Return: String
   
   public String getName() {
      return this.name;
   }
   
   // Method: Returns weight of Item.
   // Parameters: None
   // Return: int
   
   public int getWeight() {
      return this.weight;
   }
   
   // Method: Returns value of Item.
   // Parameters: None
   // Return: int
   
   public int getValue() {
      return this.value;
   }
   
   // Method: Returns size of Item.
   // Parameters: None
   // Return: int
   
   public int getSize() {
      return this.size;
   }
   
   // Method: Displays item's qualities.
   // Parameters: None
   // Return: String
   
   public String toString() {
      return this.getName() + ", W: " + this.getWeight() + ", V: " + this.getValue() + ", S: " + this.getSize();
   }
}