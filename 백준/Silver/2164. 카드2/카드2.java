import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        Queue<Integer> q = new LinkedList<>();
        int N = in.nextInt();
        for(int i=1;i<=N;i++){
            q.add(i); //큐에 1부터 N까지 순서대로 저장
        }
        int a=1;
        while(true){
            q.remove(); //첫번째 값 제거
            if(q.isEmpty()){ //큐가 비었다면
                break; //while을 벗어나
            }
            a = q.poll(); //남은 값 중 첫번째 값 반환후 제거
            if(q.isEmpty()){ //큐가 비었다면
                break; //while을 벗어나
            }
            q.add(a); //큐의 맨 뒤에 넣어줌
        }
        System.out.print(a); //큐의 마지막 요소 출력
    }
}