package com.example.activities.three;

public class WrapperActivity {

    Integer convertToInteger(String num1, String num2){
        //Given the string above, convert them to integers, and return the sum
        //Converted these to integers using the parseInt method. (Wrapping - Autoboxing)
        Integer int1 = Integer.parseInt(num1);
        Integer int2 = Integer.parseInt(num2);
        //Change the return to be correct
        Integer sum = int1 + int2;
        return sum;
    }

    Integer maxValue(){
        //Return the max value of an integer
        return 2147483647;
    }

}
