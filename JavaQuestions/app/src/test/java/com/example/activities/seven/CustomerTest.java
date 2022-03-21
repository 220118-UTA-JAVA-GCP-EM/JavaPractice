package com.example.activities.seven;

import org.junit.Test;
import static org.junit.Assert.*;
import com.example.activities.six.*;

//Use JUnit to create tests for the PremiumCustomer class you created in the last exercise
//To get points they must pass, and think about the logic of each method you are testing
//What is changing, and what should the resulting values be after the tested methods
public class CustomerTest {

    public PremiumCustomer premiumCustomer = new PremiumCustomer();

    //Generic Method stub for you to fill in
    @Test
    public void testAddToCart(){
        String item = "beer";
        premiumCustomer.addToCart("beer", 10);
    }

    //Generic Method stub for you to fill in
    public void testBuy(){

    }

    //Generic Method stub for you to fill in
    public void testDiscountPrice(){

    }


}