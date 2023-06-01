import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        long [] num = new long[n-2];
        for(int i=0;i<n-2;i++){
            num[i]=in.nextInt();
        }
        long a = num[0];
        for(int i=1;i< num.length;i++){
            a = gcd(num[i],num[i-1]);
            num[i]=num[i]*num[i-1]/a;
        }
        System.out.println(num[n-3]);
    }
    public static long gcd(long num1, long num2){ //유클리드 호제법 (최대공약수 구하기)
        if(num1%num2==0){
            return num2;
        }
        return gcd(num2,num1%num2);
    }
}