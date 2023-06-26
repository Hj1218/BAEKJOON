import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int [] num = new int[n];
        int [] dp = new int[n];
        for(int i=0;i<n;i++){
            num[i]=in.nextInt();
        }
        dp[0]=num[0];
        int max = num[0];
        for(int i=1;i<n;i++){
            dp[i]= Math.max(num[i],dp[i-1]+num[i]);
            max = Math.max(max,dp[i]);
        }
        System.out.println(max);
    }
}