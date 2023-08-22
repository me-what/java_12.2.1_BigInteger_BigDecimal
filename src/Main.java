import java.math.BigDecimal;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {
        BigInteger a = BigInteger.valueOf(2147483647);
        BigInteger b = BigInteger.valueOf(2147483641);
        //a = a * b;  // так нельзя
        a = a.multiply(b);
        System.out.println(a);  // 4611686001247518727
        long x = a.longValue();
        System.out.println(x + "\n");  // 4611686001247518727

        BigDecimal c = BigDecimal.valueOf(2325.06);
        BigDecimal d = BigDecimal.valueOf(215.06);
        c = c.subtract(d.multiply(BigDecimal.valueOf(2.1)));
// 2325,06 - (215,06 * 2,1 = 451,626) = 1873,434
        System.out.println(c);      // 1873.434
        double y = c.doubleValue();
        System.out.println(y);      // 1873.434
    }
}