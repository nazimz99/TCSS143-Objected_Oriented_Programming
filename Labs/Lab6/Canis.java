public class Canis extends Animal {
   protected String species;
   
   public Canis() {
      this.species = "Canis";
   }
   
   public Canis(String species) {
      this.species = species;
   }
   
   public Canis(String name, int legs, String species) {
      super(name, legs);
      this.species = species;
   }
   
   public String getSpecies() {
      return this.species;
   }
   
   public void setSpecies(String newSpecies) {
      this.species = newSpecies;
   }
   
   public String getSound() {
      return "bark";
   }
   
   public boolean isScary() {
      return false;
   }
   
   public String toString() {
      return "Species: " + this.getSpecies() + " " + super.toString();
   }
}