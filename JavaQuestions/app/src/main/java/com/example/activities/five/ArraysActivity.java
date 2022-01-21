package com.example.activities.five;

//Uncomment the code to start the activity

public class ArraysActivity {

    public int[] squares(int ... a) { //same as passing in (int a1, int a2, int a3)
        //Given any number of inputs, create an array the correct size
        //Store the square of every number in the array

        int[] square = new int[a.length];
        String sq = "";

        for (int j = 0; j < a.length; j++){
            square[j] = ((a[j])*(a[j]));
            sq = sq + Integer.toString(((a[j])*(a[j]))) + ", ";
        }

        //This should be modified to return the correct array
        System.out.println("the array's squares are: " + sq);
        return square;
    }

    public int arraySum(int[] nums) {
        //Return the sum of the numbers inside of the given array
        int sum = 0;

        for (int j = 0; j < nums.length; j++){
            sum = (sum + nums[j]);
        }

        //This should be modifed to return the correct number
        System.out.println("the array's sum is: " + Integer.toString(sum));
        return sum;
    }

    public double arrayAverage(double[] nums) {
        //Return the average of the numbers given in the array

        double sum = 0;

        for (int j = 0; j < nums.length; j++){
            sum = sum + nums[j];
        }

        //This should be modified to return the correct number
        System.out.println("the array's average is: " + Double.toString((sum/(nums.length))));
        return (sum/(nums.length));
    }

    public static void main(String args[]) {

        ArraysActivity arr = new ArraysActivity();
        arr.squares(5, 4, 9, 3, 6, 1);
        int[] a = {5, 4, 9, 3, 6, 1};
        arr.arraySum(a);
        double[] d = {1.0, 3.4, 5.6, 99.0, 88.6};
        arr.arrayAverage(d);

    }

}
