package com.example.activities.three;

import com.example.activities.three.WrapperActivity;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class ActivityThreeTest {

    public WrapperActivity wa = new WrapperActivity();

    @Test
    public void convertToStringTest1(){
        int num = wa.convertToInteger("4", "5");

        assertEquals(9, num);
    }

    @Test
    public void convertToStringTest2(){
        int num = wa.convertToInteger("10", "7");

        assertEquals(17, num);
    }

    @Test
    public void convertToStringTest3(){
        int num = wa.convertToInteger("10", "10");

        assertNotEquals(10, num);
    }

    @Test
    public void maxValueTest1(){
        int actual = 2147483647;
        int test = wa.maxValue();

        assertEquals(actual, test);
    }

    @Test
    public void maxValueTest2(){
        int test = wa.maxValue();

        assertNotEquals(10, test);
    }


}
