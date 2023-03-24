import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N= in.nextInt(); //스크린 칸
        int M=in.nextInt(); //바구니 칸
        int j=in.nextInt(); //떨어지는 사과 개수
        int l=1; //바구니 왼쪽
        int r=M; //바구니 오른쪽
        int count=0; //이동 거리
        for(int i=0;i<j;i++){
            int n=in.nextInt(); //사과가 떨어지는 위치
            if(n<l){ //사과가 바구니보다 왼쪽에 있는 경우
                count+=l-n;
                l=n;
                r=n+M-1;
            } else if (n>r) { //사과가 바구니보다 오른쪽에 있는 경우
                count+=n-r;
                r=n;
                l=n-M+1;
            }
        }
        System.out.print(count);
    }
}