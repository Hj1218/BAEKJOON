import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        int []a=new int[T];
        for(int i=0;i<T;i++){
            int A = in.nextInt();
            int B = in.nextInt();
            a[i]=A+B;
        }
        for(int j=0;j<T;j++){
            System.out.println(a[j]);
        }
    }
}