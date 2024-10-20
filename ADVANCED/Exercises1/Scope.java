package ADVANCED.Exercises1;

// Kapsam sınıfı, alan ve yerel değişken kapsamlarını gösterir.
public class Scope {
    private int x = 1;   // Bu sınıfın tüm metodları tarafından erişilebilen alan

    // begin metodu, yerel değişken x'i oluşturur ve başlatır.
    // ve useLocalVariable ve useField metodlarını çağırır.
    public void begin() {
        int x = 5; // metodun yerel değişkeni x, alan x'i gizler.

        System.out.printf("begin metodundaki yerel x'in değeri: %d\n", x);

        useLocalVariable(); // useLocalVariable metodunda yerel x var.
        useField();         // useField metodu, Scope sınıfının alan x'ini kullanır.
        useLocalVariable(); // useLocalVariable metodu, yerel x'i tekrar başlatır.
        useField();         // Scope sınıfının alan x'i değerini korur.

        System.out.printf("\nbegin metodundaki yerel x'in değeri: %d\n", x);
    } // begin metodunun sonu

    // her çağrıldığında yerel değişken x'i oluşturur ve başlatır.
    public void useLocalVariable() {
        int x = 25; // her çağrıldığında başlatılır.

        System.out.printf(
                "\nuseLocalVariable metoduna girildiğinde yerel x'in değeri: %d\n", x);
        ++x; // bu metodun yerel değişkeni x'i değiştirir.
        System.out.printf(
                "useLocalVariable metodundan çıkılmadan önce yerel x'in değeri: %d\n", x);
    } // useLocalVariable metodunun sonu

    // her çağrıldığında Scope sınıfının alan x'ini değiştirir.
    public void useField() {
        System.out.printf(
                "\nuseField metoduna girildiğinde alan x'in değeri: %d\n", x);
        x *= 10; // Scope sınıfının alan x'ini değiştirir.
        System.out.printf(
                "useField metodundan çıkılmadan önce alan x'in değeri: %d\n", x);
    } // useField metodunun sonu
} // Scope sınıfının sonu

/*
begin metodundaki yerel x'in değeri: 5

useLocalVariable metoduna girildiğinde yerel x'in değeri: 25
useLocalVariable metodundan çıkılmadan önce yerel x'in değeri: 26

useField metoduna girildiğinde alan x'in değeri: 1
useField metodundan çıkılmadan önce alan x'in değeri: 10

useLocalVariable metoduna girildiğinde yerel x'in değeri: 25
useLocalVariable metodundan çıkılmadan önce yerel x'in değeri: 26

useField metoduna girildiğinde alan x'in değeri: 10
useField metodundan çıkılmadan önce alan x'in değeri: 100

begin metodundaki yerel x'in değeri: 5

                     Scope
          --------------------------

          --------------------------
          + begin():
          + useField():
          + useLocalVariable():
          --------------------------
*/