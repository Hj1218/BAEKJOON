import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int [] num = new int[n+1];
        int [] dp = new int[n+1];
        for(int i=1;i<=n;i++){
            num[i]=in.nextInt();
        }
        int max =0;
        for(int i=1;i<=n;i++){
            for(int j=i-1;j>=0;j--){
                if(num[i]>num[j]){
                    dp[i]=Math.max(dp[i],dp[j]+num[i]);
                    max = Math.max(max,dp[i]);
                }
            }
        }
        System.out.println(max);
    }
}