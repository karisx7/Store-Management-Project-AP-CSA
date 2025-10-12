/*
 * Represents a type of beverage sold at my Beverages store.
 * Juice is a type of Beverage
 */
public class Juice extends Beverages {
// Instance variable
  private String flavor;

/*
 * No argument constructor declaring a default value for the flavor method
 */
  public Juice() {
    flavor = "Apple";
  }

/*
 * Parameterized constructor for price, size, and flavor
 */
  public Juice(String size, double price, String flavor) {
    super(size, price);
    this.flavor = flavor;
  }

/*
 * Access method for the flavor method.
 Returns a String result when arguments are given for the parameters.
 */
  public String getFlavor() {
    return flavor;
  }

/*
 * Mutator method for the hasBoba method.
*/
  public void setFlavor(String newFlavor) {
    flavor = newFlavor;
  }

/*  
 *toString method used to return a string representation of the flavor method.
 */
  public String toString() {
    return super.toString() + "\nFlavor: " + this.flavor;
  }

}