
/**
 * 
 */
import java.text.NumberFormat;

/**
 * Item.
 * @author ËÎÓëçñ
 * @version 1.2
 */
public class Item {
    private String name;
    private double price;
    private int quantity;
    private static double totalfee;
    
    // ----------------------------------------------------- --
    // Create a new item with the given attributes.
    // ----------------------------------------------------- --
    /**
     * 
     * @param kj it means item's name
     * @param itemPrice
     * @param numPurchased
     */
    
    public Item(String itemName, double itemPrice, int numPurchased) {
        
        name = itemName;
        price = itemPrice;
        quantity = numPurchased;
    }
    
    
    public Item() {
        name = "";
        price = 0;
    }
    
    public Item(String itemName){
        name = itemName;
    }
    

    // ----------------------------------------------------- --
    // Return a string with the information about the item
    // ----------------------------------------------------- --
    /**
     * Print important information
     * @return a string
     */
    public String toString() {
        NumberFormat fmt = NumberFormat.getCurrencyInstance();
        return ("name: " + name + "\t" + "price: " + fmt.format(price) + "\t" + "quantity: "+  quantity + "\t" +"total: "+  fmt.format(price * quantity));
    }

    // -----------------------------------------------
    // Returns the unit price of the item
    // -----------------------------------------------
    /**
     * get the unit price.
     * @return price
     */
    public void setPrice() {
        price = 5;
    }
    
    
    public double getPrice() {
        return price;
    }

    // -----------------------------------------------
    // Returns the name of the item
    // -----------------------------------------------
    /**
     * get the item's name.
     * @return item's name
     */
    public String getName() {
        return name;
    }

    // -----------------------------------------------
    // Returns the quantity of the item
    // -----------------------------------------------
    /**
     * The quantity of item.
     * @return quantity
     */
    public int getQuantity() {
        return quantity;
    }
}
