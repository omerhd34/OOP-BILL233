package ADVANCED.Exercises1;

public class NumberSystemTable {
    public static void main(String[] args) {
        // Başlıkları yazdır
        System.out.printf("%-10s %-10s %-10s %-10s%n", "Decimal", "Binary", "Octal", "Hexadecimal");
        System.out.println("--------------------------------------------------");

        // 1'den 256'ya kadar olan sayılar için tabloyu oluştur
        for (int i = 1; i <= 256; i++) {
            // Sayının farklı tabanlardaki karşılıklarını hesapla
            String binary = Integer.toBinaryString(i);
            String octal = Integer.toOctalString(i);
            String hexadecimal = Integer.toHexString(i).toUpperCase();

            // Sonucu tablo halinde yazdır
            System.out.printf("%-10d %-10s %-10s %-10s%n", i, binary, octal, hexadecimal);
        }
    }
}
/*
Decimal    Binary     Octal      Hexadecimal
--------------------------------------------------
1          1          1          1
2          10         2          2
3          11         3          3
4          100        4          4
5          101        5          5
...
255        11111111   377        FF
256        100000000  400        100

        NumberSystemTable
+-------------------------------+
|                               |
+-------------------------------+
| + main(args: String[]): void  |
+-------------------------------+

 */