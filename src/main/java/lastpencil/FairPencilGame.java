package lastpencil;

import utils.Utils;
import utils.Utils.Player;
import utils.Utils.Messages;

import java.util.Scanner;

import static utils.Utils.*;

class FairPencilGame {
    int numOfPencil;
    Player player;
    Scanner sc = new Scanner(System.in);

    void initialize() {
        numOfPencil = getNumberOfPencils(sc);
        player = getFirstPlayer(sc);
    }

    void startGame() {
        while (numOfPencil != 0) {
            printAvailablePencils();
            getPlayerInput();
        }
        System.out.println(player == Player.JACK ? Messages.JACK_WON : Messages.JOHN_WON);
        sc.close();
    }

    void getPlayerInput() {
        System.out.println((player == Player.JACK ? "Jack's" : "John's") + " turn");
        String input = sc.next();
        while (!inputPencilsIsInvalid(input)) {
            input = sc.next();
        }
        numOfPencil -= Integer.parseInt(input);
        player = changePlayer(player);
    }

    boolean inputPencilsIsInvalid(String input) {
        int pencils;
        try {
            pencils = Integer.parseInt(input);
            if (pencils < 1 || pencils > 3) {
                System.out.println(Messages.UNAVAILABLE_PENCIL_AMOUNT);
                return false;
            }
            if (pencils > numOfPencil) {
                System.out.println(Messages.MORE_PENCILS_THAN_AVAILABLE);
                return false;
            }
        } catch (NumberFormatException c) {
            System.out.println(Messages.UNAVAILABLE_PENCIL_AMOUNT);
            return false;
        }
        return true;
    }

    void printAvailablePencils() {
        System.out.println("|".repeat(numOfPencil));
    }

    public static void main(String[] args) {
        FairPencilGame game = new FairPencilGame();
        game.initialize();
        game.startGame();
    }
}
