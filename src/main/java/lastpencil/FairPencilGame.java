package lastpencil;

import utils.Utils.Player;
import utils.Utils.Messages;

import java.util.Scanner;

import static utils.Utils.changePlayer;
import static utils.Utils.isValidPlayerName;

class FairPencilGame {
    int numOfPencil;
    Player player;
    Scanner sc = new Scanner(System.in);

    void getNumberOfPencils() {
        System.out.println(Messages.GET_PENCILS_AMOUNT);
        int input = Integer.MIN_VALUE;
        while (input <= 0) {
            try {
                input = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException c) {
                input = Integer.MIN_VALUE;
            }
            if (input <= 0) {
                System.out.println(input == 0 ? Messages.NUMBER_OF_PENCILS_ZERO : Messages.NON_NUMERIC_PENCILS);
            }
        }
        numOfPencil = input;
    }

    void getFirstPlayer() {
        System.out.println(Messages.FIRST_PLAYER_MESSAGE);
        String name = sc.next();
        while (!isValidPlayerName(name)) {
            System.out.println(Messages.PLAYER_NAME_NOT_FOUND);
            name = sc.next();
        }
        player = name.equalsIgnoreCase(Player.JACK.toString()) ? Player.JACK : Player.JOHN;
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
        game.getNumberOfPencils();
        game.getFirstPlayer();
        game.startGame();
    }
}
