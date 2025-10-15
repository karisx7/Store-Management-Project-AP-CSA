//Declaring the BeveragesRunner class and demonstrates the Beverages, Coffee, Boba, and Juice classes.
public class BeveragesRunner {
  public static void main(String[] args) {

// Instantiates a Beverages object named "Karis" using the constructor with parameters.
  Beverages karis = new Beverages("Small", 3.99, false);
  System.out.println("Beverage info:"  + "\n " + karis);

// Instantiates a Coffee object named "k" using the constructor with parameters.
  Coffee k = new Coffee("Medium", 5.99, true, false);
  System.out.println("\nCoffee info:" + "\n" + k);

// Instantiates a Boba object named "jolie" using the constructor with parameters.
  Boba jolie = new Boba("Large", 7.50, true, true);  
  System.out.println("\nBoba info:" + "\n" + jolie);

// Instantiates a Juice object named "j" using the constructor with parameters.
  Juice j = new Juice("Medium", 4.50, "Orange", false);
  System.out.println("\nJuice info:" + "\n" + j);

  }
}