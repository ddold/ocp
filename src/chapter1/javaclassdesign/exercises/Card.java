package chapter1.javaclassdesign.exercises;

/**
 * Created by dan on 10/22/16.
 *
 * Q. Write a class whose instances represent a single playing card from a deck of cards.
 *    Playing cards have two distinguishing properties: rank and suit.
 */
public class Card {
    private final int suit;
    private final int rank;

    static final int HEARTS = 1;
    static final int DIAMONDS = 2;
    static final int CLUBS = 3;
    static final int SPADES = 4;

    static final int ACE = 1;
    private static final int DEUCE = 2;
    private static final int THREE = 3;
    private static final int FOUR = 4;
    private static final int FIVE = 5;
    private static final int SIX = 6;
    private static final int SEVEN = 7;
    private static final int EIGHT = 8;
    private static final int NINE = 9;
    private static final int TEN = 10;
    private static final int JACK = 11;
    private static final int QUEEN = 12;
    static final int KING = 13;

    public Card(int rank, int suit){
        assert isValidRank(rank);
        assert isValidSuit(suit);
        this.suit = suit;
        this.rank = rank;
    }

    public int getSuit(){
        return suit;
    }

    public int getRank(){
        return rank;
    }

    public static boolean isValidRank(int rank){
        return ACE <= rank && rank <= KING;
    }

    public static boolean isValidSuit(int suit){
        return HEARTS <= suit && suit <= SPADES;
    }

    public static String rankToString(int rank){
        switch(rank){
            case ACE:
                return "Ace";
            case DEUCE:
                return "Deuce";
            case THREE:
                return "Three";
            case FOUR:
                return "Four";
            case FIVE:
                return "Five";
            case SIX:
                return "Six";
            case SEVEN:
                return "Seven";
            case EIGHT:
                return "Eight";
            case NINE:
                return "Nine";
            case TEN:
                return "Ten";
            case JACK:
                return "Jack";
            case QUEEN:
                return "Queen";
            case KING:
                return "King";
            default:
                return null;
        }
    }

    public static String suitToString(int suit){
        switch (suit){
            case HEARTS:
                return "Hearts";
            case DIAMONDS:
                return "Diamonds";
            case CLUBS:
                return "Clubs";
            case SPADES:
                return "Spades";
            default:
                return null;
        }
    }

    public String toString(){
        return suitToString(getSuit()) + " " + rankToString(getRank());
    }

    public static void main(String [] args){
        assert rankToString(ACE) == "Ace";
        assert rankToString(DEUCE) == "Deuce";
    }
}
