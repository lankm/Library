package jJava;

public class ColoredText {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";

    public static String toBlack(String s) {
        return ANSI_BLACK + s + ANSI_RESET;
    }

    public static String toRed(String s) {
        return ANSI_RED + s + ANSI_RESET;
    }

    public static String toGreen(String s) {
        return ANSI_GREEN + s + ANSI_RESET;
    }

    public static String toYellow(String s) {
        return ANSI_YELLOW + s + ANSI_RESET;
    }

    public static String toBlue(String s) {
        return ANSI_BLUE + s + ANSI_RESET;
    }

    public static String toPurple(String s) {
        return ANSI_PURPLE + s + ANSI_RESET;
    }

    public static String toCyan(String s) {
        return ANSI_CYAN + s + ANSI_RESET;
    }

    public static String toWhite(String s) {
        return ANSI_WHITE + s + ANSI_RESET;
    }


}
