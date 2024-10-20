package MEDIUM.BookExercises4;

public class Interest {
    public static void main(String[] args) {
        double amount; // amount on deposit at end of each year
        double principal = 1000.0; // initial amount before interest

        // Display headers
        System.out.printf("%s%20s\n", "Year", "Amount on deposit");

        // Loop through each interest rate from 5% to 10%
        for (double rate = 0.05; rate <= 0.07; rate += 0.01) {
            System.out.printf("\nInterest rate: %.0f%%\n", rate * 100);

            // Calculate amount on deposit for each of ten years
            for (int year = 1; year <= 5; year++) {
                // Calculate new amount for the specified year
                amount = principal * Math.pow(1.0 + rate, year);

                // Display the year and the amount
                System.out.printf("%4d%,20.2f\n", year, amount);
            }
        }
    }
}
/*
Year   Amount on deposit

Interest rate: 5%
   1            1.050,00
   2            1.102,50
   3            1.157,63
   4            1.215,51
   5            1.276,28

Interest rate: 6%
   1            1.060,00
   2            1.123,60
   3            1.191,02
   4            1.262,48
   5            1.338,23

Interest rate: 7%
   1            1.070,00
   2            1.144,90
   3            1.225,04
   4            1.310,80
   5            1.402,55

UML :
-------------------------------------------
|                Interest                 |
-------------------------------------------
| + main(args: String[]): void            |
-------------------------------------------
*/