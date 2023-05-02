import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(); //남은 일수
        int [] t = new int[n+6]; //걸리는 기간을 저장할 배열
        int [] p = new int[n+6]; //받을 수 있는 금액을 저장할 배열
        int [] m = new int[n+6]; //해당 날짜에 받을 수 있는 최대 금액을 저장할 배열
        int max=0; //최대 수익

        for(int i =0;i<n;i++) {
            int a =in.nextInt(); //걸리는 기간
            int b =in.nextInt(); //받을 수 있는 금액
            t[i+1]=a; //+1은 다음 for문과 index를 맞춰주기 위함
            p[i+1]=b; //+1은 다음 for문과 index를 맞춰주기 위함
            m[i]=0; //0으로 초기화
        }

        //n+1까지인 이유 : n일에 상담을 완료하고 n+1일에 금액을 받는 것 까지 고려
        for(int j=1;j<=n+1;j++){
            //전날 최대 수익 max와 이미 저장되어 있는 값 비교
            m[j]=Math.max(max,m[j]);
            //상담이 완료된 다음날 받을 수 있는 최대 금액 비교
            //ex) 1일상담이 3일이 걸린다면 4일에 (m[j+t[j]])
            //현재 수익 + 상담완료 후 받을 금액 vs 이미 저장되어 있는 값
            //ex) 2일째(5일 걸림) = 5일째(2일 걸림) -> 7일에 얻는 수익 비교
            m[j+t[j]]=Math.max(p[j]+m[j],m[j+t[j]]);
            //다음날에 저장된 수익과 현재 최대수익을 비교하기 위한 최대수익 max
            max=Math.max(max,m[j]);
        }

        System.out.print(max); //최대수익 출력
    }
}