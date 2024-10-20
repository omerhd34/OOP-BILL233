package ARRAYS.BookExample;

// DeckOfCards class represents a deck of playing cards.

import java.util.Random;

public class DeckOfCards {
    private Card deck[]; // array of Card objects
    private int currentCard; // index of next Card to be dealt
    private final int NUMBER_OF_CARDS = 52; // constant number of Cards
    private Random randomNumbers; // random number generator

    // constructor fills deck of Cards
    public DeckOfCards() {
        String faces[] = {"Ace", "Deuce", "Three", "Four", "Five", "Six",
                "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King"};
        String suits[] = {"Hearts", "Diamonds", "Clubs", "Spades"};

        deck = new Card[NUMBER_OF_CARDS]; // create array of Card objects
        currentCard = 0; // set currentCard so first Card dealt is deck[ 0 ]
        randomNumbers = new Random(); // create random number generator

        // populate deck with Card objects
        for (int count = 0; count < deck.length; count++)
            deck[count] =
                    new Card(faces[count % 13], suits[count / 13]);
    } // end DeckOfCards constructor

    // shuffle deck of Cards with one-pass algorithm
    public void shuffle() {
        // after shuffling, dealing should start at deck[ 0 ] again
        currentCard = 0; // reinitialize currentCard

        // for each Card, pick another random Card and swap them
        for (int first = 0; first < deck.length; first++) {
            // select a random number between 0 and 51
            int second = randomNumbers.nextInt(NUMBER_OF_CARDS);

            // swap current Card with randomly selected Card
            Card temp = deck[first];
            deck[first] = deck[second];
            deck[second] = temp;
        } // end for
    } // end method shuffle

    // deal one Card
    public Card dealCard() {
        // determine whether Cards remain to be dealt
        if (currentCard < deck.length)
            return deck[currentCard++]; // return current Card in array
        else
            return null; // return null to indicate that all Cards were dealt
    } // end method dealCard
} // end class DeckOfCards

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