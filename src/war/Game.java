
package war;

import java.util.List;
import java.util.Scanner;

public class Game {

   
    private Deck deck;

    private static Display display = new Display();

    private Player humanPlayer;

    private Player compPlayer;

    public void startGame() {
        
        display.start();        //prints message at starting

        Scanner in = new Scanner(System.in);         // get name of player 1
        String name = in.nextLine();
        this.humanPlayer = new Player(name);
        this.compPlayer = new Player("Computer");

        display.playerStart(humanPlayer);         // prints message to start game

        deck = new Deck();         //creates a new deck

        deck.shuffleDeck();        //shuffle deck

        humanPlayer.setGoc(new GroupOfCards());          //Create and set gocs for user
        compPlayer.setGoc(new GroupOfCards());           //Create and set gocs for computer

        distributeCards(humanPlayer.getGoc());        //distribute cards to user
        distributeCards(compPlayer.getGoc());         //distribute cards to computer

        display.Turn(humanPlayer, compPlayer);

        int maxRounds = 23;
        Player winner = null;     //to display result
        while (battle(humanPlayer, compPlayer, null)) {
            maxRounds--;

            // checks gocs to find winner
            if (humanPlayer.getGoc().gocSize() == 0) {               
                winner = compPlayer;                                         // if computer is winner
                break;
            } else if (compPlayer.getGoc().gocSize() == 0) {
                winner = humanPlayer;                                   // if user is winner   
                break;
            } else if (humanPlayer.getGoc().gocSize() == compPlayer.getGoc().gocSize()) {
                display.Draw();
            } 

            if (maxRounds < 0) {
                break;
            }
        }

        if (winner != null) {
        } else if (humanPlayer.getGoc().gocSize() > compPlayer.getGoc().gocSize()) {
            winner = humanPlayer;
        } else if (compPlayer.getGoc().gocSize() > humanPlayer.getGoc().gocSize()) {
            winner = compPlayer;
        } else {

                   
            return;
        }
        display.Winner(winner);
    }

    // Distribute 26 cards
    public void distributeCards(GroupOfCards goc) {
        for (int i = 0; i < 26; i++) {
            goc.addCardToTop(deck.dealCard());
        }
    }

    public boolean battle(Player p1, Player p2, GroupOfCards pot) {

        //stores cards in an array.
        Card p1FaceUp = p1.getGoc().removeCardfirst();
        if (p1FaceUp == null) {
            return false;
        }

        Card p2FaceUp = p2.getGoc().removeCardfirst();
        if (p2FaceUp == null) {
            return false;
        }

        if (pot == null) {
            pot = new GroupOfCards();
        }
        pot.addCardToTop(p1FaceUp);
        pot.addCardToTop(p1FaceUp);

        int result = p1FaceUp.compareTo(p2FaceUp);
        switch (result) {
            case 0:
                display.Tie();

                List<Card> warPlayerOnePot = p1.getGoc().take(3);
                if (warPlayerOnePot == null) {
                    return false;
                }
                pot.addCardfirst(warPlayerOnePot);

                List<Card> warPlayerTwoPot = p2.getGoc().take(3);
                if (warPlayerTwoPot == null) {
                    return false;
                }
                pot.addCardfirst(warPlayerTwoPot);

                return battle(p1, p2, pot);
            case 1:
                //Give all cards on table to first player 
                p1.getGoc().combineGroupOfCards(pot);
                display.TurnWinner(p1, p1FaceUp, p2, p2FaceUp, p1.getName());
                break;
            case -1:
                //Give all cards on table to other player
                p2.getGoc().combineGroupOfCards(pot);
                display.TurnWinner(p1, p1FaceUp, p2, p2FaceUp, p2.getName());
                break;
        }

        return true;
    }
}

