import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long n = in.nextLong();
        long m = in.nextLong();
        long a = n-m;
        if(a<0){
            a=0-a;
        }
        System.out.print(a);
    }
}