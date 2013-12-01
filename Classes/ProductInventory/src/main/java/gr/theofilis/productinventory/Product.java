package gr.theofilis.productinventory;

public class Product {

    private float price;
    private long id;
    private int quantity;

    public Product() {
        this(0, 0, 0);
    }
   
    public Product(float price, long id, int quantity) {
        this.price = price;
        this.id = id;
        this.quantity = quantity;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    
    public void updateQuantity(String method) throws Exception {
        if(method.equalsIgnoreCase("add")) {
            this.quantity++;
        } else if (method.equalsIgnoreCase("subtract")) {
            this.quantity--;
        } else {
            throw new Exception("Invalid method");
        }
    }
    
}
