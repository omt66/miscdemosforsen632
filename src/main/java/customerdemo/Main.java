/*
 *  NU Educational License - 2017
 */
package customerdemo;

/**
 *
 * @author Ogun otigli@gmail.com
 */
public class Main {
    public static void main(String[] args) {
        println("--- Customer Shopping Demo (11 Jan 2017/Wed) ---");
        
        Customer customer1 = new Customer("Jane", 25, "(619) 555 1234");
        
        customer1.printInfo();
        Order order1 = new Order();
        
        order1.addLineItem(new LineItem("Bread", 2, 1.99f));
        order1.addLineItem(new LineItem("Milk", 1, 4.30f));
        
        Order order2 = new Order();
        
        order2.addLineItem(new LineItem("Newpaper", 1, 0.99f));
        order2.addLineItem(new LineItem("Cookies", 4, 2.5f));
        order2.addLineItem(new LineItem("Book", 1, 15f));
        
        customer1.addOrder(order1);
        customer1.addOrder(order2);
        
        customer1.displayMyOrders();
        
        println("--- Done ---");
    }

    private static void println(String msg) {
        System.out.println(msg);
    }
}
