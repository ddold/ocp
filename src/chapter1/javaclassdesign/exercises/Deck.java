package chapter1.javaclassdesign.exercises;

/**
 * Created by dan on 10/22/16.
 *
 * Q. Write a class whose instances represent a full deck of cards.
 */
public class Deck {
    public static int numSuits = 4;
    public static int numRanks = 13;
    public static int numCards = numRanks * numSuits;

    private Card[][] cards;

    public Deck(){
        cards = new Card[numSuits][numRanks];
        for(int suit = Card.HEARTS; suit <= Card.SPADES; suit++){
            for(int rank = Card.ACE; rank <= Card.KING; rank++){
                cards[suit - 1][rank - 1] = new Card(rank, suit);
            }
        }
    }

    public Card getCard(int suit, int rank){
        return cards[suit - 1][rank -1];
    }
}
