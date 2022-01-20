package com.example.activities.five;

//Uncomment the code to start the activity

public class ArraysActivity {

    public int[] squares(int ... a) {
        //Given any number of inputs, create an array the correct size
        //Store the square of every number in the array

        int[] squares = new int[a.length];
        for (int i = 0; i < squares.length; i++){
            squares[i] = a[i]*a[i];
        }

        //This should be modified to return the correct array
        return squares;
    }

    public int arraySum(int[] nums) {
        //Return the sum of the numbers inside of the given array
        int sum = 0;
        for (int i = 0; i < nums.length; i++){
            sum += nums[i];
        }

        //This should be modifed to return the correct number
        return sum;
    }

    public double arrayAverage(double[] nums) {
        //Return the average of the numbers given in the array
        double sum = 0;

        for (int i = 0; i < nums.length; i++){
            sum += nums[i];
        }
        double avg = sum / nums.length;
        //This should be modified to return the correct number
        return avg;
    }

}
