package ADVANCED.Exercises1;

public class ScopeTest {
    // application starting point
    public static void main(String[] args) {
        Scope testScope = new Scope();
        testScope.begin();
    } // end main
} // end class ScopeTest
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