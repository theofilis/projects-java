/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gr.theofilis.productinventory;

import junit.framework.TestCase;
import org.junit.Test;

/**
 *
 * @author as_tr_000
 */
public class ProductInvetoryTest extends TestCase {

    @org.junit.Test
    public void testAdd() {
        System.out.println("add");
        ProductInvetory invetory = new ProductInvetory();
        invetory.add(new Product(1.5f, 1l, 10));
        invetory.printInvetory();
    }

    /**
     * Test of printInvetory method, of class ProductInvetory.
     */
    @Test
    public void testPrintInvetory() {
        System.out.println("printInvetory");
        ProductInvetory invetory = new ProductInvetory();
        invetory.add(new Product(1.5f, 1l, 10));
        invetory.add(new Product(3f, 2l, 20));
        invetory.add(new Product(5f, 3l, 10));
        invetory.printInvetory();
    }
}