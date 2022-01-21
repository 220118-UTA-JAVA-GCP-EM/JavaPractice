package com.example.activities.seven;

//Uncomment the test class to run the test for this activity

import com.example.activities.six.PremiumCustomer;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;

//Use JUnit to create tests for the PremiumCustomer class you created in the last exercise
//To get points they must pass, and think about the logic of each method you are testing
//What is changing, and what should the resulting values be after the tested methods
public class CustomerTest {

    public PremiumCustomer pc = new PremiumCustomer();

    @Test
    public void testAddToCart() {
        String cart = pc.addToCart("Bananas", 2);
        double testCost = pc.cartCost;
        assertEquals("Bananas\n", cart);

    }

    @Test
    public void testBuy() {
        pc.buy();
        assertEquals("", pc.cart);
        assertEquals(0,pc.cartCost,0);
        assertEquals(0.0, pc.balance, 0);
    }

    @Test
    public void testDiscountPrice() {
        pc.addToCart("Bananas", 10);
        pc.discountPrice(15);
        assertEquals(10, pc.cartCost,0);
        assertEquals(8.5, pc.balance, 0);
    }
}


