import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int d1 = in.nextInt();
        int d2 = in.nextInt();
        double pi = 3.141592;
        System.out.print(d1*2 + 2*pi*d2);
    }
}