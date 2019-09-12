package jJava;

import java.util.Arrays;

public class JJava {
    private static int debugCount = 1;

    public static void debug(Object... args) {
        System.err.println("====DEBUG " + debugCount + "====");

        int i = 1;
        for (Object obj : args) {
            String output = advancedToString(obj);

            System.err.println("Variable " + i + ": " + output);
            i++;
        }

        System.err.println("====DEBUG " + debugCount + "====");
        debugCount++;
    }

    public static String advancedToString(Object obj) {
        if (obj instanceof Object[])
            return Arrays.deepToString((Object[]) obj);
        else if (obj instanceof int[])
            return Arrays.toString((int[]) obj);
        else if (obj instanceof double[])
            return Arrays.toString((double[]) obj);
        else if (obj instanceof char[])
            return Arrays.toString((char[]) obj);
        else if (obj instanceof long[])
            return Arrays.toString((long[]) obj);
        else if (obj instanceof byte[])
            return Arrays.toString((byte[]) obj);
        else if (obj instanceof boolean[])
            return Arrays.toString((boolean[]) obj);
        else if (obj instanceof short[])
            return Arrays.toString((short[]) obj);
        else if (obj instanceof float[])
            return Arrays.toString((float[]) obj);
        return obj.toString();
    }
}
