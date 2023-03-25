import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        int N=in.nextInt();
        int []n=new int[N];
        for(int i=0;i<N;i++){
            int num=in.nextInt();
            n[i]=num;
        }
        Arrays.sort(n);
        System.out.print(n[0]+" "+n[N-1]);
    }
}