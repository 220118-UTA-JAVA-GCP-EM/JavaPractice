package com.example.activities.five;
public class ArraysActivity {

    public int[] squares(int ... a) {
        //Given any number of inputs, create an array the correct size
        //Store the square of every number in the array
        int inputArrayLength = a.length;
        int[] inputArray = new int[inputArrayLength];
        int[] outputArray = new int[inputArrayLength];
        for (int i = 0; i < inputArrayLength; i++) {
            outputArray[i] = a[i] * a[i];
        }
         //This should be modified to return the correct array
        return outputArray;
    }

    public int arraySum(int[] nums) {
        //Return the sum of the numbers inside of the given array
        int x = 0;
        for (int i = 0; i < nums.length; i++) {
            x += nums[i];
        }
        //This should be modifed to return the correct number
        return x;
    }

    public double arrayAverage(double[] nums) {
        //Return the average of the numbers given in the array
        int arrayLength = nums.length;
        double sumOfArray = 0.0;

        for (int i = 0; i < arrayLength; i++) {
            sumOfArray += nums[i];
        }

        //This should be modified to return the correct number
        return sumOfArray/arrayLength;
    }

}
