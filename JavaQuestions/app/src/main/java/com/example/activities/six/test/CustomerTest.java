package com.example.activities.six.test;

import com.example.activities.six.model.PremiumCustomer;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class CustomerTest{

    static PremiumCustomer vip = new PremiumCustomer("Steve", 5000.0, "PS5 XBOX", 100.0, 1337, 20);

    @Test
    public void discountPriceTestPositive() {
        assertEquals("Testing 100 dollars", 85.0, vip.discountPrice(100.0));
    }

    @Test
    public void discountPriceTestNegative() {
        assertNotEquals(85.0, vip.discountPrice(90.0));
    }
}
