public class Snake extends Animal {
   protected String color;
   protected String species;
   
   public Snake() {
      this.color = "Green";
   }
   
   public Snake(String species) {
      this.species = species;
   }
   
   public Snake(String name, String color, String species) {
      super.setName(name);
      this.color = color;
      this.species = species; 
   }
   
   public String getColor() {
      return this.color;
   }
   
   public void setColor(String newColor) {
      this.color = newColor;
   }
   
   public String getSpecies() {
      return this.species;
   }
   
   public void setSpecies (String newSpecies) {
      this.species = newSpecies;
   }
   
   public String getSound() {
      return "hssss";
   }
   
   public boolean isScary() {
      return true;
   }
   
   public String toString() {
      return "Species: " + this.getSpecies() + " Color: " + this.getColor() + " " + super.toString();      
   }
}