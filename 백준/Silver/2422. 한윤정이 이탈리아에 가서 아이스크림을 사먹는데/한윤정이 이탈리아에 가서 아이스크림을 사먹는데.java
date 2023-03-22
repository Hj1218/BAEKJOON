import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt(); //아이스크림 종류
        int M = in.nextInt(); //조합 개수
        boolean[][]arr=new boolean[N+1][N+1];
        for(int l=0;l<M;l++){
            int a=in.nextInt(); //조합의 번호
            int b=in.nextInt(); //조합의 번호
            arr[a][b]=true; //섞어먹으면 안 되는 조합
            arr[b][a]=true; //섞어먹으면 안 되는 조합
        }
        int count=0; //가능한 조합 수
        for (int i = 1; i <=N; i++) {
            for (int j = i+1; j <= N; j++) {
                if(arr[i][j]){ //섞어먹으면 안 되는 조합에 해당하면
                    continue;
                }
                for (int k = j+1; k <= N; k++) {
                    if(!arr[j][k]&&!arr[k][i]){ //조합에 해당하지 않으면
                        count++; //카운트 증가
                    }
                }
            }
        }
        System.out.print(count);
    }
}