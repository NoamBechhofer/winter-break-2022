package com.noambechhofer.tictactoe;
/**
 * A Tic Tac Toe board
 */
public class Board {
  private Cell[][] theBoard;
  public static final int BOARDSIZE = 3;

  /**
   * Testboard constructor. For development purposes.
   * 
   * @param testBoard a Cell matrix to test.
   */
  public Board(Cell[][] testBoard) {
    int size = 0;
    for (int i = 0; i < BOARDSIZE; i++) {
      for (int j = 0; j < BOARDSIZE; j++) {
        size++;
        this.theBoard[i][j] = testBoard[i][j];
      }
    }
    if (size != (BOARDSIZE * BOARDSIZE)) {
      throw new IllegalArgumentException("Bad matrix size: " + size + " != 9. Please use a "+BOARDSIZE+"*"+BOARDSIZE+" Cell matrix.");
    }
  }

  /**
   * Standard constructor
   */
  public Board() {
    theBoard = new Cell[BOARDSIZE][BOARDSIZE];
    initializeBoard();
  }

  /**
   * Re-initialize this Board by instantiating all cells.
   */
  public void initializeBoard() {
    for (int i = 0; i < BOARDSIZE; i++) {
      for (int j = 0; j < BOARDSIZE; j++) {
        theBoard[i][j] = new Cell();
      }
    }
  }

  public Cell getCell(int row, int column) {
    return theBoard[row][column];
  }

  public Cell[][] theBoard() {
    return theBoard;
  }

  /**
   * toString() override
   */
  @Override
  public String toString() {
    String image = "";
    for (int i = 0; i < BOARDSIZE; i++) {

      for (int j = 0; j < BOARDSIZE; j++) {
        image += " ";

        if (theBoard[i][j].isNull()) {
          image += " ";
        } else {
          image += theBoard[i][j].val();
        }

        if (j < (BOARDSIZE - 1)) {
          image += " |";
        }
      }

      if (i < (BOARDSIZE - 1)){
        image += "\n";
        for (int j = 0; j < (BOARDSIZE - 1); j++){
          image += "---+";
        }
        image += "---\n";
      }
      
    }
    return image;
  }
}
