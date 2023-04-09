import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        BigInteger k=in.nextBigInteger();
        int l=in.nextInt();
        StringBuilder sb = new StringBuilder();
        boolean flag=false;
        for(int i=2;i<l;i++){
            if(k.mod(BigInteger.valueOf(i)).compareTo(BigInteger.ZERO)==0){
                sb.append("BAD "+i);
                flag=true;
                break;
            }
        }
        if(!flag){
            sb.append("GOOD");
        }
        System.out.print(sb);
    }
}