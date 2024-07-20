package utils;

import java.util.Arrays;

public class Utils {
    public static class Messages {
        public static final String GET_PENCILS_AMOUNT = "How many pencils would you like to use:";
        public static final String NON_NUMERIC_PENCILS = "The number of pencils should be numeric";
        public static final String NUMBER_OF_PENCILS_ZERO = "The number of pencils should be positive";
        public static final String FIRST_PLAYER_MESSAGE = "Who will be the first (John, Jack):";
        public static final String PLAYER_NAME_NOT_FOUND = "Choose between 'John' and 'Jack'";
        public static final String MORE_PENCILS_THAN_AVAILABLE = "Too many pencils were taken";
        public static final String UNAVAILABLE_PENCIL_AMOUNT = "Possible values: '1', '2' or '3'";
        public static final String JOHN_WON = "John won!";
        public static final String JACK_WON = "Jack won!";
    }

    public enum Player {
        JOHN, JACK;

        @Override
        public String toString() {
            return this.name();
        }
    }

    public static boolean isValidPlayerName(String name) {
        return Arrays.stream(Player.values()).anyMatch(it -> it.toString().equalsIgnoreCase(name));
    }

    public static Player changePlayer(Player currentPlayer) {
        return currentPlayer == Player.JACK ? Player.JOHN : Player.JACK;
    }
}
