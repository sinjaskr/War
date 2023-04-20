package war;

public class Display {

    public void start() {
       String message = "Welcome to the War Game!\n"
            + "This game is automatic and it will play until the game reaches 25 rounds or 1 deck is empty.\n"
            + "This war is between you and the computer. Will you be able to defeat it.\n"
            + "Let's see.\n\n"
            + "Please enter your name.\n"
            + "Let's go!!!!!\n";
    System.out.print(message);
    }

    public void playerStart(Player player) {
        System.out.printf("%s ,let's Start!\n\n", player.getName());
    }

    public void Turn(Player p1, Player p2) {
        String header = "NumberOfCards";
        String winner = "Winner of the Round";
        System.out.printf("%-21s %-21s %-21s %-21s %-21s \n", p1.getName(), header, p2.getName(), header, winner);
    }


    //Print out winnings for each round and final winner of game.
    public void TurnWinner(Player p1, Card card1, Player p2, Card card2, String winner) {
        System.out.printf("%-21s %-21s %-21s %-21s %s is winner.\n", card1.toString(), p1.getGoc().gocSize(), card2.toString(), p2.getGoc().gocSize(), winner);
    }

   //print war round
    public void Tie() {
                System.out.println();
        System.out.println("WAR! It's a a tie... .");
        System.out.println();
    }

    public void Winner(Player player) {
                System.out.println();
        System.out.printf("Winner of game : %s!", player.getName());
        System.out.println();
    }

    public void Draw() {
                System.out.println();
        System.out.println("OOPS! It's a draw!");
        System.out.println();
        
    }
}