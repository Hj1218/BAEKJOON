import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        b=b+c;
        while(b>=60){
            b=b-60;
            a=a+1;
        }
        if(a>=24){
            a=a-24;
        }
        System.out.print(a+" "+b);
    }
}