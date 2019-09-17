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
    }

    public void add(Fraction frac) {


    }

    public static void main(String args[]) {
        System.out.print(gcd(2048,1000));
    }




    static public  int gcd(int n1, int n2) {  //needs work
        int n3 = Math.max(n1,n2)%Math.min(n1,n2);
        if(n3==0)
            return Math.min(n1,n2);

        int n4 = Math.min(n1,n2)%n3;
        if(n4==0)
            return n3;
        return gcd(n3,n4);
    }

    public int getNumerator() {
        return numer;
    }

    public int getDenominator() {
        return denom;
    }

    public String toString() {
        return numer.toString()+"/"+denom.toString();
    }
}
