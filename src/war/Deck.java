package war;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *  @author jashanpreet,jatin,kamal,jaskaran 
 * Deck of cards .Total 52 cards in a game.
 */
public class Deck {

    private final List<Card> cards = new ArrayList<Card>();    //using arraylist
  
    //constructor with no args
    Deck() {
        createDeck();
    }

    
    private void createDeck() {
        for (Suit s : Suit.values()) {
            for (Position r : Position.values()) {
                cards.add(new Card(r, s));
            }
        }
    }

    /**
     * Shuffles the deck and get random cards
     */
    public void shuffleDeck() {
        Collections.shuffle(this.cards);
    }

    

    
    /**
     * .
     */
    public Card dealCard() {
 
        return this.cards.remove(this.cards.size() - 1);
    }
    
    
    /**
     * @return number of cards in the deck left behind
     */
    public int getCardsCount() {
        return this.cards.size();
    }


    /*
    *adds card to the deck
     */
    public void addCard(Card c) {
        this.cards.add(0, c);
    }

    
    /**
     * @return 
     */
    public List<Card> getCards() {
        return this.cards;
    }
    
    
    /**
     * @return a String having cards
     */
    @Override
    public String toString() {
        return this.cards.toString();
    }
}