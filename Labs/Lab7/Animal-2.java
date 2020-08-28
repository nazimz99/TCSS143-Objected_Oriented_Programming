
public class Animal {
	
	private String name;
	private int topSpeed;	
   
	//create the getters and setters for the instance variables
        //there is a shortcut by hovering over the variable names
		
	// For the setter associated with topSpeed make sure the values are between 0 and 70
        // Raise an exception if it is not within these values.
	
	//create a constructor that takes in a String for the name and an int for the topSpeed
	//use only the setters initialize the instance variables


        //create an equals(Object other) method that returns True if the two Animal objects have 
	//top speeds that are within 2 mph of each other
	
	// Create a toString method
	// Formatting of the returned String should follow this example:
	// Name: elephant     Top Speed: 25
   
   public Animal(String name, int topSpeed) {
      this.name = name;
      this.topSpeed = topSpeed;
   }
   
   public String getName() {
      return this.name;
   }	
   
   public void setName(String newName) {
      this.name = newName;
   }
   
   public int getTopSpeed() {
      return this.topSpeed;
   }
   
   public void setTopSpeed(int newTopSpeed) {
      this.topSpeed = newTopSpeed;
   }
   
   public boolean equalsTo(Animal a) {
      if (a.getTopSpeed() >= this.getTopSpeed() - 2 && a.getTopSpeed() <= this.getTopSpeed() + 2) {
         return true;
      }
      return false;
   }
    
   public String toString() {
      return "Name: " + this.getName() + "\tTop Speed: " + this.getTopSpeed() + "\n";
   }
}

class TestAnimal {
   public static void main(String[] args) {
      Animal a1 = new Animal("Giraffe", 75);
      Animal a2 = new Animal("Lion", 72);
      System.out.println(a1);
      System.out.println(a2);
      System.out.println(a1.equalsTo(a2));
      System.out.println();
      a1.setName("Sloth");
      a2.setName("Jaguar");
      a1.setTopSpeed(76);
      a2.setTopSpeed(75);
      System.out.println(a1);
      System.out.println(a2);
      System.out.println(a1.equalsTo(a2));
   }
}
