package Piece;

import java.awt.*;

public class YellowPiece extends Piece{

    public YellowPiece (int row , int col , Color color, String id) {
        super(row, col, Color.YELLOW, "Yellow");
    }

    @Override
    public boolean isMoveValid(int moveRow, int moveCol) {
        return false;
    }
}
