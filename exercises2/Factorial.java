import java.math.BigInteger;
public class Factorial {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++)
            System.out.println(i + "! = " + factorial(i));
    }
    public static BigInteger factorial(int n) {
        BigInteger res = BigInteger.valueOf(1);
        for (int i = n; i > 1; i--)
            res = res.multiply(BigInteger.valueOf(i));
        return res;
    }
}
