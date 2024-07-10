package Strings;

import java.util.Scanner;

/**
 * Exercise
 */
public class Exercise {

    public static void main(String[] args) {
        
        String str1 = "This is Exercise 1";
        String str2 = "This is Exercise 1";

        int response = str1.compareTo(str2);

        if (response == 0) {
            System.out.println("\""+str1+"\""+" is equal to "+"\""+str2+"\"");
        } else {
            System.out.println(str1+" is not equal to "+str2);
        }
    }
}