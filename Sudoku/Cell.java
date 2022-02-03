/*Noam Bechhofer
  Cell.java - a Sudoku cell*/
import java.util.ArrayList;
public class Cell{
  //instance vars
  private int column; //0-8
  private int row; //0-8
  private char box; //A-I
  private int value; //0 by default, 1-9
  private ArrayList<Integer> scratches;//1-9
  //constructors
  public Cell(int x) throws BoxException{//constructor for testing
    this.value = x;
    this.setBox();
  }
  public Cell(int c, int r)
  throws ValueOutOfBoundsException, CellOutOfBoundsException, BoxException{
    this.column = c;
    this.row = r;
    this.value = 0;
    scratches = new ArrayList<>();

    this.checkExceptions();
    this.setBox();
  }
  public Cell(int c, int r, int v)
  throws ValueOutOfBoundsException, CellOutOfBoundsException, BoxException{
    this.column = c;
    this.row = r;
    this.value = v;
    scratches = new ArrayList<>();

    this.checkExceptions();
    this.setBox();
  }
  //accessors
  public int getColumn(){
    return this.column;
  }
  public int getRow(){
    return this.row;
  }
  public char getBox(){
    return this.box;
  }
  public int getValue(){
    return this.value;
  }
  public ArrayList<Integer> getScratches(){
    return this.scratches;
  }
  public boolean scratchHas(Integer x){
    if (this.scratches.indexOf(x)==-1){
      return false;
    }
    return true;
  }
  public boolean hasValue(){
    if (this.value == 0){return false;}
    return true;
  }
  //mutators
  public void setValue(int x)
  throws ValueOutOfBoundsException, CellOutOfBoundsException{
    this.value = x;

    this.checkExceptions();
  }
  private void setBox() throws BoxException{
    switch (this.column){
      case 0:
      case 1:
      case 2:
        if (row<=3) {this.box = 'A';}
        else if (row<=6) {this.box = 'B';}
        else {this.box = 'C';}
        break;
      case 3:
      case 4:
      case 5:
        if (row<=3) {this.box = 'D';}
        else if (row<=6) {this.box = 'E';}
        else {this.box = 'F';}
        break;
      case 6:
      case 7:
      case 8:
        if (row<=3) {this.box = 'G';}
        else if (row<=6) {this.box = 'H';}
        else {this.box = 'I';}
        break;
      default:
        throw new BoxException();
    }
  }

  private void addScratch(int x){
    if (!(this.scratchHas(x))){
      this.scratches.add(x);
    }
  }
  private void removeScratch(Integer x){
    if(this.scratchHas(x)){
      this.scratches.remove(x);
    }
  }

  private void checkExceptions()
  throws ValueOutOfBoundsException, CellOutOfBoundsException{
    if (this.value < 0 || this.value > 9){
      throw new ValueOutOfBoundsException();
    }
    if (this.row < 0 || this.row > 8 || this.column < 0 || this.column > 8){
      throw new CellOutOfBoundsException();
    }
  }
}
