class Nto1 {
    public static void main(String args[]) {
        func(5);
    }

    // N to 1
    // static void func(int n) {
    //     if (n == 0) return;
    //     System.out.println(n);
    //     func(n-1);
    // }

    // 1 to N
    // static void func(int n) {
    //     if (n == 0) return;
    //     func(n-1);
    //     System.out.println(n);
    // }

    // N to 1 and 1 to N
    static void func(int n) {
        if (n == 0) return;
        System.out.print(n+" ");
        func(n-1);
        System.out.print(n+" ");
    }
}