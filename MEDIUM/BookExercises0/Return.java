package MEDIUM.BookExercises0;

public class Return {
    public Return() {
    }

    public static void add1(int a, int b, int c) {
        System.out.println(a + b + c);
    }

    public static int add2(int x, int y, int z) {
        return x + y + z;
    }

    public static int ucCarp(int m) {
        return m * 3;
    }

    public static int ikiTopla(int n) {
        return n + 2;
    }

    public static int dortCıkart(int k) {
        return k - 4;
    }

    public static void main(String[] args) {
        System.out.println("Method'dan dönen değer : " + add2(3, 4, 5));                    // 12
        System.out.println("Method'dan dönen değer : " + ucCarp(ikiTopla(dortCıkart(5))));  // 9
    }
}