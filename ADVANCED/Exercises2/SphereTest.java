package ADVANCED.Exercises2;

public class SphereTest {
    // Application starting point
    public static void main(String[] args) {
        Sphere mySphere = new Sphere();   // Sphere sınıfının bir nesnesi oluşturuluyor
        mySphere.determineSphereVolume(); // Kürenin hacmini belirleme işlemi başlatılıyor
    }
}
/*
Enter radius of sphere: 10
Volume is 4188,790205
--------------------------------------------
|             Sphere                       |
--------------------------------------------
| -                                        |
--------------------------------------------
| + determineSphereVolume(): void          |
| + sphereVolume(radius: double): double   |
--------------------------------------------

----------------------------------------
|           SphereTest                 |
----------------------------------------
| -                                    |
----------------------------------------
| + main(args: String[])               |
----------------------------------------
*/