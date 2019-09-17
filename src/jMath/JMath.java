package jMath;

public class JMath {
    public static double round(double numb, int prec) {
        numb *= Math.pow(10, prec);
        numb = Math.round(numb) / Math.pow(10, prec);
        return numb;
    }

    public static <E extends Number, Comparable> double average(E... numbers) {
        double total = 0;
        for (E number : numbers) {
            total += Double.parseDouble(number.toString());
        }
        return total / (numbers.length);
    }

    public static boolean isOdd(int numb) {
        if (numb % 2 == 1)
            return true;
        return false;
    }

    public static boolean isEven(int numb) {
        return !isOdd(numb);
    }

    public static int factorial(int numb) {
        int output = 1;
        for (int i = 2; i <= numb; i++) {
            output *= i;
        }
        return output;
    }

    /*
        input: the coefficients of the equasion
        output: the integer
     */
    public static int[] quadratic(int[] coef) { //needs work
        return null;
    }
}
