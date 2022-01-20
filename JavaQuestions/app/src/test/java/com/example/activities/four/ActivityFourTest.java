package com.example.activities.four;

import org.junit.Test;

import static org.junit.Assert.*;
//Uncomment the test class to run the test for this activity

public class ActivityFourTest {

    public OpsAndControlFlowActivity cfa = new OpsAndControlFlowActivity();

    @Test
    public void fooBarTest1() {
        String foo = cfa.fooBar(3);
        assertEquals("foo", foo);
    }

    @Test
    public void fooBarTest2() {
        String foo = cfa.fooBar(5);
        assertEquals("bar", foo);
    }

    @Test
    public void fooBarTest3() {
        String foo = cfa.fooBar(15);
        assertEquals("buz", foo);
    }

    @Test
    public void addEvensTest() {
        int num = cfa.sumOfEvens();
        assertEquals(2550, num);
    }

    @Test
    public void minOfTwoNumbersTest1(){
        int num = cfa.minOfTwoNumbers(1,2);
        assertEquals(1, num);
    }

    @Test
    public void minOfTwoNumbersTest2(){
        int num = cfa.minOfTwoNumbers(2,3);
        assertNotEquals(3, num);
    }
/*
    @Test
    public void reverseStringTest1(){
        String reversed = cfa.reverse("foobar");

        assertTrue(reversed.equals("raboof"));
    }

    @Test
    public void reverseStringTest2(){
        String reversed = cfa.reverse("hotdog");

        assertTrue(reversed.equals("godtoh"));
    }

    @Test
    public void reverseStringTest3(){
        String reversed = cfa.reverse("testing");

        assertTrue(!reversed.equals("testing"));
    }

*/
}
