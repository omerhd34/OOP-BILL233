package ADVANCED.Exercises1;

// Aşırı yüklenmiş (overloaded) metot bildirimleri.
public class MethodOverload {
    // Aşırı yüklenmiş kare metotlarını test et
    public void testOverloadedMethods() {
        System.out.printf("Tam sayı 7'nin karesi %d\n", square(7));
        System.out.printf("Ondalık sayı 7.5'un karesi %f\n", square(7.5));
    } // testOverloadedMethods metodunun sonu

    // int argümanıyla kare metodu
    public int square(int intValue) {
        System.out.printf("\nint argümanıyla çağrılan kare: %d\n", intValue);
        return intValue * intValue;
    } // int argümanıyla kare metodunun sonu

    // double argümanıyla kare metodu
    public double square(double doubleValue) {
        System.out.printf("\ndouble argümanıyla çağrılan kare: %f\n", doubleValue);
        return doubleValue * doubleValue;
    } // double argümanıyla kare metodunun sonu
} // MethodOverload sınıfının sonu
/*
int argümanıyla çağrılan kare: 7
Tam sayı 7'nin karesi 49

double argümanıyla çağrılan kare: 7,500000
Ondalık sayı 7.5'un karesi 56,250000
                                 MethodOverload
          --------------------------------------------------------------

          --------------------------------------------------------------
           + testOverloadedMethods():
           + square(intValue : int):
           + square(doubleValue : double):
          --------------------------------------------------------------
*/
