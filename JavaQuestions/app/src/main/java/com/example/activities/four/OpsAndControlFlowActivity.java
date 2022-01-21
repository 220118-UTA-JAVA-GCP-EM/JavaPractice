package com.example.activities.four;

public class OpsAndControlFlowActivity {

    public String fooBar(int input){

        //Fill out the method below that returns a specific String depending on the input
        //The method should return foo if the input is divisible by 3
        //The method should return bar if the input is divisible by 5
        //The method should return buz id the input is divisible by 3 AND 5
        //Hint use the modulos operator to determine the divisibility of the input
        String answer = "";

        //I know this is ugly but I'm just using else if statements over and over again using the modulos operator
        //to see if a number can be divided perfectly to 0. I'm also using a logical operator to see if the input
        //passes both the 5 and 3 for the final test.
        if(input % 3 == 0){
            answer = "foo";
        } else if (input % 5 == 0){
            answer = "bar";
        } else if (input % 5 == 0 && input % 3 == 0){
            answer = "buz";
        }

        return answer;
    }

    public int sumOfEvens(){
        //Fill out the method below that adds up all of the even numbers from 1 to 100
        //Use a for loop to achieve this
        Integer evenSum = 0;
        for(Integer i = 0; i < 101; i++){
            if(i % 2 == 0){
                evenSum += i;
            }
        }
        return evenSum;
    }

    //Find the minimum of two numbers using ternary operators
    public int minOfTwoNumbers(int a, int b){
        //Fill out this method to return the minimum of two numbers
        //You must use a tenary operator
        //Tenary operator which tests to see if a is smaller then b. If true, returns a, if False, returns b
        return (a < b ? a : b);
    }

    //Reverse a string without using a temporary variable Do NOT use reverse() in the StringBuffer or the StringBuilder APIs
    public String reverse(String input){
        //Fill out this method to take the input string and return it reserved
        //Do NOT use a temporary variable, do NOT use the reverse() in the StringBuffer or StringBuilder classes
        //I can't use a temporary variable? :(

        return "";
    }



}
