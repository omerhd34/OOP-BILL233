package ARRAYS.BookExercises;

public class SalesCommissions {
    public static void main(String[] args) {
        // Brüt satış miktarlarını temsil eden örnek bir dizi
        double[] grossSales = {5000, 4000, 3000, 2000, 1500, 8000, 7000, 1000, 6000, 3500};

        // Maaş aralıklarını saymak için bir sayaç dizisi (0-8 arasındaki indeksler)
        int[] salaryRanges = new int[9];

        // Her satış elemanının maaşını hesapla ve aralığa yerleştir
        for (double sales : grossSales) {
            // Maaşı hesapla: 200$ taban maaşı ve satışın %9'u
            int salary = (int) (200 + sales * 0.09);

            // Kazanç aralığına göre uygun sayaç dizisini güncelle
            if (salary >= 200 && salary <= 299)
                salaryRanges[0]++;
            else if (salary >= 300 && salary <= 399)
                salaryRanges[1]++;
            else if (salary >= 400 && salary <= 499)
                salaryRanges[2]++;
            else if (salary >= 500 && salary <= 599)
                salaryRanges[3]++;
            else if (salary >= 600 && salary <= 699)
                salaryRanges[4]++;
            else if (salary >= 700 && salary <= 799)
                salaryRanges[5]++;
            else if (salary >= 800 && salary <= 899)
                salaryRanges[6]++;
            else if (salary >= 900 && salary <= 999)
                salaryRanges[7]++;
            else // 1000 ve üzeri
                salaryRanges[8]++;
        }

        // Sonuçları tablo formatında özetle
        System.out.println("Salary Range\tNumber of Salespeople");
        System.out.printf("$200-$299:\t\t%d\n", salaryRanges[0]);
        System.out.printf("$300-$399:\t\t%d\n", salaryRanges[1]);
        System.out.printf("$400-$499:\t\t%d\n", salaryRanges[2]);
        System.out.printf("$500-$599:\t\t%d\n", salaryRanges[3]);
        System.out.printf("$600-$699:\t\t%d\n", salaryRanges[4]);
        System.out.printf("$700-$799:\t\t%d\n", salaryRanges[5]);
        System.out.printf("$800-$899:\t\t%d\n", salaryRanges[6]);
        System.out.printf("$900-$999:\t\t%d\n", salaryRanges[7]);
        System.out.printf("$1000 and over:\t%d\n", salaryRanges[8]);
    }
}
/*
Salary Range	Number of Salespeople
$200-$299:		1
$300-$399:		2
$400-$499:		1
$500-$599:		2
$600-$699:		1
$700-$799:		1
$800-$899:		1
$900-$999:		1
$1000 and over:	0

+-----------------------------------------+
|           SalesCommissions              |
+-----------------------------------------+
|                                         |
+-----------------------------------------+
| + main(args: String[]): void            |
+-----------------------------------------+
*/