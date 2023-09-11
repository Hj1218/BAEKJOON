import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int n = in.nextInt();
        int result = a%b;
        int num = 0;
        for(int i=0;i<n;i++){
            result*=10;
            num = result/b;
            result%=b;
        }
        System.out.println(num);
    }
}