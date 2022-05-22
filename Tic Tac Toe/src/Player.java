/**
 * A Tic Tac Toe Player. Implemented by Human, will also be implemented by a
 * Computer in the future.
 */
public interface Player {
    public int[] move();

    public char sign();

    public String name();

    public int wins();

    public void incrementWins();
}
