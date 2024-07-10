package Functions;

class Addition {
    int sum(int a, int b) {
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

    void hello() {
        System.out.println("Hello World!");
    }
    public static void main(String[] args) {
        System.out.println(add(2,3));
        Test t = new Test();
        t.hello();
        Addition a = new Addition();
        System.out.println(a.sum(2, 5));
    }
    
}