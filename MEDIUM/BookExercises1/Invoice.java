/*
Bir hırdavatçının mağazada satılan bir ürünün faturasını temsil etmek için kullanabileceği Invoice adlı bir sınıf oluşturun.
Bir Invoice, örnek değişkenleri olarak dört bilgi parçası içermelidir: bir parça numarası(String), bir parça açıklaması(String),
satın alınan ürünün miktarı(int) ve ürün başına fiyat(double). Sınıfınız, dört örnek değişkenini başlatan bir oluşturucuya sahip olmalıdır.
Her örnek değişkeni için bir küme ve bir get yöntemi sağlayın. Ayrıca, fatura tutarını hesaplayan (yani, miktarı ürün başına fiyatla çarpan)
getInvoiceAmount adlı bir yöntem sağlayın, ardından tutarı double değeri olarak döndürün. Miktar pozitif değilse, 0 olarak ayarlanmalıdır.
Ürün başına fiyat pozitif değilse, 0,0 olarak ayarlanmalıdır. Invoice sınıfının yeteneklerini gösteren InvoiceTest adlı bir test uygulaması yazın.
*/
package MEDIUM.BookExercises1;

public class Invoice {
    private String partNumber; // Parça numarası
    private String partDescription; // Parça açıklaması
    private int quantity; // Alınan miktar
    private double pricePerItem; // Birim fiyat

    // Dört değişkeni başlatan yapıcı (constructor)
    public Invoice(String partNumber, String partDescription, int quantity, double pricePerItem) {
        this.partNumber = partNumber;
        this.partDescription = partDescription;
        setQuantity(quantity); // Doğrulama için setter kullanılıyor
        setPricePerItem(pricePerItem); // Doğrulama için setter kullanılıyor
    }

    // partNumber için getter ve setter
    public String getPartNumber() {
        return partNumber;
    }

    public void setPartNumber(String partNumber) {
        this.partNumber = partNumber;
    }

    // partDescription için getter ve setter
    public String getPartDescription() {
        return partDescription;
    }

    public void setPartDescription(String partDescription) {
        this.partDescription = partDescription;
    }

    // quantity için getter ve setter
    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = (quantity > 0) ? quantity : 0; // Pozitif değilse 0 olarak ayarlanır
    }

    // pricePerItem için getter ve setter
    public double getPricePerItem() {
        return pricePerItem;
    }

    public void setPricePerItem(double pricePerItem) {
        this.pricePerItem = (pricePerItem > 0) ? pricePerItem : 0.0; // Pozitif değilse 0.0 olarak ayarlanır
    }

    // Fatura tutarını hesaplayan metod
    public double getInvoiceAmount() {
        return quantity * pricePerItem; // Miktar ile birim fiyat çarpılır
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