import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(); //계단 개수
        int [] score = new int[n+1];
        for(int i=1;i<=n;i++){
            score[i]=in.nextInt(); //계단의 점수
        }
        int [] dp = new int[n+1];
        if(n==1){ //계단이 1개인 경우
            dp[1]=score[1]; //dp[1]은 계단 1의 점수
        }
        else if(n==2){ //계단이 2개인 경우
            dp[1]=score[1];
            dp[2]=dp[1]+score[2]; //dp[2]는 계단 1의 점수 + 계단 2의 점수
        }
        else if (n==3) { //계단이 3개인 경우
            dp[1]=score[1];
            dp[2]=dp[1]+score[2];
            dp[3]=Math.max(score[1],score[2])+score[3]; //dp[3]은 계단 1,2의 점수 비교 후 높은 점수 + 계단 3의 점수
        }
        else{ //계단이 4개 이상인 경우
            dp[1]=score[1];
            dp[2]=dp[1]+score[2];
            dp[3]= Math.max(score[1],score[2])+score[3];
            for(int i=4;i<=n;i++){ //계단 4 이상부터
                //dp[i]는 2가지 방법으로 오를 수 있음
                //계단 i-3에서 i-1을 밟고 오르는 것 (계단 i-3을 밟아 얻을 수 있는 최고 점수 + 계단 i-1의 점수)
                //계단 i-2를 밟고 오르는 것 (계단 i-2를 밝아 얻을 수 있는 최고 점수)
                dp[i]=Math.max(dp[i-3]+score[i-1],dp[i-2])+ score[i];
            }
        }
        System.out.print(dp[n]);
    }
}