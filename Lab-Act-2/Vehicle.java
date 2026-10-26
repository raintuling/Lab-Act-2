public class Vehicle {
   String brand;
   String model;
   int year;
   
   public Vehicle(String brand, String model, int year){
      this.brand = brand;
      this.model = model;
      this.year = year;
      }
      void displayInfo() {
      System.out.println("Brand: " + brand + "\nModel: " + model + "\nYear: " + year);   
   }
         
}