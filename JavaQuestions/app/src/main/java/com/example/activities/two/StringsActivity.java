package com.example.activities.two;
//Uncomment the code to complete the activity

public class StringsActivity {
    
    public String sentence = "";
    public String phoneNumber = "";

    public StringsActivity(){
        
    }
    
    public StringsActivity(String s){
        this.sentence = s;
        this.phoneNumber = s;
    }
    
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

        //This should be modified to return the correct boolean
        if (input.toLowerCase().contains(word.toLowerCase())) {
            return true;
        } else {
            return false;
        }
    }

    String[] splitPhoneNumber(String phone){

        //Given a normal phone number like this 111-222-3333
        //Use the .split() method to store only the numbers in three indexes of a String array
        //Example -> "111-222-3333" -> [111,222,3333]
        String[] numberArr = new String[3];

        numberArr = phone.split("-");

        return numberArr;
    }

    public static void main(String args[]) {

        StringsActivity s = new StringsActivity("Hey there, how are you?");
        System.out.println(s.replaceAllSpaces(s.sentence));
        System.out.println(s.containsWord(s.sentence, "hey"));
        StringsActivity s1 = new StringsActivity("123-456-7890");
        String[] s2 = s1.splitPhoneNumber(s1.sentence);
        int i = 0;
        while(i<3){
            System.out.println(s2[i]);
            i++;
        }

    }

}
