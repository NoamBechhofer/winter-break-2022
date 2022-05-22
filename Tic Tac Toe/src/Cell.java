/**
 * A Tic Tac Toe cell.
 */
public class Cell {

  /**
   * the value this cell contains. Valid options are {@code null}, {@code 'X'},
   * and {@code 'O'}.
   */
  private Character val;

  /**
   * Construct a Cell with a specific value
   * 
   * @param c the value the Cell should contain. Valid options are {@code null},
   *          {@code 'X'}, and {@code 'O'}.
   */
  public Cell(Character c) {
    if (c != null)
      if (c != 'X' && c != 'O')
        throw new IllegalArgumentException();
    val = c;
  }

  /**
   * Construct a blank Cell (the Cell will contain the value {@code null}).
   * Equivalent to {@code Cell(null)}.
   */
  public Cell() {
    this(null);
  }

  /**
   * Getter for the {@link Character} underlying this class.
   */
  public Character val() {
    return val;
  }

  /**
   * Determine whether this Cell holds a {@code null} value
   * 
   * @return true if the {@link Character} underlying this class is null
   */
  public boolean isNull() {
    return val == null;
  }

  /**
   * Set the value of the {@link Character} underlying this class.
   * 
   * @param v the value the Cell should contain. Valid options are {@code null},
   *          {@code 'X'}, and {@code 'O'}.
   */
  public void setVal(char v) {
    this.val = v;
  }

  /**
   * toString() override
   */
  @Override
  public String toString() {
    return val == null ? " " : ("" + val);
  }
}
