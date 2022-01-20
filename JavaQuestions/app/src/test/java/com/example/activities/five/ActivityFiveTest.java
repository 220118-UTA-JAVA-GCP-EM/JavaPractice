package com.example.activities.five;

import org.checkerframework.checker.units.qual.A;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
//Uncomment the test class to run the test for this activity

public class ActivityFiveTest {

    public ArraysActivity aa = new ArraysActivity();

    @Test
    public void squaresTest1() {
        int arr[] = aa.squares(1, 2, 3, 4);
        assertEquals(1, arr[0]);
        assertEquals(4, arr[1]);
        assertEquals(9, arr[2]);
        assertEquals(16, arr[3]);
    }

    @Test
    public void squaresTest2() {
        int arr[] = aa.squares(33, 14, 8, 29);
        assertEquals(1089, arr[0]);
        assertEquals(196, arr[1]);
        assertEquals(64, arr[2]);
        assertEquals(841, arr[3]);
    }

    @Test
    public void arraySumTest1() {
        int arr[] = {1,2,3,4};
        int sum = aa.arraySum(arr);
        assertEquals(10, sum);
    }

    @Test
    public void arraySumTest2() {
        int arr[] = {15,39,4,11};
        int sum = aa.arraySum(arr);
        assertEquals(69, sum);
    }

    @Test
    public void arrayAverageTest1() {
        double arr[] = {5.0, 9.0, 4.0, 11.0};
        double avg = aa.arrayAverage(arr);
        assertEquals(7.25, avg, 0.01);
    }

    @Test
    public void arrayAverageTest2() {
        double arr[] = {19.0, 2.5, 53.0, 13.0};
        double avg = aa.arrayAverage(arr);
        assertEquals(21.875, avg, 0.01);
    }
}


