package Application;
import Game.GameBoard;
import Load.PieceLoader;
import Render.*;

public class Application {

    public static void main(String[] args) {


        PieceLoader loader = new PieceLoader();
        GameBoard gameBoard     = new GameBoard(PieceLoader.load());
        Render renderer  = new Render(gameBoard);

    }
}
