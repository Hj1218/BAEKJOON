import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int dp[] = new int[n+1];
        for(int i=1;i<=n;i++){
            dp[i] = i;
            for(int j=1;j*j<=i;j++){
                if(dp[i]>dp[i-j*j]+1){
                    dp[i] = dp[i-j*j]+1;
                }
            }
        }
        System.out.println(dp[n]);
    }
}