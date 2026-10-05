public class Main {
   public static void main (String[] agrs) {
   
   Vehicle v1 = new Vehicle("Toyota", "Corolla", 2020);
      System.out.println();
      v1.displayInfo();
      System.out.println("Age: " + v1.calculateAge());
      System.out.println("Is Vintage? " + v1.isVintage());  
      
      System.out.println("\nsetYear(2000): " + v1.setYear(2000)); 
      System.out.println("Year: " + v1.getYear()); 
      System.out.println("Age: " + v1.calculateAge()); 
      System.out.println("Vintage: " + v1.isVintage()); 
      System.out.println(); 
 
      System.out.println("setYear(1885): " + v1.setYear(1885)); 
      System.out.println("Year: " + v1.getYear()); 
      System.out.println(); 
 
      System.out.println("setYear(2027): " + v1.setYear(2027)); 
      System.out.println("Year: " + v1.getYear()); 
      System.out.println(); 
  
   Vehicle v2 = new Vehicle("Honda", "Civic", 2018);
      System.out.println();
      v2.displayInfo();
      System.out.println("Age: " + v2.calculateAge());
      System.out.println("Is Vintage? " + v2.isVintage());  
      
   Vehicle v3 = new Vehicle("Ford", "Mustang", 1995);
      System.out.println();
      v3.displayInfo();
      System.out.println("Age: " + v3.calculateAge());
      System.out.println("Is Vintage? " + v3.isVintage());  
 
      Vehicle invalidVehicle1 = new Vehicle("Test", "Invalid 1885", 1885); 
      System.out.println("\nNew vehicle with year 1885:"); 
      System.out.println("Initial year: " + invalidVehicle1.getYear()); 
      System.out.println(); 
 
      Vehicle invalidVehicle2 = new Vehicle("Test", "Invalid 2027", 2027); 
      System.out.println("New vehicle with year 2027:"); 
      System.out.println("Initial year: " + invalidVehicle2.getYear()); 
   
   }


}