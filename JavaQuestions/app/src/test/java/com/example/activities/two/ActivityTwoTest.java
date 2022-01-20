package com.example.activities.two;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

//Uncomment the test class to run the tests for this activity

public class ActivityTwoTest {

    public StringsActivity sa = new StringsActivity();


    @Test
    public void replaceAllSpacesTest1() {
        String replacedSpaces = sa.replaceAllSpaces("Hello World");
        assertTrue(replacedSpaces.equals("Hello-World"));
    }

    @Test
    public void replacAllSpacesTest2() {
        String replacedSpaces = sa.replaceAllSpaces("It's the end of the world as we know it!");
        assertTrue(replacedSpaces.equals("It's-the-end-of-the-world-as-we-know-it!"));
    }

    @Test
    public void replacAllSpacesTest3() {
        String replacedSpaces = sa.replaceAllSpaces("And I feel fine!");
        assertTrue(replacedSpaces.equals("And-I-feel-fine!"));
    }

    @Test
    public void containsWordTest1() {
        boolean containsWord = sa.containsWord("Hello World", "world");
        assertTrue(containsWord);
    }

    @Test
    public void containsWordTest2() {
        boolean containsWord = sa.containsWord("ThiS IS sOme CRAZy TeXT", "crazy");
        assertTrue(containsWord);
    }

    @Test
    public void containsWordTest3() {
        boolean containsWord = sa.containsWord("Some may get some lucky points on this one", "hello");
        assertFalse(containsWord);
    }

    @Test
    public void splitPhoneNumberTest1(){

        String[] numbers = sa.splitPhoneNumber("111-222-3333");

        assertTrue(numbers[0].equals("111"));
        assertTrue(numbers[1].equals("222"));
        assertTrue(numbers[2].equals("3333"));

    }

    @Test
    public void splitPhoneNumberTest2(){
        String[] numbers = sa.splitPhoneNumber("123-456-7890");

        assertTrue(numbers[0].equals("123"));
        assertTrue(numbers[1].equals("456"));
        assertTrue(numbers[2].equals("7890"));
    }

    @Test
    public void splitPhoneNumberTest3(){
        String[] numbers = sa.splitPhoneNumber("555-555-5555");

        assertFalse(numbers[0].equals("111"));
        assertFalse(numbers[1].equals("222"));
        assertFalse(numbers[2].equals("3333"));
    }

}
