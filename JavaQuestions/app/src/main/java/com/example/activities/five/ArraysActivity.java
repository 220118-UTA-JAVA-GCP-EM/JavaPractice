package com.example.activities.five;

//Uncomment the code to start the activity

public class ArraysActivity {

    public int[] squares(int ... a) {
        //Given any number of inputs, create an array the correct size
        //Store the square of every number in the array
        int[] squaresArray = new int[a.length];

        for(int i = 0; i < squaresArray.length; i++) {
            squaresArray[i] = a[i];
        }

        //This should be modified to return the correct array
        return squaresArray;
    }

    public int arraySum(int[] nums) {
        //Return the sum of the numbers inside of the given array
        int sum = 0;
        for(int i: nums)
            sum = sum + i;

        //This should be modifed to return the correct number
        return sum;
    }

    public double arrayAverage(double[] nums) {
        //Return the average of the numbers given in the array
        double sum = 0.0;
        double average = 0.0;
        for(double i: nums)
            sum = sum + i;
        average = sum / nums.length;

        //This should be modified to return the correct number
        return average;
    }

}
