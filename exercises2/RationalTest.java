public class RationalTest {
    public static void main(String[] args) {
        Rational num = new Rational(30, 45);
        Rational num2 = new Rational(15, 25);
        System.out.println(num);
        num.invert();
        num.reduce();
        System.out.println(num);
        System.out.println(num.add(num2));
    }
}
