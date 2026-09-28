public class Main {
   public static void main (String[] agrs) {
   
   Vehicle v1 = new Vehicle("Toyota", "Corolla", 2020);
      System.out.println();
      v1.displayInfo();
      System.out.println("Age: " + v1.calculateAge());
      System.out.println("Is Vintage? " + v1.isVintage());  
  
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
   
   }


}