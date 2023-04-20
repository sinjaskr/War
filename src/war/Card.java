package war;

/*
This is the Card class. This class will help us to play the game. It will match the input of computer and the player. 
If the card thrown by player is matched with the card previously thrown by computer, then all the cards present on the screen will be owned 
by user and vice- versa. At lat the one having the maximum number of cards would win the game. So, it is basically the game of luck.
*/
public class Card implements Comparable<Card> {

    private final Position pos;
    private final Suit suit;
    private final String card;


    Card(Position pos, Suit suit) {
        if (pos == null || suit == null) {      //gives exception if either their is no position of card or suit 
            throw new NullPointerException();
        }
        this.pos = pos;
        this.suit = suit;
        this.card = String.format("%s%s", pos.toString(), suit.getLetter());
    }

    /*
     * @return name of a  suit
     */
    public Suit getSuit() {   // DIAMONDS
        return this.suit;
    }

    /*
     * @return goc of an objects suit
     */
    public String getSuitLetter() {
        return this.suit.getLetter();   //D
    }

    /*
     * @return name of a pos
     */
    public Position getPosition() {      //FIVE
        return this.pos;
    }

    /*
     * @return goc of an objects pos
     */
    public String getPositionLetter() {   //5
        return this.pos.toString();
    }

    /*
     * @return Number specifies of how many points the card is?
     */
    public Integer getCardPoints() {
        return this.pos.getPositionNumber();    //5
    }

    /*
     * @return goc of an objects pos and suit
     */
    public String getCard() {
        return this.card;         //5D
    }

    /**
     * @return 1 if point value thisCard is greater than otherCard and  -1 if thisCard is smaller than otherCard 
     * It will return 0 if point values of this card and other cards are equal
     * @param: a card object
     */
    public int compareTo(Card other) {

        return this.getCardPoints().compareTo(other.getCardPoints());
    }

    /**
     * @return true if string value of suit of 2 different cards are the similar
     * @param: a card object
     */
    public boolean isSameSuit(Card other) {
        return this.suit.equals(other.suit);
    }

    /**
     * @return true if string value of pos of 2 different cards are the similar
     * @param: a card object
     */
    public boolean isSamePosition(Card other) {
        return this.pos.equals(other.pos);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (!Card.class.isAssignableFrom(obj.getClass())) {
            return false;
        }
        final Card other = (Card) obj;
        return this.suit == other.suit && this.pos == other.pos;
    }

    /*
     * @return  Name of a card 
     */
    @Override
    public String toString() {
        return this.pos.getPositionName() + " of " + this.suit.getSuitType();    //5 of Diamods
    }

}

