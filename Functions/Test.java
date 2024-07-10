package Functions;

class Addition {
    int sum(int a, int b) {
        return a + b;
    }

    double sum(double a, double b) {
        return a + b;
    }
}

public class Test {
    public static int add(int a, int b) {
        return a + b;
    }
    public static double add(double a, double b) {
        return a + b;
    }

    // Write a java method to find the smallest number among three numbers
    private static int smallesAmongstThree(int a, int b , int c) {
        if (a < b && a < c) {
            return a;
        } else if (b < a && b < c) {
            return b;
        } else {
            return c;
        }
    }

    void hello() {
        System.out.println("Hello World!");
    }
    public static void main(String[] args) {
        // System.out.println(add(2,3));
        // Test t = new Test();
        // t.hello();
        // Addition a = new Addition();
        // System.out.println(a.sum(2, 5));
        // System.out.println(a.sum(2.0, 5.0));

        int a = 3, b = 4, c = 2;
        System.out.println(smallesAmongstThree(a, b, c));
    }
    
}