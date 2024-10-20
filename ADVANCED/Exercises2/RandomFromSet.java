package ADVANCED.Exercises2;

import java.util.Random;

public class RandomFromSet {
    public static void main(String[] args) {
        Random rand = new Random();

        // a) Kümesi: 2, 4, 6, 8, 10
        int[] setA = {2, 4, 6, 8, 10};
        int randomA = setA[rand.nextInt(setA.length)]; // Küme boyutundan bir indeks seçiyoruz
        System.out.printf("Random number from set A: %d\n", randomA);

        // b) Kümesi: 3, 5, 7, 9, 11
        int[] setB = {3, 5, 7, 9, 11};
        int randomB = setB[rand.nextInt(setB.length)]; // Küme boyutundan bir indeks seçiyoruz
        System.out.printf("Random number from set B: %d\n", randomB);

        // c) Kümesi: 6, 10, 14, 18, 22
        int[] setC = {6, 10, 14, 18, 22};
        int randomC = setC[rand.nextInt(setC.length)]; // Küme boyutundan bir indeks seçiyoruz
        System.out.printf("Random number from set C: %d\n", randomC);
    }
}
/*
Random number from set A: 4
Random number from set B: 11
Random number from set C: 14
                 RandomFromSet
    ----------------------------------------
    + main(args: String[]): void
    ----------------------------------------

*/