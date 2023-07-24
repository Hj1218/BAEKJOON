import java.util.Scanner;

public class Main {
    static long c;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long a = in.nextLong();
        long b = in.nextLong();
        c = in.nextLong();

        System.out.println(pow(a,b));
    }
    static long pow(long a, long b){
        if(b==1){
            return a%c;
        }
        long temp = pow(a,b/2);
        if(b%2==1){
            return (temp*temp%c)*a%c;
        }
        return temp*temp%c;
    }
}