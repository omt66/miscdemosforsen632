/*
 *  NU Educational License - 2017
 */
package customerdemo;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Ogun otigli@gmail.com
 */
public class Customer {
    private String name;
    private int age;
    private String phoneNo;
    private List<Order> orders = new ArrayList<Order>();
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public Customer(String name, int age, String phoneNo) {
        this.name = name;
        this.age = age;
        this.phoneNo = phoneNo;
    }
    
    public void addOrder(Order order) {
        // Need to add the order to a collection!
        this.orders.add(order);
    }
    
    
    void printInfo() {
        System.out.println("My name is " + name + ", I am " 
                + age + " years old. "
                + " My contact info is " + phoneNo);
    }
    
    
    public void displayMyOrders() {
        System.out.println("Orders for " + name);
        
        int len = orders.size();
        
        for (int i=0;i < len;i++) {
            Order order = orders.get(i);
            
            System.out.println(" Order: " + order.toString());
        }        
    }    
}
