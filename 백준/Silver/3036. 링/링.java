import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int []num = new int[n];
        for(int i=0;i<n;i++){
            num[i]=in.nextInt();
        }
        int first = num[0];
        for(int i=1;i<n;i++){
            int gcd = gcd(first,num[i]);
            System.out.println((first/gcd)+"/"+(num[i]/gcd));
        }
    }
    static int gcd(int a, int b){
        int r;
        while(b!=0){
            r = a%b;
            a = b;
            b = r;
        }
        return a;
    }
}