import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a=0; //n=0
        int b=1; //n=1
        int c=0;
        for(int i=2;i<=n;i++){
            c= a+b;
            a=b;
            b=c;
        }
        if(n==0){
            c=0;
        } else if (n==1) {
            c=1;
        }
        System.out.print(c);
    }
}