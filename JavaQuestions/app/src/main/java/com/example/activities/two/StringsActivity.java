package com.example.activities.two;

public class StringsActivity {

    //In this activity you will get your hands on some string methods
    public String replaceAllSpaces(String input) {
        //Using the .replaceAll() method, replace all the spaces in the input text with '-'
        String noSpaceString = input.replaceAll(" ", "-");

        //This should be modified to return the correct string
        return noSpaceString;
    }

    public boolean containsWord(String input, String word) {
        //Expect the input to be crazy like this "InPUT iS noT UNIform"
        //Use the string methods .toLowerCase() and .contains to find out if the given word is contained inside of input
        String lowerInput = input.toLowerCase();
        String lowerWord = word.toLowerCase();

        boolean foundWord = false;

        if(lowerInput.contains(word)) foundWord = true;

        //This should be modified to return the correct boolean
        return foundWord;
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
