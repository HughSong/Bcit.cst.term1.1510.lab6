
/**
 * 
 */
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Shop.
 * @author 宋与珩
 * @version 1.0
 */
public class Shop {

    /**
     * Drive my program
     * @param args args command line arguments.
     */
    public static void main(String[] args) {
        
        
        Item mycart9 = new Item("brush", 2, 5);
        
        
        
        
        
        
        
        System.out.println();
        
        
        
        Item item;
        String itemName;
        double itemPrice;
        int quantity;
        int i = 0;
        double totalPrice=0;
        ArrayList<Item> cart = new ArrayList<Item>();
        Scanner scan = new Scanner(System.in);
        String keepShopping = "y";
        do {
            System.out.print("Enter the name of the item: ");
            itemName = scan.next();
            System.out.print("Enter the unit price: ");
            itemPrice = scan.nextDouble();
            System.out.print("Enter the quantity: ");
            quantity = scan.nextInt();
            // *** create a new item and add it to the cart
            item = new Item(itemName,itemPrice,quantity);
            cart.add(item);
            // *** print the contents of the cart object using println
            System.out.println(cart.get(i));
           
            i++;
            System.out.print("Continue shopping (y/n)? ");
            totalPrice += item.getQuantity() * item.getPrice();
            keepShopping = scan.next();
            
            
            //疑问：当我在一个位置放入一个object时，本质上应该是让这个位置指向了这个object的地址，
            //但是我用这个loop一直改写的都是object “item” 为何之前的不会被顶掉重写。。他还是实际存在的吗
        } while (keepShopping.equals("y"));
        /*
         * 这一段代码是测验我想的object ”item“到底会被重写吗，所以最后我又把这个object打了出来
         * 事实证明他的确被重写了，
         * 因此我猜想，但一个object储存到arrayList的一个指定位置中时，他并不是让这个位置指向这个object的reference
         * 而是把这个object的所有实际数据全部储存到了这个位置上
        System.out.println();
        System.out.println();
        System.out.println(item);
        */
        System.out.println("-----------------------------");
        System.out.println("The total price is: " + totalPrice);

    }
}
