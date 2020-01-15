import javax.swing.*;
import java.awt.*;

public class board {
    JFrame frame;
    JPanel checkerBoard;
    JButton[][] squares;
    entity[][] entities;

    public board() {
        frame = new JFrame();
        checkerBoard = new JPanel(new GridLayout(8, 8));
        squares = new JButton[8][8];
        entity [][] entities = new entity [8][8];
     }

    public board(JFrame frame, JPanel checkerBoard, JButton[][] squares) {
        this.frame = frame;
        this.checkerBoard = checkerBoard;
        this.squares = squares;
    }

    public void createBoard() {
        // Setting the background colors
        for (int i = 0; i < 8; i++) {
            if ((i % 2) == 0) {
                for (int j = 0; j < 8; j++) {
                    if (j % 2 == 0) {
                        this.squares[i][j] = new JButton("Piece");
                        this.squares[i][j].setBackground(Color.WHITE);
                    } else {
                        this.squares[i][j] = new JButton("Piece");
                        this.squares[i][j].setBackground(Color.BLACK);
                    }
                }
            } else {
                for (int j = 0; j < 8; j++) {
                    if (j % 2 == 0) {
                        this.squares[i][j] = new JButton("Piece");
                        this.squares[i][j].setBackground(Color.BLACK);
                    } else {
                        this.squares[i][j] = new JButton("Piece");
                        this.squares[i][j].setBackground(Color.WHITE);
                    }
                }
            }
        }
        //Adding squares onto the checker board
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                this.checkerBoard.add(squares[i][j]);
            }
        }
        //
        this.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.frame.setSize(800, 800);
        this.frame.getContentPane().add(checkerBoard);
        this.frame.setVisible(true);
    }
}