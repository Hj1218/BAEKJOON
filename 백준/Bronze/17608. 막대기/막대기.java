import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt(); //막대의 개수
        Stack<Integer> s = new Stack<>();
        for(int i=0;i<N;i++){
            s.push(in.nextInt()); //배열에 막대기 높이 정보 저장
        }
        int count = 1; //보이는 막대 개수
        int a = s.peek(); //보는 방향에서 가장 앞에 있는 막대
        s.pop(); //스택에서 제거
        for(int j=N-1;j>0;j--){
            int b = s.peek(); //남아있는 스택 중 가장 앞에 있는 막대
            s.pop(); //스택에서 제거
            if(b>a){ //앞에 있는 막대보다 크다면
                count++; //보이는 막대 개수 증가
                a = b; //막대 기준 변경
            }
        }

        System.out.print(count); //결과 출력
    }
}