public class Rational {
    private int numer, denom;
    public Rational() {
        numer = 0;
        denom = 1;
    }
    public Rational(int n, int d) {
        numer = n;
        denom = d;
    }
    public void invert() {
        int t = numer;
        numer = denom;
        denom = t;
    }
    public double toDouble() {
        return (double) numer / denom;
    }
    public void reduce() {
        int gcd = gcd(numer, denom);
        numer /= gcd;
        denom /= gcd;
    }
    public int gcd(int a, int b) {
        if (b > a) {
            int t = a;
            a = b;
            b = t;
        }
        int r = a % b;
        while (r != 0) {
            a = b;
            b = r;
            r = a % b;
        }
        return b;
    }
    public Rational add(Rational x) {
        Rational sum = new Rational(numer*x.denom + x.numer*denom, denom*x.denom);
        sum.reduce();
        return sum;
    }
    public String toString() {
        return numer + " / " + denom;
    }
}
