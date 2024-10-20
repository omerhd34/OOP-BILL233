package MEDIUM.BookExercises1;

public class Employee {
    // Özel değişkenler: çalışan adı, soyadı ve aylık maaş
    private String firstName;
    private String lastName;
    private double monthlySalary;

    // Yapıcı (constructor) metot
    public Employee(String firstName, String lastName, double monthlySalary) {
        this.firstName = firstName; // İlk adı başlat
        this.lastName = lastName;   // Soyadı başlat

        // Aylık maaşı kontrol et, eğer pozitifse ata, değilse 0.0 olarak ayarla.
        if (monthlySalary > 0.0) {
            this.monthlySalary = monthlySalary;
        } else {
            this.monthlySalary = 0.0;
        }
    }

    // Getter ve Setter: firstName için (Çalışanın ilk adını ayarla ve al)
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    // Getter ve Setter: lastName için (Çalışanın soyadını ayarla ve al)
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    // Getter ve Setter: monthlySalary için (Aylık maaşı ayarla ve al)
    public void setMonthlySalary(double monthlySalary) {
        // Aylık maaş pozitifse değeri güncelle, aksi halde 0.0 yap.
        if (monthlySalary > 0.0) {
            this.monthlySalary = monthlySalary;
        } else {
            this.monthlySalary = 0.0;
        }
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }

    // Yıllık maaşı hesapla ve geri döndür.
    public double getYearlySalary() {
        return monthlySalary * 12;
    }

    // Maaşa belirli bir yüzde oranında zam yap.
    public void giveRaise(double percentage) {
        // Maaşı belirli yüzde kadar artır.
        monthlySalary += monthlySalary * (percentage / 100);
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
           + «constructor» Employee(firstName : String, lastName : String, monthlySalary : double)
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