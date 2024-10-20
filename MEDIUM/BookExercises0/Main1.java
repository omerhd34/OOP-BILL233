package MEDIUM.BookExercises0;

import java.util.Scanner;

public class Main1 {
    public static void ohd() {         // static olmaz ise main methodu içinde çağıramayız.
        System.out.println("OHD");
    }

    // Overloading Start
    public static void add(int x, int y) {
        System.out.println(x + y);
    }

    public static void add(int x, int y, int z) {
        System.out.println(x + y + z);
    }
    // Overloading finish


    public static void nameSurname(String name, String surname) {
        System.out.println(name + " " + surname);
    }

    public static void number() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Bir sayı gir: ");            // Bir sayı gir: 5
        int sayi = scan.nextInt();
        System.out.println("Girdiğin sayı: " + sayi);  // Girdiğin sayı: 5
    }

    public static void factorialWhile() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Bir sayı gir: ");     // 4
        int sayi = scan.nextInt();
        int fact = 1;
        while (sayi > 0) {
            fact *= sayi;
            sayi--;
        }
        System.out.println(fact);
    }

    public static void factorialFor() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Bir sayı gir: ");    // 4
        int sayi = scan.nextInt();
        int fact = 1;

        for (int i = 1; i <= sayi; i++) {
            fact *= i;
        }
        System.out.print(fact);
    }

    public static void main(String[] args) {
        ohd();             // OHD
        add(5, 9);         // 14
        add(5, 9, 2);      // 16
        nameSurname("Ömer Halis", "Demir");  // Ömer Halis Demir
        number();          /// Çıktı yukarıda bulunmaktadır.
        factorialWhile();  // 24 (4*3*2*1)
        factorialFor();    // 24 (4*3*2*1)
    }
}
