package MEDIUM.BookExercises0;

import java.util.Scanner;

public class Main2 {
    public void ohd() {
        System.out.println("OHD");
    }

    public void add(int x, int y) {
        System.out.println(x + y);
    }
    public void add(int x, int y, int z) {
        System.out.println(x + y + z);
    }

    public void nameSurname(String name, String surname) {
        System.out.println(name + " " + surname);
    }

    public void number() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Bir sayı gir: ");            // Bir sayı gir: 5
        int sayi = scan.nextInt();
        System.out.println("Girdiğin sayı: " + sayi);  // Girdiğin sayı: 5
    }

    public void factorialWhile() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Bir sayı gir: ");     // 4
        int sayi = scan.nextInt();
        int fact = 1;
        while (sayi > 0) {
            fact *= sayi;
            sayi--;
        }
        System.out.println(fact);  // 24
    }

    public void factorialFor() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Bir sayı gir: ");    // 4
        int sayi = scan.nextInt();
        int fact = 1;

        for (int i = 1; i <= sayi; i++) {
            fact *= i;
        }
        System.out.print(fact);  // 24
    }

    public static void main(String[] args) {
        Main2 x = new Main2();
        x.ohd();         // OHD  (x nesnesi üzerinden ohd() çağrısı yapılıyor.)

        Main2 y = new Main2();
        y.add(5,6);      // 11
        y.add(5,6,7);    // 18

        Main2 z = new Main2();
        z.nameSurname("Ömer Halis" , "DEMİR");   // Ömer Halis DEMİR

        Main2 k = new Main2();
        k.number();   /// Çıktı yukarıda bulunmaktadır.

        Main2 l = new Main2();
        l.factorialWhile();   // 24

        Main2 m = new Main2();
        m.factorialFor();    // 24
    }
}
