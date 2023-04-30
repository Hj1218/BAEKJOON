import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int r1 = in.nextInt();
        int s = in.nextInt();
        int r2 = (s*2)-r1;
        System.out.println(r2);
    }
}