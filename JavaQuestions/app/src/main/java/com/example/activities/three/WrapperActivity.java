package com.example.activities.three;
//Uncomment the code to start this activity

public class WrapperActivity {


    public Integer convertToInteger(String num1, String num2){
        //Given the string above, convert them to integers, and return the sum
        Integer add = (Integer.valueOf(num1) + Integer.valueOf(num2));

        boolean b = false;
        String s = "false";

        if(add instanceof Integer){
            b = true;
            s = "true";
            System.out.println(s);
        } else {
            System.out.println(s);
        }

        System.out.println("the sum is: " + add.toString());
        //Change the return to be correct
        return add;
    }

    public Integer maxValue(){
        //Return the max value of an integer
        System.out.println(Integer.MAX_VALUE);
        return Integer.MAX_VALUE;
    }

    public static void main(String args[]) {

        WrapperActivity w = new WrapperActivity();
        System.out.println(w.convertToInteger("8", "10").toString());
        System.out.println(w.maxValue().toString());
    }
}

