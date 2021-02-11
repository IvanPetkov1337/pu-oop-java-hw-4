package Piece;

import java.awt.*;

public class BluePiece extends Piece{

    public BluePiece (int row , int col , Color color, String id){
        super(row , col , Color.blue , "Blue");

    }
    public boolean isMoveValid(int moveRow, int moveCol) {
        return false;
    }
}
