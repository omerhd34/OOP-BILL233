package MEDIUM.BookExercises2;

import java.util.Scanner;

public class TwoLargestFinder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Initialize the necessary variables
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        int number;

        System.out.println("Enter 5 integers:");

        // 5 sayıyı işlemek için döngü
        for (int counter = 1; counter <= 5; counter++) {
            System.out.print("Enter number " + counter + ": ");
            number = input.nextInt();

            // Girilen sayının mevcut en büyük sayıdan büyük olup olmadığını kontrol et.
            if (number > largest) {
                // Önce ikinci en büyüğü, sonra en büyüğü güncelle.
                secondLargest = largest;
                largest = number;
            } else if (number > secondLargest) {
                // Sayı en büyük değilse ancak ikinci büyükten büyükse ikinci en büyüğü güncelle.
                secondLargest = number;
            }
        }

        System.out.println("The largest number is: " + largest);
        System.out.println("The second largest number is: " + secondLargest);

        // Close the scanner
        input.close();
    }
}
/*
Enter 5 integers:
Enter number 1: 123
Enter number 2: 424
Enter number 3: 532
Enter number 4: 564
Enter number 5: 234
The largest number is: 564
The second largest number is: 532
*/