import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        LinkedList<Integer>list=new LinkedList<>(); //연결리스트
        Scanner in = new Scanner(System.in);
        int N=in.nextInt(); //N명
        int K=in.nextInt(); //K번째 사람 제거
        for(int i=1;i<=N;i++){
            list.add(i); //리스트에 1~N 저장
        }
        System.out.print("<");
        while(!list.isEmpty()){ //연결리스트가 빌 떄까지 반복
            for(int j=1;j<=K;j++){
                if(j==K){ //K번째인 경우 
                    int a = list.get(0); //K번 째 리스트 값 저장
                    list.remove(0); //연결리스트에서 값 삭제
                    if(list.size()==0){ //연결리스트 크기가 0인 경우
                        System.out.print(a);
                    }
                    else{
                        System.out.print(a+", ");
                    }
                }
                else{ //K번째가 아닌 경우
                    int b = list.get(0); //리스트 값 변수에 저장 후
                    list.remove(0); //제거
                    list.add(b); //다시 추가
                }
            }
        }
        System.out.println(">");
    }
}