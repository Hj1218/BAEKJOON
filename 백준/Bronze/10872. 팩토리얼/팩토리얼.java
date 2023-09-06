import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(factorial(n));
    }
    public static int factorial(int a){
        if(a<=1){
            return 1;
        }
        return a*factorial(a-1);
    }
}