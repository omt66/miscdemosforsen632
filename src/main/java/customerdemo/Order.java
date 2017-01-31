/*
 *  NU Educational License - 2017
 */
package customerdemo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Ogun otigli@gmail.com
 */
public class Order {
    private Date orderDate;
    private List<LineItem> lineItems = new ArrayList<LineItem>();
    
    public Order() {
        orderDate = new Date();
    }
    
    public void addLineItem(LineItem item) {
        lineItems.add(item);
    }
    
    public double calculatePrice() {
        int len = lineItems.size();
        double totalPrice = 0;
        
//        for (int i=0;i < len;i++) {
//            LineItem item = lineItems.get(i);
//            
//            System.out.println(" * item " + item);
//            
//            totalPrice += item.calculatePrice();
//        }

        for (LineItem item: lineItems) {
            System.out.println(" * item " + item);
            totalPrice += item.calculatePrice();
        }
        
        return totalPrice;
    }

    @Override
    public String toString() {
        String info = "Order on " + orderDate;
        
        info += "\n * Total price for the items: " + calculatePrice();
        
        return info;
    }
    
    
}
