import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt(); //레벨의 수
        int [] level = new int[N+1]; //레벨의 점수를 위한 배열
        for(int i=0;i<N;i++){
            level[i+1]=in.nextInt(); //각 레벨의 점수 저장
        }
        int count=0; //감소시키는 횟수
        for(int j=N-1;j>0;j--){ //거꾸로 높은 레벨(N-1)부터 
            while(level[j]>=level[j+1]){ //자신보다 높은 레벨의 점수보다 높거나 같은 경우
                level[j]-=1; //1씩 감소
                count++; //감소시키는 횟수 증가
            }
        }
        System.out.println(count); //감소시키는 횟수 출력
    }
}