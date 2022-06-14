package com.noambechhofer.tictactoe;

import java.util.Scanner;

/**
 * A human Tic Tac Toe player
 */
public class Human implements Player {
  private String name;
  /** The sign this player will have, e.g. 'X' or 'O' */
  private char sign;
  private Scanner sc;
  private int wins;
  public static final int BOARDSIZE = 3;

  /**
   * Constructor
   */
  public Human() {
    sc = new Scanner(System.in);
    wins = 0;

    System.out.println("What's your name?");
    name = sc.nextLine();

    System.out.printf("Hi %s! What sign would you like? Input one character, for example 'x' or 'o'. No quotes, case sensitive.\n", name);
    char c = sc.nextLine().charAt(0);
    sign = c;
  }

  /**
   * Getter for this Player's sign (e.g. 'X' or 'O')
   */
  public char sign() {
    return sign;
  }

  /**
   * Take one turn
   * @return an int[2]: {row, column} (rows and columns start at 1, not 0)
   */
  public int[] move() {
    System.out.println(name + ", where would you like to go?\n"
        + " Be sure to enter your choice exactly as \"row,column\" e.g. 1,2");
    String move = sc.nextLine();

    while (!move.matches("[1-" + BOARDSIZE + "],[1-" + BOARDSIZE + "]")) {
      System.out.println("Bad input format. Try again.");
      move = sc.nextLine();
    }

    return formatMove(move);
  }

  /**
   * Internal method to turn a String from move() into an int[]
   * 
   * @param move the String passed from move()
   * @return an int[2]: {row, column} (rows and columns start at 1, not 0)
   */
  private int[] formatMove(String move) {
    int[] tmp = new int[2];
    tmp[0] = Character.getNumericValue(move.charAt(0)) - 1;
    // charAt(1) is a comma
    tmp[1] = Character.getNumericValue(move.charAt(2)) - 1;
    return tmp;
  }

  /**
   * Getter for this Player's name
   */
  public String name() {
    return name;
  }

  /**
   * Getter for this Player's wins counter
   */
  public int wins() {
    return wins;
  }

  /**
   * Increment this Player's wins counter
   */
  public void incrementWins() {
    wins++;
  }
}
