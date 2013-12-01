package gr.theofilis.productinventory;

import java.util.ArrayList;
import java.util.List;

public class ProductInvetory {

    List<Product> invetory;

    public ProductInvetory() {
        this.invetory = new ArrayList<Product>();
    }

    public void add(Product product) {
        invetory.add(product);
    }

    public void printInvetory() {
        float value = 0;
        for (Product product : invetory) {
            System.out.printf("%d\t%s\t%.02f \n", product.getId(),
                    product.getQuantity(),
                    product.getPrice());
            value += (product.getPrice() * product.getQuantity());
        }
        System.out.printf("\nTotal value: %.02f", value);
    }
}
