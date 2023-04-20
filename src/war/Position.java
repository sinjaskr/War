package war;

/**
 * @author jashanpreet.jatin,kamal,jaskaran 
 * Enum named position for values of card like 2,3,4 of spades clubs, diamonds, hearts
 */
public enum Position {
    ACE("Ace",1),
    TWO("Two", 2),
    THREE("Three", 3),
    FOUR("Four", 4),
    FIVE("Five", 5),
    SIX("Six", 6),
    SEVEN("Seven", 7),
    EIGHT("Eight", 8),
    NINE("Nine", 9),
    TEN("Ten", 10),
    JACK("Jack", 11),
    QUEEN("Queen", 12),
    KING("King", 13);
    

    private String positionName;
    private int positionNumber;

    Position (String positionName, int positionNumber) {
        this.positionNumber = positionNumber;
        this.positionName = positionName;
    }
    
    /**
     * @param positionName the positionName to set
     */
    public void setPositionName(String positionName) {
        this.positionName = positionName;
    }

    /**
     * @param positionNumber the positionNumber to set
     */
    public void setPositionNumber(int positionNumber) {
        this.positionNumber = positionNumber;
    }
    

    /**
     * @return positionName
     */
    public String getPositionName() {
        return this.positionName;
    }

    /**
     * @return int positionNumber
     */
    public int getPositionNumber() {
        return this.positionNumber;
    }

    /**
     * @return shortGroupOfCards of pos
     */
    @Override
    public String toString() {
        if(this.getPositionNumber() > 10){
            return this.getPositionName().substring(0,1);
        }
        return String.valueOf(this.getPositionNumber());                           //returns the string value of position number variable
    }

    
}