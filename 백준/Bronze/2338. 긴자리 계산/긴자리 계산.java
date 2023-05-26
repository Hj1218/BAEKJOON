import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        BigInteger a1 = in.nextBigInteger();
        BigInteger a2 = in.nextBigInteger();
        System.out.println(a1.add(a2));
        System.out.println(a1.subtract(a2));
        System.out.println(a1.multiply(a2));
    }
}