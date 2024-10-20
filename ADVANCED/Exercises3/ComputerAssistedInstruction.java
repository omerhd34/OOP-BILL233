/*
Okul Seviyesi Ekleme: Kullanıcıdan bir okul seviyesi girmesini istiyoruz.
Seviye 1: Tek basamaklı sayılar (0-9).
Seviye 2: İki basamaklı sayılar (0-99).
Seviye 3: Üç basamaklı sayılar (0-999).
Aritmetik İşlem Türü Seçimi: Kullanıcıdan hangi tür aritmetik işlemleri çözmek istediğini seçmesini istiyoruz.
1: Toplama işlemi
2: Çıkarma işlemi
3: Çarpma işlemi
4: Bölme işlemi
5: Karışık (rastgele bir tür)
Plan:
Kullanıcıdan Seçimleri Al: Okul seviyesini ve aritmetik işlem türünü sor.
Seçimlere Göre Sorular Üret: Rastgele sayılar ve işlem türüne göre sorular oluştur.
Yanıtları Kontrol Et: Yanıt doğruysa, rastgele bir pozitif mesaj; yanlışsa rastgele bir olumsuz mesaj göster.
Performansı İzle: Kullanıcının doğru ve yanlış cevaplarını sayarak yüzdeyi hesapla ve geri bildirim sağla.
*/
package ADVANCED.Exercises3;

import java.util.Random;
import java.util.Scanner;

public class ComputerAssistedInstruction {
    private static final Random random = new Random();
    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        boolean continueSession = true;

        while (continueSession) {
            // Kullanıcıdan okul seviyesini al
            int gradeLevel = getGradeLevel();

            // Kullanıcıdan aritmetik işlem türünü al
            int operationType = getOperationType();

            // Soruları sor
            startQuiz(gradeLevel, operationType);

            // Kullanıcıya tekrar oynamak isteyip istemediğini sor
            continueSession = askToPlayAgain();
        }
    }

    // Kullanıcıdan okul seviyesini al
    private static int getGradeLevel() {
        System.out.print("Enter the school grade level (1 for single-digit, 2 for double-digit, etc.): ");
        return input.nextInt();
    }

    // Kullanıcıdan aritmetik işlem türünü al
    private static int getOperationType() {
        System.out.println("Select the type of arithmetic problem:");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("5. Random Mix");
        System.out.print("Enter your choice: ");
        return input.nextInt();
    }

    // Quiz başlatma fonksiyonu
    private static void startQuiz(int gradeLevel, int operationType) {
        int correctCount = 0;
        int totalQuestions = 10;

        for (int i = 0; i < totalQuestions; i++) {
            int num1 = generateNumber(gradeLevel);
            int num2 = generateNumber(gradeLevel);
            int result = 0;
            String operator = "";

            // Aritmetik işlem türüne göre soru oluştur
            int chosenOperation = operationType;
            if (operationType == 5) { // Karışık seçenekte rastgele bir işlem türü belirle
                chosenOperation = random.nextInt(4) + 1;
            }

            switch (chosenOperation) {
                case 1:
                    operator = "+";
                    result = num1 + num2;
                    break;
                case 2:
                    operator = "-";
                    result = num1 - num2;
                    break;
                case 3:
                    operator = "*";
                    result = num1 * num2;
                    break;
                case 4:
                    operator = "/";
                    // Bölme durumunda sıfırdan kaçınmak ve tam sayı sonuç üretmek için num2'yi düzenle
                    while (num2 == 0) {
                        num2 = generateNumber(gradeLevel);
                    }
                    result = num1 / num2;
                    break;
            }

            // Kullanıcıdan cevabı al ve kontrol et
            System.out.printf("How much is %d %s %d? ", num1, operator, num2);
            int userAnswer = input.nextInt();

            if (userAnswer == result) {
                correctCount++;
                displayPositiveMessage();
            } else {
                displayNegativeMessage();
            }
        }

        // Kullanıcının başarı yüzdesini hesapla
        double percentage = (correctCount / (double) totalQuestions) * 100;
        System.out.printf("Your percentage of correct answers: %.2f%%\n", percentage);

        if (percentage < 75) {
            System.out.println("Please ask your instructor for extra help.");
        }
    }

    // Rastgele sayı oluşturma (Okul seviyesine göre)
    private static int generateNumber(int gradeLevel) {
        return random.nextInt((int) Math.pow(10, gradeLevel));
    }

    // Rastgele pozitif mesaj göster
    private static void displayPositiveMessage() {
        switch (random.nextInt(4)) {
            case 0 -> System.out.println("Very good!");
            case 1 -> System.out.println("Excellent!");
            case 2 -> System.out.println("Nice work!");
            case 3 -> System.out.println("Keep up the good work!");
        }
    }

    // Rastgele olumsuz mesaj göster
    private static void displayNegativeMessage() {
        switch (random.nextInt(4)) {
            case 0 -> System.out.println("No. Please try again.");
            case 1 -> System.out.println("Wrong. Try once more.");
            case 2 -> System.out.println("Don't give up!");
            case 3 -> System.out.println("No. Keep trying.");
        }
    }

    // Kullanıcıya tekrar oynamak isteyip istemediğini sor
    private static boolean askToPlayAgain() {
        System.out.print("Would you like to play again? (yes or no): ");
        String response = input.next();
        return response.equalsIgnoreCase("yes");
    }
}
/*
Enter the school grade level (1 for single-digit, 2 for double-digit, etc.): 2
Select the type of arithmetic problem:
1. Addition
2. Subtraction
3. Multiplication
4. Division
5. Random Mix
Enter your choice: 1
How much is 85 + 13? 98
Keep up the good work!
How much is 87 + 78? 165
Very good!
How much is 32 + 3? 35
Very good!
How much is 67 + 35? 102
Keep up the good work!
How much is 72 + 75? 147
Nice work!
How much is 25 + 33? 58
Nice work!
How much is 56 + 87? 4
No. Please try again.
How much is 46 + 42? 88
Very good!
How much is 82 + 88? 170
Nice work!
How much is 15 + 95? 110
Very good!
Your percentage of correct answers: 90,00%
Would you like to play again? (yes or no): no

+-------------------------------------------+
|       ComputerAssistedInstruction         |
+-------------------------------------------+
| - random: Random                          |
| - input: Scanner                          |
+-------------------------------------------+
| + main(args: String[]): void              |
| - getGradeLevel(): int                   |
| - getOperationType(): int                |
| - startQuiz(gradeLevel: int, operationType: int): void |
| - generateNumber(gradeLevel: int): int   |
| - displayPositiveMessage(): void         |
| - displayNegativeMessage(): void         |
| - askToPlayAgain(): boolean              |
+-------------------------------------------+
 */