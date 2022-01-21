package com.example.activities.three;
//Uncomment the code to start this activity

public class WrapperActivity {

    Integer convertToInteger(String num1, String num2){
        //Given the string above, convert them to integers, and return the sum
        Integer int1 = Integer.parseInt(num1);
        Integer int2 = Integer.parseInt(num2);
        int sum = int1 + int2;

        //Change the return to be correct
        return sum;
    }

    Integer maxValue(){
        //Return the max value of an integer

        return Integer.MAX_VALUE;
    }

}

