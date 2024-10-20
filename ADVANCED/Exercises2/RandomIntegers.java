package ADVANCED.Exercises2;

import java.util.Random;

public class RandomIntegers {
    public static void main(String[] args) {
        Random rand = new Random();

        // a) 1 ≤ n ≤ 2
        int n1 = 1 + rand.nextInt(2); // 1'den başlayıp 2 dahil
        System.out.printf("Random number in range 1 ≤ n ≤ 2: %d\n", n1);

        // b) 1 ≤ n ≤ 100
        int n2 = 1 + rand.nextInt(100); // 1'den başlayıp 100 dahil
        System.out.printf("Random number in range 1 ≤ n ≤ 100: %d\n", n2);

        // c) 0 ≤ n ≤ 9
        int n3 = rand.nextInt(10); // 0'dan başlayıp 9 dahil
        System.out.printf("Random number in range 0 ≤ n ≤ 9: %d\n", n3);

        // d) 1000 ≤ n ≤ 1112
        int n4 = 1000 + rand.nextInt(113); // 1000'den başlayıp 1112 dahil
        System.out.printf("Random number in range 1000 ≤ n ≤ 1112: %d\n", n4);

        // e) -1 ≤ n ≤ 1
        int n5 = -1 + rand.nextInt(3); // -1'den başlayıp 1 dahil
        System.out.printf("Random number in range -1 ≤ n ≤ 1: %d\n", n5);

        // f) -3 ≤ n ≤ 11
        int n6 = -3 + rand.nextInt(15); // -3'ten başlayıp 11 dahil
        System.out.printf("Random number in range -3 ≤ n ≤ 11: %d\n", n6);
    }
}
/*
Random number in range 1 ≤ n ≤ 2: 1
Random number in range 1 ≤ n ≤ 100: 2
Random number in range 0 ≤ n ≤ 9: 6
Random number in range 1000 ≤ n ≤ 1112: 1037
Random number in range -1 ≤ n ≤ 1: 1
Random number in range -3 ≤ n ≤ 11: 2
                RandomIntegers
    ----------------------------------------
    + main(args: String[]): void
    ----------------------------------------

*/