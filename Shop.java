
/**
 * 
 */
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Shop.
 * @author ������
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
            
            
            //���ʣ�������һ��λ�÷���һ��objectʱ��������Ӧ���������λ��ָ�������object�ĵ�ַ��
            //�����������loopһֱ��д�Ķ���object ��item�� Ϊ��֮ǰ�Ĳ��ᱻ������д����������ʵ�ʴ��ڵ���
        } while (keepShopping.equals("y"));
        /*
         * ��һ�δ����ǲ��������object ��item�����׻ᱻ��д������������ְ����object���˳���
         * ��ʵ֤������ȷ����д�ˣ�
         * ����Ҳ��룬��һ��object���浽arrayList��һ��ָ��λ����ʱ���������������λ��ָ�����object��reference
         * ���ǰ����object������ʵ������ȫ�����浽�����λ����
        System.out.println();
        System.out.println();
        System.out.println(item);
        */
        System.out.println("-----------------------------");
        System.out.println("The total price is: " + totalPrice);

    }
}
