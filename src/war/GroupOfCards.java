package war;

import java.util.ArrayList;
import java.util.List;

/**
 * Representative of an individual cards of cards. War specifically starts with 26 cards.
 */

public class GroupOfCards {

    private List<Card> cards; //players individual cards


    public GroupOfCards() {
        this.cards = new ArrayList<Card>();
    }

    /**
     * Merge another goc into this one
     *
     * @param other
     */
    public void combineGroupOfCards(GroupOfCards other) {
        for (Card crd : other.cards) {
            this.addCardlast(crd);
        }
    }


    /**
     * Take N cards
     *
     * @param numCards
     * @return
     */
    public List<Card> take(int numCards) {
        if (numCards > this.gocSize()) {
            return null;
        }

        List<Card> out = new ArrayList<>();
        for (int i = 0; i < numCards; i++) {
            out.add(this.cards.remove(this.gocSize() - 1));
        }

        return out;
    }

    /**
     * @param: c single Card object added to end of Array
     */
    public void addCardToTop(Card crd) {
        if (crd == null) {
            throw new NullPointerException("NUll card cannot be added to group of cards.");
        }
        cards.add(crd);
    }

    /**
     * adds more than one card at a time to goc
     *
     * @param cds cards added to goc as array
     */
    public void addCardfirst(List<Card> cd) {
        this.cards.addAll(cd);
    }

    /**
     * @param c single Card object added to beginning of Array
     */
    public void addCardlast(Card crd) {
        cards.add(0, crd);
    }

    /**
     * removes the card from the last index of the array
     */
    public Card removeCardfirst() {
        if (gocSize() < 1) {
            return null;
        }
        return cards.remove(gocSize() - 1);
    }

    /**
     * removes card from the first index of the array
     */
    public Card removeCardlast() {
        if (gocSize() < 1) {
            return null;
        }
        return cards.remove(0);
    }

    /**
     *this will give number of cards
     */
    public int gocSize() {
        return cards.size();
    }

}


