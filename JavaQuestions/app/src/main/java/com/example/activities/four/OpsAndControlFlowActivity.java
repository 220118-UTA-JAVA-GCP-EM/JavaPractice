package com.example.activities.four;

//Uncomment the code to start the activity

import java.awt.font.LineMetrics;

public class OpsAndControlFlowActivity {

    public String fooBar(int input){

        //Fill out the method below that returns a specific String depending on the input
        //The method should return foo if the input is divisible by 3
        //The method should return bar if the input is divisible by 5
        //The method should return buz id the input is divisible by 3 AND 5
        //Hint use the modulos operator to determine the divisibility of the input
        if (input % 3 == 0){
            if (input % 5 ==0){
                return "buz";
            }
            return "foo";
        } else if(input % 5 == 0){
            return "bar";
        }else {
            return "";
        }

    }

    public int sumOfEvens(){
        //Fill out the method below that adds up all of the even numbers from 1 to 100
        //Use a for loop to achieve this
        int sum = 0;
        for(int i = 0; i < 101;  i++){
            if (i % 2 == 0){
                sum += i;
            }
        }


        return sum;
    }

    //Find the minimum of two numbers using ternary operators
    public int minOfTwoNumbers(int a, int b){
        //Fill out this method to return the minimum of two numbers
        //You must use a tenary operator

        int min = a <= b ? a: b;

        return min;
    }

    //Reverse a string without using a temporary variable Do NOT use reverse() in the StringBuffer or the StringBuilder APIs
    public String reverse(String input){
        //Fill out this method to take the input string and return it reserved
        //Do NOT use a temporary variable, do NOT use the reverse() in the StringBuffer or StringBuilder classes
        StringBuilder sb = new StringBuilder();

        for (int i = input.length()-1; i >=0; i--){
            sb.append(input.charAt(i));
        }

        return sb.toString();
    }



}

