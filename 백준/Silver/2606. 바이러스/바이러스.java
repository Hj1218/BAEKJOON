import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        m = in.nextInt();
        a = 1;
        dp = new int[n+1][n+1];
        b=new boolean[n+1];

        for(int i=0;i<m;i++){
            int aa = in.nextInt();
            int bb = in.nextInt();
            dp[aa][bb] = dp[bb][aa]=1;
        }
        System.out.println(dfs(1));
    }
    static int n,m,a;
    static int dp[][];
    static int count=0;
    static boolean b[];
    private static int dfs(int i) {
        b[i]=true;
        for(int j=1;j<=n;j++){
            if(dp[i][j]==1 && b[j]==false){
                count++;
                dfs(j);
            }
        }
        return count;
    }
}