import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int [] num = new int[n+1];
        int [] dp = new int[n+1];
        for(int i=0;i<n;i++){
            num[i+1]=in.nextInt();
        }
        dp[1]=num[1];
        if (n >= 2) {
            dp[2]=dp[1]+num[2];
        }
        for(int i=3;i<=n;i++){
            dp[i]=Math.max(dp[i-1],Math.max(dp[i-2]+num[i],dp[i-3]+num[i-1]+num[i]));
        }
        System.out.println(dp[n]);
    }
}