package MEDIUM.BookExercises4;

public class Main {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++)  // Dış döngü: 5 kez tekrarlanır
        {
            for (int j = 1; j <= 3; j++)  // Orta döngü: 3 kez tekrarlanır
            {
                for (int k = 1; k <= 4; k++)  // İç döngü: 4 kez tekrarlanır
                    System.out.print('*');  // 4 tane yıldız basılır

                System.out.println();  // İç döngü tamamlandığında bir satır sonu eklenir
            }

            System.out.println();  // Orta döngü tamamlandığında bir boş satır eklenir
        }
    }
}
/*
 ****
 ****
 ****

 ****
 ****
 ****

 ****
 ****
 ****

 ****
 ****
 ****

 ****
 ****
 ****
 */