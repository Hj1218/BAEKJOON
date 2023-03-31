import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        if((90<=N)&&(N<=100)){
            System.out.print("A");
        } else if ((80<=N)&&(N<=89)) {
            System.out.print("B");
        } else if ((70<=N)&&(N<=79)) {
            System.out.print("C");
        }else if ((60<=N)&&(N<=69)) {
            System.out.print("D");
        }else{
            System.out.print("F");
        }
    }
}