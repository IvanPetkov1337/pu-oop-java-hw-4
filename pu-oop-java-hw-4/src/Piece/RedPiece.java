package Piece;

import java.awt.*;

public class RedPiece extends Piece{

    public RedPiece (int row , int col , Color color, String id) {
        super(row, col, Color.red, "Red");
    }

    @Override
    public boolean isMoveValid(int moveRow, int moveCol) {
        return false;
    }
}
