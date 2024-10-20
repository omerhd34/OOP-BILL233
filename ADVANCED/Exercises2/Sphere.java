package ADVANCED.Exercises2;

// Bir kürenin hacmini hesaplayınız.
import java.util.Scanner;

public class Sphere {
    // Kullanıcıdan yarıçapı alın ve kürenin hacmini görüntüleyin.
    public void determineSphereVolume() {
        Scanner input = new Scanner(System.in); // Kullanıcıdan giriş almak için Scanner nesnesi oluşturuluyor.

        System.out.print("Enter radius of sphere: "); // Kullanıcıdan yarıçapı girmesi isteniyor.
        double radius = input.nextDouble(); // Yarıçap değeri alınıyor

        // Kürenin hacmini hesaplayıp yazdırıyoruz.
        System.out.printf("Volume is %f\n", sphereVolume(radius));
    }

    // Küre hacmini hesapla ve döndür.
    public double sphereVolume(double radius) {
        // Kürenin hacmini hesaplama formülü: (4/3) * π * r^3
        double volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
        return volume;
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