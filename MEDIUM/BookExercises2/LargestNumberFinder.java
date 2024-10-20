/* En büyük değeri (yani, bir değer grubunun maksimum değerini) bulma süreci bilgisayar uygulamalarında sıklıkla kullanılır.
Örneğin, bir satış yarışmasının kazananını belirleyen bir program, her satış elemanının sattığı birim sayısını girer.
En çok birim satan satış elemanı yarışmayı kazanır. Bir sözde kod programı ve ardından 10 tam sayıdan oluşan bir dizi giren ve en büyük
tam sayıyı belirleyen ve yazdıran bir Java uygulaması yazın. Programınız en azından aşağıdaki üç değişkeni kullanmalıdır:
a) counter: 10'a kadar saymak için bir sayaç (yani, kaç sayı girildiğini takip etmek ve 10 sayının ne zaman işlendiğini belirlemek için).
b) number: Kullanıcı tarafından en son girilen tam sayı.
c) largest: Şimdiye kadar bulunan en büyük sayı.
*/
/*
Bu soruda, bir grup sayıdan en büyüğünü bulma süreci anlatılmaktadır. Burada, kullanıcının gireceği 10 tamsayı içinden en büyüğünü
bulmamız isteniyor. Program, kullanıcıdan 10 tamsayı alacak ve bu tamsayılar arasından en büyüğünü belirleyip ekrana yazdıracak.
*/
/*
Öncelikle, pseudo kod ile bu problemi çözelim:
1- counter değişkenini 1 olarak başlat.
2- largest değişkenini 0 olarak başlat.
3- Dört kez tekrarlayan bir döngü kur:
        1 - number değişkenine kullanıcıdan bir tamsayı al.
        2 - Eğer number > largest ise, largest değerini number olarak güncelle.
        3 - counter'ı bir artır.
*/

package MEDIUM.BookExercises2;

import java.util.Scanner;

public class LargestNumberFinder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Değişkenlerin tanımlanması
        int counter = 1;  // counter değişkeni, kullanıcıdan alınan sayıların sayısını takip eder.
        int largest = Integer.MIN_VALUE;
// largest değişkeni, girilen sayılar arasından en büyüğünü saklar. Başlangıç değeri olarak Integer.MIN_VALUE verilmiştir,
// bu sayede kullanıcının gireceği herhangi bir sayı largest'ı güncelleyebilir.
        while (counter <= 4) {  // while döngüsü, 4 kez tekrarlanır ve her döngüde kullanıcıdan bir sayı girmesi istenir.
            System.out.printf("Lütfen %d. sayıyı girin: ", counter);
            int number = input.nextInt();
            // Girilen sayı largest'tan büyükse, largest değeri güncellenir.
            if (number > largest) {
                largest = number;
            }
            counter++;
        }

        // Tüm sayılar alındıktan sonra, largest değişkeni ekrana yazdırılır.
        System.out.printf("Girilen sayılar arasındaki en büyük sayı: %d\n", largest);

        input.close();
    }
}
/*
Lütfen 1. sayıyı girin: 12
Lütfen 2. sayıyı girin: 23
Lütfen 3. sayıyı girin: 44
Lütfen 4. sayıyı girin: 56
Girilen sayılar arasındaki en büyük sayı: 56
*/