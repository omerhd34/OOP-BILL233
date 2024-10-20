package ARRAYS.BookExample;

// Card shuffling and dealing application.
public class DeckOfCardsTest {
    // execute application
    public static void main(String[] args) {
        DeckOfCards myDeckOfCards = new DeckOfCards();
        myDeckOfCards.shuffle(); // place Cards in random order

        // print all 52 Cards in the order in which they are dealt
        for (int i = 0; i < 13; i++) {
            // deal and print 4 Cards
            System.out.printf("%-20s%-20s%-20s%-20s\n",
                    myDeckOfCards.dealCard(), myDeckOfCards.dealCard(),
                    myDeckOfCards.dealCard(), myDeckOfCards.dealCard());
        } // end for
    } // end main
} // end class DeckOfCardsTest
/*
Nine of Hearts      Queen of Clubs      Four of Diamonds    Nine of Diamonds
Deuce of Clubs      Eight of Clubs      Ten of Hearts       King of Clubs
King of Diamonds    Five of Diamonds    Ten of Diamonds     Deuce of Spades
Five of Spades      Eight of Diamonds   Seven of Clubs      Deuce of Diamonds
Ten of Spades       Queen of Hearts     Eight of Spades     Ace of Spades
Ace of Hearts       Six of Clubs        Jack of Diamonds    Nine of Clubs
Deuce of Hearts     King of Spades      Seven of Diamonds   Three of Clubs
Seven of Spades     Five of Clubs       Queen of Spades     Ten of Clubs
Six of Spades       Ace of Clubs        Queen of Diamonds   Five of Hearts
Three of Hearts     Jack of Hearts      Four of Hearts      Three of Spades
King of Hearts      Six of Hearts       Seven of Hearts     Jack of Spades
Nine of Spades      Eight of Hearts     Four of Spades      Ace of Diamonds
Four of Clubs       Six of Diamonds     Jack of Clubs       Three of Diamonds

+-----------------------------+
|        DeckOfCards          |
+-----------------------------+
| - deck: Card[]              |
| - currentCard: int          |
| - NUMBER_OF_CARDS: final int|
| - randomNumbers: Random     |
+-----------------------------+
| + DeckOfCards()             |
| + shuffle(): void           |
| + dealCard(): Card          |
+-----------------------------+

+-------------------------------+
|       DeckOfCardsTest         |
+-------------------------------+
| + main(args: String[]): void  |
+-------------------------------+

*/