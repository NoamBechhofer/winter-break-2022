public class BoardTester{
  public static void main(String[] args)
  throws BoxException, ValueOutOfBoundsException, CellOutOfBoundsException{
    Cell[][] x = {{new Cell(0,0,1), new Cell(0,1,2), new Cell(0,2,3), new Cell(0,3,4), new Cell(0,4,5), new Cell(0,5,6), new Cell(0,6,7), new Cell(0,7,8), new Cell(0,8,9)},{new Cell(1,0), new Cell(1,1,1), new Cell(1,2,2), new Cell(1,3,3), new Cell(1,4,4), new Cell(1,5,5), new Cell(1,6,6), new Cell(1,7,7), new Cell(1,8,8)},{new Cell(2,0,1), new Cell(2,1,2), new Cell(2,2,3), new Cell(2,3,4), new Cell(2,4,5), new Cell(2,5,6), new Cell(2,6,7), new Cell(2,7,8), new Cell(2,8,9)},{new Cell(3,0), new Cell(3,1,1), new Cell(3,2,2), new Cell(3,3,3), new Cell(3,4,4), new Cell(3,5,5), new Cell(3,6,6), new Cell(3,7,7), new Cell(3,8,8)},{new Cell(4,0,1), new Cell(4,1,2), new Cell(4,2,3), new Cell(4,3,4), new Cell(4,4,5), new Cell(4,5,6), new Cell(4,6,7), new Cell(4,7,8), new Cell(4,8,9)},{new Cell(5,0), new Cell(5,1,1), new Cell(5,2,2), new Cell(5,3,3), new Cell(5,4,4), new Cell(5,5,5), new Cell(5,6,6), new Cell(5,7,7), new Cell(5,8,8)},{new Cell(6,0,1), new Cell(6,1,2), new Cell(6,2,3), new Cell(6,3,4), new Cell(6,4,5), new Cell(6,5,6), new Cell(6,6,7), new Cell(6,7,8), new Cell(6,8,9)},{new Cell(7,0), new Cell(7,1,1), new Cell(7,2,2), new Cell(7,3,3), new Cell(7,4,4), new Cell(7,5,5), new Cell(7,6,6), new Cell(7,7,7), new Cell(7,8,8)},{new Cell(8,0,1), new Cell(8,1,2), new Cell(8,2,3), new Cell(8,3,4), new Cell(8,4,5), new Cell(8,5,6), new Cell(8,6,7), new Cell(8,7,8), new Cell(8,8,9)}};

    Board test = new Board(x);
    System.out.println(test);
  }
}
