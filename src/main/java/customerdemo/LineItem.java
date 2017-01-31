/*
 *  NU Educational License - 2017
 */
package customerdemo;

/**
 *
 * @author Ogun otigli@gmail.com
 */
public class LineItem {
    private String name;
    private int count;
    private float price;

    public LineItem(String name, int count, float price) {
        this.name = name;
        this.count = count;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
    
    
    public double calculatePrice() {
        double totalPrice;
        
        totalPrice = price*count;
        
        return totalPrice;
    }
    
    @Override
    public String toString() {
        String info = "Item name: " + name 
                        + " count: " + count 
                        + " price: " + price
                        + " total price: " + calculatePrice();
        
        return info;
    }
}
