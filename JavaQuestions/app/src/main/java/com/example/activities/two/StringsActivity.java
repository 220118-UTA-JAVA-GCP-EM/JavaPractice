package com.example.activities.two;
//Uncomment the code to complete the activity

import java.util.Locale;

public class StringsActivity {

    //In this activity you will get your hands on some string methods
    public String replaceAllSpaces(String input) {
        //Using the .replaceAll() method, replace all the spaces in the input text with '-'

        input = input.replaceAll(" ", "-");

        //This should be modified to return the correct string
        return input;
    }

    public boolean containsWord(String input, String word) {
        //Expect the input to be crazy like this "InPUT iS noT UNIform"
        //Use the string methods .toLowerCase() and .contains to find out if the given word is contained inside of input

        input = input.toLowerCase();
        word = word.toLowerCase();


        //This should be modified to return the correct boolean
        return input.contains(word);
    }

    String[] splitPhoneNumber(String phone){

        //Given a normal phone number like this 111-222-3333
        //Use the .split() method to store only the numbers in three indexes of a String array
        //Example -> "111-222-3333" -> [111,222,3333]
        String[] numberArr = new String[3];

        numberArr = phone.split("-");


        return numberArr;
    }

}
