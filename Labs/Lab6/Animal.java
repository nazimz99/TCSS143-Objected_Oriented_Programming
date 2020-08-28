public abstract class Animal {
   protected String name;
   protected int legs;
   
   public Animal() {
      this.name = "Animal";
      this.legs = 0;
   }
   
   public Animal(String name, int legs) {
      this.name = name;
      this.legs = legs;
   }
   
   public String getName() {
      return this.name;
   }
   
   public void setName(String newName) {
      this.name = newName;
   }
   
   public int getLegs() {
      return this.legs;
   }
   
   public void setLegs(int age) {
      this.legs = age;
   }
   
   public abstract String getSound();
   
   public abstract boolean isScary();
   
   public String toString() {
      return "Animal Name: " + this.getName() + " Legs: " + this.getLegs() + " Sound: " + this.getSound() + " Scary: " + this.isScary();
   }
}

class TestAnimal {
   public static void main(String[] args) {
      Animal c = new Canis("Dog", 4, "Canis");
      System.out.println(c);
      System.out.println();
      Animal s = new Snake("Snek", "Red", "Noodle");
      System.out.println(s);
      System.out.println();
      Animal d = new Dog("Spike");
      System.out.println(d);
   }
}

class BonusTest {
   public static void main(String[] args) {
      Animal s1 = new Snake("Snek", "Red", "Noodle");  // Upcast Snake to Animal
      System.out.println(s1);                    // Outputs the toString method found in the Snake class
      System.out.println(s1.getSound());          // Outputs the return value found in the getSound method found in the Snake class
      System.out.println(s1.isScary());     // Outputs the the return value found in the isScary method found in the Snake class
      System.out.println(s1.getName());
      System.out.println(s1.getLegs());
      // System.out.println(s1.getColor()); --> Error because getColor method is not a method found in the Animal class
   
      Snake c1 = (Snake)s1;                   // Downcast back to Snake 
      
      /* Every method outputted originates from the Snake class due to the Downcast back to Snake */
      System.out.println(c1);
      System.out.println(c1.getSound());           
      System.out.println(c1.isScary());
      System.out.println(c1.getName());
      System.out.println(c1.getLegs());
      System.out.println(c1.getColor());
   
      // Animal s2 = new Animal();   ---> Error because Animal is an abstract class, so it cannot be instantiated
   
      Animal s3 = new Canis("Wolf", 4, "Lupus");   // Upcast
      System.out.println(s3);             // Outputs toString method's return value found in Canis class
      System.out.println(s3.getSound());  // Outputs getSound's return value found in Canis class
      System.out.println(s3.isScary());   // Outputs isScary's return value found in Canis class
      System.out.println(s3.getName());   
      // System.out.println(s3.getSpecies()); --> Error because getSpecies method is not a method found in the Animal class
      
      Canis r1 = (Canis)s3;   // downcast to Canis
      /* Every method outputted originates from the Canis class due to the Downcast to Canis */
      System.out.println(r1);
      System.out.println(r1.getSound());
      System.out.println(r1.getName());
      System.out.println(r1.getSpecies());
      
      Animal s4 = new Dog("Goodboye");     // Upcast
      /* Contents from Dog class is printed */
      System.out.println(s4);
      System.out.println(s4.getSound());

   }
}