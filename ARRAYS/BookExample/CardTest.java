package ARRAYS.BookExample;

public class CardTest {
    public static void main(String[] args) {
        // "Ace" yüzüne ve "Hearts" türüne sahip bir kart oluşturuluyor.
        Card card = new Card("Ace", "Hearts");

        System.out.println(card);   // Kartın String temsili ekrana yazdırılıyor.
    }
}
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