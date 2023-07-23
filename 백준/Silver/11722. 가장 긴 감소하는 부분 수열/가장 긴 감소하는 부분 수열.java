import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int [] num =new int[n];
        int [] dp = new int[n];
        for(int i=0;i<n;i++){
            num[i]=in.nextInt();
            dp[i]=1;
        }
        int max = 0;
        for(int i=1;i<n;i++){
            for(int j=0;j<i;j++){
                if (num[i] < num[j] && dp[i] <= dp[j]) {
                    dp[i] = dp[j] + 1;
                } else if (num[i] == num[j]) {
                    dp[i] = dp[j];
                }
            }
        }
        for(int i = 0;i<n;i++){
            max = Math.max(max,dp[i]);
        }
        System.out.println(max);
    }
}