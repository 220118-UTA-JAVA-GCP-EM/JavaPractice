/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package com.example;

import com.example.activities.one.Foo;
import com.example.activities.two.StringsActivity;

public class App {


    public static void main(String[] args) {

        //assignment 1
        Foo f = new Foo("bar argument");
        f.printBar();

        //assignment 2
        StringsActivity sa = new StringsActivity();
        String test1 = "This is a no spaces test...";
        System.out.println(test1);

        String noSpaces = sa.replaceAllSpaces(test1);
        System.out.println(noSpaces);

        System.out.println("-------------------");

        String testWord = "this";
        if (sa.containsWord(test1, testWord)) {
            System.out.println("The string contains the word: " + testWord);
        }
        else{
            System.out.println("The string does NOT contain the word: " + testWord);
        }

    }
}
