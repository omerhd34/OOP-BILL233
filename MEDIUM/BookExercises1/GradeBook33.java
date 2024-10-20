package MEDIUM.BookExercises1;

// Bir kurstaki dersin adı ve eğitmen adı ile bir kurstaki GradeBook33 sınıfı.
public class GradeBook33 {
    private String courseName;     // Bu GradeBook için dersin adı
    private String instructorName; // Bu dersin eğitmeninin adı

    // Yapıcı metot (constructor) ders adı ve eğitmen adı ile sınıfı başlatır
    public GradeBook33(String name, String instructor) {
        courseName = name; // courseName'i başlatır
        instructorName = instructor; // instructorName'i başlatır
    } // Yapıcı metot sonu

    public void setCourseName(String name) {    // Ders adını belirlemek için metot
        courseName = name; // Ders adını sakla
    }

    public String getCourseName() {   // Ders adını almak için metot
        return courseName;
    }

    public void setInstructorName(String instructor) {   // Eğitmen adını belirlemek için metot
        instructorName = instructor; // Eğitmen adını sakla
    }

    public String getInstructorName() {   // Eğitmen adını almak için metot
        return instructorName;
    }

    public void displayMessage() {    // GradeBook kullanıcısına bir hoş geldin mesajı göster
        // Ders adını ve eğitmen adını göster
        System.out.printf("%s not defterine hoş geldiniz.\n", getCourseName());
        System.out.printf("Bu dersin sunumu: %s tarafından yapılmaktadır.\n", getInstructorName());
    }
} // GradeBook sınıfının sonu
/*
Java not defterine hoş geldiniz.
Bu dersin sunumu: Ömer Halis DEMİR tarafından yapılmaktadır.
Python not defterine hoş geldiniz.
Bu dersin sunumu: Nisa DEMİR tarafından yapılmaktadır.
UML :
                    GradeBookTest33
          ---------------------------------

          ----------------------------------
           static void main(args: String[])
          ----------------------------------
                        |
                        |
                        |
                        |creates
                        |
                        |
                        |
                        ↓
                                     GradeBook33
          ----------------------------------------------------------------
           – courseName : String
           – instructorName : String
          ----------------------------------------------------------------
           «constructor» GradeBook33( name : String , instructor : String)
           + setCourseName( name : String )
           + getCourseName( ) : String
           + setInstructorName( instructor : String)
           + getInstructorName() : String
           + displayMessage()
          ----------------------------------------------------------------                */