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

    // Approach 2
    private static boolean valParentheses(String str) {
        if (str.isEmpty()) {
            return true;
        }

        StringBuffer exp = new StringBuffer();

        for (int i=0; i<str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == '(' || ch=='{' || ch=='[') {
                exp.append(ch);
            } else {
                char top = exp.charAt(exp.length()-1);
                if ((top == ')' && ch == '(') || (top == '}' && ch == '{') || (top == ']' && ch == '[')) {
                    exp.deleteCharAt(exp.length()-1);
                }
            }
        }

        if (exp.length() == 0) {
            return true;
        } else {
            return false;
        }

    }

    private static boolean isPalindrome(String str) {
        if (str.isEmpty()) {
            return true;
        }

        for (int i=0; i<str.length()/2; i++) {
            if(str.charAt(i) != str.charAt(str.length()-1-i)) {
                return false;
            }
        }

        return true;
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
        // System.out.println(validParentheses(exp));
        // System.out.println(valParentheses(exp));

        String input = "noon";
        System.out.println(isPalindrome(input));
    }
}