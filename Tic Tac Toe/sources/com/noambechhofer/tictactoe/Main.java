package com.noambechhofer.tictactoe;

import java.util.Scanner;

/**
 * The driver class for the Tic Tac Toe project. Run its main() method to play
 * any number of Tic Tac Toe rounds between two people.
 */
public class Main {
    /**
     * This keeps track of how many games have been played so far. It's updated by
     * this class's main() method, and accessed by {@link Game} when determining
     * which {@link Player} goes first.
     */
    public static int gameNumber;

    /**
     * Run this main() method to play any number of Tic Tac Toe rounds between two
     * people
     * 
     * @param args inconsequential
     */
    public static void main(String[] args) {
        gameNumber = 0;
        Scanner sc = new Scanner(System.in);
        Game t3 = new Game();
        do {
            t3.play();
            t3.printScore();
            System.out.println("Would you like to play again? 'y' for yes, other for no");
            gameNumber++;
        } while (sc.nextLine().charAt(0) == 'y');

        sc.close();
    }
}
