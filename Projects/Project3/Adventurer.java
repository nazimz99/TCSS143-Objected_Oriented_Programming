/*
   Programmer: Nazim Zerrouki
   Program: Problem 2
   Date: 3/04/18
*/
import java.util.*;

 // Declares instance variables
public class Adventurer extends Backpack {
   private String name;
   private int maxWeight;
   private Backpack backpack;
   
   // Invokes constructor and instantiates empty backpack
   public Adventurer(String name, int maxWeight, int maxSize) {
      super(maxSize);
      super.maxSize = maxSize;
      backpack = new Backpack(maxSize);
      this.name = name;
      this.maxWeight = maxWeight;
   }
   
   // Method: Return name of adventurer.
   // Parameters: None
   // Return: String
   
   public String getName() {
      return this.name;
   }
   
   // Method: Get the maximum weight adventurer can carry.
   // Parameters: None
   // Return: int

   public int getMaxWeight() {
      return this.maxWeight;
   }
   
   // Method: Get the maximum size adventurer can carry.
   // Parameters: None
   // Return: int

   public int getMaxSize() {
      return maxSize;
   }
   
   // Method: Return the list of items, weight, value, and size the backpack carries. 
   // Parameters: ArrayList<Item>
   // Return: Backpack
   
   /* public Backpack getBackpack(ArrayList<Item> myItems) {
      backpack = new Backpack(this.getMaxSize());
      for (Item item : myItems) {
         backpack.addItem(item);
      }
      backpack.getItemList(); 
      backpack.getTotalWeight(); 
      backpack.getTotalValue();
      backpack.getTotalSize();
      this.getMaxSize();
      return backpack;
   } */
   
   // Method: Checks if item weight is below maximum weight that can be carried.
   // Parameters: Item
   // Return: boolean
   
   public boolean checkWeight(Item i) {
      if (i.getWeight() <= this.getMaxWeight()) {
         return true;
      }
      return false;
   }
   
   // Method: Optimizes treasure to maximize total value and remain below the maximum weight and size.
   // Parameters: ArrayList<Item>
   // Return: Backpack
   
   public Backpack optimizeTreasure(ArrayList<Item> myItems) {
      int maxValue = 0;
      int minValue = myItems.get(0).getValue();
      for (Item item : myItems) {
         if (maxValue < item.getValue()) {
            maxValue = item.getValue();
         }
         if (minValue > item.getValue()) {
            minValue = item.getValue();
         }
      }
      for (Item item : myItems) {
         if (backpack.checkSpace(item) && this.checkWeight(item)) {
            if (backpack.getTotalWeight() < this.getMaxWeight() && backpack.getTotalSize() < this.getMaxSize()) {
               if (maxValue == item.getValue()) {
                  backpack.addItem(item);
                  this.optimizeTreasure(myItems);
               }
            }
            /*else {
               if (minValue == item.getValue()) {
                  //backpack.removeItem(item);
               }
            } */
         }
 
      }      
      return backpack;
   }
   
   /* public Backpack optimizeTreasure(ArrayList<Item> myItems) {
      int minValue = myItems.get(0).getValue();
      for (Item i : myItems) {
         if (minValue > i.getValue()) {
            minValue = i.getValue();
         }
      } 
      for (Item item : myItems) { 
         if (backpack.getTotalWeight() > this.getMaxWeight() || backpack.getTotalSize() > this.getMaxSize()) {  
            if (minValue == item.getValue()) {
               backpack.getItemList().remove(item);
               this.getBackpack(myItems);
               this.optimizeTreasure(myItems);   
            } 
         }
      }
   return backpack;
   } */
}