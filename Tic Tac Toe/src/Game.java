/*  todo: Alternate who goes first.
*/
/**
 * A Tic Tac Toe Game
 */
public class Game {

  private Board board;
  private Player player1;
  private Player player2;

  /**
   * Constructor
   */
  public Game() {

    System.out.println("Let's get Player 1 set up:");
    player1 = new Human();

    System.out.println("Now let's set up Player 2:");
    boolean matches = true;
    while (matches) {
      player2 = new Human();
      if (player1.sign() == player2.sign())
        System.out.printf("%s has already chosen the sign %c. Try again.\n", player1.name(), player1.sign());
      else
        matches = false;
    }

  }

  /**
   * Play a single round
   */
  public void play() {
    board = new Board();
    int moveNumber = 1;
    while (!move(moveNumber++))
      ;// move() until it returns true, indicating a victory
  }

  /**
   * Internal method to alternate turns.
   * 
   * @param moveNumber the turn number. Starts at 1 and increments everytime a
   *                   Player makes a move.
   * @return true if the Player wins on that move.
   */
  private boolean move(int moveNumber) {
    Player p;
    if (moveNumber % 2 == 1)
      p = player1;
    else
      p = player2;

    if (move(p, moveNumber)) {
      p.incrementWins();
      return true;
    }

    return false;
  }

  /**
   * Internal method to have a Player move.
   * 
   * @param p          the Player whose turn it is.
   * @param moveNumber the turn number. Starts at 1 and increments everytime a
   *                   Player makes a move.
   * @return true if the Player wins on that move.
   */
  private boolean move(Player p, int moveNumber) {
    System.out.println(board);

    int[] cellCoords = p.move();
    Cell c = board.getCell(cellCoords[0], cellCoords[1]);

    if (!c.isNull()) {
      System.out.println("Cell already occupied!");
      move(moveNumber);
    } else
      c.setVal(p.sign());

    // check if the move won
    if (moveNumber >= 5)
      if (checkBoard(cellCoords, p.sign())) {
        System.out.println(board);
        System.out.println(p.name() + " wins!");
        return true;
      }
    return false;
  }

  /**
   * Check whether a specific Player move wins the board.
   * 
   * @param cellCoords the coordinates of the move - row, column.
   * @param matchMe    the Player's sign, i.e. 'X' or 'O'
   * @return true if the move wins the board.
   */
  private boolean checkBoard(int[] cellCoords, Character matchMe) {
    // victory: when the Cell's row or column are the same char (not null tho).
    // Also, if the Cell is on a diagonal, check the diagonals.
    Cell[] row = new Cell[3];
    Cell[] column = new Cell[3];

    for (int i = 0; i < 3; i++) {
      row[i] = board.getCell(cellCoords[0], i);
      column[i] = board.getCell(i, cellCoords[1]);
    }

    boolean rowVictory = true;
    for (Cell c : row) {
      Character current = c.val();
      if (current == null || !current.equals(matchMe))
        rowVictory = false;
    }
    if (rowVictory)
      return true;

    boolean colVictory = true;
    for (Cell c : column) {
      Character current = c.val();
      if (current == null || !current.equals(matchMe))
        colVictory = false;
    }
    if (colVictory)
      return true;

    // diagonals, needs to be rethought when going above 3 as board size!!
    boolean dgnlVictory = false;
    if ((!rowVictory && !colVictory) && (cellCoords[0] + cellCoords[1]) % 2 == 0) {
      dgnlVictory = checkDiagonals(cellCoords, matchMe);
    }
    if (dgnlVictory)
      return true;

    return false;
  }

  // will break when going above 3 as board size! Rethink how it's implemented.
  /**
   * Internal method to check whether a specifc Player move wins the board by
   * diagonals
   * 
   * @param cellCoords the coordinates of the move - row, column.
   * @param matchMe    the Player's sign, i.e. 'X' or 'O'
   * @return true if the move wins the board on a diagonal
   */
  private boolean checkDiagonals(int[] cellCoords, Character matchMe) {
    // the "\" backslash diagonal
    boolean backVictory = true;
    if (cellCoords[0] == cellCoords[1])
      for (int i = 0; i < 3; i++) {
        Character current = board.getCell(i, i).val();
        if (current == null || !current.equals(matchMe))
          backVictory = false;
      }
    if (backVictory)
      return true;

    // the "/" forwardslash diagonal
    boolean fwdVictory = true;
    if (cellCoords[0] + cellCoords[1] == 2)
      for (int i = 0; i < 3; i++) {
        Character current = board.getCell(i, 2 - i).val();
        if (current == null || !current.equals(matchMe))
          fwdVictory = false;
      }
    if (fwdVictory)
      return true;

    return false;
  }

  /**
   * Print the current score. Each time a player wins a board, their score is
   * incremented.
   */
  public void printScore() {
    System.out.printf("The score stands as follows: %s has %d wins, and %s has %d wins.\n",
        player1.name(), player1.wins(), player2.name(), player2.wins());
  }
}
