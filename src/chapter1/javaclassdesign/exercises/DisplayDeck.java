package chapter1.javaclassdesign.exercises;

/**
 * Created by dan on 10/22/16.
 *
 * Q. Write a small program to test your deck and card classes.
 *    The program can be as simple as creating a deck of cards and displaying its cards.
 */
public class DisplayDeck {
    public static void main(String [] args){
        Deck deck = new Deck();
        for(int suit = Card.HEARTS; suit <= Card.SPADES; suit++){
            for(int rank = Card.ACE; rank <= Card.KING; rank++){
                Card card = deck.getCard(suit, rank);
                System.out.printf("%s of %s\n",
                        Card.rankToString(card.getRank()),
                        Card.suitToString(card.getSuit()));
            }
        }
    }
}
