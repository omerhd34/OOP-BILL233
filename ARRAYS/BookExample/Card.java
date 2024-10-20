
/* Bu kod parçası, Java'da bir Card (Oyun Kartı) sınıfını tanımlar. Bu sınıf, kartın yüzünü (örneğin "Ace", "Deuce") ve
kartın türünü (örneğin "Hearts", "Diamonds") temsil eden iki özelliğe sahiptir.
Kod çalıştırıldığında, kartın yüzü ve türü birleştirilip "face of suit" biçiminde bir metin olarak döndürülür.
Örneğin, Card sınıfının bir örneği oluşturulup toString() metodu çağrıldığında, kartın yüzü ve türüne göre bir metin
çıktısı elde edilir.*/

package ARRAYS.BookExample;
// Card class represents a playing card.
public class Card
{
    private String face; // face of card ("Ace", "Deuce", ...)
    private String suit; // suit of card ("Hearts", "Diamonds", ...)

    // two-argument constructor initializes card's face and suit
    public Card(String cardFace, String cardSuit) {
        face = cardFace; // initialize face of card
        suit = cardSuit; // initialize suit of card
    } // end two-argument Card constructor

    // return String representation of Card
    public String toString() {
        return face + " of " + suit;
    } // end method toString
} // end class Card
/*
Ace of Hearts

---------------------------------
|             Card              |
---------------------------------
| - face: String                |
| - suit: String                |
---------------------------------
| + Card(cardFace: String,      |
|         cardSuit: String)     |
| + toString(): String          |
---------------------------------

             1
             |
             |

          CardTest
---------------------------------
|                               |
---------------------------------
| + main(args: String[]): void  |
---------------------------------
*/