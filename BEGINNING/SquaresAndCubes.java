package BEGINNING;

public class SquaresAndCubes {
    public static void main(String[] args) {
        // Başlıkları yazdır
        System.out.printf("%-10s%-10s%-10s%n", "number", "square", "cube");

        // 0'dan 10'a kadar olan sayılar için döngü
        for (int number = 0; number <= 5; number++) {
            int square = number * number;
            int cube = number * number * number;

            // Sayı, karesi ve küpü üç sütun halinde yazdır
            System.out.printf("%-10d%-10d%-10d%n", number, square, cube);
        }
    }
}
/*
number    square    cube
0         0         0
1         1         1
2         4         8
3         9         27
4         16        64
5         25        125
*/