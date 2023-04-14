import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(); //참가자의 수
        Queue<Integer> q = new LinkedList<>();
        for(int i=0;i<n;i++){
            q.add(i+1); //큐에 티셔츠 번호 저장
        }
        int t =1; //단계
        long num = 1; //단계별 이동 횟수
        while(q.size()!=1){ //1명 남을 때까지 반복
            num=(long)t*t*t; //단계별 진행 수 (1단계 = 1, 2단계 = 8 ...)
            num = num%q.size(); //단계별 이동 횟수
            if(num==0){ //num이 0인 경우
                num=q.size(); //num은 q.size()
            }
            for(int j=0;j<num-1;j++){ //백준이가 앞에 서 있는 사람의 전 사람까지 제거 후 다시 저장
                int a = q.remove(); //맨 앞에 있는 값 반환 후 삭제
                q.add(a); //큐에 다시 저장
            }
            t++; //단계 증가
            q.poll(); //백준이가 앞에 서 있는 사람 제외
        }
        System.out.print(q.remove());//남은 1명의 티셔츠 번호 출력
    }
}