public class Main {
   public static void printDetails(Vehicle vehicle) {
   vehicle.displayInfo();
   }
   public static void printAction (Vehicle vehicle) {
     vehicle.moveForward();
     vehicle.moveBackward();
     vehicle.moveLeft();
     vehicle.moveRight();
   }
      
   public static void performService(Serviceable item) {
      item.service();
   }
   
   public static void main(String[] args) {
   
   Vehicle vehicle = new Car("Toyota", "Camry", 2024, 4);
      System.out.println();
      vehicle.displayInfo();
  
   vehicle = new Motorcycle("Honda", "CB500X", 2024, "Manual");
      System.out.println();
      vehicle.displayInfo();
        
   vehicle = new Truck("Ford", "F-150", 2024, 4);
      System.out.println();
      vehicle.displayInfo();
     
     System.out.println("\n=== 2. Method Parameter ===");
      Car car = new Car("Mazda", "MX-5 Miata", 2026, 4);
      Motorcycle motor = new Motorcycle("Yamaha", "MT-07", 2026, "Manual");
      Truck truck = new Truck("Chevrolet", "Silverado 1500", 2026, 4);
      
      printDetails(car);
      System.out.println();
      printDetails(motor);
      System.out.println();
      printDetails(truck);
      
      System.out.println("\n=== 3. Polymorphic Array ===");
      
      Vehicle[] vehicles = {
         new Car("Mazda", "MX-5 Miata", 2026, 4),
         new Motorcycle("Yamaha", "MT-07", 2026, "Manual"),
         new Truck("Chevrolet", "Silverado 1500", 2026, 4)
      };
      
      for(Vehicle currentVehicle : vehicles) {
         printDetails(currentVehicle);
         printAction(currentVehicle);
         System.out.println();
   }
      System.out.println("\n=== 4. Serviceable Array ===");
      
      Printer printer = new Printer();
      
      Serviceable[] serviceables = {car, motor, truck, printer};
      
      for(Serviceable item : serviceables) {
         performService(item);
      }
      System.out.println();
      
      Vehicle[] sameVehicles = {car, motor, truck};
      
      for(Vehicle currentVehicle : sameVehicles) {
         currentVehicle.displayInfo();
         printAction(currentVehicle);
         System.out.println();
      }
  
   }

}
 