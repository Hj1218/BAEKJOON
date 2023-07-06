import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        BigInteger a = BigInteger.valueOf(1);
        BigInteger b = BigInteger.valueOf(1);
        for(int i=0;i<m;i++){
            a = a.multiply(BigInteger.valueOf(n-i));
            b = b.multiply(BigInteger.valueOf(i+1));
        }
        System.out.println(a.divide(b));
    }
}