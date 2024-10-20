package MEDIUM.BookExercises1;
// Her bir GradeBook nesnesi oluşturulduğunda, ders adı ve eğitmen adını belirtmek için GradeBook yapıcı metodu kullanılır.
public class GradeBookTest33 {
    public static void main(String[] args) {  // Ana metod, programın yürütülmesini başlatır.
        // GradeBook nesnesi oluştur
        GradeBook33 gradeBook1 = new GradeBook33("Java", "Ömer Halis DEMİR");
        GradeBook33 gradeBook2 = new GradeBook33("Python", "Nisa DEMİR");
        // Her bir GradeBook için courseName ve instructorName'in ilk değerini göster.
        gradeBook1.displayMessage();
        gradeBook2.displayMessage();
    }
}
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
                        | creates
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
          ----------------------------------------------------------------                 */