import java.util.Scanner;

public class Main {
    static int [][] arr;
    static Integer [][] dp;
    static int n;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        arr = new int[n][n];
        dp = new Integer[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<i+1;j++){
                arr[i][j]=in.nextInt();
            }
        }
        for(int i=0;i<n;i++){
            dp[n-1][i]=arr[n-1][i];
        }
        System.out.println(check(0,0));
    }
    static int check(int a, int b){
        if(a==n-1){
            return dp[a][b];
        }
        if(dp[a][b]==null){
            dp[a][b]=Math.max(check(a+1,b),check(a+1,b+1))+arr[a][b];
        }
        return dp[a][b];
    }
}