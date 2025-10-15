/*
 * Represents a type of beverage sold at my Beverages store.
 * Coffee is a type of Beverage
 */
public class Coffee extends Beverages {
// Instance variable
private boolean hasIce;

/*
 * No argument constructor declaring a default value for the hasIce method
 */
public Coffee() {
  hasIce = true;
}

/*
 * Parameterized constructor for price, size, and hasIce
 */
public Coffee(String size, double price, boolean isToGo, boolean hasIce) {
  super(size, price, isToGo);
  this.hasIce = hasIce;
}

/*
 * Access method for the hasIce method.
 Returns a Boolean result when arguments are given for the parameters.
 */
public boolean getHasIce() {
  return hasIce;
}

/*
 * Mutator method for the hasIce method.
*/
public void setHasIce(boolean newHasIce) {
  hasIce = newHasIce;
}

/*  
 *toString method used to return a string representation of the hasIce method.
 */
public String toString() {
  return super.toString() + "\nHas Ice?: " + this.hasIce;
}

}