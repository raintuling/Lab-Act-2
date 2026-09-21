public class Main {
   public static void main (String[] agrs) {
   
   Vehicle v1 = new Vehicle();
      v1.brand = "Toyota";
      v1.model = "Corolla";
      v1.year = 2020;
      v1.displayInfo();
      System.out.println("Age: " + v1.calculateAge());
      System.out.println("Is Vintage? " + v1.isVintage());  
  
   Vehicle v2 = new Vehicle();
      v2.brand = "Honda";
      v2.model = "Civic";
      v2.year = 2018;
      v2.displayInfo();
      System.out.println("Age: " + v2.calculateAge());
      System.out.println("Is Vintage? " + v2.isVintage());  
      
   Vehicle v3 = new Vehicle();
      v3.brand = "Ford";
      v3.model = "Mustang";
      v3.year = 1995;
      v3.displayInfo();
      System.out.println("Age: " + v3.calculateAge());
      System.out.println("Is Vintage? " + v3.isVintage());  
   
   }


}