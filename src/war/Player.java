
package war;
/**
  *@author jashanpreet.jatin,kamal,jaskaran 
 */

public class Player {

    private String name;
    private GroupOfCards goc;
    

    public Player(String name) {
        this.name = name;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the goc
     */
    public GroupOfCards getGoc() {
        return goc;
    }

    /**
     * @param goc the goc to set
     */
    public void setGoc(GroupOfCards goc) {
        this.goc = goc;
    }

   
 
}