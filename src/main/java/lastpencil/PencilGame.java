package lastpencil;

import java.util.Scanner;

import utils.Utils.*;


public class PencilGame {
    int numOfPencils;
    Scanner sc = new Scanner(System.in);
    Player currentPlayer;

    int getNumberOfPencils() {
        System.out.println("How many pencils would you like to use:");
        return sc.nextInt();
    }

    Player getFirstPlayer() {
        System.out.println("Who will be the first (John, Jack):");
        return sc.next().toUpperCase().equals(Player.JACK.name()) ? Player.JACK : Player.JOHN;
    }

    void printPencils() {
        System.out.println("|".repeat(numOfPencils));
    }

    void changePlayer() {
        currentPlayer = currentPlayer == Player.JACK ? Player.JOHN : Player.JACK;
    }

    int getNextPlayersTurn() {
        System.out.println((currentPlayer == Player.JACK ? "Jack's" : "John's") + " turn:");
        return sc.nextInt();
    }

    public void start() {
        numOfPencils = getNumberOfPencils();
        currentPlayer = getFirstPlayer();
        while (numOfPencils > 0) {
            printPencils();
            numOfPencils -= getNextPlayersTurn();
            changePlayer();
        }
    }

    public static void main(String[] args) {
        PencilGame game = new PencilGame();
        game.start();
    }
}
