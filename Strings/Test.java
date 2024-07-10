package Strings;

public class Test {

    public static void main(String[] args) {
        String str = "Hello dear NIET Students";
        System.out.println(str);
        String str1 = new String("Hello NIETIAN's");
        System.out.println(str1);
        int len = str.length();
        System.out.println("Length : "+len);
        System.out.println(str1.charAt(3));
        System.out.println(str1.substring(2,7));
        System.out.println(str.concat(str1));
        System.out.println(str.toLowerCase());
        System.out.println(str1.toLowerCase());
        System.out.println(str.toUpperCase());
        System.out.println(str1.toUpperCase());
        System.out.println(str1.replace('l', 't'));
        System.out.println(str1.contains("NIET"));
        System.out.println(str1.indexOf('l'));
        System.out.println(str1.trim());
    }
}