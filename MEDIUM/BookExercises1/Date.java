/* Date adında, üç adet bilgiyi örnek değişkenleri olarak içeren bir sınıf oluşturun: bir ay (int), bir gün (int) ve bir yıl (int).
Sınıfınız, üç örnek değişkenini başlatan ve sağlanan değerlerin doğru olduğunu varsayan bir oluşturucuya sahip olmalıdır.
Her örnek değişkeni için bir set ve bir get yöntemi sağlayın. Ay, gün ve yılı eğik çizgilerle (/) ayırarak görüntüleyen bir displayDate
yöntemi sağlayın. Date sınıfının yeteneklerini gösteren DateTest adında bir test uygulaması yazın. */
package MEDIUM.BookExercises1;

public class Date {
    private int month;
    private int day;
    private int year;

    // Yapıcı (Constructor)
    public Date(int month, int day, int year) {
        this.month = month; // Ayı ayarlama
        this.day = day;     // Günü ayarlama
        this.year = year;   // Yılı ayarlama
    }

    public void setMonth(int month) {   // Ayı ayarlayan metot
        this.month = month;
    }

    public void setDay(int day) {  // Günü ayarlayan metot
        this.day = day;
    }

    public void setYear(int year) {  // Yılı ayarlayan metot
        this.year = year;
    }


    public int getMonth() {  // Ayı döndüren metot
        return month;
    }

    public int getDay() {  // Günü döndüren metot
        return day;
    }

    public int getYear() {  // Yılı döndüren metot
        return year;
    }

    public void displayDate() {  // Tarihi gösteren metot
        System.out.printf("%d/%d/%d%n", month, day, year); // Ay/Gün/Yıl formatında yazdırma
    }
}