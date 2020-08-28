public class Dog extends Canis {

   public Dog() {
      super.species = "familiaris";
      super.legs = 4;
   }

   public Dog(String name) {
      super.setName(name);
      super.species = "familiaris";
      super.legs = 4;
   }
   
   public String getSound() {
      return super.getSound();
   }
   
   public boolean isScary() {
      return super.isScary();
   }
   
   public String toString() {
      return super.toString();
   }
}
