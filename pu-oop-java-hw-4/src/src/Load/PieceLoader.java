package Load;

import Game.GameBoard;
import Piece.*;

import java.awt.*;
import java.util.Random;

public class PieceLoader {


    private static int unplacedBluePieces   = 5;
    private static int unplacedGreenPieces  = 8;
    private static int unplacedRedPieces    = 50;
    //private int unplacedYellowPieces = 1;


    /*Пълни масива pieceCollection с Piece objects и връща двумерен масив със вече зададени стойности*/

    public static Piece[][] load() {

        Piece[][] pieceCollection = new Piece[GameBoard.TILE_SIDE_COUNT][GameBoard.TILE_SIDE_COUNT];

        //hard-coded starting position
pieceCollection[0][0] = (new YellowPiece(0, 0 , Color.YELLOW, "Yellow"));

        for(int i = 0 ; i < GameBoard.TILE_SIDE_COUNT ; i++){
            for(int j = 1 ; j < GameBoard.TILE_SIDE_COUNT ; j++){
                pieceCollection[i][j] = setRandomPiece(i, j);

            }
        }

        return pieceCollection;
    }

    /*
    @param приема row, col и ги задава като стойност на всеки Piece
    -Случайно задаване на цвят за Piece
    Задава стойности и позиции на всеки Piece и връща двумерен масив от вид Piece
    * */

    private static Piece setRandomPiece(int row, int col) {

        RedPiece red = new RedPiece(row, col, Color.red, "Red");
        BluePiece blue = new BluePiece(row, col, Color.red, "Blue");
        GreenPiece green = new GreenPiece(row, col, Color.red, "Green");

Random rand = new Random();
int colorPiece = rand.nextInt(3);

switch (colorPiece){
    case 0:
        if(unplacedRedPieces > 0) {
        unplacedRedPieces -= 1;
        return red;
    }
    else setRandomPiece(row, col);
        break;

        case 1:
            if(unplacedBluePieces > 0) {
                unplacedBluePieces -= 1;
                return blue;
            }
            else setRandomPiece(row, col);
            break;

            case 2:


        if(unplacedGreenPieces > 0) {
            unplacedGreenPieces -= 1;
            return green;
        }
        else setRandomPiece(row, col);

        break;


}
 return red;
    }
}