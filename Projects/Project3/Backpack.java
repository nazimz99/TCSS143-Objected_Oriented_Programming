/*
   Programmer: Nazim Zerrouki
   Program: Problem 2
   Date: 3/04/18
*/

import java.util.*;

// Declares instance variables.
public class Backpack {
   private ArrayList<Item> list;
   private int totalWeight;
   private int totalValue;
   private int totalSize;
   protected int maxSize;
   
// Invoke constructor and initalizes an empty Backpack.
   public Backpack(int maxSize) {
      list = new ArrayList<Item>();
      this.totalWeight = 0;
      this.totalValue = 0;
      this.totalSize = 0;
      this.maxSize = maxSize;
   }

   
   // Method: Returns list of items in Backpack.
   // Parameters: None
   // Return: ArrayList<Item>
   
   public ArrayList<Item> getItemList() { 
      return this.list;
   }
   
   // Method: Returns total weight of ArrayList<Item>
   // Parameters: None
   // Return: int
   
   public int getTotalWeight() {
      this.totalWeight = 0;
      for (Item i: this.getItemList()) {
         this.totalWeight += i.getWeight();
      }
         return this.totalWeight;
   }
   
   // Method: Returns total value of ArrayList<Item>
   // Parameters: None
   // Return: int
   
   public int getTotalValue() {
      this.totalValue = 0;
      for (Item i: this.getItemList()) {
         this.totalValue += i.getValue();
      }
      return this.totalValue;
   }
   
   // Method: Returns total size of ArrayList<Item>
   // Parameters: None
   // Return: int
   
   public int getTotalSize() {
      this.totalSize = 0;
      for (Item i: this.getItemList()) {
         this.totalSize += i.getSize();
      }
      return this.totalSize;
   }
   
   // Method: Returns maximum size that can be carried.
   // Parameters: None
   // Return: int
   
   public int getMaxSize() {
      return this.maxSize;
   }
   
   // Method: Adds items to backpack
   // Parameters: None
   // Return: void
   
   public void addItem(Item i) {
      this.list.add(i);
   }
   
   // Method: Remove items from backpack
   // Parameters: None
   // Return: Void
   
   public void removeItem(Item i) {
      this.list.remove(i);

   }
   
   // Method: Check if item size is equal to or less than max size
   // Parameters: Item
   // Return: boolean
   
   public boolean checkSpace(Item i) {
      if (i.getSize() <= this.getMaxSize()) {
         return true;
      }
      return false;
   }
   
   // Method: Display ArrayList<Item> and each item's qualities.
   // Parameters: None
   // Return: String
   
   public String toString() {
      String result = "";
      for (Item i: this.getItemList()) {
         result += i + "\n";
      }
      result += "~ Weight: " + this.getTotalWeight() + "\n~ Size: " + this.getTotalSize() + "\n~ Total worth: " + this.getTotalValue();
      return result;
   }
}