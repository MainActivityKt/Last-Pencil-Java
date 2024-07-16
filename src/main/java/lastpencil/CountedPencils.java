package lastpencil;

import utils.Utils.*;
import java.util.Scanner;



public class CountedPencils {
    int num;
    Scanner sc = new Scanner(System.in);
    Player player;

    int getNumberOfPencils() {
        System.out.println("How many pencils would you like to use:");
        return sc.nextInt();
    }

    Player getFirstPlayer() {
        System.out.println("Who will be the first (John, Jack):");
        return sc.next().toUpperCase().equals(Player.JACK.name()) ? Player.JACK : Player.JOHN;
    }

    void printPencils() {
        System.out.println("|".repeat(num));
    }

    public void start() {
        num = getNumberOfPencils();
        player = getFirstPlayer();
        printPencils();
        System.out.println((player == Player.JACK ? "Jack" : "John") + " is going first!");
    }

    public static void main(String[] args) {
        CountedPencils pencils = new CountedPencils();
        pencils.start();
    }
}


