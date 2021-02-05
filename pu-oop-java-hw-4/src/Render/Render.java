package Render;
import Game.GameBoard;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Render extends JFrame implements MouseListener {

    GameBoard gameBoardLogic;

    public Render(GameBoard gameBoardLogic) {


        this.gameBoardLogic = gameBoardLogic;


        this.setSize(800, 800);
        this.setVisible(true);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.addMouseListener(this);
    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

    public void paint(Graphics g) {

        for(int row = 0; row < 8; row++) {
            for(int col = 0; col < 8; col++) {

                this.gameBoardLogic.renderGameTile(g, row, col);
                this.gameBoardLogic.renderGamePiece(g, row, col);
            }
        }
    }
}
