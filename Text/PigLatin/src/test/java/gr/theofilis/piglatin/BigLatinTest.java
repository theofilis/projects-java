package gr.theofilis.piglatin;

import junit.framework.TestCase;

/**
 *
 * @author Theofilis
 */
public class BigLatinTest extends TestCase {
    
    public BigLatinTest(String testName) {
        super(testName);
    }
    
    @Override
    protected void setUp() throws Exception {
        super.setUp();
    }
    
    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }

    /**
     * Test of encode method, of class BigLatin.
     */
    public void testEncodeHappy() {
        String word = "happy";
        String expResult = "appyhay";
        String result = BigLatin.encode(word);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of encode method, of class BigLatin.
     */
    public void testEncodeDuck() {
        String word = "duck";
        String expResult = "uckday";
        String result = BigLatin.encode(word);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of encode method, of class BigLatin.
     */
    public void testEncodeGlove() {
        String word = "glove";
        String expResult = "oveglay";
        String result = BigLatin.encode(word);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of encode method, of class BigLatin.
     */
    public void testEncodeEgg() {
        String word = "egg";
        String expResult = "eggway";
        String result = BigLatin.encode(word);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of encode method, of class BigLatin.
     */
    public void testEncodeInbox() {
        String word = "inbox";
        String expResult = "inboxway";
        String result = BigLatin.encode(word);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of encode method, of class BigLatin.
     */
    public void testEncodeEight() {
        String word = "eight";
        String expResult = "eightway";
        String result = BigLatin.encode(word);
        assertEquals(expResult, result);
    }
    
}
