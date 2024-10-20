/*
Bir hırdavatçının mağazada satılan bir ürünün faturasını temsil etmek için kullanabileceği Invoice adlı bir sınıf oluşturun.
Bir Invoice, örnek değişkenleri olarak dört bilgi parçası içermelidir: bir parça numarası(String), bir parça açıklaması(String),
satın alınan ürünün miktarı(int) ve ürün başına fiyat(double). Sınıfınız, dört örnek değişkenini başlatan bir oluşturucuya sahip olmalıdır.
Her örnek değişkeni için bir küme ve bir get yöntemi sağlayın. Ayrıca, fatura tutarını hesaplayan (yani, miktarı ürün başına fiyatla çarpan)
getInvoiceAmount adlı bir yöntem sağlayın, ardından tutarı double değeri olarak döndürün. Miktar pozitif değilse, 0 olarak ayarlanmalıdır.
Ürün başına fiyat pozitif değilse, 0,0 olarak ayarlanmalıdır. Invoice sınıfının yeteneklerini gösteren InvoiceTest adlı bir test uygulaması yazın.
*/
package MEDIUM.BookExercises1;

public class InvoiceTest {
    public static void main(String[] args) {
        // Bir Invoice nesnesi oluştur
        Invoice invoice1 = new Invoice("12345", "Çekiç", 3, 15.99);

        // Fatura detaylarını göster
        System.out.println("Parça Numarası: " + invoice1.getPartNumber());
        System.out.println("Parça Açıklaması: " + invoice1.getPartDescription());
        System.out.println("Miktar: " + invoice1.getQuantity());
        System.out.println("Birim Fiyat: $" + invoice1.getPricePerItem());
        System.out.printf("Fatura Tutarı: $%.2f%n", invoice1.getInvoiceAmount());

        // Geçersiz miktar ve fiyat test et
        Invoice invoice2 = new Invoice("67890", "Çiviler", -5, -10.0);
        System.out.println("\nParça Numarası: " + invoice2.getPartNumber());
        System.out.println("Parça Açıklaması: " + invoice2.getPartDescription());
        System.out.println("Miktar: " + invoice2.getQuantity());
        System.out.println("Birim Fiyat: $" + invoice2.getPricePerItem());
        System.out.printf("Fatura Tutarı: $%.2f%n", invoice2.getInvoiceAmount());
    }
}
/*
Parça Numarası: 12345
Parça Açıklaması: Çekiç
Miktar: 3
Birim Fiyat: $15.99
Fatura Tutarı: $47,97

Parça Numarası: 67890
Parça Açıklaması: Çiviler
Miktar: 0
Birim Fiyat: $0.0
Fatura Tutarı: $0,00

UML :
                    InvoiceTest
          ---------------------------------

          ----------------------------------
           static void main(args: String[])
          ----------------------------------
                        |
                        |uses
                        ↓
                                                                Invoice
          ------------------------------------------------------------------------------------------------------------------
           – partNumber : String
           – partDescription : String
           – quantity : int
           – pricePerItem : double
          ------------------------------------------------------------------------------------------------------------------
            «constructor» Invoice( partNumber : String ,  partDescription : String , quantity : int , pricePerItem : double)
           + getPartNumber( )      : String
           + setPartNumber( partNumber : String )
           + getPartDescription( ) : String
           + setPartDescription( partDescription : String )
           + getQuantity( )        : int
           + setQuantity( quantity : int )
           + getPricePerItem( )    : double
           + setPricePerItem( pricePerItem : double )
           + getInvoiceAmount( )   : double
          ------------------------------------------------------------------------------------------------------------------
*/
