import java.util.Scanner;

public class Main {
    static int n,a,b,m;
    static int result=-1;
    static boolean dp[][];
    static boolean v[];
    static int count=0;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        a = in.nextInt();
        b = in.nextInt();
        m = in.nextInt();
        dp = new boolean[n+1][n+1];

        for(int i=0;i<m;i++){
            int aa = in.nextInt();
            int bb = in.nextInt();
            dp[aa][bb] = dp[bb][aa]=true;
        }
        v = new boolean[n+1];
        dfs(a,0);
        System.out.println(result);
    }
    private static void dfs(int i, int j) {
        v[i]=true;
        if(i==b){
            result=j;
            return;
        }
        for(int k=1;k<=n;k++){
            if(dp[i][k]&&!v[k]){
                dfs(k,j+1);
            }
        }
    }
}