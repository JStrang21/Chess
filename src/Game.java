public class Game {
    Player playerOne;
    Player playerTwo;
    Board board;
    
    public Game(int i) {
        //Substantiate playerOne with 1 as paramater to indicate that it's the human player
        if (i == 1) {
            //One player game
            playerOne = new Player(i);
            playerTwo = new Player();
        }
        else if (i == 2) {
            //Two player game
            playerOne = new Player(i);
            playerTwo = new Player(i);
        }
        else {
            //CPU vs CPU (may remove in future)
            playerOne = new Player();
            playerTwo = new Player();
        }
    }
}
