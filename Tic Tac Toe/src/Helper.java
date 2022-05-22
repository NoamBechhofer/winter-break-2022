/**
 * Tic Tac Toe helper class
 */
public class Helper {
    /**
     * Test purposes. Turn a Character[] of {@link char}s and {@code null}s into an equivalent Tic Tac Toe {@link Board}.
     * @param vals the array. Should read left to right, top to bottom.
     * @return the Board.
     */
    public Board interpret(Character[] vals){

        int boardSize = (int) Math.sqrt(vals.length);

        Cell[][] board = new Cell[boardSize][boardSize];
        for (int i = 0; i < boardSize; i++)
            for (int j = 0; j < boardSize; j++)
                board[i][j] = new Cell(vals[i * boardSize + j]);

        return new Board(board);
    }
}
