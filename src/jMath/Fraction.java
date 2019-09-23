package jMath;

public class Fraction {
    private Integer numer;  //negatives are put only on top
    private Integer denom = 1;

    public Fraction(int numerator) {
        numer = numerator;
    }

    public Fraction(int numerator, int denominator) {
        numer = numerator;
        denom = denominator;
        format();
    }

    public void add(Fraction frac) {
        numer = numer * frac.getDenominator() + frac.getNumerator() * denom;
        denom = denom * frac.getDenominator();
        format();
    }

    public void subtract(Fraction frac) {
        add(new Fraction(-frac.getNumerator(), frac.getDenominator()));
    }

    public void multiply(Fraction frac) {
        numer = numer * frac.getNumerator();
        denom = denom * frac.getDenominator();
        format();
    }

    public void divide(Fraction frac) {
        multiply(new Fraction(frac.getDenominator(), frac.getNumerator()));
    }

    private int gcd(int n1, int n2) {
        int n3 = Math.max(n1, n2) % Math.min(n1, n2);
        if (n3 == 0)
            return Math.min(n1, n2);

        int n4 = Math.min(n1, n2) % n3;
        if (n4 == 0)
            return n3;
        return gcd(n3, n4);
    }

    public void format() {
        int gcd = gcd(numer, denom);
        numer /= gcd;
        denom /= gcd;

        if (denom < 0) {
            denom = Math.abs(denom);
            numer *= -1;
        }
    }

    public int getNumerator() {
        return numer;
    }

    public int getDenominator() {
        return denom;
    }

    public String toString() {
        return numer.toString() + (denom == 1 ? "" : "/" + denom.toString());
    }

    public String toStringF() {
        return Double.toString(numer / (double) denom);
    }
}
