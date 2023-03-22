import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
       int N= in.nextInt(); //바구니 수
       int M= in.nextInt(); //바꾸는 수
        int[] a=new int[N];
       for(int i=0; i<N; i++){
           a[i]=i+1;
       }
       for(int j=0;j<M;j++){
           int b=in.nextInt();
           int c=in.nextInt();
           int d=a[b-1];
           a[b-1]=a[c-1];
           a[c-1]=d;
       }
       for(int k=0;k<N;k++){
           System.out.print(a[k] + "\n");
       }
    }
}