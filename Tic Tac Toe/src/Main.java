import java.util.Scanner;

/**
 * The driver class for the Tic Tac Toe project. Run its main() method to play
 * any number of Tic Tac Toe rounds between two people.
 */
public class Main {
    /**
     * Run this main() method to play any number of Tic Tac Toe rounds between two
     * people
     * 
     * @param args inconsequential
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Game t3 = new Game();
        do {
            t3.play();
            t3.printScore();
            System.out.println("Would you like to play again? 'y' for yes, other for no");
        } while (sc.nextLine().charAt(0) == 'y');

        sc.close();
    }
}
