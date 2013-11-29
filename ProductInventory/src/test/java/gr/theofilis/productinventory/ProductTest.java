/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gr.theofilis.productinventory;

import junit.framework.TestCase;
import org.junit.Test;

/**
 *
 * @author Theofilis George
 */
public class ProductTest extends TestCase {

    /**
     * Test of getId method, of class Product.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        Product instance = new Product();
        long expResult = 0L;
        long result = instance.getId();
        assertEquals(expResult, result);
    }

    /**
     * Test of setId method, of class Product.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        long id = 0L;
        Product instance = new Product();
        instance.setId(id);
         assertEquals(id, instance.getId());
    }

    /**
     * Test of getPrice method, of class Product.
     */
    @Test
    public void testGetPrice() {
        System.out.println("getPrice");
        Product instance = new Product();
        float expResult = 0.0F;
        float result = instance.getPrice();
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of setPrice method, of class Product.
     */
    @Test
    public void testSetPrice() {
        System.out.println("setPrice");
        float price = 0.0F;
        Product instance = new Product();
        instance.setPrice(price);
         assertEquals(price, instance.getPrice());
    }

    /**
     * Test of getQuantity method, of class Product.
     */
    @Test
    public void testGetQuantity() {
        System.out.println("getQuantity");
        Product instance = new Product();
        int expResult = 0;
        int result = instance.getQuantity();
        assertEquals(expResult, result);
    }

    /**
     * Test of setQuantity method, of class Product.
     */
    @Test
    public void testSetQuantity() {
        System.out.println("setQuantity");
        int quantity = 1;
        Product instance = new Product();
        instance.setQuantity(quantity);
        assertEquals(quantity, instance.getQuantity());
    }

    /**
     * Test of updateQuantity method, of class Product.
     */
    @Test
    public void testUpdateAddQuantity() throws Exception {
        System.out.println("updateQuantity");
        String method = "add";
        Product instance = new Product();
        int exResult = instance.getQuantity() + 1;
        instance.updateQuantity(method);
        assertEquals(exResult, instance.getQuantity());
    }
    
        /**
     * Test of updateQuantity method, of class Product.
     */
    @Test
    public void testUpdateSubtractQuantity() throws Exception {
        System.out.println("updateQuantity");
        String method = "subtract";
        Product instance = new Product(1, 1, 2);
        int exResult = instance.getQuantity() - 1;
        instance.updateQuantity(method);
        assertEquals(exResult, instance.getQuantity());
    }

}