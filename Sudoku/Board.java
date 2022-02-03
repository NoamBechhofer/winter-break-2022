/*(c) Noam Bechhofer 2022
  Board.java - a Sudoku board*/
public class Board{
  //instance vars
  private Cell[][] layout;//[row][column]
  //constructors
  public Board(Cell[][] x){
    this.layout = x;
  }
  //accessors
  public String toString(){
    String image = "CURRENT BOARD:\n";
    for(int i = 0; i<9; i++){
      for(int j = 0; j<9; j++){
        int val = layout[i][j].getValue();
        if (val == 0) {//blank cell
          image += "  ";//print only whitespace
        } else {//non-blank cell
          image += val+" ";//print the value and some whitespace
        }
        if (j == 2 || j == 5){image += "| ";}//vertical box lines
      }
      image+="\n";
      if (i == 2 || i == 5){
        image += "------+-------+-------\n";//horizontal box lines
      }
    }
    return image;
  }
  //mutators

}
