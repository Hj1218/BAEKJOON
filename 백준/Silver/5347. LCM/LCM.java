import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<n;i++){
            long a = in.nextInt();
            long b = in.nextInt();
            long c = GCD(a,b);
            long result = a*b/c;
            sb.append(result).append("\n");
        }
        System.out.println(sb);
    }
    static long GCD(long a, long b) {
        if(a%b ==0) {
            return b;
        }
        return GCD(b, a%b);
    }
}