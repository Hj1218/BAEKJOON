import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        b=b-45;
        if(b<0){
            a=a-1;
            if(a<0){
                a=23;
            }
            b=b+60;
            System.out.print(a+" "+b);
        }
        else{
            System.out.print(a+" "+b);
        }
    }
}