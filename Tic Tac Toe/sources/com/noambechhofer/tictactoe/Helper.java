package com.noambechhofer.tictactoe;
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

    
    /**
     * Clear the console. If not able to do so, add some seperating lines.
     */
    public final static void clearConsole(){
        try{
            final String os = System.getProperty("os.name");
            if (os.contains("Windows")){
            Runtime.getRuntime().exec("cls");
            }
            else{
            Runtime.getRuntime().exec("clear");
            }
        } catch (final Exception e){
            System.out.print("\n\n\n\n\n");
        }
    }
}
