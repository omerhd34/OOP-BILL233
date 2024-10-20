package MEDIUM.BookExercises1;
import java.util.Scanner;
public class AccountTest {
    public static void main(String[] args) {
        Account account1 = new Account(50.00);   // 50.00 başlangıç bakiyesine sahip bir hesap oluşturur.
        Account account2 = new Account(-7.53);   // Negatif başlangıç bakiyesiyle bir hesap oluşturur.
        System.out.printf("account1 balance: $%.2f\n", account1.getBalance());    // İlk hesapların bakiyelerini yazdırır.
        System.out.printf("account2 balance: $%.2f\n\n", account2.getBalance());  // İlk hesapların bakiyelerini yazdırır.

        Scanner input = new Scanner(System.in);  // Kullanıcıdan giriş almak için bir Scanner oluşturur.

        double depositAmount;
        System.out.print("Enter deposit amount for account1: ");    // İlk hesap için para yatırma miktarını sorar.
        depositAmount = input.nextDouble();
        System.out.printf("\nadding %.2f to account1 balance\n\n", depositAmount);
        account1.credit(depositAmount);     // Yatırılan miktarı account1'e ekler.

        System.out.printf("account1 balance: $%.2f\n", account1.getBalance());   // Yeni bakiyeleri yazdırır.
        System.out.printf("account2 balance: $%.2f\n\n", account2.getBalance()); // Yeni bakiyeleri yazdırır.

        System.out.print("Enter deposit amount for account2: ");    // İkinci hesap için para yatırma miktarını sorar.
        depositAmount = input.nextDouble();
        System.out.printf("\nadding %.2f to account2 balance\n\n", depositAmount);
        account2.credit(depositAmount);     // Yatırılan miktarı account2'ye ekler.

        System.out.printf("account1 balance: $%.2f\n", account1.getBalance());  // Yeni bakiyeleri tekrar yazdırır.
        System.out.printf("account2 balance: $%.2f\n", account2.getBalance());  // Yeni bakiyeleri tekrar yazdırır.
    }

    public static class Analysis {
        public void processExamResults() {
            // create Scanner to obtain input from command window
            Scanner input = new Scanner(System.in);

            // initializing variables in declarations
            int passes = 0;    // number of passes
            int failures = 0;  // number of failures
            int studentCounter = 1; // student counter
            int result; // one exam result (obtains value from user)

            // process 10 students using counter-controlled loop
            while (studentCounter <= 10) {
                // prompt user for input and obtain value from user
                System.out.print("Enter result (1 = pass, 2 = fail): ");
                result = input.nextInt();

                // if...else nested in while
                if (result == 1) {
                    passes = passes + 1; // increment passes
                } else {
                    failures = failures + 1; // increment failures
                }

                // increment studentCounter so loop eventually terminates
                studentCounter = studentCounter + 1;
            }

            // termination phase; prepare and display results
            System.out.printf("Passed: %d%nFailed: %d%n", passes, failures);

            // determine whether more than 8 students passed
            if (passes > 8) {
                System.out.println("Öğrenim Ücretini Artırın.");
            }
        } // end method processExamResults
    } // end class Analysis

    public static class AnalysisTest {
        public static void main(String[] args) {
            // create Analysis object
            Analysis application = new Analysis();

            // call method to process results
            application.processExamResults();
        } // end main
    } // end class AnalysisTest

    // Calculate the sum of the integers from 1 to 10
    public static class Calculate {
        public static void main(String[] args) {
            int sum;
            int x;

            x = 1;    // initialize x to 1 for counting
            sum = 0;  // initialize sum to 0 for totaling

            while (x <= 10) // while x is less than or equal to 10
            {
                sum += x; // add x to sum
                ++x;      // increment x
            } // end while

            System.out.printf("The sum is: %d\n", sum);
        } // end main
    } // end class Calculate
}
/* UML :
                    AccountTest
          ---------------------------------

          ----------------------------------
           static void main(args: String[])
          ----------------------------------
                        |
                        |creates
                        ↓
                                Account
          -------------------------------------------------
           – balance : Double
          -------------------------------------------------
           «constructor» Account( initialBalance : Double )
           + credit( amount : Double )
           + getBalance( ) : Double
          -------------------------------------------------

account1 balance: $50,00
account2 balance: $0,00

Enter deposit amount for account1: 25,53

adding 25,53 to account1 balance

account1 balance: $75,53
account2 balance: $0,00

Enter deposit amount for account2: 123,45

adding 123,45 to account2 balance

account1 balance: $75,53
account2 balance: $123,45
                                                                            */