package com.noambechhofer.tictactoe;
/**
 * A Tic Tac Toe Player. Implemented by Human, will also be implemented by a
 * Computer in the future.
 */
public interface Player {
    /**
     * Take one turn
     * @return an int[2]: {row, column} (rows and columns start at 1, not 0)
     */
    public int[] move();

    public char sign();

    public String name();

    public int wins();

    public void incrementWins();
}
