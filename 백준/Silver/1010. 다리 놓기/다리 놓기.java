import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        StringBuilder sb= new StringBuilder(); //결과 저장을 위한 StringBuilder
        int T = in.nextInt(); //테스트 케이스의 개수
        for(int i=0;i<T;i++){
            int N = in.nextInt(); //강 서쪽 사이트 개수
            int M = in.nextInt(); //강 동쪽 사이트 개수
            int a=1;
            for (int j = 0; j < N; j++) {
                a = a * (M - j) / (j + 1);
            }
            sb.append(a).append("\n"); //StringBuilder에 결과 저장
        }
        System.out.print(sb); //결과 출력
    }
}