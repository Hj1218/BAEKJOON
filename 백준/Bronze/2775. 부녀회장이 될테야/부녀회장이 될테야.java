import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int t = in.nextInt(); //test case t
        int [][] num = new int[15][15];
        StringBuilder sb = new StringBuilder();

        for(int j=0;j< 15;j++){
            num[0][j]=j; //0층의 j호는 j명
            num[j][1]=1; //각 층의 1호는 모두 1명
            num[j][0]=0;
        }

        for(int i=1;i<15;i++){ //i층
            for(int j=2;j<15;j++){ //j호
                for(int k=1;k<=j;k++){ //1호~j호
                    num[i][j]+=num[i-1][k]; //i층 j호는 i-1층 1호 ~ j호 사람 수 합
                }
            }
        }

        for(int i=0;i<t;i++){ //test case 수 만큼
            int k = in.nextInt(); //k층
            int n = in.nextInt(); //n호
            sb.append(num[k][n]).append("\n"); //num[k][n]값을 sb에 저장
        }

        System.out.println(sb);
    }
}