import javax.swing.*;
import java.awt.*;

public class checkers {
    public static void main(String[] args) {
        entity board[][] = fillBoard();
        //printBoard(board);
        board checkerB = new board();
        checkerB.createBoard();
    }

    public static entity[][] fillBoard() {
        entity board[][] = new entity[8][8];
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                board[i][j] = new entity();
            }
        }
        for (int i = 0; i < 8; i++) {
            switch (i) {
                case 0:
                    for (int j = 1; j < 8; j += 2) {
                        board[i][j].team = 1;
                        board[i][j].type = 1;
                    }
                    break;
                case 1:
                    for (int j = 0; j < 8; j += 2) {
                        board[i][j].team = 1;
                        board[i][j].type = 1;
                    }
                    break;
                case 2:
                    for (int j = 1; j < 8; j += 2) {
                        board[i][j].team = 1;
                        board[i][j].type = 1;
                    }
                    break;
                case 5:
                    for (int j = 0; j < 8; j += 2) {
                        board[i][j].team = 2;
                        board[i][j].type = 1;
                    }
                    break;
                case 6:
                    for (int j = 1; j < 8; j += 2) {
                        board[i][j].team = 2;
                        board[i][j].type = 1;
                    }
                    break;
                case 7:
                    for (int j = 0; j < 8; j += 2) {
                        board[i][j].team = 2;
                        board[i][j].type = 1;
                    }
                    break;
            }
        }
        return board;
    }

    public static void printBoard(entity[][] board) {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print(Integer.toString(board[i][j].type));
            }
            System.out.println("");
        }
    }
}