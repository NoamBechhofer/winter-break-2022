package com.noambechhofer.tictactoe;

import javax.swing.*;
import java.awt.*;

public class T3GUI extends JFrame{
    private int boardSize;
    /** Buttons will be 300x300 px */
    private static final int BUTTONSIZE = 300;

    public T3GUI(int boardSize){

        super("Tic Tac Toe");
        this.boardSize = boardSize;
        initUI();

    }

    private void initUI() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize((BUTTONSIZE * boardSize),(BUTTONSIZE * boardSize));//accomodate buttons
        setLocationRelativeTo(null);//center the window

        JMenuBar bar = new JMenuBar();
        JMenu file = new JMenu("File");
        bar.add(file);

        JMenuItem newGame = new JMenuItem("New Game");//new Game, not new round!
        JMenuItem showScore = new JMenuItem("Show Score");//popup?
        file.add(newGame); file.add(showScore);
        
        setJMenuBar(bar);

        T3Panel gamePanel = new T3Panel();

        GridLayout grid = new GridLayout(boardSize, boardSize);
        for (int i = 0; i < boardSize * boardSize; i++){
            JButton button = new JButton();
            button.setText("");
            button.addActionListener(e -> {
                
            });
        }
    }
    public static void main(String[] args) {
        T3GUI gui = new T3GUI(3);
        
    }
}

class T3Panel extends JPanel {}
