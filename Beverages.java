/*
 * Represents a beverage that can be sold at my store
 */
public class Beverages {
// Instance variables
  private String size;
  private double price;
  private boolean isToGo;


/*
 * No argument constructors declaring default values for the size and price of the beverages
 */
public Beverages() {
  size = "Small";
  price = 4.99;
  isToGo = false;
}

/*
 * Parameterized constructor for both price and size
 */
public Beverages(String size, double price, boolean isToGo) {
  this.size = size;
  this.price = price;
  this.isToGo = isToGo;
}

/*
 * Access method for size and price.
 Returns both size and price when arguments are given for the parameters.
 */
public String getSize() {
  return size;
}

public double getPrice() {
  return price;
}

public boolean getIsToGo() {
  return isToGo;
}

/*
 * Mutator method for size and price.
*/
  public void setSize(String newSize) {
    size = newSize;
  }

  public void setPrice(double newPrice) {
    if (price < 0) {
      price = 0.0;
    } else if (price >= 0) {
      price = newPrice;
    }
    
  }

  public void setIsToGo(boolean newIsToGo) {
    isToGo = newIsToGo;
  }

/*  
 *toString method used to return a string representation of size and price
 */
  public String toString() {
    return ("Size: " + this.size + "\nPrice: $" + this.price + "\nIs it to-go?: " + this.isToGo);
  } 
}
 