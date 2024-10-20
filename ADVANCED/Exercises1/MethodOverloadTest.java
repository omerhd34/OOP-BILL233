package ADVANCED.Exercises1;

// MethodOverload sınıfını test etmek için uygulama.
public class MethodOverloadTest {
    public static void main(String[] args) {
        MethodOverload methodOverload = new MethodOverload();
        methodOverload.testOverloadedMethods();
    } // main metodunun sonu
} // MethodOverloadTest sınıfının sonu
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