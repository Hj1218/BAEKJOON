import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        double [] arr =new double[N];
        for(int i=0;i<N;i++){
            int num=in.nextInt();
            arr[i]=num;
        }
        double result=0;
        Arrays.sort(arr);
        double max = arr[N-1];
        for(int j=0;j<N;j++){
            double a = arr[j]/max*100;
            result = result + a;
        }
        System.out.print(result/N);
    }
}