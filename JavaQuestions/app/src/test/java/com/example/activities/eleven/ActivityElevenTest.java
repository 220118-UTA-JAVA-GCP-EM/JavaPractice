package com.example.activities.eleven;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeSet;

import static org.junit.Assert.assertEquals;
/*
import com.example.activities.six.*;
import com.example.activities.eleven.*;
 */
/*
public class ActivityElevenTest {
    @Test
    public void premiumCustomerComparable(){

        List<PremiumCustomer> customerList = new ArrayList<PremiumCustomer>();
        customerList.add(new PremiumCustomer("test user1", 100 , "", 0.0, "premium user", 123, 1));
        customerList.add(new PremiumCustomer("test user2", 100 , "", 0.0, "premium user", 456, 3));
        customerList.add(new PremiumCustomer("test user3", 100 , "", 0.0, "premium user", 789, 5));
        customerList.add(new PremiumCustomer("test user4", 100 , "", 0.0, "premium user", 789, 2));
        customerList.add(new PremiumCustomer("test user5", 100 , "", 0.0, "premium user", 789, 7));

        Collections.sort(customerList);

        assertEquals(7, customerList.get(1).getYears());
    }

    @Test
    public void premiumCustomerComparator(){

        Set<PremiumCustomer> customerSet =  new TreeSet<>();

        customerSet.add(new PremiumCustomer("test user1", 100 , "", 0.0, "premium user", 123, 1));
        customerSet.add(new PremiumCustomer("test user2", 100 , "", 0.0, "premium user", 456, 3));
        customerSet.add(new PremiumCustomer("test user3", 100 , "", 0.0, "premium user", 789, 5));
        customerSet.add(new PremiumCustomer("test user4", 100 , "", 0.0, "premium user", 789, 2));
        customerSet.add(new PremiumCustomer("test user5", 100 , "", 0.0, "premium user", 789, 7));

        PremiumCustomer[] customArr = customerSet.toArray();

        assertEquals(7, customArr[0].getYears());

    }
}
*/