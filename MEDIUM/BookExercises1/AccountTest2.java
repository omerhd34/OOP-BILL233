package MEDIUM.BookExercises1;

import java.util.Scanner;  // Kullanıcıdan giriş almak için Scanner sınıfını içe aktarıyoruz.

public class AccountTest2 {
    public static void main(String[] args) {
        // İlk iki hesap nesnesi oluşturuluyor.
        Account2 account1 = new Account2(50.00);    // account1, 50.00 bakiye ile başlatılıyor.
        Account2 account2 = new Account2(-7.53);    // account2, -7.53 bakiye ile başlatılıyor.
        // İlk iki hesabın başlangıç bakiyeleri yazdırılıyor.
        System.out.printf("account1 balance: $%.2f\n", account1.getBalance());
        System.out.printf("account2 balance: $%.2f\n\n", account2.getBalance());

        Scanner input = new Scanner(System.in);   // Kullanıcıdan giriş almak için Scanner nesnesi oluşturuluyor.
        double depositAmount;  // Para yatırma miktarı için değişken

        System.out.print("Enter deposit amount for account1: ");     // account1 için para yatırma işlemi
        depositAmount = input.nextDouble(); // Kullanıcıdan para yatırma miktarı alınıyor.
        System.out.printf("\nadding %.2f to account1 balance\n\n", depositAmount);
        account1.credit(depositAmount);   // Miktar account1'e ekleniyor

        // account1 ve account2'nin güncellenmiş bakiyeleri yazdırılıyor.
        System.out.printf("account1 balance: $%.2f\n", account1.getBalance());
        System.out.printf("account2 balance: $%.2f\n\n", account2.getBalance());

        System.out.print("Enter deposit amount for account2: ");   // account2 için para yatırma işlemi
        depositAmount = input.nextDouble();  // Kullanıcıdan para yatırma miktarı alınıyor.
        System.out.printf("\nadding %.2f to account2 balance\n\n", depositAmount);
        account2.credit(depositAmount);  // Miktar account2'ye ekleniyor.

        // Güncellenmiş bakiyeler yazdırılıyor.
        System.out.printf("account1 balance: $%.2f\n", account1.getBalance());
        System.out.printf("account2 balance: $%.2f\n\n", account2.getBalance());

        // account1 için para çekme işlemi
        System.out.print("Enter debit amount for account1: ");
        double debitAmount = input.nextDouble();   // Kullanıcıdan para çekme miktarı alınıyor.
        account1.debit(debitAmount);   // Miktar account1'den çekiliyor.
        System.out.printf("account1 balance after debit: $%.2f\n", account1.getBalance());  // Güncellenmiş account1 bakiyesi yazdırılıyor.

        // account2 için para çekme işlemi
        System.out.print("Enter debit amount for account2: ");
        debitAmount = input.nextDouble();  // Kullanıcıdan para çekme miktarı alınıyor.
        account2.debit(debitAmount);   // Miktar account2'den çekiliyor.
        System.out.printf("account2 balance after debit: $%.2f\n", account2.getBalance());   // Güncellenmiş account2 bakiyesi yazdırılıyor.
    }

    public static class GradeBook5 {
        private String courseName; // name of course this GradeBook represents

        // constructor initializes courseName
        public GradeBook5(String name) {
            courseName = name; // initializes courseName
        }

        // method to set the course name
        public void setCourseName(String name) {
            courseName = name; // store the course name
        }

        // method to retrieve the course name
        public String getCourseName() {
            return courseName;
        }

        // display a welcome message to the GradeBook user
        public void displayMessage() {
            // getCourseName gets the name of the course
            System.out.printf("Welcome to the grade book for %s!\n", getCourseName());
        }

        // determine the average of an arbitrary number of grades
        public void determineClassAverage() {
            // create Scanner to obtain input from command window
            Scanner input = new Scanner(System.in);

            int total; // sum of grades
            int gradeCounter; // number of grades entered
            int grade; // grade value
            double average; // average of grades with decimal point for precision

            // initialization phase
            total = 0; // initialize total
            gradeCounter = 0; // initialize loop counter

            // processing phase
            System.out.print("Enter grade or -1 to quit: "); // prompt for input
            grade = input.nextInt(); // read grade

            // loop until sentinel value read from user
            while (grade != -1) {
                total = total + grade; // add grade to total
                gradeCounter = gradeCounter + 1; // increment counter

                // prompt for and read the next grade
                System.out.print("Enter grade or -1 to quit: ");
                grade = input.nextInt();
            }

            // termination phase
            if (gradeCounter != 0) { // if the user entered at least one grade
                // calculate average of all grades entered
                average = (double) total / gradeCounter;

                // display total and average (with two digits of precision)
                System.out.printf("\nTotal of all %d grades is %d.\n", gradeCounter, total);
                System.out.printf("Class average is %.2f.\n", average);
            } else { // no grades were entered, so output appropriate message
                System.out.println("No grades were entered");
            }
        }
    } // end class GradeBook

    public static class GradeBookTest5 {
        public static void main(String[] args) {
            // create GradeBook object myGradeBook and pass course name to constructor
            GradeBook5 myGradeBook = new GradeBook5("Java");

            myGradeBook.displayMessage(); // display welcome message
            myGradeBook.determineClassAverage(); // find average of grades
        } // end main
    } // end class GradeBookTest
}
/*
account1 balance: $50,00
account2 balance: $0,00

Enter deposit amount for account1: 42

adding 42,00 to account1 balance

account1 balance: $92,00
account2 balance: $0,00

Enter deposit amount for account2: 22

adding 22,00 to account2 balance

account1 balance: $92,00
account2 balance: $22,00

Enter debit amount for account1: 45
account1 balance after debit: $47,00
Enter debit amount for account2: 6
account2 balance after debit: $16,00
UML :
                    AccountTest2
          ---------------------------------

          ----------------------------------
           static void main(args: String[])
          ----------------------------------
                        |
                        |creates
                        ↓
                             Account2
          --------------------------------------------------
           – balance : Double
          --------------------------------------------------
           «constructor» Account2( initialBalance : Double )
           + credit( amount : Double )
           + getBalance( ) : Double
           + debit( amount : Double )
          --------------------------------------------------

 */