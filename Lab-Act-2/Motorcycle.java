public class Motorcycle extends Vehicle {
   private String typeOfEngine;
      
      public Motorcycle (
         String brand,
         String model,
         int year,
         String typeOfEngine
         ) { 
            super(brand, model, year);
            this.typeOfEngine = typeOfEngine;
         }
         
     @Override
     public void displayInfo() {
      super.displayInfo();
      System.out.println("Type of Engine: " + typeOfEngine);
      }
}
  