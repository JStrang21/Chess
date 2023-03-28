public class Player {
    //If player object is human than game will wait for player to make move
    public boolean human;
    
    public Player(int i) {
        //If player is instantiated with i as paramater rather than no parameter than that object is human playable
        human = true;
    }

    public Player() {
        human = false;
    }
}
