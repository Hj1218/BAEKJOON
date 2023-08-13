import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long x = in.nextLong();
        long y = in.nextLong();
        if(y==0){
            long a = 1;
            long p = 0;
            for(int i=0;i<x;i++){
                p+=6;
                a+=p;
            }
            System.out.println(a);
        }
        else{
            long n = x+y-1;
            long a = 1;
            long p = 0;
            for(int i=0;i<n;i++){
                p+=6;
                a+=p;
            }
            a+=y;
            System.out.println(a);
        }
    }
}