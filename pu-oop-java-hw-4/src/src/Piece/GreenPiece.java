package Piece;

import java.awt.*;

public class GreenPiece extends Piece{

    public GreenPiece (int row , int col , Color color, String id) {
        super(row, col, Color.green, "Green");
    }
    public boolean isMoveValid(int moveRow, int moveCol) {
        return false;
    }
}

