/*Noam Bechhofer
  Interpreter.java - take a string of 81 (non-seperated) digits and format it to
  make a Sudoku board.
  N.B.: Make sure to write empty cells as 0 when using Interpreter*/
import java.io.File;
import java.io.PrintWriter;
import java.io.FileNotFoundException;
public class Interpreter{
  public static String Interpret(String board) throws IllegalArgumentException{
    if (board.length() != 81){throw new IllegalArgumentException("bad length; 81 cells required");}
    String stringer = "Cell[][] x = {";
    for (int i = 0; i<9; i++){//column[]
      stringer += "{";
      for (int j = 0; j<9; j++) {//row[]

        int pos = i*9+j;//position in the String
        char valChar = board.charAt(pos);//get the value
        int val = valChar - 48;//char to int
        if (val == 0){
          stringer += "new Cell("+i+","+j+")";//abbreviated constructor for null celll
        } else if (val >= 1 && val <= 9) {
          stringer += "new Cell("+i+","+j+","+val+")";
        } else {
          throw new IllegalArgumentException("character "+valChar+" at position "
          +(pos+1)+" is not a valid 0 - 9 number.");
        }
        if (j != 8) {stringer += ", ";}//to seperate from next new Cell
      }
      if (i != 8) { stringer += "},";}
      else { stringer += "}";}//last row[] should not be followed by a ','
    }
    stringer += "};";

    return stringer;
  }
  public static void main (String[] args) throws FileNotFoundException{
    //Take a commandline input
    File f = new File("Formatted_Board.txt");
    PrintWriter pOut = new PrintWriter(f);

    String formatted = Interpreter.Interpret(args[0]);
    pOut.println(formatted);
    pOut.close();
  }
}
