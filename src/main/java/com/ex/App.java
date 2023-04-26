package main.java.com.ex;

/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        Game g1 = new Game(1);
        //g1.board.movePiece(0, 0, 0, 1);
        g1.board.getPiece(0,0);
    }
}
