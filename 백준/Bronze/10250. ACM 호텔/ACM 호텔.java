import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt(); //입력
        int [] a=new int[T];
        for(int i=0; i<T; i++){
            int H = in.nextInt(); //층
            int W = in.nextInt(); //방
            int N = in.nextInt(); //손님
            int y;
            if (N%H==0){
                y=H;
            }
            else{
                y=N%H;
            }
            int x;
            if(N%H==0){
                x=N/H;
            }
            else{
                x=(N/H)+1;
            }
            int yyxx = (y*100)+x;
            a[i]=yyxx;
        }
        for(int j=0; j<T; j++){
            System.out.println(a[j]);
        }
    }
}