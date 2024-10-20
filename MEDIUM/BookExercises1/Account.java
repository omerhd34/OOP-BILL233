package MEDIUM.BookExercises1;

public class Account {
    private double balance; // balance değişkeni, hesabın mevcut bakiyesini tutar ve private olarak tanımlandığı için sınıf dışından doğrudan erişilemez.

    // Account yapıcı metodu (constructor), parametre olarak bir initialBalance (başlangıç bakiyesi) alır.
    // Eğer bu değer sıfırdan büyükse, bu değeri balance değişkenine atar. Aksi takdirde, bakiye 0 olarak kalır.
    public Account(double initialBalance) {   // Yapıcı metot, başlangıç bakiyesini ayarlamak için kullanılır.
        if (initialBalance > 0.0)
            balance = initialBalance;
    }
    public void credit(double amount) {   // credit metodu, parametre olarak aldığı amount (miktar) değeri ile mevcut bakiyeyi artırır.
        balance = balance + amount;
    }
    public double getBalance() {   // Mevcut bakiyeyi döndürür.
        return balance;
    }
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