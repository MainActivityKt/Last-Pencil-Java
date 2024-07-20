package lastpencil;

import utils.Utils.Player;
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
            printAvailablePencils(numOfPencil);
            getPlayerInput();
        }
    }

    void getPlayerInput() {
        System.out.println((player == Player.JACK ? "Jack's" : "John's") + " turn");
        String input = sc.next();
        while (!inputPencilsIsValid(input, numOfPencil)) {
            input = sc.next();
        }
        numOfPencil -= Integer.parseInt(input);
        player = changePlayer(player);
    }



    public static void main(String[] args) {
        FairPencilGame game = new FairPencilGame();
        game.initialize();
        game.startGame();
    }
}
