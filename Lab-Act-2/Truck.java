public class Truck extends Vehicle {
   private int numberOfWheels;
   
   public Truck (
      String model,
      String brand,
      int year,
      int numberOfWheels
      ) { 
         super(model, brand, year);
         this.numberOfWheels = numberOfWheels;
         }
         
   @Override
   public void displayInfo() { 
      super.displayInfo();
      System.out.println("Number of Wheels: " + numberOfWheels);
   }
   

}