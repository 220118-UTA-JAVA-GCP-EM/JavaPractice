package com.example.activities.four;

//Uncomment the code to start the activity

public class OpsAndControlFlowActivity {

    public String fooBar(int input){

        //Fill out the method below that returns a specific String depending on the input
        //The method should return foo if the input is divisible by 3
        //The method should return bar if the input is divisible by 5
        //The method should return buz id the input is divisible by 3 AND 5
        //Hint use the modulos operator to determine the divisibility of the input
        if (((input % 3) == 0) && ((input % 5) == 0)){
            System.out.println("buz");
            return "buz";
        } else if ((input % 5) == 0){
            System.out.println("bar");
            return "bar";
        } else if ((input % 3) == 0){
            System.out.println("foo");
            return "foo";
        } else {
            System.out.println("not divisible by 3 or 5");
            return "not divisible by 3 or 5";
        }

    }

    public int sumOfEvens(){
        //Fill out the method below that adds up all of the even numbers from 1 to 100
        //Use a for loop to achieve this
        int sum = 0;
        for(int i = 0; i< 101; i++){
            if((i % 2) == 0){
                sum = (sum + i);
            }
        }
        System.out.println(String.valueOf(sum));
        return sum;
    }

    //Find the minimum of two numbers using ternary operators
    public int minOfTwoNumbers(int a, int b){
        //Fill out this method to return the minimum of two numbers
        //You must use a tenary operator

        if(a != b){
            int compare = ((a < b) ? a : b);
            System.out.println("the lesser number is: " + String.valueOf(compare));
            return compare;
        } else {
            System.out.println("the numbers are equal");
            return 0;
        }

    }

    //Reverse a string without using a temporary variable Do NOT use reverse() in the StringBuffer or the StringBuilder APIs
    public String reverse(String input){
        //Fill out this method to take the input string and return it reversed
        //Do NOT use a temporary variable, do NOT use the reverse() in the StringBuffer or StringBuilder classes

        String reversed = "";
        int i = 0;
        for (i = input.length(); i > 0; i--){
            char c = input.charAt((i - 1));
            reversed = reversed + c;
        }

        System.out.println(reversed);
        return reversed;
    }

    public static void main(String args[]) {

        OpsAndControlFlowActivity op = new OpsAndControlFlowActivity();
        op.fooBar(15);
        //System.out.println(op.fooBar(15).toString());
        op.fooBar(3);
        //System.out.println(op.fooBar(3).toString());
        op.fooBar(5);
        //System.out.println(op.fooBar(5).toString());
        op.fooBar(1);
        //System.out.println(op.fooBar(1).toString());
        //System.out.println(Integer.toString(op.sumOfEvens()));
        op.sumOfEvens();
        //System.out.println(Integer.toString(op.minOfTwoNumbers(5, 3)));
        op.minOfTwoNumbers(5, 3);
        //System.out.println(Integer.toString(op.minOfTwoNumbers(1, 1)));
        op.minOfTwoNumbers(1, 1);
        //System.out.println(op.reverse("Pickle Rick!"));
        op.reverse("Pickle Rick!");

    }

}



