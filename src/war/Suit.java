package war;

/**
   * @author jashanpreet.jatin,kamal,jaskaran 
 * making enum Suit for the cards like spades clubs diamonds and hearts
 */
public enum Suit {
    SPADES("spade", "s"),
    CLUBS("club", "c"),
    DIAMONDS("diamond", "d"),
    HEARTS("heart", "h");
    
    
    private String suitType;
    private String letter;

   
    Suit(String suitType, String letter){
        this.suitType = suitType;
        this.letter = letter;
    }

    /**
     * @param letter the letter to set
     */
    public void setLetter(String letter) {
        this.letter = letter;
    }
    
    /**
     *return letter like d,c,s,h
     */
    public String getLetter(){
        return this.letter;
    }

    /**
     *returns the suit type of the cards
     */
    public String getSuitType() {
        return this.suitType;
    }

   
    /**
     * @param suitType the suitType to set
     */
    public void setSuitType(String suitType) {
        this.suitType = suitType;
    }

    
    
     /**
     *overriding toString
     */
    @Override
    public String toString() {
        return this.getLetter();
    }


}
























