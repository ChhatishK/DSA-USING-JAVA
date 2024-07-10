package Strings;
import java.util.*;
public class Exercise {
    // Valid Parantheses
    public static boolean validParentheses(String str){
        Stack<Character> s = new Stack<>();
        


        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);

            if(ch == '(' || ch == '{' || ch == '['){
                s.push(ch);
            }
            else{

                if(s.isEmpty()){
                    return false;
                }
                char top = s.peek();
                if((top == '(' && ch == ')')|| (top == '{' && ch == '}')|| (top == '[' && ch == ']' )){
                    s.pop();
                }
                else{
                  return false;
                }

                
            }
        }
        if(s.isEmpty()){
            return true;
        }
        else{
            return false;
        }
        
    }

    public static void main(String[] args) {
        
        // String str1 = "This is Exercise 1";
        // String str2 = "This is Exercise 1";

        // int response = str1.compareTo(str2);
        // // int response = str1.equalsIgnoreCase(str2);

        // if (response == 0) {
        //     System.out.println("\""+str1+"\""+" is equal to "+"\""+str2+"\"");
        // } else {
        //     System.out.println(str1+" is not equal to "+str2);
        // }

        String exp = "({[]})";
        System.out.println(validParentheses(exp));
    }
}