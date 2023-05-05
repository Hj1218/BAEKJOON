import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(); //병사의 수
        int [] p = new int[n+1];
        for(int i=1;i<=n;i++){
            p[i]=in.nextInt(); //각 병사의 전투력 저장
        }
        int []dp=new int[n+1];
        int max=0; //남아있는 병사의 수
        for(int j=1;j<=n;j++){
            dp[j]=1; //초기값 저장
            for(int k=0;k<j;k++){
                if((p[j]<p[k])&&(dp[j]<=dp[k])){ //내림차순 + dp값이 작거나 같은 경우 
                    dp[j]=dp[k]+1; //dp값 증가
                }
            }
            max=Math.max(max,dp[j]); //남아있는 병사의 수 비교
        }
        System.out.print(n-max); //열외해야 하는 병사의 수
    }
}