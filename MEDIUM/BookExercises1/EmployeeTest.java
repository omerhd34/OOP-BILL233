package MEDIUM.BookExercises1;

public class EmployeeTest {
    public static void main(String[] args) {
        // İki Employee (Çalışan) nesnesi oluştur
        Employee emp1 = new Employee("Ömer Halis", "DEMİR", 5000.00);
        Employee emp2 = new Employee("Nisa", "DEMİR", 2000.00);

        // Her çalışanın yıllık maaşını ekrana yazdır
        System.out.printf("Yıllık maaş: %s %s: $%.2f%n", emp1.getFirstName(), emp1.getLastName(), emp1.getYearlySalary());
        System.out.printf("Yıllık maaş: %s %s: $%.2f%n", emp2.getFirstName(), emp2.getLastName(), emp2.getYearlySalary());

        // Her çalışana %10 zam yap
        emp1.giveRaise(10);
        emp2.giveRaise(10);

        // Zamdan sonra her çalışanın yıllık maaşını tekrar ekrana yazdır
        System.out.printf("%%10 zamdan sonra yıllık maaş: %s %s: $%.2f%n", emp1.getFirstName(), emp1.getLastName(), emp1.getYearlySalary());
        System.out.printf("%%10 zamdan sonra yıllık maaş: %s %s: $%.2f%n", emp2.getFirstName(), emp2.getLastName(), emp2.getYearlySalary());
    }
}
/*
Yıllık maaş: Ömer Halis DEMİR: $60000,00
Yıllık maaş: Nisa DEMİR: $24000,00
%10 zamdan sonra yıllık maaş: Ömer Halis DEMİR: $66000,00
%10 zamdan sonra yıllık maaş: Nisa DEMİR: $26400,00

UML :
                    EmployeeTest
          ---------------------------------

          ----------------------------------
           static void main(args: String[])
          ----------------------------------
                        |
                        |creates
                        ↓
                                           Employee
          -------------------------------------------------------------------------
           - firstName : String
           - lastName : String
           - monthlySalary : double
          --------------------------------------------------------------------------
           + Employee(firstName : String, lastName : String, monthlySalary : double)
           + getFirstName() : String
           + setFirstName(firstName : String) : void
           + getLastName() : String
           + setLastName(lastName : String) : void
           + getMonthlySalary() : double
           + setMonthlySalary(monthlySalary : double) : void
           + getYearlySalary() : double
           + giveRaise(percentage : double) : void
          --------------------------------------------------------------------------
*/