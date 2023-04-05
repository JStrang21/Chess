package main.java.com.ex;

public class Board {
    //int 1 represents white && int 2 represents black
    public Square[][] board = new Square[8][8];

    public Board() {
        //Sets up board with white pieces on one side and black pieces on other side
        initalizePieces();
    }

    public boolean movePiece(int color, int srcX, int srcY, int desX, int desY) {
        //Player decides where to move piece, board checks if move is possible given the specific pieces movement
        //Get target square from inputted x and y
        Square curSquare = board[srcX][srcY];
        //Get piece on the square
        Piece curPiece = curSquare.piece;
        //TODO account for if enemy piece is on des square
        boolean squareOccupied = board[desX][desY].isOccupied;
        //If move is possible and square has enemy piece then move piece to des square and account for kill
        if (curPiece.canMove(desX, desY) && squareOccupied)  {
            //board[desX][desY] = 
        }
        else if (curPiece.canMove(desX, desY) && !squareOccupied) {
            board[desX][desY].piece = curPiece;
            curPiece.curX = desX;
            curPiece.curY = desY;
        }
        //Else return false and piece stays in square
        return false;
    }

    public void initalizePieces() {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                
            }
        }

    }


}
