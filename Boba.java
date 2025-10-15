/*
 * Represents a type of beverage sold at my Beverages store.
 * Boba is a type of Beverage
 */
public class Boba extends Beverages {
// Instance variable
  private boolean hasBoba;

/*
 * No argument constructor declaring a default value for the hasBoba method
 */
  public Boba() {
    hasBoba = false;
  }

/*
 * Parameterized constructor for price, size, and hasBoba
 */
  public Boba(String size, double price, boolean isToGo, boolean hasBoba) {
    super(size, price, isToGo);
    this.hasBoba = hasBoba;
  }

/*
 * Access method for the hasBoba method.
 Returns a Boolean result when arguments are given for the parameters.
 */
  public boolean getHasBoba() {
    return hasBoba;
  }

/*
 * Mutator method for the hasBoba method.
*/
  public void setHasBoba(boolean newHasBoba) {
    hasBoba = newHasBoba;
  }

/*  
 *toString method used to return a string representation of the hasBoba method.
 */
public String toString() {
  return super.toString() + "\nHas Boba?: " + this.hasBoba;
}
  
}