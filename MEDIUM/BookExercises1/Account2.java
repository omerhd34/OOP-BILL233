package MEDIUM.BookExercises1;

public class Account2 {
    private double balance; // balance değişkeni, hesabın mevcut bakiyesini tutar ve private olarak tanımlandığı için sınıf dışından doğrudan erişilemez.

    // Account yapıcı metodu (constructor), parametre olarak bir initialBalance (başlangıç bakiyesi) alır.
    // Eğer bu değer sıfırdan büyükse, bu değeri balance değişkenine atar. Aksi takdirde, bakiye 0 olarak kalır.
    public Account2(double initialBalance) {  // Yapıcı metot, başlangıç bakiyesini ayarlamak için kullanılır.
        if (initialBalance > 0.0)
            balance = initialBalance;
    }

    public void credit(double amount) {   // credit metodu, parametre olarak aldığı amount (miktar) değeri ile mevcut bakiyeyi artırır.
        balance += amount;
    }

    public double getBalance() {   // Mevcut bakiyeyi döndürür.
        return balance;
    }

    public void debit(double amount) {    // Yeni para çekme (debit) metodu
        if (amount > balance) {     // Çekilmek istenen miktar bakiyeden fazlaysa uyarı verir.
            System.out.println("Debit amount exceeded account balance.");
        } else {
            balance -= amount;   // Aksi takdirde bakiyeden bu miktarı düşer.
        }
    }
}
/* UML :
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
*/